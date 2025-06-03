package factory;
/*
Schreibe eine AnimalFactory, die Katzen (Cat) oder Hunde (Dog) produzieren kann.
Verwende in der Klasse AnimalFactory eine create-Methode mit switch-case.
 */
public class AnimalFactory {

    public static Animal create(String t){

        return switch (t) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> null;
        };
// Klassisch:
//        switch (t){
//            case "cat":
//                return  new Cat();
//            case "dog":
//                return new Dog();
//        }

    }
}
