package ru.progschool.november_2013.java.quiz;

/**
 * @author ProgSchool
 * Класс содержит константы, типы и методы, общие для всех
 * программ - админа и теста.
 */
import ru.progschool.november_2013.java.quiz.Question;
import ru.progschool.november_2013.java.quiz.Answer;
import ru.progschool.november_2013.java.quiz.AnswersList;
import java.io.*;
import java.util.*;

/**
 * Публичный класс для работы с вопросами и ответами. Содержит в себе
 * списки вопросов и ответов, а также общеиспользуемые поля и методы
 * программ администратора и тестирования.
 */
public class QuizData {
	/**
	 * Экземпляр текущего списка вопросов.
	 */
	public QuestionList currentquestionlist;
	/**
	 * Константа хранения имени файла списка вопросов, загружаемого при запуске программы опроса.
	 */
	public static final String QUIZDEFAULTFILENAME = "DefaultList.prop";
	/**
	 * Функция для преобразования числа в строку с добавлением незначащих нулей.
	 * Здесь нужна для формирования имён параметров prop-файла в соответствии
	 * с форматом из ТЗ.
	 */
	public static String intToTripleString(int i){
		String s = Integer.toString(i);
		int l = s.length();
		if (l<3) {
			for (int j=l; j<l-1; j++) {
				s = "0"+s;
			}
		}
		return (s);
	}
	/**
	 * Класс списка вопросов. Включает в себя, помимо списка-массива вопросов с ответами,
	 * методы загрузки и сохранения в prop-файл.
	 */
	public class QuestionList {
		/**
		 * Модификатор списка нужен только для работы с программой для
		 * администрирования. В программе тестирования он не используется.
		 */
		public boolean ismodified;
		/**
		 * Заголовок списка.
		 */
		public String header;
		/**
		 * Тема опроса.
		 */
		public String theme;
		/**
		 * Время опроса в секундах.
		 */
		public int testingtime;
		/**
		 * Защищённый параметр.
		 * Число вопросов, которые нужно задать пользователю.
		 * Устанавливается с помощью сеттеров после
		 * ввода всех вопросов.
		 */
		private int testingquestionscount;
		/**
		 * Список-массив вопросов.
		 */
		public ArrayList<Question> questions;
		/**
		 * Загружает список из файла filename в формате prop.
		 */
		public int loadFromFile(String filename){
			Properties prop = new Properties();
	    	try {
	    		prop.load(new FileInputStream(filename));
	    		this.header = prop.getProperty("testhdr");
	    		this.theme = prop.getProperty("testtheme");
	    		String s = prop.getProperty("testtime");
	    		this.testingtime = Integer.parseInt(s);
	    		s = prop.getProperty("questcnt");
	    		int qc = Integer.parseInt(s);
	    		s = prop.getProperty("questfortestcnt");
	    		this.testingquestionscount = Integer.parseInt(s);
	    		questions = new ArrayList<Question>();
	    		for (int i = 0; i<qc; i++) {
	    			Question q = new Question();
	    			s = "Q"+QuizData.intToTripleString(i)+'_';
	    			q.text = prop.getProperty (s+"t");
	    			int ac = Integer.parseInt(prop.getProperty (s+"c"));
	    			q.answers = new AnswersList();
	    			String s2;
	    			for (int j = 0; j<ac; j++) {
	    				s2 = prop.getProperty(s+Integer.toString(j));
	    				q.answers.addAnswerFromFileString(s2);
	    			}	
	    			questions.add(q);	
	    		}
	    		return (0);
	    	}
	    	catch (IOException ex) {
	    		return (1);
	    	}	
			}
		/**
		 * Сохраняет список вопросов в файл с путем и именем filename
		 */
		public void saveToFile(String filename){
			Properties prop = new Properties();
	    	try {
	    		String s;
	    		String s1;
	    		prop.setProperty("testhdr", this.header);
	    		prop.setProperty("testtheme", this.theme);
	    		prop.setProperty("testtime", String.valueOf(this.testingtime));
	    		prop.setProperty("questcnt", String.valueOf(this.questions.size()));
	    		prop.setProperty("questfortestcnt", String.valueOf(this.testingquestionscount));
	    		for (int i=0; i<questions.size(); i++) {
	    			Question q = this.questions.get(i);
	    			s = "Q"+QuizData.intToTripleString(i)+'_';
	    			prop.setProperty(s+'t', q.text);
	    			int ac = q.getAnswersCount();
	    			prop.setProperty(s+"c", String.valueOf(ac));
	    			for (int j=0;j<q.answers.getCount();j++){
	    				Answer ans = q.answers.Answers.get(j);
	    				s1 = s+String.valueOf(j);
	    				prop.setProperty(s1, ans.convertTextToFileFormat());
	    			}	    			
	    		}		
	    		prop.store(new FileOutputStream(filename), null);
	    	} catch (IOException ex) {
	    		ex.printStackTrace();
	        }
		}
		
		/**
		 * Возвращает число вопросов, которые нужно задать тестируемому.
		 */
		public int getTestingQuestionsCount() {return this.testingquestionscount;}
		/**
		 * Устанавливает число вопросов для задания тестируемому
		 * @param testingcount the testingcount to set
		 */
		public void setTestingQuestionsCount(int testingcount) throws QuestionException{
			if (this.getTestingQuestionsCount()>this.questions.size()) {
				throw new QuestionException("Число вопросов для задания тестируемому не должно превышать общее число вопросов.");
			}
			this.testingquestionscount = testingcount;	
		}
		class QuestionException extends Exception{
			private static final long serialVersionUID = 1L;
			private String msg;
			QuestionException(String s){msg = s;}
			public String toString(){
				return "Ошибка: "+msg;
			}
		}
		
	}
}
