package HomeWork6;

public class Animal {


    private final String name;
    private final float maxRun;
    private final float maxSwim;


    public Animal(String name, float maxRun, float maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

    }

    public void run(float dimension) {
        if (dimension > maxRun) {
            System.out.println("не можем пробежать такую дистанцию");
        } else {
            System.out.println(name + " пробежал!");
        }
    }

    public void swim(float dimension) {
        if (maxSwim == 0f) {
            System.out.println(name + " не умеет плавать");
            return;
        }
        if (dimension > maxSwim) {
            System.out.println("не можем проплыть такую дистанцию");
        } else {
            System.out.println(name + " проплыл!");
        }

    }


}
