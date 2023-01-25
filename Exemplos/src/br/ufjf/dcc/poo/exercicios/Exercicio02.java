package br.ufjf.dcc.poo.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float larguraTerreno, profundidadeTerreno, larguraCasa, profundidadeCasa, areaTerreno, areaCasa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		larguraTerreno = teclado.nextFloat();
		System.out.println("Digite a profundidade do terreno: ");
		profundidadeTerreno = teclado.nextFloat();
		System.out.println("Digite a largura da casa: ");
		larguraCasa = teclado.nextFloat();
		System.out.println("Digite a profundidade da casa: ");
		profundidadeCasa = teclado.nextFloat();
		
		areaCasa = larguraCasa * profundidadeCasa;
		areaTerreno = larguraTerreno * profundidadeTerreno;
		
		System.out.println("Resta " + ((areaTerreno-areaCasa)/areaTerreno)*100 + "% da area");
		teclado.close();
	}

}
