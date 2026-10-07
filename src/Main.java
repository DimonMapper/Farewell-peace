void main() {
// 1 task
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println("task 1");
    System.out.print("dog = " + dog + ", ");
    System.out.print("cat = " + cat + ", ");
    System.out.println("paper = " + paper);
//task 2
    var a = 4;
    dog = dog + a;
    cat = cat + a;
    paper = paper + a;
    System.out.println("task 2");
    System.out.print("dog1 = " + dog + ", ");
    System.out.print("cat1 = " + cat + ", ");
    System.out.println("paper1 = " + paper);

//task 3
    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;
    System.out.println("task 3");
    System.out.print("dog2 = " + dog + ", ");
    System.out.print("cat2 = " + cat + ", ");
    System.out.println("paper2 = " + paper);

//task 4
    System.out.println("task 4");
    var friend = 19;
    System.out.print("friend1 = " + friend + ", ");
    friend += 2;
    System.out.print("friend2 = " + friend + ", ");
    friend /= 3;
    System.out.println("friend3 = " + friend);

//task 5
    System.out.println("task 5");
    var frog = 3.5;
    System.out.print("frog1 = " + frog + ", ");
    frog *= 10;
    System.out.print("frog2 = " + frog + ", ");
    frog /= 3.5;
    System.out.print("frog3 = " + frog + ", ");
    frog += 4;
    System.out.println("frog4 = " + frog);

//task 6
    var weightboxer1 = 78.2;
    var weightboxer2 = 82.7;
    double totalmas = weightboxer1 + weightboxer2;
    double diffmas = weightboxer2 - weightboxer1;
    System.out.println("task 6");
    System.out.print("Общий вес = " + totalmas + ", ");
    System.out.println("Разница между ними = " + diffmas);

//task 7
    double division = weightboxer2 % weightboxer1;
    System.out.println("task 7");
    System.out.println("Остаток от деления между двумя весами = " + division);
/*
    640 часов работы поделено между сотрудниками.\
    Если каждый сотрудник посвящает работе 8 часов,
     то сколько всего работников в компании?
     Выведите результат задачи в консоль в формате:
     «Всего работников в компании — … человек».
    Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
    если в компании работает на 94 человека больше.
    Выведите результат задачи в консоль в формате: «Если в компании работает … человек,
    то всего … часов работы может быть поделено между сотрудниками».
*/

//task 8
    var allhour = 640;
    var honp = 8;
    int p = allhour/honp;
    int pep = p + 94;
    int allhour1 = pep*honp;
    System.out.println("task 8");
    System.out.println("Всего работников в компании — " +p+ " человек");
    System.out.println("Если в компании работает " +pep+ " человеква, то всего " +allhour1+ " часа работы может быть поделено между сотрудниками");




}