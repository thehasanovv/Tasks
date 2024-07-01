package classtasks.happyfamily;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;

    private Human father;

    private Human[] children;

    private Pet pet;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public void addChild(Human child) {
        if (children == null) {
            this.children = new Human[1];
            children[0] = child;
        } else {
            Human[] tempArr = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                tempArr[i] = children[i];
            }
            tempArr[tempArr.length - 1] = child;
            this.children = tempArr;
        }
    }

    public boolean deleteChild(int index) {
        if (this.children == null) return false;

        Human[] tempArr = new Human[this.children.length - 1];

        if (tempArr.length < index) {
            throw new RuntimeException("Hal hazırda " + this.children.length + " index var. Sən isə "
                    + index + "ci " + "indexi istəyirsən");
        }

        for (int i = 0, k = 0; i < children.length; i++) {
            if (i == index) continue;
            tempArr[k++] = this.children[i];
        }
        this.children = tempArr;

        return true;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother)
                && Objects.equals(father, family.father)
                && Arrays.equals(children, family.children)
                && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
