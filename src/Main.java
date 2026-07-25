public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2021;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " является високосным годом");
            } else {
                System.out.println(year + " не является високосным");
            }
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println(monthNumber + " - месяц зимнего сезона");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + " - месяц весеннего сезона");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + " - месяц летнего сезона");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + "  - месяц осеннего сезона");
                break;
            default:
                System.out.println("Номер месяца не может быть больше 12");
        }
    }
}