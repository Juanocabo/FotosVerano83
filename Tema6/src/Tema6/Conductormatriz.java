package Tema6;

public class Conductormatriz {

	public static void main(String[] args) {
		Matriz hola = new Matriz(2,2);
		Matriz adios = new Matriz(2,2);
		hola.Imprimir();
		adios.Imprimir();
		hola.mul(adios).Imprimir();
		
	}

}
