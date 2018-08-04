package edu.bu.met.cs665;

import java.util.Random;
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
    Question question = null;
    Random random = new Random();
    // numQuestionsOptions maps to the number of Question subclasses.
    // In other words, this is the max number of the types of questions we can randomly choose.
    int numQuestionOptions = 3;
    while(true){
      question = questionFactory.getQuestion(random.nextInt(numQuestionOptions));
      System.out.println(question.getQuestion());
      String userAnswer = in.nextLine();
      if(question.checkForCorrectAnswer(userAnswer)){
        System.out.println("Correct answer");
      }else{
        System.out.println("Incorrect.  The correct answer was: " + question.getAnswer());
      }
      System.out.println("Press q to quit or any other key to continue: ");
      String userPicksAnotherQuestion = in.nextLine();
      if(userPicksAnotherQuestion.toLowerCase().equals("q")){
        System.out.println("Goodbye!");
        break;
      }
    }

    in.close();
  }

}
