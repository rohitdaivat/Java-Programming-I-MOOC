
public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        this.height = 0;
        this.weight = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }

    public int growOlder() {
        this.age = this.age + 1;
        return this.age;
    }
    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    
    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

}
