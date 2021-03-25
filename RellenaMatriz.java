package matrices;
/**
 * 
 * @author Janira
 *
 */
public class RellenaMatriz {
	
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
		
		
	}

}
