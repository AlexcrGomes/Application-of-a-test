package entities;

import java.util.Scanner;

public class Test {
	private Student studantTested;
	private Question question1, question2, question3, question4;
	private int answer1, answer2, answer3, answer4;
	private double grade;
	
	public Test(Student studantTested, Question question1, Question question2, Question question3, Question question4) {
		this.studantTested = studantTested;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.grade = 0;
	}
	
	public void applyTest() {
		Scanner reader = new Scanner(System.in);
		
		System.out.println(question1.toString());
		System.out.print("Select the right answer: ");
		answer1 = reader.nextInt();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(question2.toString());
		System.out.print("Select the right answer: ");
		answer2 = reader.nextInt();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(question3.toString());
		System.out.print("Select the right answer: ");
		answer3 = reader.nextInt();
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println(question4.toString());
		System.out.print("Select the right answer: ");
		answer4 = reader.nextInt();
		System.out.println();
		System.out.println("----------------------------------");
		reader.close();
	}
	
	public void correctTest() {
		if (question1.checkAnswer(answer1)) {
			grade += 2.5;
		}
		if (question2.checkAnswer(answer2)) {
			grade += 2.5;
		}
		if (question3.checkAnswer(answer3)) {
			grade += 2.5;
		}
		if (question4.checkAnswer(answer4)) {
			grade += 2.5;
		}
		System.out.println();
		showResult();
	}

	public void showResult() {
		System.out.println(studantTested.getName() +"'s test");
		System.out.printf("Result: %.2f", grade);
		
		
		/*if (question1.checkAnswer(answer1)) {
			System.out.println("1 - Right");;
		} else {
			System.out.println("1 - Wrong");
		}
		if (question2.checkAnswer(answer2)) {
			System.out.println("2 - Right");;
		} else {
			System.out.println("2 - Wrong");
		}
		if (question3.checkAnswer(answer3)) {
			System.out.println("3 - Right");;
		} else {
			System.out.println("3 - Wrong");
		}
		if (question4.checkAnswer(answer4)) {
			System.out.println("4 - Right");;
		} else {
			System.out.println("4 - Wrong");
		}
		*/
		
	}
	
	
}
