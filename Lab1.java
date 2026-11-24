import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Інформація про примітивні типи даних");

        System.out.println("byte");//для чисел що займають мінімальний обʼєм памʼяті
        System.out.println("Розмір: " + Byte.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println();

        System.out.println("short");//цей тип даних використовується для показу цілих чисе, які потребують меньшого діапазону значень ніж int
        System.out.println("Розмір: " + Short.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println();

        System.out.println("int");//цілі значення, більше значень ніж у short
        System.out.println("Розмір: " + Integer.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println();

        System.out.println("long");//цей тип даних використовується для показу цілих чисе, які потребують більшого  діапазону значень ніж int
        System.out.println("Розмір: " + Long.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("float");//для чисел з плаваючою комою
        System.out.println("Розмір: " + Float.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println();

        System.out.println("double");//для чисел з плаваючою крапкою
        System.out.println("Розмір: " + Double.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("char");//для зберігання символів
        System.out.println("Розмір: " + Character.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);
        System.out.println();

        Scanner scanner = new Scanner(System.in);//для введення користувачу

        System.out.println("Введіть конкретний тип даних:");

        System.out.print("bite: ");
        byte byteValue = Byte.parseByte(scanner.nextLine());

        System.out.print("short: ");
        short shortValue = Short.parseShort(scanner.nextLine());

        System.out.print("int: ");
        int intValue = Integer.parseInt(scanner.nextLine());

        System.out.print("long: ");
        long longValue = Long.parseLong(scanner.nextLine());

        System.out.print("float: ");
        float floatValue = Float.parseFloat(scanner.nextLine());

        System.out.print("double: ");
        double doubleValue = Double.parseDouble(scanner.nextLine());

        System.out.print("char: ");
        char charValue = scanner.nextLine().charAt(0);

        System.out.println();
        System.out.println("Введені значення:");
        System.out.println("byte = " + byteValue);
        System.out.println("short = " + shortValue);
        System.out.println("int = " + intValue);
        System.out.println("long = " + longValue);
        System.out.println("float = " + floatValue);
        System.out.println("double = " + doubleValue);
        System.out.println("char = " + charValue);;
        System.out.println();

        scanner.close();//введення закрито
    }
}