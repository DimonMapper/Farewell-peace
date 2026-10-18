void main() {
    // 1 task
    System.out.println(" ");
    System.out.println("1 task");
    System.out.println(" ");
    for (int i = 1; i <= 10; i = i + 1) {
        System.out.print(i + " ");
    }
    System.out.println(" ");

//task 2
    System.out.println(" ");
    System.out.println("2 task");
    System.out.println(" ");
    for (int i = 10; i > 0; i = i - 1) {
        System.out.print(i + " ");
    }
    System.out.println(" ");


//task 3
    System.out.println(" ");
    System.out.println("3 task");
    System.out.println(" ");
    for (int i = 0; i < 17; i = i + 2) {
        System.out.print(i + " ");
    }
    System.out.println(" ");

//task 4
    System.out.println(" ");
    System.out.println("4 task");
    System.out.println(" ");
    for (int i = 10; i > -11; i = i - 1) {
        System.out.print(i + " ");
    }
    System.out.println(" ");

//task 5
    System.out.println(" ");
    System.out.println("5 task");
    System.out.println(" ");
    for (int year = 1904; year < 2100; year = year + 1) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        }
    }

//task 6
    System.out.println(" ");
    System.out.println("6 task");
    System.out.println(" ");
    for (int i = 7; i < 100; i = i + 7) {
        System.out.print(i+" ");
    }
    System.out.println(" ");

//task 7
    System.out.println(" ");
    System.out.println("7 task");
    System.out.println(" ");
    for (int i = 1; i < 600; i = i * 2) {
        System.out.print(i+" ");
    }
    System.out.println(" ");
//task 8
    System.out.println(" ");
    System.out.println("8 task");
    System.out.println(" ");
    int salary = 29000;
    int capital = 0;
    for (int i = 0; i < 12; i = i + 1) {
        capital=capital + salary;
        System.out.println("Месяц "+i+", сумма накоплений равна "+capital+" рублей");
    }

//task 9
    System.out.println(" ");
    System.out.println("9 task");
    System.out.println(" ");
    int salary1 = 29000;
    int total = 0;
    for (int i = 0; i < 12; i++) {
        total=total + (total/100);
        total=total + salary1;
        System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
    }
//task 10
    System.out.println(" ");
    System.out.println("10 task");
    System.out.println(" ");
    int result ;
    for (int i = 1; i < 11; i++) {
        result = 2*i;
        System.out.println("2*"+i+"="+result);
    }

//task 5
//task 5
}