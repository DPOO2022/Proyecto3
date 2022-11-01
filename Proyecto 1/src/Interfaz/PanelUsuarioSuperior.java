package Interfaz;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUsuarioSuperior extends JPanel{
	
	private VentanaUsuario padre;
	
	private JButton verEstadisticas;
	private JButton comprarJugador;
	private JButton venderJugador;
	
	public PanelUsuarioSuperior(VentanaUsuario papa) {
		padre = papa;
		
		verEstadisticas = new JButton("Ver Estadísticas");
		comprarJugador = new JButton("Comprar Jugador");
		venderJugador = new JButton("Vender Jugador");
		setBorder(new TitledBorder("Bienvenido "+ padre.getInterfaz().getAplicacion().getUsuarioActivo().getNombreUsuario()+"!"));
		setLayout(new FlowLayout());
		add(verEstadisticas);
		add(comprarJugador);
		add(venderJugador);
	}

}
