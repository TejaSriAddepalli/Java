import java.util.Scanner;
public class Day4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		int sum=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum is: "+sum);
	}

}
