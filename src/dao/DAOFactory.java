package dao;

import dao.component.TiempoMaquinariaDAO;
import dao.design.ITiempoMaquinariaDAO;

public class DAOFactory {
	private static DAOFactory daoFac;
	
	static{
		daoFac = new DAOFactory();
	}
	
	public static DAOFactory getInstane(){
		return daoFac;
	}
	
	public ITiempoMaquinariaDAO getTiempoMaquinariaDAO(){
		return new TiempoMaquinariaDAO();
	}
}
