package Tema6;

public class Ejer02 {

		public int[] sum(int[]vector1,int []vector2) {
			int[]vector3 = new int[vector1.length];
			for(int i = 0;i<vector1.length;++i) {
				vector3[i]=vector1[i]+vector2[i];
			}
			return vector3;
			
		}

	public static void main(String[] args) {
		Ejer02 suma = new Ejer02();
		int []vector1 = new int[10];
		int []vector2 = new int[10];
		int []vector3 = new int[10];
		vector3=suma.sum(vector1,vector2);
		for(int i = 0;i<vector1.length;++i) {
		System.out.println(vector3[i]);
		}
		}

}
