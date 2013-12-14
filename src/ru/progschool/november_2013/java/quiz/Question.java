/**
 * 
 */
package ru.progschool.november_2013.java.quiz;

import ru.progschool.november_2013.java.quiz.AnswersList;

/**
 * @author ProgSchool
 *
 */
public class Question {
	/**
	 * Текст вопроса
	 */
	public String text;
	/**
	 * Набор ответов
	 */
	public AnswersList answers;
	/**
	 * @Возвращает число ответов на вопрос
	 */
	public int getAnswersCount(){return answers.getCount();}
	/**
	 * @Возвращает число правильных ответов на вопрос
	 */
	public int getRightAnswersCount(){return answers.getRightAnswersCount();}
}
	