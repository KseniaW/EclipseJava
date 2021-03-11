package groupProject;

public class quiz {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		int total=0;
		for(int r=0; r<a.length;r++) {
			
			for(int c=0; c<a[r].length;c++) {
				
				if(a[r][c]<0 && a[r][c]%2!=0) {
				total++;
				
				}
				
			}
			
		}
		
System.out.println(total);
		
	    }
	}
