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
	private boolean isright;
	/**
	 * Метод преобразования полей вопроса в текст для записи в список вопросов и ответов
	 */
	public String convertTextForFile(){
		if (this.isright){
			return ('*'+answertext);
		}
		else return (answertext);
	}
	/**
	 * Удаляет из строки S первый символ
	 */
	private static String deleteFirstSymbol(String s){
		String s1 = "";
		for (int i=1; i<s.length();i++){
			s1 = s1 + s.charAt(i);
		}
		return (s1);
	}
	/**
	 * Формирует поля ответа из строки anstext
	 * в формате хранения ответа в файле
	 */
	public void formAnswerFromText(String anstext){
		if (anstext.charAt(1)=='*'){
			this.answertext = deleteFirstSymbol(anstext);
			this.isright = false;
		}
		else{
			this.answertext = anstext;
			this.isright = true;
		}
	}
}
