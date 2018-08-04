package edu.bu.met.cs665.question;

import java.util.Random;
import edu.bu.met.cs665.interval.Interval;

public class SimpleIntervalUpQuestion extends Question {

  private int bassNote;
  private int halfStepsUp;
  private String question;
  private String answer;


  @Override
  public void createQuestion() {
    String intervalAsString = Interval.numerOfHalfStepsAsString(this.halfStepsUp);
    String bassAsString = Interval.pitchNumberToChromaticNoteName(this.bassNote);
    this.question = String.format("What is the note %s %s?", intervalAsString, bassAsString);
  }

  @Override
  public void computeAnswer() {
    int calculatedAnswer = this.bassNote + this.halfStepsUp;
    this.answer = Interval.pitchNumberToChromaticNoteName(calculatedAnswer);
  }

  @Override
  public String getQuestion() {
    return this.question;
  }

  @Override
  public boolean checkForCorrectAnswer(String givenAnswer) {
    // Format the incoming answer to the expected format
    return formatAnswer(givenAnswer).equals(this.answer);
  }

  @Override
  public void generateRandomValues() {
    Random random = new Random();
    this.bassNote = random.nextInt(11);
    // The mapping is currently not complete, so this is the current upper bound on this
    // TODO After the mapping is finished, changed the upper bound on this random value
    this.halfStepsUp = random.nextInt(7);
  }

  @Override
  public String getAnswer() {
    return this.answer;
  }

}
