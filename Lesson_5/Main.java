import checkNumber.CheckNumber;
import checkSumSign.CheckSumSign;
import compareNumbers.CompareNumbers;
import createArray.CreateArray;
import diagArray.DiagArray;
import fillArray.FillArray;
import isLeapYear.IsLeapYear;
import isNegative.IsNegative;
import isSumInRange.IsSumInRange;
import printArray.PrintArray;
import printColor.PrintColor;
import printString.PrintString;
import printThreeWords.PrintThreeWords;
import transArray.TransArray;


public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1: Создайте метод printThreeWords()");
        PrintThreeWords printThreeWords = new PrintThreeWords();
        printThreeWords.words();

        System.out.println("Задание 2: Создайте метод checkSumSign()");

        CheckSumSign checkSumSign = new CheckSumSign();
        checkSumSign.checkSumSign();

        System.out.println("Задание 3: Создайте метод printColor()");

        PrintColor printColor = new PrintColor();
        printColor.printColor();

        System.out.println("Задание 4: Создайте метод compareNumbers()");

        CompareNumbers compareNumbers = new CompareNumbers();
        compareNumbers.compareNumbers();

        System.out.println("Задание 5: Входит ли сумма двух чисел входит в диапазон 10..20");

        IsSumInRange isSumInRange = new IsSumInRange();
        System.out.println(isSumInRange.isSumInRange(1,8));

        System.out.println("Задание 6: Проверка на положительное число");

        CheckNumber number = new CheckNumber();
        number.checkNumber(number.getA());

        System.out.println("Задание 7: Проверка на отрицательность");

        IsNegative negative = new IsNegative();
        System.out.println("Число: " + negative.getA());
        System.out.println(negative.isNegative(negative.getA()));

        System.out.println("Задание 8: Передеть строку и число, метод выводит строку число раз");

        PrintString print = new PrintString();
        print.printString(print.getStr(), print.getA());

        System.out.println("Задание 9: Проверка является ли год високосным");

        IsLeapYear isLeapYear = new IsLeapYear();
        isLeapYear.value();

        System.out.println("Задание 10: замена 1 на 0 и 0 на 1 в массиве");

        PrintArray printArr = new PrintArray();
        PrintArray.printArray();

        System.out.println("Задание 11: Заполнение пустого массива");

        FillArray fillArr = new FillArray();
        fillArr.arr();

        System.out.println("Задание 12: В массиве [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] все что меньше 6 умнржается на 2");

        TransArray transArr = new TransArray();
        transArr.transArr();

        System.out.println("Задание 13: Диаганали в двумерном массиве");

        DiagArray diagArr = new DiagArray();
        diagArr.diagArr();

        System.out.println("Задание 14: Указать размер массива и его наполнение");

        CreateArray createArr = new CreateArray();
        CreateArray.createArr(10,20);

    }
}
