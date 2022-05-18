public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {

        int clientDeviceYear = 2010;
        int clientOS = 0;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS ==0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 2800;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней на доставку: " + deliveryDay);

    }

    public static void task5() {
       int monthNumber = 15;
       switch (monthNumber) {
           case 12:
           case 1:
           case 2:
               System.out.println("Сезон - зима");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("Сезон - весна");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("Сезон - лето");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("Сезон - осень");
               break;
               default:
               System.out.println("Такого нет");
       }
    }

}