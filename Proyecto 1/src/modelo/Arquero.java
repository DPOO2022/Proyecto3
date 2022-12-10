package modelo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Arquero extends Jugador{
	private int golesRecibidos;
	private int penaltisAtajados;
	private ArrayList<Integer> golesRecibidosJornada;
	private ArrayList<Integer> penaltisAtajadosJornada;
	
	public Arquero() {
		minutosJugadosJornada = new ArrayList<Integer>();
		minutoInicioJornada= new ArrayList<Integer>();
		minutoSustitucionJornada= new ArrayList<Integer>();
		golesAnotadosJornada= new ArrayList<Integer>();
		autogolesJornada= new ArrayList<Integer>();
		asistenciasJornada= new ArrayList<Integer>();
		penaltisErradosJornada= new ArrayList<Integer>();
		amarillasJornada= new ArrayList<Integer>();
		rojasJornada= new ArrayList<Integer>();
		golesRecibidosJornada = new ArrayList<Integer>();
		penaltisAtajadosJornada = new ArrayList<Integer>();
		manosJornada = new ArrayList<Integer>();
		tirosLibresCobradosJornada = new ArrayList<Integer>();
		tirosLibresAnotadosJornada = new ArrayList<Integer>();
	}
	public ArrayList<Integer> getGolesRecibidosJornada() {
		return golesRecibidosJornada;
	}
	public void setGolesRecibidosJornada(ArrayList<Integer> golesRecibidosJornada) {
		this.golesRecibidosJornada = golesRecibidosJornada;
	}
	public ArrayList<Integer> getPenaltisAtajadosJornada() {
		return penaltisAtajadosJornada;
	}
	public void setPenaltiAtajadosJornada(ArrayList<Integer> penaltisErradosJornada) {
		this.penaltisErradosJornada = penaltisErradosJornada;
	}
	public double calcularPuntaje(int numJornada) {
		double puntos = 0;
		try {
		puntos += 5 * (double) this.golesAnotadosJornada.get(numJornada-1);}
		catch(Exception ex) {
			System.out.println(this.toString());
		}
		puntos += 3 * (double) this.asistenciasJornada.get(numJornada-1);
		puntos += -2 * (double) this.penaltisErradosJornada.get(numJornada-1);
		puntos += -1 * (double) this.amarillasJornada.get(numJornada-1);
		puntos += -3 * (double) this.rojasJornada.get(numJornada-1);
		puntos += -2 * (double) this.autogolesJornada.get(numJornada-1);
		puntos += -1 * (double) this.manosJornada.get(numJornada-1);
		puntos += 1 * (double) this.tirosLibresCobradosJornada.get(numJornada-1);
		puntos += 2 * (double) this.tirosLibresAnotadosJornada.get(numJornada-1);
		
		if(this.golesRecibidosJornada.get(numJornada-1) == 0) { 
			  	puntos += 4; 
		}
		 
		
		if(this.penaltisAtajadosJornada.get(numJornada-1) > 0) { 
			  puntos += 5; 
		}
		 
		if(this.minutosJugadosJornada.get(numJornada-1) > 1 && this.minutosJugadosJornada.get(numJornada-1) <= 60) {
			puntos += 1;
		}
		if(this.minutosJugadosJornada.get(numJornada-1) > 60) {
			puntos += 2;
		}
		if(this.minutosJugadosJornada.size()>=3&&this.minutosJugadosJornada.get(numJornada-1) > 60 && this.minutosJugadosJornada.get(numJornada-2) > 60 && this.minutosJugadosJornada.get(numJornada-3) > 60) {
			puntos+= 5;
		}
		if(this.golesAnotadosJornada.size()>=3&&this.golesAnotadosJornada.get(numJornada-1) > 1 && this.golesAnotadosJornada.get(numJornada-2) > 1 && this.golesAnotadosJornada.get(numJornada-3) > 1) {
			puntos+= 10;
		}
		if (this.puntosJornada == null) {
			this.puntosJornada = new ArrayList<Double>();
		}
		this.puntosJornada.add(numJornada-1, puntos);
		this.actualizarPuntosTotales();
		return this.puntosTotales;
	}
	public int getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos() {
		this.golesRecibidos = 0;
		for (int d: golesRecibidosJornada) {
			this.golesRecibidos+=d;
		}
	}
	public int getPenaltisAtajados() {
		return this.penaltisAtajados;
	}
	public void setPenaltisAtajados() {
		this.penaltisAtajados = 0;
		for (int d: penaltisAtajadosJornada) {
			this.penaltisAtajados+=d;
		}
	}
}
