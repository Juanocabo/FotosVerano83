package Tema6;
public class Menu {
	Plato[] carta = new Plato[6];
	static int cont=0;
	public Menu() {
		for(int i = 0;i<carta.length;++i) {
		carta[i] = new Plato();}
	}	
	public void setCarta(String Nombre, String Ingredientes, float precio) {
		if(cont<6) {
		carta[cont].setNombre(Nombre);
		carta[cont].setIngredientes(Ingredientes);
		carta[cont].setPrecio(precio);
		++cont;}
	}
	public void verCarta() {
		for(int i = 0;i<carta.length;++i) {
			 System.out.println(i+1);
			 System.out.println(carta[i].getNombre());
			 System.out.println(carta[i].getIngredientes());
			 System.out.println(carta[i].getPrecio());
			 System.out.println();
			 System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Menu menu = new Menu();
		menu.setCarta("salchicha","pan",21);
		menu.verCarta();
	}
}
