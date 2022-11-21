package be.intecbrussel.animals;

public class Lion implements Comparable<Lion>{
    private String name;
    private double neckFurLength;
    private int age;

    public Lion(String name, double neckFurLength, int age) {
        this.name = name;
        this.neckFurLength = neckFurLength;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNeckFurLength() {
        return neckFurLength;
    }

    public void setNeckFurLength(double neckFurLength) {
        this.neckFurLength = neckFurLength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", neckFurLength=" + neckFurLength +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Lion o) {
    //    int returnValue=this.name.compareTo(o.name);
     // return  returnValue;
        Lion lion1=this;
        Lion lion2=o;
        int lion1Age=lion1.age;
        int lion2Age=lion2.age;
        if (lion1Age>lion2Age) {
            return 1;
        }else if (lion1Age==lion2Age){
            return 0;
        }else {
            return -1;
    }
}
}
