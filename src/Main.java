public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1001, "Ноутбук", 70000, "Электроника");
        Product p2 = new Product(1001, "Ноутбук Pro", 90000, "Электроника");
        Product p3 = new Product(1002, "Мышь", 1500, "Электроника");
        Product p4 = new Product(1001, "Ноутбук", 70000, "Техника");
        Product p5 = new Product(1003, null, 500, null);
        Product p6 = new Product(1003, "Кабель", 700, null);

        System.out.println("=== Товары ===");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);

        System.out.println("=== Сравнение товаров ===");
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false
        System.out.println("p1.equals(p4): " + p1.equals(p4)); // false
        System.out.println("p5.equals(p6): " + p5.equals(p6)); // true (category оба null)
        System.out.println("p1.equals(null): " + p1.equals(null)); // false

        // ---------- Тест заказов ----------
        Order o1 = new Order("Иванов", new Product[]{p1, p3});
        Order o2 = new Order("Иванов", new Product[]{p2, p3});
        Order o3 = new Order("Иванов", new Product[]{p3, p1});
        Order o4 = new Order("Петров", new Product[]{p1, p3});
        Order o5 = new Order("Иванов", new Product[]{p1});
        Order o6 = new Order("Сидоров", new Product[]{p1, null});
        Order o7 = new Order("Сидоров", new Product[]{p1, null});
        Order o8 = new Order("Сидоров", new Product[]{null, p1});

        System.out.println("=== Заказы ===");
        System.out.println("o1: " + o1);
        System.out.println("o2: " + o2);
        System.out.println("o3: " + o3);
        System.out.println("o4: " + o4);
        System.out.println("o5: " + o5);
        System.out.println("o6: " + o6);
        System.out.println("o7: " + o7);
        System.out.println("o8: " + o8);

        System.out.println("=== Сравнение заказов ===");
        System.out.println("o1.equals(o2): " + o1.equals(o2)); // true
        System.out.println("o1.equals(o3): " + o1.equals(o3)); // false
        System.out.println("o1.equals(o4): " + o1.equals(o4)); // false
        System.out.println("o1.equals(o5): " + o1.equals(o5)); // false
        System.out.println("o6.equals(o7): " + o6.equals(o7)); // true
        System.out.println("o6.equals(o8): " + o6.equals(o8)); // false
    }
}