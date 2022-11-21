package be.intecbrussel.optionals;

import java.util.Optional;

public class PersonRepository {
    private Person[] people;

    public PersonRepository() {
        people = new Person[5];
        people[0] = new Person("Jean", 12);
        people[1] = new Person("Bob", 16);
        people[2] = new Person("Kadir", 35);
        people[3] = new Person("Avi", 23);
        people[4] = new Person("Zakaria", 25);
    }

    // public Person findByName(String name) {
      public Optional<Person> findByName(String name){
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}



