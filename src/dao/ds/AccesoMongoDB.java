package dao.ds;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class AccesoMongoDB {
	static private MongoClient db;
	
	static public MongoClient getAccesoSingleton(){
		if(db == null){
			try{
				db = new MongoClient("",27017);
			} catch (MongoException e){
				System.out.println(e.getMessage());
			}
		}
		return db;
	}
}
