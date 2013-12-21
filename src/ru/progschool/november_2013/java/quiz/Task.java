package ru.progschool.november_2013.java.quiz;

import java.util.ArrayList;
import ru.progschool.november_2013.java.quiz.Answer;

/**
 * Класс вопроса.
 */
public class Task {
	public Task(){
		this.answers = new ArrayList();
	}
	/**
	 * Текст вопроса
	 */
	private String question;
	/**
	 * Набор ответов
	 */
	private ArrayList<Answer> answers;
	/**
	 * Устанавливает текст ответа
	 */
	public void setQuestion(String txt){this.question = txt;}
	/**
	 * Возвращает текст ответа
	 */
	public String getQuestion(){return this.question;}
	/**
	 * Устанавливает текст ответа
	 */
	public void appendAnswer(String txt, boolean right){
		Answer ans = new Answer(txt, right);
		this.answers.add(ans);
	}
	/**
	 * Возвращает все ответы на вопрос
	 */
	public ArrayList<Answer> getAnswers(){return this.answers;}	
	/**
	 * Возвращает общее число ответов на вопрос
	 */
	public int getAnswersCount(){return this.answers.size();}
	/**
	 * Возвращает число правильных ответов на вопрос
	 */
	public int getRightAnswersCount(){
		int j = 0;
		for (int i=0; i<this.getAnswersCount(); i++){
			if (this.answers.get(i).isRight()) j++;
		}
		return j;
	}	
}
