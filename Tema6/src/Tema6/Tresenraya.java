package Tema6;

import java.util.Scanner;

public class Tresenraya {
Scanner tec = new Scanner(System.in);
	public Tresenraya() {
		boolean jugar=true;
		do {
			boolean partida=true;
			Juego ter = new Juego();
			do {
				int a,b;
				int t=tec.nextInt();
				switch(t) {
				case 7:a=0;b=0;break;
				case 8:a=0;b=1;break;
				case 9:a=0;b=2;break;
				case 4:a=1;b=0;break;
				case 5:a=1;b=1;break;
				case 6:a=1;b=2;break;
				case 1:a=2;b=0;break;
				case 2:a=2;b=1;break;
				case 3:a=2;b=2;break;
				default: a=0;b=0;
				}
				
				ter.Turno(a, b);
				if(ter.u==9||ter.fin==false)partida=false;
			}while(partida);
			System.out.println("Quieres jugar otra partida? y/n");
			String l = tec.next();
			if(l.equals("n")) {
				jugar=false;
				ter.Estadisticas();
			}
		}while(jugar);
		
	}
	public class Juego {
		public boolean fin=true;
		public int u = 0;
		static int partidax = 0,partidao=0,partidas=0;
		String[][] tablero = new String[3][3];

		public Juego() {
			for (int i = 0; i < tablero[0].length; ++i) {
				for (int j = 0; j < tablero.length; ++j) {
					tablero[i][j] = " ";
				}
			}
			fin=true;
			++partidas;
			Tablero();
		}

		public void Turno(int a, int b) {
			if (u % 2 == 0) {
				tablero[a][b] = "X";
			} else
				tablero[a][b] = "O";
			Tablero();
			Comprobar();
			++u;
			
		}
		public void Tablero() {
			System.out.println("  0 1 2");
			System.out.println();
			for (int i = 0; i < tablero[0].length; ++i) {
				System.out.print(i+" ");
				for (int j = 0; j < tablero.length; ++j) {
					System.out.print(tablero[i][j]);
					if (j < 2)
						System.out.print("|");
				}
				if (i < 2) {
					System.out.println();
					System.out.println("  ______");
					System.out.println();
				}
				else System.out.println();
			}

		}
		public void Comprobar() {
			if(tablero[0][0].equals("X")&&tablero[0][1].equals("X")&&tablero[0][2].equals("X")) fin=false;
			else if(tablero[1][0].equals("X")&&tablero[1][1].equals("X")&&tablero[1][2].equals("X")) fin=false;
			else if(tablero[2][0].equals("X")&&tablero[2][1].equals("X")&&tablero[2][2].equals("X")) fin=false;
			else if(tablero[0][0].equals("X")&&tablero[1][1].equals("X")&&tablero[2][2].equals("X")) fin=false;
			else if(tablero[0][2].equals("X")&&tablero[1][1].equals("X")&&tablero[2][0].equals("X")) fin=false;
			else if(tablero[0][0].equals("X")&&tablero[1][0].equals("X")&&tablero[2][0].equals("X")) fin=false;
			else if(tablero[0][1].equals("X")&&tablero[1][1].equals("X")&&tablero[2][1].equals("X")) fin=false;
			else if(tablero[0][2].equals("X")&&tablero[1][2].equals("X")&&tablero[2][2].equals("X")) fin=false;
			else if(tablero[0][0].equals("O")&&tablero[0][1].equals("O")&&tablero[0][2].equals("O")) fin=false;
			else if(tablero[1][0].equals("O")&&tablero[1][1].equals("O")&&tablero[1][2].equals("O")) fin=false;
			else if(tablero[2][0].equals("O")&&tablero[2][1].equals("O")&&tablero[2][2].equals("O")) fin=false;
			else if(tablero[0][0].equals("O")&&tablero[1][1].equals("O")&&tablero[2][2].equals("O")) fin=false;
			else if(tablero[0][2].equals("O")&&tablero[1][1].equals("O")&&tablero[2][0].equals("O")) fin=false;
			else if(tablero[0][0].equals("O")&&tablero[1][0].equals("O")&&tablero[2][0].equals("O")) fin=false;
			else if(tablero[0][1].equals("O")&&tablero[1][1].equals("O")&&tablero[2][1].equals("O")) fin=false;
			else if(tablero[0][2].equals("O")&&tablero[1][2].equals("O")&&tablero[2][2].equals("O")) fin=false;
			if(u%2==0 && fin==false) { 
				System.out.println("Ha ganado el jugador X");
				++partidax;
			}
			else if(u%2!=0 && fin==false) { 
				System.out.println("Ha ganado el jugador O");
				++partidao;
			}
			else if(u>=8)System.out.println("Empate");;
		}
		public void Estadisticas() {
			System.out.println("Partidas ganadas por X: "+partidax+"\n"+"Partidas ganadas por O: "+partidao+"\n"+"Partidas jugadas: "+partidas);
		}
	}
}