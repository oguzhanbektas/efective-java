package com.oguzhan.bektas.efectivejava.item2;

public class Starbucks {

    // requirement
    private String size;

    // not a requirement
    private String amountOfLactoseFreeMilk;
    private Boolean softenerCoffee;

    public Starbucks() {
    }


    // Telescope Pattern

    public Starbucks(String size, String amountOfLactoseFreeMilk) {
        this.size = size;
        this.amountOfLactoseFreeMilk = amountOfLactoseFreeMilk;
    }

    public Starbucks(String size, Boolean softenerCoffee) {
        this.size = size;
        this.softenerCoffee = softenerCoffee;
    }

    public Starbucks(String size, String amountOfLactoseFreeMilk, Boolean softenerCoffee) {
        this.size = size;
        this.amountOfLactoseFreeMilk = amountOfLactoseFreeMilk;
        this.softenerCoffee = softenerCoffee;
    }

    public Starbucks(String xl) {
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAmountOfLactoseFreeMilk() {
        return amountOfLactoseFreeMilk;
    }

    public void setAmountOfLactoseFreeMilk(String amountOfLactoseFreeMilk) {
        this.amountOfLactoseFreeMilk = amountOfLactoseFreeMilk;
    }

    public Boolean getSoftenerCoffee() {
        return softenerCoffee;
    }

    public void setSoftenerCoffee(Boolean softenerCoffee) {
        this.softenerCoffee = softenerCoffee;
    }
}
