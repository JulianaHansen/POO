package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int cinco, dez, vinteCinco, cinquenta, valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		valor = teclado.nextInt();
		
		cinquenta = valor/50;
		valor -= 50*cinquenta;
		
		vinteCinco = valor/25;
		valor -= 25*vinteCinco;
		
		dez = valor/10;
		valor -= 10*dez;
		
		cinco = valor/5;
		valor -= 5*dez;
		
		System.out.println(cinquenta + " moedas de 50 centavos");
		System.out.println(vinteCinco + " moedas de 25 centavos");
		System.out.println(dez + " moedas de 10 centavos");
		System.out.println(cinco + " moedas de 5 centavos");
		teclado.close();
	}

}
