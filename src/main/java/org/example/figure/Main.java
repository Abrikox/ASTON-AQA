package org.example.figure;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Зеленый", "Синий");
        Triangle triangle = new Triangle(3, 4, 5, "Желтый", "Коричневый");

        circle.displayInfo();
        System.out.println();
        rectangle.displayInfo();
        System.out.println();
        triangle.displayInfo();
    }
}
