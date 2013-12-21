package ru.progschool.november_2013.java.quiz;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 19.12.13
 * Time: 11:50
 * To change this template use File | Settings | File Templates.
 */
public class QuizModel {
    private  Test test;
    private QuizStorage quizStorage;
//***************************************************************
// Конструктор модели. Ввод всех задач
//***************************************************************
    public QuizModel(){
       quizStorage = new InProgStorage();
       test = new Test();
       quizStorage.restoreTest(test);
    }
//***************************************************************
// Предоставление доступа к тесту
//***************************************************************
    public Test getTest(){
        return this.test;
    }

}
