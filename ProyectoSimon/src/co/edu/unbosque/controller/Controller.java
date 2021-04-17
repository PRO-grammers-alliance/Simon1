package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Operaciones;
import co.edu.unbosque.view.VentanaBienvenida;
import co.edu.unbosque.view.VentanaJuego;

public class Controller implements ActionListener {

	private VentanaBienvenida ventanaBienvenida;
	private VentanaJuego ventanaJuego;
	private Operaciones op;

	public Controller() {
		ventanaBienvenida = new VentanaBienvenida();
		ventanaJuego = new VentanaJuego();
		op = new Operaciones();
		asignarOyentes();
	}

	public void asignarOyentes() {
		ventanaBienvenida.getPi().getBtingreso().addActionListener(this);
		ventanaJuego.getpC().getBtEmpezar().addActionListener(this);
		ventanaJuego.getpS().getColorV().addActionListener(this);
		ventanaJuego.getpS().getColorR().addActionListener(this);
		ventanaJuego.getpS().getColorA().addActionListener(this);
		ventanaJuego.getpS().getColorAz().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("jugar")) {
			ventanaBienvenida.setVisible(false);
			ventanaJuego.setVisible(true);
		} else if (e.getActionCommand().equals("empezar")) {
			// Pasa por parametro la secuencia en un string de numeros y los escribe en el archivo de propiedades
			op.gestionarPropiedades(op.crearSecuencia());
			// Escribe en la parte superior los n�meros generados
			for (int i = 0; i < 4; i++) {
				if (i==0) {
					ventanaJuego.getpN().getNum1().setText(""+op.verSecuencia(i));
				} else if (i==1) {
					ventanaJuego.getpN().getNum2().setText(""+op.verSecuencia(i));
				} else if (i==2) {
					ventanaJuego.getpN().getNum3().setText(""+op.verSecuencia(i));
				} else if (i==3) {
					ventanaJuego.getpN().getNum4().setText(""+op.verSecuencia(i));		
				}
			}
			//Activa los botones para seguir la secuencia
			ventanaJuego.getpS().getColorV().setEnabled(true);
			ventanaJuego.getpS().getColorR().setEnabled(true);
			ventanaJuego.getpS().getColorA().setEnabled(true);
			ventanaJuego.getpS().getColorAz().setEnabled(true);
			
			

		} else if (e.getActionCommand().equals("verde")) {
			
		} else if (e.getActionCommand().equals("rojo")) {
			
		} else if (e.getActionCommand().equals("amarillo")) {
			
		} else if (e.getActionCommand().equals("azul")) {
			
		}
	}
}
