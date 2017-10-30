package dao.to;

import java.io.Serializable;

public class TiempoMaquinariaTO implements Serializable{
	private String codigoMaquinaria;
	private String fecha;
	private String tiempoNoUso;
	private String tiempoUso;
	private Integer turno;
	public String getCodigoMaquinaria() {
		return codigoMaquinaria;
	}
	public void setCodigoMaquinaria(String codigoMaquinaria) {
		this.codigoMaquinaria = codigoMaquinaria;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTiempoNoUso() {
		return tiempoNoUso;
	}
	public void setTiempoNoUso(String tiempoNoUso) {
		this.tiempoNoUso = tiempoNoUso;
	}
	public String getTiempoUso() {
		return tiempoUso;
	}
	public void setTiempoUso(String tiempoUso) {
		this.tiempoUso = tiempoUso;
	}
	public Integer getTurno() {
		return turno;
	}
	public void setTurno(Integer turno) {
		this.turno = turno;
	}
	
}
