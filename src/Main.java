

void main() {


    // 1 task
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;

    System.out.println("Ф. И. О. сотрудника — " + fullName);
    System.out.println("  ");

// 2 task

    String fullNameUpperCase = fullName.toUpperCase();

    System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);
    System.out.println("  ");

    // 3 task

    String fullName1 = "Иванов Семён Семёнович";
    String fixedFullName = fullName1.replace('ё', 'е');

    System.out.println("Данные Ф. И. О. сотрудника — " + fixedFullName);

}