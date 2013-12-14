/**
 * 
 */
package ru.progschool.november_2013.java.quiz;

/**
 * @author Sergey
 *Класс для хранения одного ответа на вопрос
 */
public class Answer {
	/**
	 * Текст ответа (без звёздочки)
	 */
	public String answertext;
	/**
	 * Признак правильности ответа
	 */
	public boolean isright;
	/**
	 * Метод преобразования полей вопроса в текст 
	 * для записи в список вопросов и ответов.
	 * Используется только в программе
	 * администрирования.
	 */
	public String convertTextToFileFormat(){
		if (this.isright) return ('*'+answertext);
		else return (answertext);
	}
	/**
	 * Формирует поля ответа из переданной строки anstext
	 */
	public void formAnswerFromText(String anstext){
		this.isright = (anstext.charAt(1)=='*');
		if (this.isright) this.answertext = anstext.substring (1, anstext.length());
		else this.answertext = anstext;
	}
}
