package ru.progschool.november_2013.java.quiz;

/**
 * @author ProgSchool
 * Класс содержит константы, типы и методы, общие для всех
 * программ - админа и теста.
 */
import java.util.ArrayList;


/**
 * Публичный класс для работы с вопросами и ответами. Содержит в себе
 * списки вопросов и ответов, а также общеиспользуемые поля и методы
 * программ администратора и тестирования.
 */
public class Test {	
	/**
	 * Тема опроса.
	 */
	private String subject;
	/**
	 * Название опроса.
	 */
	private String name;
	/**
	 * Список-массив объектов-вопросов
	 */
	private ArrayList<Task> tasks;
	/**
	 * Возвращает тему опроса
	 */
	public String getSubject(){return this.subject;}
	/**
	 * Устанавливает тему опроса
	 */
	public void setSubject (String txt){this.subject = txt;}	
	/**
	 * Возвращает название опроса
	 */
	public String getName(){return this.name;}
	/**
	 * Устанавливает название опроса
	 */
	public void setName (String txt){this.name = txt;}
	/**
	 * Возвращает число вопросов в тесте (массиве)
	 */
	public int getQuestionsCount(){return this.tasks.size();}	
	/**
	 * Добавляет вопрос в массив
	 */
	public void appendTask(Task task){this.tasks.add(task);}	
	/**
	 * Возвращает текст вопроса с индексом index
	 */
	public String getQuestionText (int index) throws QuestionException{
		if ((index+1)>tasks.size()) throw (new QuestionException("Неверный индекс вопроса."));
		Task task = this.tasks.get(index);
		return task.getQuestion();
	}
	/**
	 * Возвращает общее число ответов на вопрос с индексом index
	 */
	public int getAnswersCount (int index) throws QuestionException{
		if (index>tasks.size()-1) throw (new QuestionException("Неверный индекс вопроса."));
		return this.tasks.get(index).getAnswersCount();
	}
	/**
	 * Возвращает число правильных ответов на вопрос с индексом index
	 */
	public int getRightAnswersCount (int index) throws QuestionException{
		if (index>tasks.size()-1) throw (new QuestionException("Неверный индекс вопроса."));
		return this.tasks.get(index).getRightAnswersCount();
	}
	/**
	 * Возвращает текст ответа с индексом answerindex на вопрос с индексом index
	 */
	public String getAnswerText (int questionindex, int answerindex) throws QuestionException{
		if (questionindex>tasks.size()-1) throw (new QuestionException("Неверный индекс вопроса."));
		Task task = this.tasks.get(questionindex);
		int i = task.getAnswersCount();
		if (answerindex>(i-1)) throw (new QuestionException("Неверный индекс ответа."));
		return task.answers.get(answerindex).getAnswer();
	}
	/**
	 * Возвращает правильность ответа с индексом answerindex на вопрос с индексом index
	 */
	public boolean getAnswerRight (int questionindex, int answerindex) throws QuestionException{
		if (questionindex>tasks.size()-1) throw (new QuestionException("Неверный индекс вопроса."));
		Task task = this.tasks.get(questionindex);
		int i = task.getAnswersCount();
		if (answerindex>(i-1)) throw (new QuestionException("Неверный индекс ответа."));
		return task.answers.get(answerindex).isRight();
	}
	//дополнительные подклассы
	/**
	 * Исключение со спецификой тестирования
	 */
	class QuestionException extends Exception{
		private static final long serialVersionUID = 1L;
		private String msg;
		QuestionException(String s){msg = s;}
		public String toString(){return "Ошибка: "+msg;}
	}
	
	
}
