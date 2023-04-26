package practica;

import java.util.Scanner;

public class tabla_precios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String precio [][]= new String[5][2];
		precio[0][0]="manzana";
		precio[0][1]= "50";
		precio[1][0]="Arroz";
		precio[1][1]="23";
		precio[2][0]="agucate";
		precio[2][1]= "500";
		precio[3][0]="frijoles";
		precio[3][1]="26";
		precio[4][0]="azucar";
		precio[4][1] ="100";
		for(int i = 0; i<5 ;i++) {
		 for(int j=0; j<2;j++)
		 {
			 System.out.print(precio[i][j]+" ");
		 }
		 System.out.println("");
		}
		
		

	}

}
