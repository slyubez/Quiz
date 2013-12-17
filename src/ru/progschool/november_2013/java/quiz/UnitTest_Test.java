package ru.progschool.november_2013.java.quiz;

import ru.progschool.november_2013.java.quiz.Test.QuestionException;

public class UnitTest_Test {

	/**
	 * @param args
	 */
	public static void out (String s){
		System.out.println(s);
	}
	public static void outInt (int i){
		String s = Integer.toString(i);
		System.out.println(s);
	}
	
	public static void main(String[] args) throws QuestionException {
		// TODO Auto-generated method stub
		Test t = new Test();
		PropFileStorage storage = new PropFileStorage();
		storage.restoreTest(t);
		out (t.getName());
		out (t.getSubject());
		outInt (t.getQuestionsCount());
		for (int i=0; i<t.getQuestionsCount(); i++){
			String s = "Вопрос №"+Integer.toString(i);
			out (s);
			s = t.getQuestionText(i);
			out (s);
			for (int j=0; j<t.getAnswersCount(i); j++){
				String s1 = t.getAnswerText(i, j);
				if (t.getAnswerRight(i, j)) s1='*'+s1;
				out (s1);
			}
		}
	}

}
