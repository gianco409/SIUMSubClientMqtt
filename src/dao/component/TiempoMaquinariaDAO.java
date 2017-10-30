package dao.component;

import java.awt.List;
import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import dao.design.ITiempoMaquinariaDAO;
import dao.ds.AccesoMongoDB;
import dao.to.TiempoMaquinariaTO;

public class TiempoMaquinariaDAO implements ITiempoMaquinariaDAO{
	
	private final MongoClient db;
	private MongoDatabase database;
	private MongoCollection<Document> collection;

	public TiempoMaquinariaDAO() {
		this.db = AccesoMongoDB.getAccesoSingleton();
		database = db.getDatabase("sium");
	}

	public ArrayList listatiempomaquinario() {
		// TODO Auto-generated method stub
		return null;
	}

	public String insertarTiempoMaquinaria(TiempoMaquinariaTO tiempoMaquinaria) {
		// TODO Auto-generated method stub
		try {
            collection = database.getCollection("tiempoMaquinaria");
            Document jTiempoMaquinaria = new Document().append("codigoMaquinaria", tiempoMaquinaria.getCodigoMaquinaria())
                    .append("idTurno", tiempoMaquinaria.getTurno())
                    .append("fecha", tiempoMaquinaria.getFecha())
                    .append("tiempoUso", tiempoMaquinaria.getTiempoUso())
                    .append("tiempoNoUso", tiempoMaquinaria.getTiempoNoUso());
            collection.insertOne(jTiempoMaquinaria);
            return "correcto";
        } catch (MongoException e) {
            System.out.println(e.getMessage());
            return "fallo";
        }
	}

	public String actulizarTiempoMaquinaria(TiempoMaquinariaTO tiempoMaquinaria) {
		// TODO Auto-generated method stub
		String rpta = "";
        collection = database.getCollection("tiempoMaquinaria");
        FindIterable<Document> findIterable = collection.find(
                and(
                        eq("codigoMaquinaria", tiempoMaquinaria.getCodigoMaquinaria()),
                        eq("idTurno", tiempoMaquinaria.getTurno()),
                        eq("fecha", tiempoMaquinaria.getFecha())
                )
        );
        String objectid = findIterable.first().getString("_id");
        collection.updateOne(
                eq("_id", objectid),
                combine(
                        set("tiempoUso", tiempoMaquinaria.getTiempoUso()),
                        set("tiempoNoUso",tiempoMaquinaria.getTiempoNoUso())
                )
        );
        return rpta;
	}

	public String eliminarTiempoMaquinaria(List idtiempomaquinaria) {
		// TODO Auto-generated method stub
		return null;
	}

	public TiempoMaquinariaTO datotiempomaquinariaporid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
