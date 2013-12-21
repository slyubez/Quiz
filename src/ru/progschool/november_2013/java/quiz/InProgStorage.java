package ru.progschool.november_2013.java.quiz;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 19.12.13
 * Time: 20:22
 * To change this template use File | Settings | File Templates.
 */
public class InProgStorage implements QuizStorage{
    public void restoreTest(Test test) {
        Task t = new Task();
        test.setSubject("Math");
        test.setName("For beginners");
        t.setQuestion("2х2=?");
        t.appendAnswer("4", true);
        t.appendAnswer("3", false);
        t.appendAnswer("5", false);
        test.appendTask(t);             // Добавление первой задачи в коллекцию
        t = new Task();
        t.setQuestion("A square is ");
        t.appendAnswer("a rectangle", true);
        t.appendAnswer("a triangle", false);
        t.appendAnswer("a quadrangle", true);
        test.appendTask(t);              // Добавление второй задачи в коллекцию
    }
}
