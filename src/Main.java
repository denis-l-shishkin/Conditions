import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

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
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке ...");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ...");
            }
        } else {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке ...");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ...");
            }
        }
        System.out.println("--Enf of task 2-- \n");
        int year = 2021;
        if (year >= 1584 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year >= 1584 && year % 4 ==0 && year % 100 != 0) {
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
                System.out.println("1-й месяц Январь принадлежит к сезону зима.");
                break;
            case 2:
                System.out.println("2-й месяц Февраль принадлежит к сезону зима.");
                break;
            case 3:
                System.out.println("3-й месяц Март принадлежит к сезону весна.");
                break;
            case 4:
                System.out.println("4-й месяц Апрель принадлежит к сезону весна.");
                break;
            case 5:
                System.out.println("5-й месяц Май принадлежит к сезону весна.");
                break;
            case 6:
                System.out.println("6-й месяц Июнь принадлежит к сезону лето.");
                break;
            case 7:
                System.out.println("7-й месяц Июль принадлежит к сезону лето.");
                break;
            case 8:
                System.out.println("8-й месяц Август принадлежит к сезону лето.");
                break;
            case 9:
                System.out.println("9-й месяц Сентябрь принадлежит к сезону осень.");
                break;
            case 10:
                System.out.println("10-й месяц Октябрь принадлежит к сезону осень.");
                break;
            case 11:
                System.out.println("11-й месяц Ноябрь принадлежит к сезону осень.");
                break;
            case 12:
                System.out.println("12-й месяц Декабрь принадлежит к сезону зима.");
                break;
            default:
            System.out.println("Несуществующий месяц. В году только 12 месяцев.");
        }
        System.out.println("--Enf of task 5-- \n");

    }
}