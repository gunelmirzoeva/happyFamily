package happyFamily;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Cupcake", 1, 65, new String[]{"eat", "drink", "sleep"});
        Human father = new Man("Jack", "Russell", 1970);
        Human mother = new Woman("Jane", "Russell", 1972);
        Family family = new Family(mother, father);
        family.setPet(dog);

        Human child = new Woman("Jessica", "Russell", 2004, 100, dog, family, new String[][]{{"Monday", "party"}, {"Tuesday", "chess"}});
        family.addChild(child);

        System.out.println(family);

        child.greetPet();
        child.describePet();

        System.out.println("Family count: " + family.countFamily());

        family.deleteChild(child);
        System.out.println("After removing child: " + family);

        System.out.println("Family count after removing child: " + family.countFamily());
    }
}
