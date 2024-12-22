package happyFamily;

public class RoboCat extends Pet {
    public RoboCat(String nickname) {
        super(Species.CAT, nickname);
    }

    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.CAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + getNickname() + ". I am a robot cat!");
    }
}
