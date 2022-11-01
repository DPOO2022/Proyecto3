package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class VentanaCrearEquipo extends JFrame{
	private PanelCrearEquipo panelCrearEquipo;
	private PanelInferiorCrearEquipo panelInferiorCrearEquipo;
	private InterfazPrincipal padre;
	
	public VentanaCrearEquipo(InterfazPrincipal papa) {
		padre = papa;
		panelCrearEquipo = new PanelCrearEquipo(this);
		panelInferiorCrearEquipo = new PanelInferiorCrearEquipo(this);
		panelCrearEquipo.setSize(700,200);
		setLayout(new BorderLayout());
		add(panelCrearEquipo, BorderLayout.NORTH);
		add(panelInferiorCrearEquipo, BorderLayout.SOUTH);
		setTitle("Fantasy Football");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(900, 600));
		setResizable(false);
		setVisible(true);
	}
	public InterfazPrincipal getInterfaz() {
		return this.padre;
	}
}
