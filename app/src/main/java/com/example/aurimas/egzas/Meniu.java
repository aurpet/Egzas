package com.example.aurimas.egzas;


public class Meniu {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeniu() {
        return meniu;
    }

    public void setMeniu(String meniu) {
        this.meniu = meniu;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String meniu;
    private String group;
    private String name;
    private double calories;
    private double price;

    public Meniu(int id, String meniu, String group, String name, double calories, double price) {
        this.id = id;
        this.meniu = meniu;
        this.group = group;
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Meniu (){

    }


    @Override
    public String toString() {
        return "Meniu{" +
                "id=" + id +
                ", meniu='" + meniu + '\'' +
                ", group=" + group +
                ", name=" + name +
                ", calories='" + calories + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}