package factoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.create();
        dog.speak();

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.create();
        cat.speak();
    }
}
