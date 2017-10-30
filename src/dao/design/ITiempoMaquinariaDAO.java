package dao.design;

import java.awt.List;
import java.util.ArrayList;

import dao.to.TiempoMaquinariaTO;

public interface ITiempoMaquinariaDAO {
	public abstract ArrayList<TiempoMaquinariaTO> listatiempomaquinario();
	public abstract String insertarTiempoMaquinaria(TiempoMaquinariaTO tiempmaqui);
	public abstract String actulizarTiempoMaquinaria(TiempoMaquinariaTO tiempmaqui);
	public abstract String eliminarTiempoMaquinaria(List idtiempomaquinaria);
	public abstract TiempoMaquinariaTO datotiempomaquinariaporid(Integer id);
}
