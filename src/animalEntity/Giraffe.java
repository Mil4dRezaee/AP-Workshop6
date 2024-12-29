package animalEntity;

import animal.Mammal;
import animalNature.Prey;

public class Giraffe extends Mammal implements Prey {

    public Giraffe (String name, int age, int speed) {
        super(name, age, speed);
    }

    public String getSpecial() {
        return "towering height";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void show(int index) {
        System.out.println("row: " + index + "\tname: " + getName() + "\tage: " + getAge() + "\tspeed: " + getSpeed() + "\tanimal special: " + getSpecial());
    }

}