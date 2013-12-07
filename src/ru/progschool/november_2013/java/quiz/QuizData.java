package ru.progschool.november_2013.java.quiz;

/**
 * @author ProgSchool
 * Класс содержит константы, типы и методы, общие для всех
 * программ - админа и теста.
 */
import ru.progschool.november_2013.java.quiz.Question;
import ru.progschool.november_2013.java.quiz.Answer;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class QuizData {
	public static final String QUIZDEFAULTFILENAME = "DefaultList.prop";
	/**
	 * Функция для преобразования числа в строку
	 * с добавлением незначащих нулей.
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
		public int questionscount;
		public int testingcount;
		public Question[] questions;
		public int loadFromFile(String filename){
			Properties prop = new Properties();
	    	try {
	    		prop.load(new FileInputStream(filename));
	    		this.header = prop.getProperty("testhdr");
	            this.theme = prop.getProperty("testtheme");
	            String s = prop.getProperty("testtime");
	            this.testingtime = Integer.parseInt(s);
	            s = prop.getProperty("questcnt");
	            this.questionscount = Integer.parseInt(s);
	            s = prop.getProperty("questfortestcnt");
	            this.testingcount = Integer.parseInt(s);
	            questions = new Question[questionscount];
	            for (int i = 0; i<questionscount; i++) {
	            	questions [i] = new Question();
	            	s = "Q"+QuizData.intToTripleString(i);
	            	questions [i].text = s+"_t";
	            	questions [i].answerscount = Integer.parseInt(s+"_c");
	            	Answer[] answers = new Answer[questions [i].answerscount];
	            	String s1 = s+"_";
	            	for (int j = 0; j<questions [i].answerscount; j++) {
	            		answers [j].answertext = s1+Integer.toString(j);
	            		answers [j].isright = ((answers [j].answertext).charAt(j)=='*');
	            	}
	            }
	            return (0);
	    	} catch (IOException ex) {
	    		ex.printStackTrace();
	    		return (1);
	        }	
		}
		public void saveToFile(String filename){
			
		}
		
	}
}
