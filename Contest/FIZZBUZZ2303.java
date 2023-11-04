/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt();
		    int b = 1;
		    int k = 1;
		    int m = (n - 2);
		    for ( int i = 1 ; i<=n ; i++){
		        
		    
		    b = b * i;
		    
		    }
		    for ( int i = 1 ; i<=m ; i++ ) {
		    k = k * i ; 
		        
		    }
		    System.out.println(b / k);
		}
	}
}
