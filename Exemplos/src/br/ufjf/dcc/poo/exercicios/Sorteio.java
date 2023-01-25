package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class Sorteio {

	public static void main(String[] args) {
		int numSorteado =  (int) (100*Math.random());
		int numDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ", null, JOptionPane.QUESTION_MESSAGE));
		while(numSorteado != numDigitado) {
			if(numSorteado > numDigitado)
				JOptionPane.showMessageDialog(null, "O numero sorteado é maior que o digitado");
			else
				JOptionPane.showMessageDialog(null, "O numero sorteado é menor que o digitado");
			numDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero: ", null, JOptionPane.QUESTION_MESSAGE));
		}
		JOptionPane.showMessageDialog(null, "Você acertou o numero sorteado");
	}

}
