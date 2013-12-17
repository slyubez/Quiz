package ru.progschool.november_2013.java.quiz;
import java.io.*;
import java.util.*;
import ru.progschool.november_2013.java.quiz.Test.QuestionException;
public class TestFileMaker {	
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
	public static void saveToFile(Test test, String filename){
		Properties prop = new Properties();
    	try {
    		String s;
    		String s1;
    		String s2;
    		prop.setProperty("testhdr", test.getName());
    		prop.setProperty("testtheme", test.getSubject());
    		prop.setProperty("testtime", "120");
    		prop.setProperty("questcnt", String.valueOf(test.getQuestionsCount()));
    		prop.setProperty("questfortestcnt", "0");
    		for (int i=0; i<test.getQuestionsCount(); i++) {
    			s = "Q"+intToTripleString(i)+'_';
    			prop.setProperty(s+'t', test.getQuestionText(i));
    			prop.setProperty(s+'c', String.valueOf (test.getAnswersCount(i)));
    			for (int j=0;j<test.getAnswersCount(i);j++){
    				s1 = s+String.valueOf(j);
    				s2 = test.getAnswerText(i, j);
    				if (test.getAnswerRight(i, j)) s2 = '*'+s2;
    				prop.setProperty(s1, s2);
    			}	//for j    			
    		} //for i		
    		prop.store(new FileOutputStream(filename), null);
    	} catch (IOException ex) {
    		ex.printStackTrace();
    		System.out.println(ex.getMessage());
        } catch (QuestionException qe){
        	System.out.println(qe.getMessage());
        }
	}	
	public static void out (String text){
		System.out.println(text);
	}
	
	public static void outln (String text){
		System.out.println(text+"\n");
	}
	
	public static String getKbdString(){
		byte bKbd[] = new byte[512];
		int iCnt = 0;
		String szStr = "";
		try
		{
		  iCnt = System.in.read(bKbd);
		}
		catch(Exception ex)
		{
		  System.out.println(ex.toString()); 
		}
		szStr = new String(bKbd, 0, iCnt);
		szStr = szStr.trim();
		return szStr;
	}
	
	public static int getKbdInt(){
		String szStr = getKbdString();
	    Integer intVal = new Integer(szStr);
		return intVal.intValue();
	}
	
	public static String enterString (String text){
		outln (text);
		return (getKbdString());
	}
	
	public static int enterInt (String text){
		out (text);
		return (getKbdInt());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] qarr = {"Единица растрового изображения — это", 
						 "Разрешение экрана измеряется в", 
						 "Размер бумажного изображения (фотографии) может измеряться в", 
						 "Для выделения связной области применяется инструмент", 
						 "Растровое изображение может иметь формат", 
						 "Наиболее качественное растровое изображение может быть в формате",
						 "800x600 — это количество", 
						 "Зная величины 800x600 и 72 dpi изображения, можно узнать его реальные размеры?", 
						 "Качество фотографии определяется", 
						 "Верно ли утверждение <<Качество растрового изображения не меняется при увеличении» размеров?>>",
						 "Какой формат изображения поддерживает слои?", 
						 "Альфа-канал определяет"};
		int[] anscntarr = {3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
		String[][] answsarr = {{"пиксел", "растр", "дюйм"}, 
							   {"миллиметрах", "дюймах", "точках на дюйм", "пикселях"}, 
							   {"кластерах", "растровых единицах", "точках на дюйм"},
							   {"волшебная палочка", "перо", "лассо"},
							   {"TIFF", "CDR", "ODT"},
							   {"TIFF", "JPEG", "BMP"},
							   {"пикселей по ширине и высоте", "пикселей на количество дюймов", "растровых точек на единицу длины"},
							   {"да", "нет", "иногда возможно"},
							   {"ее реальными размерами", "разрешением монитора компьютера", "разрешением изображения"},
							   {"Да", "Нет", "Не всегда"},
							   {"XCF", "GIF", "JPEG"},
							   {"прозрачность", "яркость", "определенную цветовую гамму"}};
		boolean[][] rightarr = {{false, true, false}, 
								{false, false, false, true}, 
								{false, true, false},
								{true, false, false},
								{true, false, false},
								{true, false, false},
								{true, false, false},
								{true, false, false},
								{false, false, true},
								{false, true, false},
								{true, false, false},
								{true, false, false}};
		Test test = new Test();
		String s = "Растровая графика. GIMP.";
		test.setName(s);
		s = "Тест по растровой графике и редактору GIMP.";
		test.setSubject(s);		
		int qcnt = 12;
		for (int i=0; i<qcnt; i++){
			Task task = new Task();
			task.setQuestion(qarr [i]);
			int acnt = anscntarr [i];
			for (int j=0; j<acnt; j++){
				s = answsarr [i][j];
				boolean b = rightarr [i][j];
				task.appendAnswer(s,  b);
			}
			test.appendTask(task);	
		}
		saveToFile(test, "default.prop");
		s = enterString("Тест сохранён. Нажмите Enter для завершения.");
	}

}
