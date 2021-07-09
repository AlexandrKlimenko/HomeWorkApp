package HomeWork6;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Cat("Cat", 200, 0),
                new Dog("Dog", 500, 10)
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(350);
            animals[i].swim(8);
        }
    }


}