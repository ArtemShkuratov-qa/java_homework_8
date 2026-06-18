package generics.tasks;

public class Main {
    static void main(String[] args) {
        //Проверка реализации дженерик класса Box
        Box testString = new Box();
        testString.setValue("ABC");
        System.out.println(testString.getValue());

        Box testInt = new Box();
        testInt.setValue(123);
        System.out.println(testInt.getValue());

        //Проверка реализации дженерик метода printArray
        String [] fruits = {"Апельсин", "Груша", "Яблоко", "Киви", "Банан"};
        Integer [] numbers = {1, 2, 3, 10, 1111, 5234};

        testString.printArray(fruits);
        testInt.printArray(numbers);

        //Проверка реализации класса Pair с двумя типами
        Pair pair1 = new Pair();

        pair1.setFirstValue("UUQZ");
        System.out.println(pair1.getFirstValue());

        pair1.setSecondValue(124);
        System.out.println(pair1.getSecondValue());
    }
}
