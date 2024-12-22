package happyFamily;

import java.util.Arrays;
import java.util.Objects;

public abstract class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Family family;
    private String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Family family, String[][] schedule) {
        this(name, surname, year);
        this.iq = iq;
        this.pet = pet;
        this.family = family;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname());
        } else {
            System.out.println("Hello, no pet available");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyness = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old, and he is " + slyness + ".");
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Arrays.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, pet) + Arrays.deepHashCode(schedule);
    }

}

final class Man extends Human {
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, Pet pet, Family family, String[][] schedule) {
        super(name, surname, year, iq, pet, family, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey buddy, " + getPet().getNickname() + ", how's it going?");
    }

    public void repairCar() {
        System.out.println("I am repairing the car.");
    }
}

final class Woman extends Human {
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, Family family, String[][] schedule) {
        super(name, surname, year, iq, pet, family, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello dear, " + getPet().getNickname() + ", did you miss me?");
    }

    public void makeup() {
        System.out.println("I am doing makeup.");
    }
}
