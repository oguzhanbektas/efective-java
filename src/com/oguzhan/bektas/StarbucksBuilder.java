package com.oguzhan.bektas;

public class StarbucksBuilder {

    // requirement
    private String size;

    // not a requirement
    private String amountOfLactoseFreeMilk;
    private Boolean softenerCoffee;

    public StarbucksBuilder(Builder builder) {
        size = builder.size;
        amountOfLactoseFreeMilk = builder.amountOfLactoseFreeMilk;
        softenerCoffee = builder.softenerCoffee;
    }

    public static class Builder {

        // requirement
        private final String size;

        // not a requirement
        private String amountOfLactoseFreeMilk;
        private Boolean softenerCoffee;

        public Builder(String size) {
            this.size = size;
        }

        public Builder lactoseFreeMilk(String lactoseFreeMilk) {
            amountOfLactoseFreeMilk = lactoseFreeMilk;
            return this;
        }

        public Builder softener(Boolean softener) throws Exception {
            if (softener == null) {
                throw new Exception();
            }
            softenerCoffee = softener;
            return this;
        }

        public StarbucksBuilder build() {
            return new StarbucksBuilder(this);
        }
    }
}
