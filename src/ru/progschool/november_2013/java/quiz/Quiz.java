package ru.progschool.november_2013.java.quiz;
/**
 * @author ProgSchool
 */
//import ru.progschool.november_2013.java.quiz.*;
import java.io.File;

/**
 * Класс Quiz будет основным классом программы
 *
 */
public class Quiz {
	/**
	 * @param args
	 * В методе main сначала мы должны проверить доступность файла данных, и если
	 * он не существует - выйти из программы с сообщением об ошибке.
	 * Имя файла данных берётся из константы QUIZDEFAULTFILENAME. Сам файл располагается
	 * в каталоге с программой.
	 * Затем проверяется корректность файла путём загрузки списка вопросов. При
	 * ошибке в процессе загрузки файла - тоже выходим из программы, предварительно
	 * выругавшись.
	 * В противном случае запустим класс QuizController и передаём его конструктору имя 
	 * пользователя для последующей обработки.
	 */
	public static void main(String[] args) {
        QuizController quizController = new QuizController();     // Создание контроллера
        quizController.performTest();                                 // Выдача всех задач на консоль
	}

}
