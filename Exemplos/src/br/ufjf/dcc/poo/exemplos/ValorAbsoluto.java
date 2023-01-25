package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class ValorAbsoluto {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ", null, JOptionPane.QUESTION_MESSAGE));
		if(num < 0) {
			num *= -1;
		}
		JOptionPane.showMessageDialog(null, "Absoluto: " + num);
	}

}
