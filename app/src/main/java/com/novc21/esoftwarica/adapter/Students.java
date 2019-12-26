package com.novc21.esoftwarica.adapter;

public class Students {
    private String name, gender, address;
    private int age, imgProfileId, imgDeleteId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImgProfileId() {
        return imgProfileId;
    }

    public void setImgProfileId(int imgProfileId) {
        this.imgProfileId = imgProfileId;
    }

    public int getImgDeleteId() {
        return imgDeleteId;
    }

    public void setImgDeleteId(int imgDeleteId) {
        this.imgDeleteId = imgDeleteId;
    }

    public Students(String name, String gender, String address, int age, int imgProfileId, int imgDeleteId) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
        this.imgProfileId = imgProfileId;
        this.imgDeleteId = imgDeleteId;
    }
}
