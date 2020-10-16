import java.util.Scanner;
public class Day4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integer=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<integer.length;i++) {
			integer[i]=s.nextInt();
		}
		System.out.println("Odd values");
		for(int i=0;i<integer.length;i++) {
			if(integer[i]%2!=0) {
				System.out.println(integer[i]);
			}
		}
	}

}
