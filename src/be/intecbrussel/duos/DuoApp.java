package be.intecbrussel.duos;

public class DuoApp {
    public static void main(String[] args) {
     IntDuo euroAndCents=new IntDuo(50,80);
        System.out.println("I have "+euroAndCents.getNumber1()+" euro!");
        System.out.println("I have "+euroAndCents.getNumber2()+" cents!");
     Duo<Integer> euroAndCent=new Duo<>(50,80);
        System.out.println("I have "+euroAndCent.getNumber1()+" euro!");
        Duo<String>synonym=new Duo<>("Happy","Joyful");
        System.out.println(synonym.getNumber1()+" means the same as "+synonym.getNumber2());
        DifferentDuo<Integer,String>numbers=new DifferentDuo<>(20,"Twenty");
        System.out.println(numbers.getElement1()+ " = " +numbers.getElement2());
        }

    }

