package edu.bu.met.cs665.question;

import java.util.Random;
import edu.bu.met.cs665.interval.Interval;

public class SimpleIntervalDownQuestion extends Question {
  private String question;
  private String answer;
  private int intervalDown;
  private int bassNote;
  
  
  @Override
  public void createQuestion() {
    this.question = String.format("What is the note a %s %s?",
        Interval.numerOfHalfStepsAsString(this.intervalDown), 
        Interval.pitchNumberToChromaticNoteName(this.bassNote));
        
  }

  @Override
  public void generateRandomValues() {
    Random random = new Random();
    // Since we are doing intervals down, we need a negative int
    // TODO change 7 as more note mappings are made in the interval mappings
    this.intervalDown = random.nextInt(7) * -1;
    this.bassNote = random.nextInt(11);

  }

  @Override
  public void computeAnswer() {
    int calculatedAnswer = this.bassNote + this.intervalDown;
    this.answer = Interval.pitchNumberToChromaticNoteName(calculatedAnswer);

  }

  @Override
  public String getQuestion() {
    return this.question;
  }

  @Override
  public boolean checkForCorrectAnswer(String givenAnswer) {
    return formatAnswer(givenAnswer).equals(this.answer);
  }

  @Override
  public String getAnswer() {
    return this.answer;
  }

}
