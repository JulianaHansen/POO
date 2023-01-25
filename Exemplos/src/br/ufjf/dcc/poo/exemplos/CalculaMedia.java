package br.ufjf.dcc.poo.exemplos;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		float a, b, c, media;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextFloat();
		System.out.println("Digite o terceiro valor: ");
		c = teclado.nextFloat();
		media = (a+b+c)/3;
		System.out.println("A media e " + media);
		teclado.close();
	}

}
