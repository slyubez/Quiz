/**
 * 
 */
package ru.progschool.november_2013.java.quiz;

/**
 * @author ProgSchool *
 */

import ru.progschool.november_2013.java.quiz.Answer;
import java.util.*;

/**
 * Класс хранит список ответов на один вопрос.
 */
public class AnswersList {
	/**
	 * Список ответов*
	 */
	public ArrayList<Answer> Answers;
	/**
	 * Добавляет в список ответ из строки S
	 * в формате хранения ответа в файле
	 */
	public void addAnswerFromFileString(String s){
		Answer ans = new Answer();
		ans.formAnswerFromText(s);
	}
	/**
	 * Возвращает общее количество ответов в списке
	 */
	public int getCount(){return this.Answers.size();}
	/**
	 * Возвращает количество правильных ответов в списке
	 */
	public int getRightAnswersCount(){
		int cnt = 0;
		for (int i=0; i<this.Answers.size(); i++){
			Answer ans = Answers.get(i);
			if (ans.isright) cnt++;
		}
		return (cnt);
	}
}
