package animalEntity;

import animal.Bird;
import animalNature.Hunter;
import animalNature.Prey;

public class Eagle extends Bird implements Hunter {

    public Eagle (String name, int age, int heightOfFly) {
        super(name, age, heightOfFly);
    }

    public String getSpecial() {
        return "The fastest diver!";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(getName() + " hunted " + prey.getName());
    }

    @Override
    public void show(int index) {
        System.out.println("row: " + index + "\tname: " + getName() + "\tage: " + getAge() + "\tfly height: " + getHeightOfFly() + "\tanimal special: " + getSpecial());
    }

}