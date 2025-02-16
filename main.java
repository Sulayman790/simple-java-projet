// Exemple complet démontrant les concepts de base en Java
public class Main {
    public static void main(String[] args) {
        // --- Déclarations et types primitifs ---
        int x = 10;
        double y = 3.14;
        boolean flag = true;
        String message = "Bonjour, Java!";
        
        System.out.println("Message: " + message);
        System.out.println("x = " + x + ", y = " + y);
        
        // --- Structures de contrôle ---
        // Condition if/else
        if (x > 5) {
            System.out.println("x est supérieur à 5");
        } else {
            System.out.println("x est inférieur ou égal à 5");
        }
        
        // Switch-case
        int jour = 3;
        switch(jour) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            default:
                System.out.println("Autre jour");
                break;
        }
        
        // Boucles
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop i = " + i);
        }
        
        // While loop
        int j = 5;
        while(j > 0) {
            System.out.println("While loop j = " + j);
            j--;
        }
        
        // Do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop k = " + k);
            k++;
        } while(k < 3);
        
        // --- Utilisation des tableaux ---
        int[] tableau = {1, 2, 3, 4, 5};
        for (int nombre : tableau) {
            System.out.println("Nombre dans le tableau: " + nombre);
        }
        
        // --- Utilisation des Collections ---
        // ArrayList avec Generics
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Charlie");
        System.out.println("ArrayList: " + arrayList);
        
        // LinkedList
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        System.out.println("LinkedList: " + linkedList);
        
        // HashMap
        java.util.HashMap<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "Un");
        map.put(2, "Deux");
        map.put(3, "Trois");
        System.out.println("HashMap: " + map);
        
        // --- Gestion des exceptions ---
        try {
            // Division par zéro pour générer une exception
            int division = x / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception attrapée: " + e.getMessage());
        }
        
        // --- Programmation orientée objet ---
        // Création et utilisation d'objets qui démontrent l'héritage, le polymorphisme et l'implémentation d'une interface
        
        // Création d'un objet Dog (chien) qui hérite d'Animal et implémente l'interface Speakable
        Dog dog = new Dog("Rex");
        dog.speak();
        dog.displayInfo();
        
        // Création d'un objet Cat (chat)
        Cat cat = new Cat("Whiskers");
        cat.speak();
        cat.displayInfo();
        
        // Polymorphisme : une référence de type Animal peut contenir un objet Dog
        Animal animal = new Dog("Buddy");
        animal.speak();
    }
}

// --- Interface ---
interface Speakable {
    void speak();
}

// --- Classe abstraite ---
abstract class Animal implements Speakable {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.println("Nom de l'animal: " + name);
    }
    
    // Méthode abstraite que les sous-classes doivent implémenter
    public abstract void speak();
}

// --- Classe concrète Dog qui hérite d'Animal ---
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void speak() {
        System.out.println(name + " dit: Woof Woof!");
    }
}

// --- Classe concrète Cat qui hérite d'Animal ---
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void speak() {
        System.out.println(name + " dit: Meow!");
    }
}
