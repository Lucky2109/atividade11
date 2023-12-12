package atividade11;

import java.util.Scanner;

public class Atividade11n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10,6};
		int leitura, indice=0;
		boolean localizarPosicao=true;
		
		System.out.println("Digite um numero para ser encontrado dentro do vetor:  ");
		leitura = leia.nextInt();
		
		while (indice < 10 && localizarPosicao == true) {
			
			if (vetorInteiros[indice] == leitura) {
				localizarPosicao = false;
				
				
			}
			
			indice++;
			
		}
			if(localizarPosicao == true) {
				
				System.out.println("Número" +leitura+ "não encontrado");}
			else {
				System.out.println("Número" +leitura+ "esta na posição "+ indice);
				
			}
			
		}
		
	
	

}
