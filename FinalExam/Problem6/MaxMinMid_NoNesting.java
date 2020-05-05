package FinalExam_Code;

public class MaxMinMid_NoNesting {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 17; 
		int c = 43;
		int max = 0; 
		int min = 0;
		int mid = 0;
		
		long startTime = System.nanoTime();
		
		if(a > b && a > c && b > c) {
			max = a;
			min = c;
			mid = b;
		}
		
		else if(a > b && a > c && b < c) {
			max = a;
			min = b;
			mid = c;
		}
		
		else if(b  >c && b > a && a > c) {
			max = b;
			min = c;
			mid = a;
		}
		
		else if(b > c && b > a && c > a) {
			max = b;
			min = a;
			mid = c;
		}
		
		else if(c > a && c > b && a > b) {
			max = c;
			min = b;
			mid = a;
		}
		
		else {
			max = c;
			min = a;
			mid = b;
		}
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);  
		System.out.println("Time it took: " + duration);
		
		System.out.println("Max is "+ max);
		System.out.println("Mid is "+ mid);
		System.out.println("Min is "+ min);
		
		}
		  
}
