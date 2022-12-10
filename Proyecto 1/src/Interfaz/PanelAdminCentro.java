package Interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAdminCentro extends JPanel {
	private VentanaAdmin padre;
	
	private JTextField tfArchivoPartidos;
	private JTextField tfArchivoInfoJugadores; 
	private JTextField tfArchivoDatosPartido;
	
	private JLabel etiquetaArchivoPartidos;
	private JLabel etiquetaArchivoInfoJugadores;
	private JLabel etiquetaArchivoDatosPartido;
	private JLabel etiquetaConfigurarTemporada;
	private JLabel etiquetaEspacio;
	private JLabel etiquetaEspacio2;
	
	
	
	public PanelAdminCentro(VentanaAdmin papa) {
		padre = papa;
		
		tfArchivoPartidos = new JTextField("");
		tfArchivoPartidos.setPreferredSize(new Dimension(500,30));
		tfArchivoInfoJugadores= new JTextField("");
		tfArchivoInfoJugadores.setPreferredSize(new Dimension(500,30));
		tfArchivoDatosPartido= new JTextField("");
		tfArchivoDatosPartido.setPreferredSize(new Dimension(500,30));
		
		etiquetaArchivoPartidos= new JLabel("Ingrese el filePath de los partidos de la temporada:");
		etiquetaArchivoInfoJugadores= new JLabel("Ingrese el filePath con la informacion de los "
				+ "jugadores de la temporada:");
		etiquetaArchivoDatosPartido= new JLabel("Ingrese el filePath con los datos del partido deseado:");
		etiquetaConfigurarTemporada= new JLabel("ARCHIVOS PARA CONFIGURAR LA TEMPORADA");
		etiquetaEspacio= new JLabel("");
		etiquetaEspacio2= new JLabel("");
		
		
		setLayout(new GridLayout(9,1));
		
		add(etiquetaArchivoDatosPartido);
		add(tfArchivoDatosPartido);
		
		add(etiquetaEspacio);
		
		add(etiquetaConfigurarTemporada);
		add(etiquetaArchivoPartidos);
		add(tfArchivoPartidos);
		add(etiquetaArchivoInfoJugadores);
		add(tfArchivoInfoJugadores);
		
		//add(etiquetaEspacio2);
		
		
	}



	public JTextField getTfArchivoPartidos() {
		return tfArchivoPartidos;
	}



	public JTextField getTfArchivoInfoJugadores() {
		return tfArchivoInfoJugadores;
	}



	public JTextField getTfArchivoDatosPartido() {
		return tfArchivoDatosPartido;
	}
	
	

}
