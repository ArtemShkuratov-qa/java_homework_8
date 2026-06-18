package exceptions.tasks;

import exceptions.tasks.exceptions.InvalidAgeException;
import exceptions.tasks.exceptions.InvalidEmailException;

public class Main {
    static void main(String[] args) {
        ExceptionsTasks exceptionsTasks = new ExceptionsTasks();

        //Проверка метода для обработки исключения FileNotFoundException
        exceptionsTasks.openFile();

        //Проверка метода для обработки исключения ArithmeticException
        exceptionsTasks.division(10, 0);

        //Проверка оработки исключения InvalidAgeException
        try {
            exceptionsTasks.checkAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }

        try {
            exceptionsTasks.checkAge(160);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }

        //Проверка обработки исключения InvalidEmailException
        try {
            exceptionsTasks.checkEmail("artem_shkuratov@bk.ru");
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            exceptionsTasks.checkEmail("artem_shkuratov@bk");
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
