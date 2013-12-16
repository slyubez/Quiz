/**
 * 
 */
package ru.progschool.november_2013.java.quiz;
import java.io.*;
import java.util.*;
/**
 * @author Sergey
 *
 */
public class PropFileStorage implements QuizStorage{
	public static final String DEFAULTFILENAME = "default.prop";
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
	@Override
	public void restoreTest(Test test) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
    	try {
    		prop.load(new FileInputStream(DEFAULTFILENAME));
    		test.setName(prop.getProperty("testhdr"));
    		test.setSubject(prop.getProperty("testtheme"));
    		String s = prop.getProperty("questcnt");
    		int qcount = Integer.parseInt(s);
    		for (int qindex=0; qindex<qcount; qindex++){
    			Task task = new Task();
    			String s1 = 'Q'+intToTripleString(qindex)+'_';
    			task.setQuestion(prop.getProperty(s1+'t'));
    			s = prop.getProperty(s1+'c');
    			int acount = Integer.parseInt(s);
    			for (int aindex=0; aindex<acount; aindex++){
    				String s2 = s1+Integer.toString(aindex);
    				s = prop.getProperty(s2);
    				String txt;
    				Boolean right = (s.charAt(0)=='*');
    				if (right) txt = s.substring(1); else txt = s;
    				task.appendAnswer(txt, right);	    				
    			}
    			test.appendTask(task);
    		}
    	}
    	catch (IOException ex) {
    		
    	}	
		}
	
}
	


