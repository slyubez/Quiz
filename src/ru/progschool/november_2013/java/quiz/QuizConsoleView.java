package ru.progschool.november_2013.java.quiz;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 19.12.13
 * Time: 20:39
 * To change this template use File | Settings | File Templates.
 */
public class QuizConsoleView implements QuizView {
    public  void executeTest(Test test){
        System.out.println("Subject: "+ test.getSubject());  //Предмет
        System.out.println("Name: "+ test.getName());  //Предмет
        System.out.println("**************************************************");    //Разделитель задач
        ArrayList tasks =  test.getTasks();     // Получение коллекции всех задач из модели
        Iterator itr = tasks.iterator();
        Task task;
        while(itr.hasNext()) {             // Цикл по всем задачам
            task = (Task)itr.next();       // Получение объекта очередной задачи из коллекции
            System.out.println("Question "+ task.getQuestion()); //Вопрос
            ArrayList answers =  task.getAnswers();
            Iterator itrans = answers.iterator();
            Answer answer;
            System.out.println("Answer versions:");
            while(itrans.hasNext()) {                //Цикл вывода всех ответов
                answer = (Answer)itrans.next();
                System.out.println(answer.getAnswer() + " " + (answer.isRight()? "Right": "Wrong"));
            }
            System.out.println("**************************************************");    //Разделитель задач

        }
    }

}

