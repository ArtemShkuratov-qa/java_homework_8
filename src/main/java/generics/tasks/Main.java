package generics.tasks;

public class Main {
    public static void main(String[] args) {
        //Проверка реализации дженерик класса Box
        Box <String> testString = new Box<>();
        testString.setValue("ABC");
        System.out.println(testString.getValue());

        Box <Integer> testInt = new Box<>();
        testInt.setValue(123);
        System.out.println(testInt.getValue());

        //Проверка реализации дженерик метода printArray
        String [] fruits = {"Апельсин", "Груша", "Яблоко", "Киви", "Банан"};
        Integer [] numbers = {1, 2, 3, 10, 1111, 5234};

        Box.printArray(fruits);
        Box.printArray(numbers);

        //Проверка реализации класса Pair с двумя типами
        Pair <String,Integer> pair1 = new Pair<>();

        pair1.setFirstValue("UUQZ");
        System.out.println(pair1.getFirstValue());

        pair1.setSecondValue(124);
        System.out.println(pair1.getSecondValue());
    }
}
