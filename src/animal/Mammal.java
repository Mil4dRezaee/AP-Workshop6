package animal;

public abstract class Mammal extends Animal{

    public Mammal(String name, int age, int speed) {
        super.setName(name);
        super.setAge(age);
        this.setSpeed(speed);
    }

    private int Speed;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

}