package animal;

public abstract class Bird extends Animal{

    public Bird(String name, int age, int heightOfFly) {
        super.setName(name);
        super.setAge(age);
        this.setHeightOfFly(heightOfFly);
    }

    private int heightOfFly;

    public int getHeightOfFly() {
        return heightOfFly;
    }

    public void setHeightOfFly(int heightOfFly) {
        this.heightOfFly = heightOfFly;
    }

}