import java.util.*;
class Weird
{
	public static void main(String args[])
	{
		 Scanner in = new Scanner(System.in);
         long n = in.nextInt();
		 System.out.print(n+" ");
		 while(n!=1)
		 {
			 if(n%2==0){
				 n=n/2;
			 }
			 else{
				 n=n*3;
				 n=n+1;
			 }
			 System.out.print(n+" ");
		 }
	}
}