package poo;

import java.util.Scanner;

public class Arreglo {
	
	public void ejercicio() {
		String arreglo [] = new String[5] ;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< arreglo.length; i++) {
			arreglo[i]= sc.next();	
		}
		for(int i = 0; i<arreglo.length; i++) {
			System.out.println(arreglo[i] + " Tama�o " + arreglo[i].length());
		}
		sc.close();
	}

}
