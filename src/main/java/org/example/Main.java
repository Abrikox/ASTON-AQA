package org.example;

import org.example.park.Park;
import org.example.employee.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Danila", "Rabotyaga", "danila7327441@gmail.com",
                "+375(29)729-41-10", 0, 23);
        System.out.println(employee);

        Employee[] emplArr = new Employee[5];
        emplArr[0] = employee;
        emplArr[1] = new Employee("Stepan Stepanych", "Nachalnik", "stepan228@gmail.com",
                "+375(44)123-32-12", 1000, 14);
        emplArr[2] = new Employee("Ivan Ivanych", "Zam Nachalnika", "Ivan228@gmail.com",
                "+375(29)234-43-23", 500, 13);
        emplArr[3] = new Employee("Nikita Nikitich", "Rabotyaga", "nikita-rabotyaga@gmail.com",
                "+375(33)999-99-99", 100, 10);
        emplArr[4] = new Employee("Dobrynia Dobrynin", "Trudyaga", "dobrynia-trudyaga@gmail.com",
                "+375(29)888-88-88", 50, 9);

        employee.printArrInfo(emplArr);

        ArrayList<Park.Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Park.Attraction("American Gorki", "06:00 - 07:00", 100));

        attractionList.add(new Park.Attraction("Lohotron", "06:00 - 07:00", 100000000));

        Park.Attraction attraction = new Park.Attraction("Tir", "06:00 - 07:0", 1000);

        attractionList.add(attraction);

        attraction.infoAttractionList(attractionList);
    }

}
