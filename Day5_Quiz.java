import java.util.Scanner;
class Question {
	String ques,op1,op2,op3,op4;
	int actualans, userans;
	Scanner sc=new Scanner(System.in);
	public boolean que(){
		System.out.println(ques);
		System.out.println("1. "+op1);
		System.out.println("2. "+op2);
		System.out.println("3. "+op3);
		System.out.println("4. "+op4+"\nPlease choose an option:");
		userans=sc.nextInt();
		if(userans==actualans){
			return(true);
		}
		return false;
	}
}
class Player {
	String name;
	int score;
	Scanner sc=new Scanner(System.in);
	public void getDetails(){
		System.out.print("Enter ur name: ");
		name=sc.nextLine();
	}
}
class Game {
	Question[] question=new Question[5];
	Player player=new Player();
	String[] questions= {"Who is the father of geometry?","When was telephone invented?","Largest fresh water lake in India?","Most powerful type of computer?","The first movie released in 1982 with terrific computer animation and graphics was?"};
	String[] op1= {"Aristotle","1870s","Pulicat Lake","Super-micro","Star wars"};
	String[] op2= {"Euclid","1880s","Veeranam Lake","Super conductor","Tron"};
	String[] op3= {"Pythagoras","1850s","Chilka Lake","Super computer","Forbidden planet"};
	String[] op4= {"Kepler","1860s","Kolleru Lake","Megaframe","Dark star"};
	int[] ans= {2,1,4,3,1};
	public void start() {
		for(int i=0;i<question.length;i++){
			question[i]=new Question();		
		}		
		for(int i=0;i<question.length;i++){
			question[i].ques=questions[i];
	        question[i].op1=op1[i];
	        question[i].op2=op2[i];
	        question[i].op3=op3[i];
	        question[i].op4=op4[i];
	        question[i].actualans=ans[i];
		}
	}
	public void play() {
		player.getDetails();
		for(int i=0;i<questions.length;i++) {
			boolean status=question[i].que();
			if(status==true) {
				System.out.println("Good!! It's correct!!\n");
				player.score=player.score+10;
			}
			else {
				System.out.println("Oops!! Incorrect!!\n");
			}
		}
		System.out.println(player.name+" you scored "+player.score+" points, out of "+(question.length*10));
	}
}
public class Day5_Quiz {
	public static void main(String[] args) {
		Game game=new Game();
		game.start();
		game.play();
	}
}
