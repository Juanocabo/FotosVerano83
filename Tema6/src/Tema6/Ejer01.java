package Tema6;

public class Ejer01 {
	public int mediaVe(int [] numeros) {
		int media,suma=0;
		for(int j = 0; j < numeros.length;++j) {
			
			suma+= numeros[j];
		}
		media=(suma/numeros.length);
		return media;
	}
	public void Esp(int [] numeros) {
		int media,sup=0,inf=0,ig=0;
		 media=mediaVe(numeros);
		for(int i = 0;i<numeros.length;++i) {
			if(numeros[i]>media)++sup;
			else if(numeros[i]<media)++inf;
			else ++ig;
		}
		System.out.println(sup +" "+ inf+" "+ig);
	}
	
	
	public static void main(String[] args) {
		Ejer01 hola = new Ejer01();
		int [] numeros = new int[20];
		int suma=0,media,sup=0,inf=0,ig=0;
		for(int i = 0;i<numeros.length;++i) {
			numeros[i]= (int)(Math.random()*20)+1;
			System.out.println(numeros[i]);
		}
		System.out.println(hola.mediaVe(numeros));
		hola.Esp(numeros);

	}}
