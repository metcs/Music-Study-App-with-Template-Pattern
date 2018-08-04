package edu.bu.met.cs665.question;

import java.util.Random;
import edu.bu.met.cs665.interval.Interval;

public class AltoClefQuestion extends Question {
  private String question;
  private int lineNumber;
  private String answer;

  @Override
  public String getAnswer() {
    return this.answer;
  }

  @Override
  public void createQuestion() {
    String formattedName = null;
    switch (this.lineNumber) {
      case 0:
        formattedName = "first";
        break;
      case 1:
        formattedName = "second";
        break;
      case 2:
        formattedName = "third";
        break;
      case 3:
        formattedName = "fourth";
        break;
      case 4:
        formattedName = "fifth";
        break;
    }
    this.question =
        String.format("What is the note on the %s line of the alto clef?", formattedName);
  }

  /**
   * Generates the random values to be inserted into the question and answer.
   */
  @Override
  public void generateRandomValues() {
    Random random = new Random();
    // There are 5 lines on a single staff
    this.lineNumber = random.nextInt(5);
  }

  @Override
  public void computeAnswer() {
    this.answer = Interval.altoClefNoteNameForLineNumber(this.lineNumber);
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
}
