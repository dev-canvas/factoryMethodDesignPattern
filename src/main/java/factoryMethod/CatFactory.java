package factoryMethod;

public class CatFactory extends AnimalFactory {
    Animal create() {
        return new Cat();
    }
}
