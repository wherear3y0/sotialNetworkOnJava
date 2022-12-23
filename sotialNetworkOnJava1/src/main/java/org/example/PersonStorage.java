package org.example;

import Description.Person;

import java.util.HashMap;
import java.util.Optional;

public class PersonStorage {

    private HashMap<Integer, Person> persons;
    private int countId;
    PersonStorage(){
        this.persons = new HashMap<Integer, Person>();
        this.countId = 1;
    }

    public void addPerson(Person person) {
        persons.put(countId++, person);
    }
    public Optional<Person> getById(Integer id)  {
        return Optional.ofNullable(persons.get(id));
    }

}
