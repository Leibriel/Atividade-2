package matriz;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int matriz[][] = new int[50][50];
		int dp = 0;
		int x = 1;
		
		//leitura
		for(int i=0; i<50; i++) {
			for(int j=0; j<50; j++) {
				matriz[i][j] = x;
				x+=2;
			}
		}
		
		//apresentacao
		for(int i=0; i<50; i++) {
			for(int j=0; j<50; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		//diagonal principal
				for(int i=0; i<50; i++) {
					for(int j=0; j<50; j++) {
						if(i==j) {
							dp = dp + matriz[i][j];
						}
					}
					
				}
		
		System.out.println("O resultado da diagonal principal é: " + dp);
	}

}
