package br.ufjf.dcc.poo.exercicios;

import javax.swing.JOptionPane;

public class LadosTriangulo {

	public static void main(String[] args) {
		float lado1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado 1: ", null, JOptionPane.QUESTION_MESSAGE));
		float lado2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado 2: ", null, JOptionPane.QUESTION_MESSAGE));
		float lado3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Lado 3: ", null, JOptionPane.QUESTION_MESSAGE));
		
		boolean verifica1 = Math.abs(lado3-lado2) < lado1 && (lado3+lado2) > lado1;
		boolean verifica2 = Math.abs(lado3-lado1) < lado2 && (lado3+lado1) > lado2;
		boolean verifica3 = Math.abs(lado1-lado2) < lado3 && (lado1+lado2) > lado3;
		
		if(verifica1 && verifica2 && verifica3)
			JOptionPane.showMessageDialog(null, "Existe");
		else
			JOptionPane.showMessageDialog(null, "Não existe");
	}
}
