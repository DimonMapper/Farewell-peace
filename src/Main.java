import java.util.Scanner;

void main() {
    Scanner scannerInput1 = new Scanner(System.in);
    Scanner scannerInput2 = new Scanner(System.in);
    Scanner scannerInput3 = new Scanner(System.in);

    // 1 task
    System.out.println("Введите значение в зависимости от ОС вашего устройства: ");
    byte clientOS = scannerInput1.nextByte();

    switch (clientOS) {
        case 0:
            System.out.println("Установите версию приложения для iOS по ссылке");
            break;
        case 1:
            System.out.println("Установите версию приложения для Android по ссылке");
            break;
    }




//task 2
    System.out.println("Введите значение в зависимости от ОС вашего устройства: ");
    byte clientOS1 = scannerInput1.nextByte();
    System.out.println("Введите год устройства: ");
    int clientDeviceYear = scannerInput2.nextInt();

    if (clientOS1 == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOS1 == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (clientOS1 == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }


//task 3
    System.out.print("Введите год:");
    int year = scannerInput1.nextInt();
    if (year <= 1584) {
        System.out.println("Год должен быть больше 1584");
    } else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
        System.out.println(year + " год является високосным");
    } else {
        System.out.println(year + " год не является високосным");
    }




//task 4
    System.out.print("Введите расстояние в км:");
    int deliveryDistance = scannerInput1.nextInt();

    if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: 1");
    } else if (deliveryDistance <= 60) {
        System.out.println("Потребуется дней: 2");
    } else if (deliveryDistance <= 100) {
        System.out.println("Потребуется дней: 3");
    } else {
        System.out.println("Доставки нет");
    }


//task 5
    System.out.print("Введите цифру месяца:");
    byte monthNumber = scannerInput1.nextByte();

    if (monthNumber < 1 || monthNumber > 12) {
        System.out.println("Некорректный номер месяца");
        return;
    }

    switch (monthNumber) {
        case 1:
        case 2:
        case 12:
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
    }

    scannerInput1.close();
    scannerInput2.close();
    scannerInput3.close();

}