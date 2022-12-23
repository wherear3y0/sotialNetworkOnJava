package org.example;

public class Person {

    private int age;
    private String name;
    private int gender;

    public Person(int age, String name, int gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name ){
        this.name = name;
    }

    public int getGender(){
        return gender;
    }
    public void setGender(int gender){
        this.gender = gender;
    }
}
