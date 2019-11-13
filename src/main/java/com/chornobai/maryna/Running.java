package com.chornobai.maryna;
import org.apache.log4j.Logger;

public class Running extends Hobby {

    private int distance;

    public Running(String name, int age, int distance) {
        super(name, age);
        this.distance = distance;
    }

    @Override
    void tellAboutHobby() throws HobbyException {
        if (age < 0) throw new HobbyException();
        else {
            System.out.println("Hobby{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}' + "Running{" +
                    "distance=" + distance +
                    '}');


        }
    }
}
