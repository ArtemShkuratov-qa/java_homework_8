package generics.tasks;

//1. Задача на дженерик класс
//   Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа. Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
public class Box <T> {
    private T value;

    public void setValue(T newValue) {
        this.value = newValue;
    }

    public T getValue() {
        return value;
    }

    //2. Задача на дженерик метод
    //   Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
    public static <U> void printArray(U [] array) {
        for (U element : array) {
            System.out.println(element);
        }
    }
}
