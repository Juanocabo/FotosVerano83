
	import java.util.Scanner;

	public class PruebaDiscos {

		public static void main (String[]args){
			Discos myObj = new Discos();
			Scanner teclado = new Scanner(System.in);
			System.out.print("Titulo del disco: ");
			myObj.titulo = teclado.nextLine();
			System.out.print("Numero de canciones del disco: ");
			myObj.numCanciones = teclado.nextInt();
			System.out.print("Precio del disco: ");
			myObj.precio = teclado.nextInt();
			System.out.print("Fecha de compra del disco: ");
			myObj.fechaCompra = teclado.next();
			
			System.out.println("Titulo: " + myObj.titulo + "\r\n" + "Numero de canciones: " + myObj.numCanciones
					+ "\r\n" + "Precio: " + myObj.precio + "\r\n" + "Fecha de compra: " + myObj.fechaCompra);
			
		}

	}

