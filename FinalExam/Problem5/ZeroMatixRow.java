package FinalExam_Code;


public class ZeroMatixRow {
	
	public static void main(String[] args) {
		//Random r = new Random();
		int[][] temp = new int[10][10];
		System.out.println(temp.length);
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				temp[i][j] = 5;
			}
		}
		
		for(int i = 0; i < temp.length; i++) {
			temp[5][i] = 0;
		}
		
		
		for(int i = 0; i < temp.length; i++) {
			temp[8][i] = 0;
		}
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp.length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
		
		int count = 0;
		for(int row = 0; row < temp.length; row++) {
			for(int col = 0; col < temp.length; col++) {
				if(temp[row][col] == 0) {
					count++;
				}
			}
			
			if(count == temp.length) {
				System.out.println("The first zero row is: " + row);
				break;
			}
			
			count = 0;
		}
		
	}

}
