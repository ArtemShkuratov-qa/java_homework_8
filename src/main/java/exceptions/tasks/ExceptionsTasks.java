package exceptions.tasks;

import exceptions.tasks.exceptions.InvalidAgeException;
import exceptions.tasks.exceptions.InvalidEmailException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsTasks {
    //1. Обработка проверяемого исключения
    //   Условие задачи:
    //   Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
    public void openFile() {
        try {
            FileReader file = new FileReader("file10.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }

    //2. Обработка непроверяемого исключения
    //   Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление. Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
    public void division(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!");
        }
    }

    //3. Создание и использование собственного проверяемого исключения
    //   Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Введен некорректный возраст пользователя. Возраст должен быть от 0 до 150!");
        } else System.out.println("Введено валидное значение возраста");
    }

    //4. Создание и использование собственного непроверяемого исключения
    //   Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
    public void checkEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || (!email.contains(".com") && !email.contains(".ru"))) {
            throw new InvalidEmailException("Введен невалидный email пользователя!");
        } else System.out.println("Введен валидный email!");
    }
}
