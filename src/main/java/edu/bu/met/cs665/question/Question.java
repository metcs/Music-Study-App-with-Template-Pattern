package edu.bu.met.cs665.question;

public abstract class Question {
  public void initialize(){
    this.generateRandomValues();
    this.createQuestion();
    this.computeAnswer();
  }
  public abstract void createQuestion();
  public abstract void generateRandomValues();
  public abstract void computeAnswer();
  public abstract String getQuestion();
  public abstract boolean checkForCorrectAnswer(String answer);
}
