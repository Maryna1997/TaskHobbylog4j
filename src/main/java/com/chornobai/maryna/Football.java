package com.chornobai.maryna;


public class Football extends Hobby {

    private int number;

    public Football(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    @Override
    void tellAboutHobby() throws HobbyException {
        if (age < 0) throw new HobbyException();
        else {
            System.out.println("Hobby{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}' + "Football{" +
                    "number=" + number +
                    '}');
        }


    }
}
