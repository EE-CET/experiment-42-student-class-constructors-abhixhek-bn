import java.util.Scanner;

class Student {
	String name;
	int rollNo;
   
	Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
		
	void display(){
	System.out.println("Name: " + name+" Roll: "+rollNo);
	}
}
		
    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    
    // TODO: Create a method or use direct access to print details in the required format


public class StudentClass {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();

	int roll=sc.nextInt();
	sc.nextLine();
	String name1=sc.nextLine();
	int roll1=sc.nextInt();
        Student c = new Student(name,roll);
        c.display();
	Student c1 = new Student(name1,roll1);
        c1.display();
	
    }
}

        
        // TODO: Read name1
        // TODO: Read rollNo1
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        
        // TODO: Read name2
        // TODO: Read rollNo2
        
        // TODO: Create two Student objects
        
        // TODO: Print details for both students
    

