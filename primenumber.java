package Countprimes;

public class primenumber {

	public static int prime(int n) {
	     
		int count=1;
		if(n==0||n==1||n==2) {
		   return 0;
		}
		   else
			   for(int i=0;i<n;i++) {
				   for(int j=0;j<i;j++) {
					   if(i%j==0) {
						   break;
					   }else if(j==i-1 && i%j!=0) {
						   count++;
						   
				   }
				
			   }
				   
	
			}
		return count;
		
		}
			public static void main(String[]args) {
				int a=1;
				System.out.println(a);
			}
	
			
		}

	


