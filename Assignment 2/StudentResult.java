package StudentResult;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter tamil mark:- ");
		int tamil = sc.nextInt();
		System.out.println("Enter english mark:- ");
		int english = sc.nextInt();
		System.out.println("Enter maths mark:- ");
		int maths = sc.nextInt();
		System.out.println("Enter science mark:- ");
		int science = sc.nextInt();
		System.out.println("Enter social mark:- ");
		int social = sc.nextInt();
		
		StudentResult obj = new StudentResult();
		
		int total = obj.calculateTotal(tamil, english, maths, science, social);
		double avg = obj.calculateAverage(total);
		String grade = obj.calculateGrade(avg);
		
		obj.display(total, avg, grade);
		
		sc.close();

	}
	
	int calculateTotal(int tamil , int english , int maths , int science , int social) {
		return tamil+english+maths+science+social;
	}
	
	double calculateAverage(int total) {
		return total/5;
	}
	
	String calculateGrade(double avg) {
		return avg>=90 ? "A" : 
			avg<90 && avg>=75 ? "B" :
				avg<75 && avg>=50 ? "C" :
					"Fail";
	}
	
	void display(int total , double avg , String grade) {
		System.out.println("Total : "+total);
		System.out.println("Average : "+avg);
		System.out.println("Grade : "+grade);
	}
}

//Requirements: 
//	1. Create a class StudentResult. 
//	2. Create a method calculateTotal() that accepts five subject marks and returns the total. 
//	3. Create a method calculateAverage() that accepts the total and returns the average. 
//	4. Create a method calculateGrade() that accepts the average and 
//	returns a grade: ○ 90 and above: A ○ 75–89: B ○ 50–74: C ○ Below 50: Fail 
//	5. Create a method to display the total, average, and grade. 
//	
//	Sample input: 85, 78, 92, 88, 77. 
//	Expected output: Total: 420 Average: 84.0 Grade: B 