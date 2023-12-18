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
            int start;
            int end;
            do{
                System.out.println("Введите число начала диапазона :");
                start = scanner.nextInt();
                System.out.println("Введите число конца диапазона :");
                end = scanner.nextInt();
                if(start > end) {
                    System.out.println("Ошибка, начало: " + start + " больше, чем конец: " + end);
                    System.out.println("Введите диапазон номер: " + (i + 1) + " ещё раз");
                }
            } while (start > end);
            Range range = new Range(start, end);
            array[i] = range;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i].getLength());
        }


    }
}