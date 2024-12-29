package animalEntity;

import animal.Bird;
import animalNature.Prey;

public class Parrot extends Bird implements Prey {

    public Parrot (String name, int age, int heightOfFly) {
        super(name, age, heightOfFly);
    }

    public String getSpecial() {
        return "The intelligent bird!";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void show(int index) {
        System.out.println("row: " + index + "\tname: " + getName() + "\tage: " + getAge() + "\tfly height: " + getHeightOfFly() + "\tanimal special: " + getSpecial());
    }

}