package carpim;
import java.util.Scanner;

public class CarpimTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub000?
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int count = 0;
	     for(count = 0; count<=10; count++){
	    	 int multiple = count * n;
	    	 System.out.println(n + "*" + count + "=" +multiple);
	     }

	}

	public static boolean twoSumOne(int a, int b, int c) {
		return a+b==c?true:b+c==a?true:a+c==b?true:false;

	}


}
