
public class App {

	public static void main(String[] args) {

		// 2-dimensional arrays
		int numberGrid[][];
		numberGrid=new int[2][2];
		for (int i = 0; i < numberGrid.length; i++) {
			for (int j = 0; j < numberGrid[i].length; j++) {
				System.out.print(numberGrid[i][j] + "\t");
				
			}
		}
		
		// 2-dimensional arrays
		String textGrid[][]=new String[2][2];
		for (int i = 0; i < textGrid.length; i++) {
			for (int j = 0; j < textGrid[i].length; j++) {
				System.out.print(textGrid[i][j] + "\t");
				
			}
		}
		
		//2-dimensional arrays
		boolean flagTable[][] = {{true, true}, {false, false}};
		for (int i = 0; i < flagTable.length; i++) {
			for (int j = 0; j < flagTable[i].length; j++) {
				System.out.print(flagTable[i][j] + "\t");
				
			}
		}
		
	}

}
