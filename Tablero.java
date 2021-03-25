package matrices;

public class Tablero {
	
	public static void printTablero (int [][] matriz){
		System.out.println("  1 2 3 4 5 6 7 8");
		for (int i=0; i<=matriz.length-1; i++) {
			System.out.print(Character.toString ((char) 65+i));
			for (int j=0; j<=matriz[i].length-1; j++) {
				
				if (matriz[i][j]==0) {
					System.out.print(" .");
				//El punto centrado aparece como caracter especial y da problemas
				}else if (matriz[i][j]==1) {
					System.out.print(" +");
				}else if (matriz[i][j]==2) {
					System.out.print(" 0");
				}else if (matriz[i][j]==3) {
					System.out.print(" X");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tablero = 

			 {{0, 0, 1, 1, 0, 1, 0, 0},

			  {3, 0, 0, 0, 3, 0, 0, 1},

			  {0, 0, 1, 0, 0, 3, 0, 0},

			  {2, 0, 0, 0, 3, 0, 0, 0},

			  {1, 0, 0, 3, 3, 2, 0, 0},

			  {0, 0, 0, 1, 2, 0, 0, 0},

			  {0, 0, 0, 1, 0, 0, 0, 0},

			  {1, 0, 0, 0, 0, 0, 0, 0}};
		
		
		printTablero(tablero);
		
		
		
		

}
}