package com.tts;

public class pet {

    private String name;
    private int age;
    private String location;
    private String type;
//Empty Constructor
    public pet() {

    }
//All attributes constructor

    public pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;

    }
    //Get Methods

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }
    //Code to be able to change the Set Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
