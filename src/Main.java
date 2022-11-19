import java.time.LocalDate;

public class Main {
    public static void leapYear(int year){
        if (isLeapYear(year))
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
    }
    private static boolean isLeapYear(int year){
        return ((year%4) == 0 && (year % 400 == 0 || year % 100 != 0));
    }

    private static void printMessageClient(int version, int clientDeviceYear) {
        int iOS = 0;
        int Android = 1;
        int currentYear = LocalDate.now().getYear();
        if (version == iOS && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (version == iOS && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        if (version == Android && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (version == Android && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int countDeliveryDays (int deliveryDistance) {
        int deliveryFirstDay = 20;
        int deliveryAfterTheFirstDay = 40;
        int ternDelivery = deliveryDistance - deliveryFirstDay - deliveryAfterTheFirstDay;
        if (deliveryFirstDay - deliveryDistance >= 0)
            return 1;
        else if (deliveryFirstDay + deliveryAfterTheFirstDay - deliveryDistance >= 0)
            return 2;
        else if (deliveryFirstDay + deliveryAfterTheFirstDay + deliveryAfterTheFirstDay - deliveryDistance >= 0)
           return 3;
        else
            return -1;
    }

    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int year = 2021;
        leapYear(year);


        //Задание 2
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2022;
        printMessageClient(clientOS, clientDeviceYear);


        //Задание 3
        System.out.println("Задание 3");
        int deliveryDistance  = 95;
        System.out.println("Дней потребуется " + countDeliveryDays(deliveryDistance));
    }

}