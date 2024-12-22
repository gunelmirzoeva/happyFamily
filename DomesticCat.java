package happyFamily;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname) {
        super(Species.CAT, nickname);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.CAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I love to purr!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
}
