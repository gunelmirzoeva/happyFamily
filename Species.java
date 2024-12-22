package happyFamily;

public enum Species {
    CAT(false, 4, true),
    DOG(false, 4, true),
    BIRD(true, 2, false),
    FISH(false, 0, false),
    HAMSTER(false, 4, true),
    UNKNOWN(false, 0, false);
    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }

    @Override
    public String toString() {
        return name() + " {canFly=" + canFly + ", numberOfLegs=" + numberOfLegs + ", hasFur=" + hasFur + "} ";
    }
}
