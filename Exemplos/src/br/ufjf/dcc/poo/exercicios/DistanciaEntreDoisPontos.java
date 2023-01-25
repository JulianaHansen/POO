package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		float ax = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a coordenada x do ponto a: ", null, JOptionPane.QUESTION_MESSAGE));
		float ay = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a coordenada y do ponto a: ", null, JOptionPane.QUESTION_MESSAGE));
		float bx = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a coordenada x do ponto b: ", null, JOptionPane.QUESTION_MESSAGE));
		float by = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a coordenada y do ponto b: ", null, JOptionPane.QUESTION_MESSAGE));
		float distancia = (float) Math.sqrt(Math.pow(bx-ax, 2)+Math.pow(by-ay, 2));
		JOptionPane.showMessageDialog(null, "A distancia é " + distancia);
	}

}
