import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier <Human> createHuman = () ->{
            System.out.println("Ввведите имя:");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Введите возраст:");
            Integer age = new Scanner(System.in).nextInt();
            System.out.println("Введите рост:");
            Double height = new Scanner(System.in).nextDouble();
            return new Human(name, age, height);
        };
        Predicate <Integer> isAdult = age -> age >= 18;
        Human human1 = createHuman.get();
        String adult = isAdult.test(human1.getAge()) ? "совершеннолетний" : "несовершеннолетний";
        System.out.println(human1.getName() + " "+adult);
        System.out.println("Вес: " + human1.getAge());

    }
}