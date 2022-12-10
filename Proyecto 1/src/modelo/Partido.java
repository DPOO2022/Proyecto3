package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Partido {
	private String fecha;
	private EquipoReal equipoLocal;
	private EquipoReal equipoVisitante;
	private int numeroJornada;
	private int golesLocal;
	private int golesVisitante;
	private boolean resultado;
	public Partido() {
		resultado = false;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public EquipoReal getEquipoLocal() {
		return equipoLocal;
	}
	public int getNumeroJornada() {
		return numeroJornada;
	}
	public void setEquipoLocal(EquipoReal equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public EquipoReal getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(EquipoReal equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	public void actualizarResultadoPartido(int numJornada) {
		if (this.golesLocal > this.golesVisitante) {
			this.equipoLocal.actualizarResultadoPartido(numJornada, "Ganó");
			this.equipoVisitante.actualizarResultadoPartido(numJornada, "Perdió");
		}
		else if (this.golesLocal < this.golesVisitante) {
			this.equipoVisitante.actualizarResultadoPartido(numJornada, "Ganó");
			this.equipoLocal.actualizarResultadoPartido(numJornada, "Perdió");
		}
		else {
			this.equipoVisitante.actualizarResultadoPartido(numJornada, "Empató");
			this.equipoLocal.actualizarResultadoPartido(numJornada, "Empató");
		}
	}
	public void setResultado(boolean b) {
		this.resultado =b;
		
	}
	public boolean getResultado() {
		// TODO Auto-generated method stub
		return this.resultado;
	}
}
