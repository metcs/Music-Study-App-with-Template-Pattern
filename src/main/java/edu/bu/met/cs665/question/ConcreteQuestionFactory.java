package edu.bu.met.cs665.question;

import org.jfree.ui.about.SystemProperties;

public class ConcreteQuestionFactory implements QuestionFactory {

  @Override
  public Question getQuestion(int questionNumber) {
    Question question = null;
    switch (questionNumber){
      case 0: question = new SimpleIntervalUpQuestion();
      break;
      case 1: question = new SimpleIntervalDownQuestion();
      break;
      case 2: question = new AltoClefQuestion();
      break;
    }
    return question;
  }

}
