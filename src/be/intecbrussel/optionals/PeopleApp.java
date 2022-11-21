package be.intecbrussel.optionals;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class PeopleApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Who do you want to find?");
        String name=scanner.nextLine();

        //Person person=pr.findByName(name);
        PersonRepository pr=new PersonRepository();
        Optional<Person> optionalPerson=pr.findByName(name);
        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            System.out.println(person);
            System.out.println("The age of " + name + " is " + person.getAge());
        }else{
            System.out.println("Person "+name+" is not found");
        }
        ArrayList<Person>peoples=new ArrayList<>();
    }
}
