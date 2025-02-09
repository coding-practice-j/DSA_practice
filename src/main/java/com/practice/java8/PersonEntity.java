package com.practice.java8;

public class PersonEntity {
    private String name;
    private int age;
    
	/*
	 * public Person() { }
	 */

    public PersonEntity(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
