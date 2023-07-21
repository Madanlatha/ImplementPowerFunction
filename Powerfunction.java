package implementPowerFunction;

import java.util.Scanner;

public class Powerfunction {
	 int power(int a,int b,int c){
		 
	        if (b==0){
	            return 1;
	        }
	        if(b==1) {
	        	return a;
	        }
	        	return power(a,b/2,c);
	 }
	     

	public static void main(String[] args) {		
				Scanner sc = new Scanner (System.in);
				int a = sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				Powerfunction pow=new Powerfunction();
				System.out.println(pow.power(a,b,c));
			}
		
	}


