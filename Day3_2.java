import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import java.util.Scanner;
class Employee1{
	String name;
	int mon_salary,ann_salary;
	int day,month,year;
	double tax;
	public void getDetails() {
	Scanner s=new Scanner(System.in);
	//s.nextLine();
	name=s.nextLine();
	mon_salary=s.nextInt();
	day=s.nextInt();
	month=s.nextInt();
	year=s.nextInt();
	}
	public void calculateTax(){
		ann_salary=mon_salary*12;
		if(ann_salary>=500000) {
			tax=ann_salary*(0.2);
		}
		else if(ann_salary>=400000 && ann_salary<500000) {
			tax=ann_salary*(0.15);
		}
		else if(ann_salary<400000 && ann_salary>=300000) {
			tax=ann_salary*(0.10);
		}
		else if(ann_salary<300000 && ann_salary>=200000) {
			tax=ann_salary*(0.05);
		}
		else {
			tax=0;
		}	
	}
	public void display(){
		LocalDate dob=LocalDate.of(year, month, day);
		LocalDate now=LocalDate.now();
		Period per= Period.between(dob, now); 
		System.out.println("Name : "+name+",\nAge : "+per.getYears()+",\nAnnual Salary : "+ann_salary+",\nTax Amount : "+tax);
		//System.out.println("Name : "+name+",\nAnnual Salary : "+ann_salary+",\nTax Amount : "+tax);

	}
}
public class Day3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e=new Employee1();
		e.getDetails();
		e.calculateTax();
		e.display();
		
	}

}
