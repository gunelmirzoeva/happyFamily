package happyFamily;

public class Fish extends Pet {
    public Fish(String nickname) {
        super(Species.FISH, nickname);
    }

    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.FISH, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I swim around!");
    }
}
