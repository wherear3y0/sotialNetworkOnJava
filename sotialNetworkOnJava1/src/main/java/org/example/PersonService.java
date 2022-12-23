package org.example;

import Description.Person;

public class PersonService {
    private PersonStorage storage;
    PersonService() {
        storage = new PersonStorage();
    }
    public void addPerson(int age, String name, int gender) {
        storage.addPerson(new Person(age,name,gender));
    }
    public Person getById(int id) {
        String s = "ID doesn't contain in storage";
        return storage.getById(id).orElseThrow();
    }

}
