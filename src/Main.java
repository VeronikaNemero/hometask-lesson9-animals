import animals.Dog;
import animals.Rabbit;
import animals.Tiger;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.voice();
        dog.eat("MEAT");

        Rabbit rabbit = new Rabbit();
        rabbit.voice();
        rabbit.eat("grass");

        Tiger tiger = new Tiger();
        tiger.voice();
        tiger.eat("carrot");
    }
}
