public class Main {
    public static void main(String[] args) {
        // Техническое задание
        int clientOS = 1; // 0-iOS, 1-Android
        int yearOfIssue = 0; // 0 - c 2015г и по настоящее время, 1 - произведен ранее 2015 года
        int year = 2004;
        int deliveryDistance = 95;
        int dayDelivery = 1;
        int monthNumber = 5;






        // Задание 1.
        System.out.println("Задание 1.");
        System.out.println();

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        // Задание 2.
        System.out.println("Задание 2.");
        if (clientOS == 0 && yearOfIssue == 1){
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearOfIssue == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && yearOfIssue == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите приложения для Android по ссылке");
        }
        System.out.println();

        // Задание 3.
        System.out.println("Задание 3");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println(year+ " Является високосным");
        }else{
            System.out.println(year+ " Не является високосным");
        }
        System.out.println();

        // Задание 4.
        System.out.println("Задание 4");

        if (deliveryDistance <= 20){
            System.out.println("1 день срок доставки");
        }
        if (deliveryDistance >= 40 && deliveryDistance <=60){
            System.out.println(dayDelivery*2+ "" +
                    "дня срок доставки");
        }
        if (deliveryDistance >= 60 && deliveryDistance <=100){
            System.out.println(dayDelivery*3+ " дня срок доставки");
        }
        System.out.println();

        // Задание 5.
        System.out.println("Задание 5");

        switch (monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case  9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
        }
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");



        }












    }

}