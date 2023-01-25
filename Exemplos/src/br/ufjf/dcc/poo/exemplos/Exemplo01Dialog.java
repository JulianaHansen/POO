package br.ufjf.dcc.poo.exemplos;

import javax.swing.JOptionPane;

public class Exemplo01Dialog {

	public static void main(String[] args) {
		String nomeUsuario = null;
		nomeUsuario = JOptionPane.showInputDialog(null, nomeUsuario);
		JOptionPane.showMessageDialog(null, "Ola " + nomeUsuario + "!");

	}

}
