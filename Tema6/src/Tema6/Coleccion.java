package Tema6;
import java.util.Scanner;

import tema5.Disco;
public class Coleccion {
	Scanner tec = new Scanner(System.in);
	private int indice=0;
	Disco [] coleccion = new Disco[100];
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	} 

	public void InDisco() {
		System.out.println("Titulo: ");
		String titulo = tec.nextLine();
		System.out.println("Numero de canciones: ");
		int ncan = tec.nextInt();
		System.out.println("Precio: ");
		float precio = tec.nextFloat();
		System.out.println("Fecha: ");
		int fecha = tec.nextInt();
		Disco dc = new Disco(titulo,ncan,fecha,precio);
		coleccion[indice]=dc;
	}
	public void BusDisco(int ind) {
		
		coleccion[ind].ImpDisco();
		
	}
}
