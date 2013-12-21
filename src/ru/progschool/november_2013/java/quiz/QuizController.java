/**
 * 
 */
package ru.progschool.november_2013.java.quiz;

import java.util.*;
/**
 * @author Sergey
 *
 */
public class QuizController {
    private QuizView quizview;
    private QuizModel quizmodel;
    //***************************************************************
// Конструктор контроллера
//***************************************************************
    public QuizController() {
        quizview = new QuizConsoleView();  // Создание объекта представления
        quizmodel = new QuizModel();     // Создание модели ( ввод текста всех задач)
    }

//***************************************************************
// Метод ViewAll -
// Считывание всех задач из модели и передача их во View
//***************************************************************
    public void performTest(){
        Test test ;
        test = quizmodel.getTest();
        quizview.executeTest(test);
    }
}  // Окончание класса  QuizController

