package com.chornobai.maryna;


public abstract class Hobby {

    public String name;
    public int age;
    abstract void tellAboutHobby() throws HobbyException;

    public Hobby(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hobby() {
        super();
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
