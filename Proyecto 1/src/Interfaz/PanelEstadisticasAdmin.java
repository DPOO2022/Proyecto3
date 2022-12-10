package Interfaz;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEstadisticasAdmin extends JPanel implements ActionListener{
	private static final String EQUIPOS = "EQUIPOS";
	private static final String JUGADORES = "JUGADORES";
	private static final String JEQUIPO = "JEQUIPO";
	private JButton btnEstComparacionRankEquipos;
	private JButton btnPuntosJugadoresEquipo;
	private JButton btnEstJugadoresMasPuntosUnEquipo;
	private JTextField txtRanking;
	private VentanaEstadisticaAdmin padre;
	public PanelEstadisticasAdmin(VentanaEstadisticaAdmin papa) {
		padre = papa;
		
		txtRanking = new JTextField("");
		txtRanking.setEditable(true);
		txtRanking.setPreferredSize(new Dimension(170,30));
		
		btnEstComparacionRankEquipos = new JButton("Comparacion Entre los mejores equipos");
		btnEstComparacionRankEquipos.setActionCommand(EQUIPOS);
		btnEstComparacionRankEquipos.addActionListener(this);
		
		btnPuntosJugadoresEquipo = new JButton("Jugadores Mayor Aporte");
		btnPuntosJugadoresEquipo.setActionCommand(JUGADORES);
		btnPuntosJugadoresEquipo.addActionListener(this);
		
		btnEstJugadoresMasPuntosUnEquipo = new JButton("Jugadores Mas Puntos en un equipo");
		btnEstJugadoresMasPuntosUnEquipo.setActionCommand(JEQUIPO);
		btnEstJugadoresMasPuntosUnEquipo.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(txtRanking);
		add(btnEstComparacionRankEquipos);
		add(btnPuntosJugadoresEquipo);
		add(btnEstJugadoresMasPuntosUnEquipo);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String evento = e.getActionCommand();
		if(evento.equals(EQUIPOS)) {
			this.padre.mostrarComparacionRankEquipos(txtRanking.getText());
		}
		if(evento.equals(JUGADORES)) {
			this.padre.mostrarJugadoresMayorAporte(txtRanking.getText());
		}
		//if(evento.equals(JEQUIPO)) {
		//	this.padre.mostrarJ();
		//}
	}
}

