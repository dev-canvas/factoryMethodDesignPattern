package factoryMethod;

public class DogFactory extends AnimalFactory {
    Animal create() {
        return new Dog();
    }
}
