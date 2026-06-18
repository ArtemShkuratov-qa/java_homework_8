package generics.tasks;

//3. Задача на дженерик с двумя типами данных
//   Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов. Класс должен позволять получать и устанавливать каждый из этих объектов.
public class Pair <T, E> {
    private T firstValue;
    private E secondValue;

    public void setFirstValue(T value) {
        this.firstValue = value;
    }

    public void setSecondValue(E value) {
        this.secondValue = value;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public E getSecondValue() {
        return secondValue;
    }
}
