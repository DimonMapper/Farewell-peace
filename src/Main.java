void main() {
// 1 task
    int p = 47000;
    byte u = 27;
    short k = 27012;
    long j = 2732122485L;
    float n = 27.12f;
    double h = 27.12052634;
    System.out.println("task 1");
    System.out.println("Значение переменной p с типом int равно " + p);
    System.out.println("Значение переменной u с типом byte равно " + u);
    System.out.println("Значение переменной k с типом short равно " + k);
    System.out.println("Значение переменной j с типом long равно " + j);
    System.out.println("Значение переменной n с типом float равно " + n);
    System.out.println("Значение переменной h с типом double равно " + h);

//task 2
    float a = 27.12f;
    long b = 987678965549L;
    float c = 2.786f;
    short d = 569;
    short e = -159;
    short f = 27897;
    byte g = 67;
    System.out.println("task 2");
    System.out.println("Значение переменной a с типом float равно " + a);
    System.out.println("Значение переменной b с типом long равно " + b);
    System.out.println("Значение переменной c с типом float равно " + c);
    System.out.println("Значение переменной d с типом short равно " + d);
    System.out.println("Значение переменной e с типом short равно " + e);
    System.out.println("Значение переменной f с типом short равно " + f);
    System.out.println("Значение переменной g с типом byte равно " + g);

//task 3
    byte ludmila = 23;
    byte anna = 27;
    byte ekaterina = 30;
    short papers = 480;
    short paper = (short) (papers / (ludmila + anna + ekaterina));
    System.out.println("task 3");
    System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги ");

//task 4
    System.out.println("task 4");
    byte t1 = 20;
    short t2 = 3 * 60 * 24;
    int t3 = 30 * 60 * 24;
    byte time = 2;
    byte bottle = 16;
    byte result = (byte) (bottle / time);
    short result1 = (short) (t1 * result);
    System.out.println("За 20 минут машина произвела " + result1 + " штук бутылок");
    int result2 = t2 * result;
    System.out.println("За 3 дня машина произвела " + result2 + " штук бутылок");
    int result3 = t3 * result;
    System.out.println("За 1 месяц машина произвела " + result3 + " штук бутылок");

//task 5
    System.out.println("task 5");
    byte allPaint = 120;
    byte brownPaint = 2;
    byte whitePaint = 4;
    short klass = (short) (allPaint / (brownPaint + whitePaint));
    short allBp = (short) (klass * brownPaint);
    short allWp = (short) (klass * whitePaint);
    System.out.println("В школе, где " + klass + " классов, нужно " + allWp + " банок белой краски и " + allBp + " банок коричневой краски ");

//task 6
    float gramToKgs = 1000;
    byte banan = 80;
    byte milk = 105;
    byte icecream = 100;
    byte egg = 70;
    short blender = (short) (5 * banan + 2 * milk + 2 * icecream + 4 * egg);
    float weight = blender / gramToKgs;
    System.out.println("task 6");
    System.out.println("Вес завтрака = " + blender + " грамм");
    System.out.println("Вес завтрака = " + weight + " кг");

//task 7
    byte allWeight = 7;
    short weight1 = 250;
    short weight2 = 500;
    short gramToKg = 1000;
    short daysWeight1 = ((short) (allWeight * gramToKg / (weight1)));
    short daysWeight2 = ((short) (allWeight * gramToKg / (weight2)));
    System.out.println("task 7");
    System.out.println(daysWeight1 + " дней в среднем может потребоваться, чтобы добиться результата похудения при первом способе");
    System.out.println(daysWeight2 + " дней в среднем может потребоваться, чтобы добиться результата похудения при втором способе");
//task 8

    int curSalMasha = 67760;
    int curSalDenis = 83690;
    int curSalKris = 76230;
    byte promotion = 10;
    int newSalMasha = curSalMasha + ((curSalMasha * promotion) / 100);
    int newSalDenis = curSalDenis + ((curSalDenis * promotion) / 100);
    int newSalKris = curSalKris + ((curSalKris * promotion) / 100);
    byte year = 12;
    int annualIncomeMasha = newSalMasha * year;
    int annualIncomeDenis = newSalDenis * year;
    int annualIncomeKris = newSalKris * year;
    int prevYearsIncomeMasha = curSalMasha * year;
    int prevYearsIncomeDenis = curSalDenis * year;
    int prevYearsIncomeKris = curSalKris * year;
    int diffMasha = annualIncomeMasha - prevYearsIncomeMasha;
    int diffDenis = annualIncomeDenis - prevYearsIncomeDenis;
    int diffKris = annualIncomeKris - prevYearsIncomeKris;

    System.out.println("task 8");
    System.out.println("Маша теперь получает " + newSalMasha + " рублей. Годовой доход вырос на " + diffMasha + " рублей");
    System.out.println("Кристина теперь получает " + newSalKris + " рублей. Годовой доход вырос на " + diffKris + " рублей");
    System.out.println("Денис теперь получает " + newSalDenis + " рублей. Годовой доход вырос на " + diffDenis + " рублей");

}