package edu.bu.met.cs665.question;

public class ConcreteQuestionFactory implements QuestionFactory {

  @Override
  public Question getQuestion(int questionNumber) {
    Question question = null;
    switch (questionNumber){
      case 0: question = new SimpleIntervalUpQuestion();;
    }
    return question;
  }

}
