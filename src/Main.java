import java.util.Scanner;

/*Создать программу, которая позвояет ввести с клавиатуры n диапазонов
        целочисленных значений (например, 3-10).
        Каждый диапазон имеет начальную и конечную точку.
        После ввода программа должна вывести длину каждого диапазона.
        Программа должна выводить сообщение об ошибке, если начало диапазона больше, чем конец.*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте колличество диапазонов: ");
        int n = scanner.nextInt();
        Range[] array = new Range[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите число начала диапазона :");
            int start = scanner.nextInt();
            System.out.println("Введите число конца диапазона :");
            int end = scanner.nextInt();
            Range range = new Range(start, end);
            array[i] = range;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i].getLength());
        }


    }
}