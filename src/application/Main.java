package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Circulo;
import entity.Forma;
import entity.Retangulo;
import enums.Cor;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os dados de N figuras (N fornecido
		 * pelo usuário), e depois mostrar as áreas destas figuras na
		 * mesma ordem em que foram digitadas.
		 * 
		 * Enter the number of shapes: 2
		 * Shape #1 data:
		 * Rectangle or Circle (r/c)? r
		 * Color (BLACK/BLUE/RED): BLACK
		 * Width: 4.0
		 * Height: 5.0
		 * Shape #2 data:
		 * Rectangle or Circle (r/c)? c
		 * Color (BLACK/BLUE/RED): RED
		 * Radius: 3.0
		 * SHAPE AREAS:
		 * 20.00
		 * 28.27
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<Forma>();
		
		
		System.out.println("Entre com o número de Formas: ");
		Integer num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println("Shape #" + i + " data:");
			sc.nextLine();
			
			System.out.println("Retangulo ou Circulo (r/c)?");
			String tipo = sc.nextLine();
			
			System.out.println("Cor (BLACK/BLUE/RED):");
			Cor cor = Cor.valueOf(sc.next());

			
			if(tipo.equals("r")) {
				System.out.println("Largura: ");
				Double largura = sc.nextDouble();
				
				System.out.println("Altura: ");
				Double altura = sc.nextDouble();
				
				Retangulo ret = new Retangulo(cor, largura, altura);
				
				list.add(ret);
			}else {
				System.out.println("Raio: ");
				Double raio = sc.nextDouble();
				
				Circulo circ = new Circulo(cor, raio);
				
				list.add(circ);
			}
		}
		
		System.out.println();
		System.out.println("AREAS DAS FORMAS: ");
		
		for (Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		
		
		sc.close();
	}

}
