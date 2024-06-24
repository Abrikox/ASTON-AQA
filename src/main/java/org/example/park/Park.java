package org.example.park;

import java.util.ArrayList;

public class Park {
    public static class Attraction {

        private final String name;
        private final String workTime;
        private final int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("Attraction: %s%nWorking hours: %s%nPrice: %d%n", name, workTime, price);

        }

        public void infoAttractionList(ArrayList<Attraction> attractionList) {
            for (Attraction array : attractionList) {
                System.out.println(array);
            }

        }
    }
}
