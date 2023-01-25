package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Exercicio01Dialog {

	public static void main(String[] args) {
		float a = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um numero: ", null, JOptionPane.QUESTION_MESSAGE));
		float b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite outro numero: ", null, JOptionPane.QUESTION_MESSAGE));
		float soma = a + b;
		JOptionPane.showMessageDialog(null, "A soma é " + soma);

	}

}
