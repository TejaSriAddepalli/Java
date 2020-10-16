import java.util.Scanner;
class Student{
	int sub1, sub2,sub3,sub4,sub5;
    float percentage=0;
	float average;
	public void calculatePercentage() {
		Scanner sc=new Scanner(System.in);
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
		sub4=sc.nextInt();
		sub5=sc.nextInt();
		average = (sub1+sub2+sub3+sub4+sub5);
		percentage = (average/500)*100;
		if(percentage>=90) {
			System.out.println("A-Grade for "+percentage+"%");
		}
		else if(percentage <90 && percentage>=75){
			System.out.println("B-Grade for "+percentage+"%");
		}
		else if(percentage< 75 && percentage>=60){
			System.out.println("C-Grade for "+percentage+"%");
		}
		else if(percentage<60 && percentage>=50){
			System.out.println("D-Grade for "+percentage+"%");
		}
		else{
			System.out.println("Fail for "+percentage+"%");
		}
	}
}
public class Day3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.calculatePercentage();
	}

}
