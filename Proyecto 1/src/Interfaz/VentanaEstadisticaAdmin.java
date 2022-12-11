package Interfaz;

import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaEstadisticaAdmin extends JFrame{

		private InterfazPrincipal padre;
		private PanelEstadisticasAdmin panel;
		public VentanaEstadisticaAdmin(InterfazPrincipal papa) {
			padre = papa;
			
			panel = new PanelEstadisticasAdmin(this);
			
			setTitle("Fantasy Football");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(new Dimension(300, 200));
			setResizable(false);
			setVisible(true);
			
			add(panel);
			
		
	}
	public void mostrarComparacionRankEquipos(String ranking) {
		this.padre.mostrarComparacionRankEquipos(ranking);
	}
	public void mostrarJugadoresMayorAporte(String ranking) {
		this.padre.mostrarPuntosJugadoresEquipo(ranking);
	}
	public void mostrarJugadoresMasPuntosUnEquipo(String ranking) {
		this.padre.mostrarJugadoresMasPuntosUnEquipo(ranking);
	}
	
}
