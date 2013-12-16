package ru.progschool.november_2013.java.quiz;

/**
 * Класс хранения ответа и его методов
 */
public class Answer {
	/**
	 * Текст ответа
	 */
	private String answer;
	/**
	 * Признак правильности ответа
	 */
	private boolean isright;
	/**
	 * Конструктор ответа. Принимает поля текста (String) и правильности ответа (boolean).
	 */
	public Answer(String answertext, boolean right){
		this.isright = right;
		this.answer = answertext;
	}
	/**
	 * Возвращает текст ответа.
	 */
	public String getAnswer(){return this.answer;}
	/**
	 * Возвращает правильность ответа.
	 */
	public boolean isRight(){return this.isright;}
}