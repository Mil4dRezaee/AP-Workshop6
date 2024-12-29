package animalEntity;

import animal.Mammal;
import animalNature.Hunter;
import animalNature.Prey;

public class Cheetah extends Mammal implements Hunter {

    public Cheetah (String name, int age, int speed) {
        super(name, age, speed);
    }

    public String getSpecial() {
        return "The fastest speed!";
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
        System.out.println("row: " + index + "\tname: " + getName() + "\tage: " + getAge() + "\tspeed: " +getSpeed() + "\tanimal special: " + getSpecial());
    }

}