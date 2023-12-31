package Main;

import java.util.Scanner;

import entities.Question;
import entities.Student;
import entities.Test;

public class aplication {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		Question q1 = new Question("What year was A New Hope released?", "1976", "1977", "1978", "1979", 2);
		Question q2 = new Question("In which film does Luke find out Darth Vader is his father?", "A New Hope", "The Empire Strikes Back", "Return of the Jedi", "Attack of the Clones", 2);
		Question q3 = new Question("What was the original name of the Star Wars series?", "Star Battles", "Space Adventures", "Adventures of Luke Starkiller", "Space Wars", 3);
		Question q4 = new Question("Luke Skywalker was raised on which planet?", "Hoth", "Alderaan", "Tatooine", "Jakku", 3);
		
		
		System.out.println("To apply the test, please enter the data below:");
		System.out.print("Name: ");
		String name = reader.nextLine();
		System.out.print("Enrolment : ");
		int enrolment = reader.nextInt();
		System.out.println("----------------------------------");
		
		Student student1 = new Student(name,enrolment);
		
		Test test1 = new Test(student1,q1,q2,q3,q4);
		test1.applyTest();
		test1.correctTest();
		
		
		reader.close();
		
	}

}
