import java.util.Scanner;

void main() {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    Scanner c = new Scanner(System.in);

    // 1 task
    System.out.print("Введите возраст:");
    byte age = a.nextByte();
    if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
    } else {
        System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }


//task 2
    System.out.print("Введите температуру:");
    byte temp = a.nextByte();
    if (temp >= 5) {
        System.out.println("На улице " + temp + " градусов, можно идти без шапки");
    } else {
        System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
    }


//task 3
    System.out.print("Введите скорость:");
    short speed = a.nextShort();
    if (speed >= 60) {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
    } else {
        System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
    }

//task 4
    System.out.print("Введите возраст:");
    byte ages = a.nextByte();
    if (ages >= 2 && ages <= 6) {
        System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в детский сад");
    } else if (ages >= 7 && ages <= 17) {
        System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в школу");
    } else if (ages >= 18 && ages <= 24) {
        System.out.println("Если возраст человека равен " + ages + ", то то его место в университете или в армии");
    } else if (ages > 24) {
        System.out.println("Если возраст человека равен " + ages + ", то ему пора ходить на работу");
    } else {
        System.out.println("Если возраст человека равен " + ages + ", то ему нужно научиться ходить");
    }

//task 5
    System.out.print("Введите возраст ребенка:");
    byte ageChild = a.nextByte();
    if (ages > 5 && ages <= 14) {
        System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
    } else if (ages > 14) {
        System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого");
    } else {
        System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе");
    }


//task 6
    System.out.print("Введите количество людей в вагоне:");
    short countInVagon = a.nextShort();
    if (countInVagon >= 0 && countInVagon <= 59) {
        System.out.println("В вагоне есть сидячие места");
    } else if (countInVagon > 60 && countInVagon <= 101) {
        System.out.println("В вагоне есть стоячие места");
    } else {
        System.out.println("В вагоне нет мест");
    }

//task 7
    System.out.print("Введите значение one:");
    int one = a.nextInt();
    System.out.print("Введите значение two:");
    int two = b.nextInt();
    System.out.print("Введите значение three:");
    int three = c.nextInt();
if (one >= two && one >= three) {
    System.out.println("one самое большое число");
} else if (two >= one && two >= three) {
    System.out.println("two самое большое число");
} else {
    System.out.println("three самое большое число");
}

    a.close();
    b.close();
    c.close();
}