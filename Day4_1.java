import java.util.Scanner;
class Avenger{
	String name,power,weapon,planet;
	int age;
	Scanner s=new Scanner(System.in);

	public void getDetails() {
		//Scanner s=new Scanner(System.in);
		name=s.nextLine();
		age=s.nextInt();
		s.nextLine();
		power=s.nextLine();
		weapon=s.nextLine();
		planet=s.nextLine();
	}
	public void displayDetails() {
		System.out.println("Name: "+name+"\nAge: "+age+"\nPower: "+power+"\nWeapon: "+weapon+"\nPlanet: "+planet+"\n");
	}
}
public class Day4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avenger[] a=new Avenger[5];
		for(int i=0;i<5;i++) {
			a[i]=new Avenger();
			a[i].getDetails();
		}
		for(int i=0;i<5;i++) {
			a[i].displayDetails();
		}
	}
}

