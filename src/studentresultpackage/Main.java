package studentresultpackage;

/*
 * this class is example of Variables, Methods, Constructors,
 *  Inheritance and Encapsulation
 * 
 */

import java.io.InputStream;
import java.util.Scanner;

public class Main { // main method
	
	
	public static void main(String[] args) {
		StudentResultProcesing srp=new StudentResultProcesing(); // this is the object of second (StudentResultProcesing) class
		Student student=new Student(); // this is object for the first (Student) class
		Scanner scanner=new Scanner(System.in); // this is Scanner Class object
		System.out.println("Please enter student name");
		String studentNameUserInput=scanner.nextLine(); // user input for student name
		System.out.println("Please enter student phone Number");
	    String studentPhoneUserInput=scanner.nextLine();// user input for student phone number
	    System.out.println("Please enter student roll Number");
	    int studentRollnoUserInput=scanner.nextInt();// user input for student roll number
	    System.out.println("Please enter student class name(7, 8 ,9) Number");
	    int studentclassnameUserInput=scanner.nextInt(); // user input for student class name
		srp.printresult();
		
		student.setStudentName(studentNameUserInput); // this line will set the name for student in Student class private variable 
		student.setPhoneNumber(studentPhoneUserInput);// this line will set the phone number for student in Student class private variable 
		student.setRollNumber(studentRollnoUserInput);// this line will set the roll number  for student in Student class private variable 
		student.setClassName(studentclassnameUserInput); // this line will set the class name for student in Student class private variable 
		
		System.out.println("\n"); // enter for little space
		
		// this below line will print all information which got from user
		System.out.println("Student Name:- " + studentNameUserInput + "\n" + "Student Telephone:- " + studentPhoneUserInput + " \n" + "Student Roll Number:- " + studentRollnoUserInput + " \n" + "Student Class :-" + studentclassnameUserInput );
		
	}

	
}

class Student{

	private String studentName;  //private variable for Student class
    private String phoneNumber;  //private variable for Student class
    private int rollNumber;      //private variable for Student class
    private int className;       //private variable for Student class
	
    public String getStudentName() { // getter for student name
		return studentName;
	}
	public void setStudentName(String studentName) { // setter for student name
		this.studentName = studentName;
	}
	public String getPhoneNumber() { // getter for phone number
		return phoneNumber;
	}
	public void setPhoneNumber(String studentPhoneUserInput) { // setter for phone number
		this.phoneNumber = studentPhoneUserInput;
	}
	public int getRollNumber() { // getter for roll number 
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) { // setter for roll number 
		this.rollNumber = rollNumber;
	}
	public int getClassName() { //getter for class name
		return className;
	}
	public void setClassName(int className) { // setter for class name
		this.className = className;
	}

	public static int result(int englishSub, int mathSub,int scienceSub) { // this return method will get the marks and judge whether student pass of fail.
	   int englishPassing=35; // these are the passing marks
	   int mathPassing=35;
	   int sciencePassing=35;
	   int failorPass; // local variable for set the result 
	   if (englishSub>englishPassing||mathSub>mathPassing||scienceSub>sciencePassing) {// logic is if all subject marks are less then 35(which is passing marks) so it will fail the student
	      
		    failorPass=35;
		    }else {
	    	    failorPass= 36;}
	    	 
	  
		   return failorPass; // return value should be either 35 or 36 means fail or pass
 
	}
}


class StudentResultProcesing extends Student{ // class extending the another class
	
	Scanner sc=new Scanner(System.in); // object for Scanner class
	Student student=new Student();// object for Student class (i thought it should be here ) correct me if i  m wrong?
	
	public void printresult() { // this method is just to get the user input for marks and decide weather student pass or fail
	System.out.println("Please enter marks for English Subject between 0 to 100"); 
	int marksforEnglish=sc.nextInt(); // user input English subject marks
	System.out.println("Please enter marks for Math Subject between 0 to 100");
	int marksforMath=sc.nextInt();// user input Math subject marks
	System.out.println("Please enter marks for Science Subject between 0 to 100");
	int marksforScience=sc.nextInt();// user input Science subject marks
	int getFailOrPass= student.result(marksforEnglish,marksforMath,marksforScience);
	if(getFailOrPass==35) {  // this logic will get the result pass/fail
		System.out.println("PASS");
	}else if(getFailOrPass==36) {
		System.out.println("FAIL");
	}
	}
    
}






















