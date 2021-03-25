package matrices;
/**
 * 
 * @author Janira
 *
 */
public class ValoresACero {
	
	public static int[][] rellenaMatrizUtil (int[][] matriz){
		
		Utilidades.rellenaMatriz(matriz, 0, 1);
		return matriz;
		
	}
	
	public static int [][] rellenaMatriz (int[][] matriz){
		
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				
			    matriz[i][j] = (int) (Math.random()*(1-0 + 1)+0);
			}
		}
		return matriz;
	}
	
	
	public static int columnasACero (int[][] matriz) {
		int cuantosCeros=0;
		int columnasACero=0;
		
		for (int i=0; i<=matriz.length-1; i++) {
			cuantosCeros=0;
			for (int j=0; j<=matriz.length-1; j++) {
				if (matriz[j][i]==0) {
					cuantosCeros++;
					
				}
			}
			if (cuantosCeros==matriz.length-1) {
				columnasACero++;
			}
		}
		return columnasACero;
	}
	
	public static int filasACero (int[][] matriz) {
		int cuantosCeros=0;
		int columnasACero=0;
		
		for (int i=0; i<=matriz.length-1; i++) {
			cuantosCeros=0;
			for (int j=0; j<=matriz.length-1; j++) {
				if (matriz[i][j]==0) {
					cuantosCeros++;
					
				}
			}
			if (cuantosCeros==matriz.length-1) {
				columnasACero++;
			}
		}
		return columnasACero;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] matriz = new int [10] [10];
		
		matriz=rellenaMatriz(matriz);
		
		for (int[] array : matriz) {
			for (int num : array) {
				System.out.print(num +" ");
			}
			System.out.println();
		}
		
		System.out.println("Hay " +filasACero(matriz) +" filas de ceros en la matriz");
		System.out.println("Hay " +columnasACero(matriz) +" columnas de ceros en la matriz");
	}

}
