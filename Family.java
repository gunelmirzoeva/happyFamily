package happyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[children.length] = child;
        this.children = newChildren;
        child.setFamily(this);
    }

    public boolean deleteChild(Human child) {
        int index = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;

        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        this.children = newChildren;
        child.setFamily(null);
        return true;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public String toString() {
        return "\nFamily: \n" +
                "mother=" + mother.getName() + " " + mother.getSurname() +
                "\nfather=" + father.getName() + " " + father.getSurname() +
                "\nchildren=" + Arrays.toString(Arrays.stream(children).map(Human::getName).toArray(String[]::new)) +
                "\npet=" + pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father) + Arrays.hashCode(children) + Objects.hashCode(pet);
    }


}
