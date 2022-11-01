package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import modelo.Participante;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JPanel{
	
	private VentanaUsuario padre;
	
	private JLabel titulares;
	private JLabel suplentes;
	
	private JCheckBox  jugador1;
	private JCheckBox  jugador2;
	private JCheckBox  jugador3;
	private JCheckBox  jugador4;
	private JCheckBox  jugador5;
	private JCheckBox  jugador6;
	private JCheckBox  jugador7;
	private JCheckBox  jugador8;
	private JCheckBox  jugador9;
	private JCheckBox  jugador10;
	private JCheckBox  jugador11;
	private JCheckBox  jugador12;
	private JCheckBox  jugador13;
	private JCheckBox  jugador14;
	private JCheckBox  jugador15;
	
	
	public PanelUsuario(VentanaUsuario papa) {
		padre = papa;
		if (((Participante)padre.getInterfaz().getAplicacion().getUsuarioActivo()).getEquipo()!=null) {
			setBorder(new TitledBorder(((Participante)padre.getInterfaz().getAplicacion().getUsuarioActivo()).getEquipo().getNombre()));
		}
		titulares = new JLabel("Titulares:");
		suplentes = new JLabel("Suplentes:");
		
		jugador1 = new JCheckBox ();
		jugador1.setPreferredSize(new Dimension(70,10));
		//jugador1.setEditable(false);
		jugador2 = new JCheckBox ();
		jugador2.setPreferredSize(new Dimension(70,10));
		//jugador2.setEditable(false);
		jugador3 = new JCheckBox ();
		jugador3.setPreferredSize(new Dimension(70,10));
		//jugador3.setEditable(false);
		jugador4 = new JCheckBox ();
		jugador4.setPreferredSize(new Dimension(70,10));
		//jugador4.setEditable(false);
		jugador5 = new JCheckBox ();
		jugador5.setPreferredSize(new Dimension(70,10));
		//jugador5.JCheckBox (false);
		jugador6 = new JCheckBox ();
		jugador6.setPreferredSize(new Dimension(70,10));
		//jugador6.setEditable(false);
		jugador7 = new JCheckBox ();
		jugador7.setPreferredSize(new Dimension(70,10));
		//jugador7.setEditable(false);
		jugador8 = new JCheckBox ();
		jugador8.setPreferredSize(new Dimension(70,10));
		//jugador8.setEditable(false);
		jugador9 = new JCheckBox ();
		jugador9.setPreferredSize(new Dimension(70,10));
		//jugador9.setEditable(false);
		jugador10 = new JCheckBox ();
		jugador10.setPreferredSize(new Dimension(70,10));
		//jugador10.setEditable(false);
		jugador11 = new JCheckBox ();
		jugador11.setPreferredSize(new Dimension(70,10));
		//jugador11.setEditable(false);
		jugador12 = new JCheckBox ();
		jugador12.setPreferredSize(new Dimension(70,10));
		//jugador12.setEditable(false);
		jugador13 = new JCheckBox ();
		jugador13.setPreferredSize(new Dimension(70,10));
		//jugador13.setEditable(false);
		jugador14 = new JCheckBox ();
		jugador14.setPreferredSize(new Dimension(70,10));
		//jugador14.setEditable(false);
		jugador15 = new JCheckBox ();
		jugador15.setPreferredSize(new Dimension(70,10));
		//jugador15.setEditable(false);
	
		setLayout(new GridLayout(15,1));
		
		add(titulares);
		add(jugador1);
		add(jugador2);
		add(jugador3);
		add(jugador4);
		add(jugador5);
		add(jugador6);
		add(jugador7);
		add(jugador8);
		add(jugador9);
		add(jugador10);
		add(jugador11);
		add(suplentes);
		add(jugador12);
		add(jugador13);
		add(jugador14);
		add(jugador15);
		
	}
	
}
