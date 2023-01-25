package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a: ");
		a = teclado.nextDouble();
		System.out.println("Digite b: ");
		b = teclado.nextDouble();
		System.out.println("Digite c: ");
		c = teclado.nextDouble();
		
		delta = Math.pow(b, 2) - 4*a*c;
		x1 = (-b + Math.sqrt(delta))/2*a;
		x2 = (-b - Math.sqrt(delta))/2*a;
		
		System.out.println("x1 = " + x1 + " e x2 = " + x2);
		teclado.close();
	}

}
