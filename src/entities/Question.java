package entities;

public class Question {
	private String statement;
	private String option1, option2, option3, option4;
	private int rightAnswer;

	public Question(String statement, String option1, String option2, String option3, String option4, int rightAnswer) {
		this.statement = statement;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightAnswer = rightAnswer;
	}

	@Override
	public String toString() {
		return statement + "\n" +
		"1 - " + option1 + "\n" +
		"2 - " + option2 + "\n" +
		"3 - " + option3 + "\n" +
		"4 - " + option4;
	}
	
	public boolean checkAnswer(int answer) {
		return this.rightAnswer == answer;
	}
	
	
}
