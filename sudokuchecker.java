package javaapplication21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
;

class SudokuChecker{
	static boolean[] numbers;
        String az = "True";
                String bz = "False";
	/**
	 * Sample Input:
	 * 1) 1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,8,9,1,3,4,5,6,7,8,9,1,2,4,5,6,7,8,9,1,2,3,5,6,7,8,9,1,2,3,4,6,7,8,9,1,2,3,4,5,7,8,9,1,2,3,4,5,6,8,9,1,2,3,4,5,6,7,9,1,2,3,4,5,6,7,8
	 * 
	 * 2) 1,2,7,5,3,9,8,4,6,4,5,3,8,6,1,7,9,2,8,9,6,4,7,2,1,5,3,2,8,9,3,1,7,4,6,5,3,6,5,2,8,4,9,1,7,7,4,1,9,5,6,3,2,8,9,7,4,6,2,8,5,3,1,5,1,2,7,4,3,6,8,9,6,3,8,1,9,5,2,7,4
	 * 
	 * 3) 8,1,2,9,7,4,3,6,5,9,3,4,6,5,1,7,8,2,7,6,5,8,2,3,9,4,1,5,7,1,4,8,2,6,9,3,2,8,9,3,6,5,4,1,7,6,4,3,7,1,9,2,5,8,1,9,6,5,3,7,8,2,4,3,2,8,1,4,6,5,7,9,4,5,7,2,9,8,1,3,6
	 * @param args
	 */
	public static void main(String args[]) throws IOException{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	    String s;
            while ((s = in.readLine()) != null) {
		//Scanner scan = new Scanner(System.in);
		//String input = scan.nextLine();
		String[] sudokuString = s.split(",");
            
		int SudokuPuzzle[][] = new int[9][9];
		SudokuChecker sc = new SudokuChecker();
		int counter = 0;
		for(int i = 0; i < 9; i++){
			counter  = i > 0 ? counter + 9 : 0;
			for(int j = 0; j < 9; j++){
//				System.out.println(i+j);
			SudokuPuzzle[i][j] = Integer.parseInt(sudokuString[j+counter]);
			System.out.print(SudokuPuzzle[i][j]+" ");
			}
			System.out.println();
		}
            
//		System.out.println(sc.display(SudokuPuzzle));
		System.out.println(sc.checkSudoku(SudokuPuzzle));
		
            }
            }
        
//	void display(int[][] SudokuPuzzle){
//		System.out.println();
//	}

	String checkSudoku(int[][] SudokuPuzzle){
		
		String  a = checkRows(SudokuPuzzle);
		String  b = checkColumns(SudokuPuzzle);
		String  c = checkGrid(SudokuPuzzle);
		if(a.equals(b) && b.equals(c) )
			return az;
		// checkColumns(SudokuPuzzle);
		return bz;
	}

	String  checkRows(int[][] SudokuPuzzle){
		for(int i = 0; i < 9; i++){
			numbers = new boolean[10];
			for(int j = 0; j < 9; j++){
				int digit = SudokuPuzzle[i][j];
				if(numbers[digit]){
					return bz;
				}
				else{
					numbers[digit] = true;
				}
			}	
		}
		return az;
	}

	String checkColumns(int[][] SudokuPuzzle){
		String az = "True";
                String bz = "False";
            for(int j = 0; j < 9; j++){
			numbers = new boolean[10];
			for(int i = 0; i < 9; i++){
				int digit = SudokuPuzzle[i][j];
				if(numbers[digit]){
					return bz;
				}
				else{
					numbers[digit] = true;
				}
			}	
		}
		return az;
	}

	String checkGrid(int[][] SudokuPuzzle){
		for (int k = 0; k < 9; k+=3){
			numbers = new boolean[10];
			for(int j = k+0; j < k+3; j++){
				for(int i = k+0; i < k+3; i++){
					int digit = SudokuPuzzle[i][j];
					if(numbers[digit]){
						return bz;
					}
					else{
						numbers[digit] = true;
					}
				}	
			}
		}
		return az;
	}

}