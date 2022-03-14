package com.tsi.java.Animals.Exo6_7;

    public class Domestic {

        protected final String name;

        public Domestic (String name) {
            this.name = name;
        }

        protected void cat() {
            System.out.printf("%s Kitty\n", name);
        }

        protected void printNameDog() {
            System.out.printf("%s Scooby-doo\n", name);
        }

        }

