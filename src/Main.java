import java.util.Scanner;

void main() {

    Scanner scannerInput1 = new Scanner(System.in);
/*
    // 1 task
    System.out.println("Введите, когда пятница в начале месяца (от 1 до 7) ");
    int firstFriday = scannerInput1.nextInt();

    byte count = 0;
    byte day;
    if (firstFriday >= 1 && firstFriday <= 7) {
        for (day = 1; day <= 31; day++) {

            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
                count++;
            }
        }
        if (count >= 4 && count <= 5) {
            System.out.println("Проверка пройдена: найдено пятниц — " + count);
        } else {
            System.out.println("Ошибка: неожиданное количество пятниц — " + count);
        }
    } else {
        System.out.println("Выбрано неверное значение");
    }

    // 2 task


    int marathonDistance = 42195; // метры
    int step = 500;
    int distance = 0; // пройденная дистанция

    do {
        int remaining = marathonDistance - distance;
        System.out.println("Держитесь! Осталось " + remaining + " метров");
        distance += step;
    } while (distance < marathonDistance);
    System.out.println(" ");

    int marathonDistance1 = 42195;
    int step1 = 500;
    int distance1;

    for (distance1 = 0; distance1 < marathonDistance1; distance1 += step1) {
        int remaining = marathonDistance1 - distance1;
        System.out.println("Держитесь! Осталось " + remaining + " метров");
    }
    // 3 task
    System.out.println("Введите ваш бюджет и мы расчитаем на сколько дней вы сможете оставить мимашину на стоянке:");
    int moneyInDay = 100;
    int budget = scannerInput1.nextInt();
    int days = 0;

    while (budget > 0) {
        days++;
        if (days % 5 == 0) {
            continue;
        }
        budget -= moneyInDay;
    }

    System.out.println("Бюджета хватит на " + days + " дней");
    System.out.println("Введите ваш бюджет и мы расчитаем на сколько дней вы сможете оставить мимашину на стоянке:");
    int budget1 = scannerInput1.nextInt();
    int moneyInDay1 = 100;
    int totDay = 0;
    for (int totay = 1; budget1 > 0; totay++) {
        totDay = totay;
        if (totay % 5 == 0) {
            continue;

        }
        budget1 -= moneyInDay1;
    }
    System.out.println("Бюджета хватит на " + totDay + " дней");
    System.out.println(" ");

    //4 task

    long target = 12000000;
    int monthlyDeposit = 15000;
    float rate = 0.07f;
    int period = 6;
    int month = 0;
    float total = 0;

    while (true) {
        month++;
        total += monthlyDeposit;
        if (month % period == 0) {
            total += total * rate;
        }
        System.out.printf("Месяц %d: накоплено %.2f ₽%n", month, total);
        if (total >= target) {
            break;
        }
    }
    System.out.println("Цель достигнута за " + month + " мес.");

*/
// 5 task

    System.out.println("Введите сколько заряда на телефоне сейчас:");
    int chargePerMinute = 2;
    int overheat = 10;
    int pause = 2;
    int maxOverheats = 3;

    int charge = scannerInput1.nextInt();
    int minute = 0;
    int overheats = 0;

    while (charge < 100) {
        minute++;
        if (minute % overheat == 0) {
            overheats++;
            System.out.println("Минута " + minute + ": перегрев №" + overheats
                    + ", заряд " + charge + "%");

            if (overheats >= maxOverheats) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                break;
            }

            minute += pause;
            continue;
        }

        charge = Math.min(charge + chargePerMinute, 100);
    }

    System.out.println("Время зарядки составило " + minute + " минут. Текущий заряд: " + charge + "%");

}