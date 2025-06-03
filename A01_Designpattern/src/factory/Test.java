package factory;

public class Test {

    public static void main(String[] args) {
       Animal animal=  AnimalFactory.create("dog");
       animal.run();
    }
}
