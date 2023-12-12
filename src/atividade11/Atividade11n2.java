package atividade11;

import java.util.Scanner;

public class Atividade11n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = new int[10];
		int incremento=1, soma=0;
		
		
		
		
		for(int linha = 0; linha<= 9; linha++) {
			
			System.out.println("Digite o "+ incremento++ + " numero de 10:  ");
			vetorInteiros[linha] = leia.nextInt(); 
		}
		
		for(int linha = 0; linha<=9; linha++) {
			
			
			if(vetorInteiros[linha]%2==0) {
			
				soma = soma+vetorInteiros[linha];
				System.out.println("O numero "+vetorInteiros [linha] +" é par");}}
				
			
			
		for(int linha = 0; linha<=9; linha++) {
			
			if(vetorInteiros[linha]%2==1) {
			
				soma = soma+vetorInteiros[linha];
				System.out.println("O numero "+vetorInteiros [linha] +" é impar");}}
		
		
			
		System.out.println("a soma dos numeros do vetor é  "+ soma );
		System.out.println("a média dos numeros do vetor é  "+ soma/10 );
				
		

			

	}

}
