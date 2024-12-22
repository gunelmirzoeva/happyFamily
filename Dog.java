package happyFamily;

public class Dog extends Pet {
    public Dog(String nickname) {
        super(Species.DOG, nickname);
    }

    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
