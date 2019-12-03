public class Cat {
    private String name;
    private int age;
    private boolean fivPos;

    public Cat(String name, int age, boolean fivPos) {
        this.name = name;
        this.age = age;
        this.fivPos = fivPos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFivPos() {
        return fivPos;
    }

    public void setFivPos(boolean fivPos) {
        this.fivPos = fivPos;
    }

    @Override
    public String toString() {
        return name + " (Cat, age " + age + ", " + (fivPos ? "FIV+" : "FIV-") + ")";
    }
}
