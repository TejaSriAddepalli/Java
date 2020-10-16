class Employee{
	String name;
	int age;
	String city;
	public void display() {
		System.out.println("My Name is "+name+". I'm "+age+" years old! "+"I'm from "+city);
	}
}

public class Day2 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="Nobitha";
		e.age=10;
		e.city="Japan";
		e.display();
		Employee e1=new Employee();
		e1.name="Doraemon";
		e1.age=100;
		e1.city="Japan";
		e1.display();

	}

}
