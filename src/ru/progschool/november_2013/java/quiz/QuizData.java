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


public class QuizData {
	public static final String QUIZDEFAULTFILENAME = "DefaultList.prop";
	/**
	 * Функция для преобразования числа в строку добавлением незначащих нулей.
	 * Здесь нужна для формирования имён параметров prop-файла.
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
	
	public class QuestionList {
		public String header;
		public String theme;
		public int testingtime;
		public int testingcount;
		public ArrayList<Question> questions;
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
	            this.setTestingCount(Integer.parseInt(s));
	            questions = new ArrayList<Question>();
	            for (int i = 0; i<qc; i++) {
	            	Question q = new Question();
	            	s = "Q"+QuizData.intToTripleString(i);
	            	q.text = s+"_t";
	            	int ac = Integer.parseInt(s+"_c");
	            	q.answers = new AnswersList();
	            	String s1 = s+"_";
	            	String s2;
	            	for (int j = 0; j<ac; j++) {
	            		s2 = prop.getProperty(s1+Integer.toString(j));
	            		q.answers.addAnswerFromFileString(s2);
	            	}
	            questions.add(q);	
	            }
	            return (0);
	    	} catch (IOException ex) {
	    		ex.printStackTrace();
	    		return (1);
	        }	
		}
		public void saveToFile(String filename){
			
		}
		/**
		 * Возвращает число вопросов, которые нужно задать тестируемому.
		 */
		public int getTestingCount() {
			return testingcount;
		}
		/**
		 * @param testingcount the testingcount to set
		 */
		public void setTestingCount(int testingcount) {
			this.testingcount = testingcount;
		}
		
	}
}
