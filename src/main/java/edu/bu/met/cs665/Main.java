package edu.bu.met.cs665;

import java.util.Scanner;
import edu.bu.met.cs665.question.ConcreteQuestionFactory;
import edu.bu.met.cs665.question.Question;
import edu.bu.met.cs665.question.QuestionFactory;

public class Main {

  /**
   * A main method to run examples. 
   * @param args not used 
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    QuestionFactory questionFactory = new ConcreteQuestionFactory();
    Question question = questionFactory.getQuestion(0);
    System.out.println(question.getQuestion());
    String userAnswer = in.nextLine();
    System.out.println(question.checkForCorrectAnswer(userAnswer));
    in.close();
  }

}
