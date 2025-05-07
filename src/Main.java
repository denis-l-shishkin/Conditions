public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ...");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ...");
        }
        System.out.println("--Enf of task 1-- \n");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ...");
        } else if (clientOS == 0 && clientDeviceYear < 2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ...");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке ...");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ...");
        }
        System.out.println("--Enf of task 2-- \n");
        int year = 2021;
        if (year % 400 == 0 || year >= 1584 && year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println("--Enf of task 3-- \n");
        int deliveryDistance = 95;
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
        if (deliveryTime != 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        System.out.println("--Enf of task 4-- \n");
        int monthNumber = 16;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону осень.");
                break;
            default:
            System.out.println("Несуществующий месяц. В году только 12 месяцев.");
        }
        System.out.println("--Enf of task 5-- \n");

    }
}