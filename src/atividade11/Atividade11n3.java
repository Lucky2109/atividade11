package atividade11;

import java.util.Scanner;

public class Atividade11n3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int matrizInteiros [][] = {{1, 2, 3}, 
								   {4, 5, 6}, 
								   {7, 8, 9}};;
		int i = 0, soma=0, soma2=0, b=0;
		
		
		
		for(int indiceLinha = 0; indiceLinha< 3; indiceLinha++) {
			for(int indiceColuna = 0; indiceColuna< 3; indiceColuna++) {
				
				System.out.println("Digite "+matrizInteiros [indiceLinha][indiceColuna] +" numero");
				matrizInteiros[indiceLinha][indiceColuna] = leia.nextInt();
				
			}			
			
		}
		
		for(int indiceLinha = 0; indiceLinha< 3; indiceLinha++) {
			for(int indiceColuna = 0; indiceColuna< 3; indiceColuna++) {
																																																	
			
		}
		
				// TODO Auto-generated method stub						
	}
		soma=matrizInteiros[0][2]+matrizInteiros[1][1]+matrizInteiros[2][0];
		soma2=matrizInteiros[0][0]+matrizInteiros[1][1]+matrizInteiros[2][2];
		System.out.println("Os elementos da diagonal principal são: ");
		System.out.println(matrizInteiros[0][0]);
		
		System.out.println(matrizInteiros[1][1]);
		
		System.out.println(matrizInteiros[2][2]);
																
		System.out.println("Os elementos da diagonal secundaria são: ");
		System.out.println(matrizInteiros[0][2]);
		
		System.out.println(matrizInteiros[1][1]);
		
		System.out.println(matrizInteiros[2][0]);
		
		System.out.println("A soma do elementos da diagonal principal é: "+soma);
		System.out.println("A soma do elementos da diagonal secundaria é: "+soma2);
		

}
}
