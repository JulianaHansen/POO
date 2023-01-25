package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class ConsumoCombustivel {

	public static void main(String[] args) {
		int km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os quilometros dirigidos: ", null, JOptionPane.QUESTION_MESSAGE));
		int litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os litros do tanque cheio: ", null, JOptionPane.QUESTION_MESSAGE));
		float kmPorLitro = (float) km/litros;
		JOptionPane.showMessageDialog(null, kmPorLitro + "km/litro");
	}

}
