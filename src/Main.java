

void main() {


    // 1 task

    int [] weight = new int []{1, 2, 3};
    float [] umber = {1.57f, 7.654f, 9.986f};
    byte[] bit = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    // 2 task


    for (int oneNumber = 0; oneNumber < weight.length; oneNumber++) {
        System.out.print(weight[oneNumber]);
        if (weight.length > (oneNumber +1) ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");

    for (int twoNumber = 0; twoNumber < umber.length; twoNumber++) {
        System.out.print(umber[twoNumber]);
        if (umber.length > (twoNumber +1) ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");

    for (int threeNumber = 0; threeNumber < bit.length; threeNumber++) {
        System.out.print(bit[threeNumber]);
        if (bit.length > (threeNumber +1) ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");

    // 3 task

    for (int oneNumber = weight.length - 1 ; oneNumber >= 0; oneNumber--) {
        System.out.print(weight[oneNumber]);
        if ( oneNumber > 0  ) {
            System.out.print(", ");
        }
    }

    System.out.println(" ");
    System.out.println(" ");

    for (int twoNumber =umber.length - 1 ; twoNumber >= 0; twoNumber--) {
        System.out.print(umber[twoNumber]);
        if ( twoNumber > 0  ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");


    for (int threeNumber =bit.length - 1 ; threeNumber >= 0  ; threeNumber--) {
        System.out.print(bit[threeNumber]);
        if ( threeNumber > 0  ) {
            System.out.print(", ");
        }
    }
    System.out.println(" ");
    System.out.println(" ");


    for (int oneNumber = 0; oneNumber < weight.length; oneNumber++) {

        if (weight[oneNumber]%2 != 0) {
            weight[oneNumber] = weight[oneNumber] + 1;
        }
    }
    System.out.println(Arrays.toString(weight));


    /*



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
*/
}