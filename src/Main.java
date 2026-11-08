import java.util.Scanner;

public static void delivery(int deliveryDistance) {
    if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: 1");
    } else if (deliveryDistance <= 60) {
        System.out.println("Потребуется дней: 2");
    } else if (deliveryDistance <= 100) {
        System.out.println("Потребуется дней: 3");
    } else {
        System.out.println("Доставки нет");
    }

}

public static void clientDevice(byte clientOS) {

    int currentYear = LocalDate.now().getYear();
    if (clientOS == 0 && currentYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 1 && currentYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
}


public static void clientDevice(int year) {



   //
    if(year <=1584){
        System.out.println("Год должен быть больше 1584");
    }
    else if(year %400==0||(year %4==0&&year %100!=0)){
        System.out.println(year +" год является високосным");
    }
    else{
        System.out.println(year +" год не является високосным");
    }
}

void main() {

    Scanner scannerInput1 = new Scanner(System.in);

// 1 task
    System.out.print("Введите расстояние в км:");
    int deliveryDistance = scannerInput1.nextInt();
    delivery(deliveryDistance);
// 2 task
    System.out.println("Введите значение в зависимости от тип операционной системы (0 — iOS, 1 — Android ): ");
    byte clientOS = scannerInput1.nextByte();

    clientDevice(clientOS);
// 3 task
    System.out.print("Введите год:");
    int year = scannerInput1.nextInt();
    clientDevice(year);
}


