package edu.bu.met.cs665.question;

public abstract class Question {
  private String question;
  private String answer;

  public Question() {
    // Upon calling the constructor, begin calling the steps to create the question and answer
    this.initialize();
  }

  /**
   * This is the method that defines the steps that go into creating the questions and answers.
   */
  public void initialize() {
    this.generateRandomValues();
    this.createQuestion();
    this.computeAnswer();
  }

  public String formatAnswer(String answer) {
    System.out.println("Answer is: " + answer);

    if (answer.length() > 1) {
      return answer.substring(0, 1).toUpperCase() + answer.substring(1);
    }
    return answer.toUpperCase();
  }

  public abstract String getAnswer();

  public abstract void createQuestion();

  public abstract void generateRandomValues();

  public abstract void computeAnswer();

  public abstract String getQuestion();

  public abstract boolean checkForCorrectAnswer(String answer);
}
