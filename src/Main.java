public class Main {
    public static void main(String[] args) {
        // Техническое задание
        int clientOS = 0; // 0-iOS, 1-Android
        int yearOfIssue = 0; // 0 - c 2015г и по настоящее время, 1 - произведен ранее 2015 года

        // Задание 1.
        System.out.println("Задание 1.");
        System.out.println();

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0) {
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


    }

}