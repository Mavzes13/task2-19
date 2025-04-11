import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean flag = false;
        if (a % 5 == 0){
            System.out.printf("a=%d\n", a);
            flag = true;
        }
        if (b % 5 == 0){
            System.out.printf("b=%d\n", b);
            flag = true;
        }
        if (c % 5 == 0){
            System.out.printf("c=%d\n", c);
            flag = true;
        }
        if (!flag){
            System.out.println("нет значений, кратных 5");
        }
        System.out.printf("Результат целочисленного деления a на b: %d\n", a / b);
        System.out.printf("Результат деления a на b: %f\n", a * 1. / b);
        System.out.printf("Результат деления a на b с округлением в большую сторону: %d\n", (a + b - 1) / b);
        System.out.printf("Результат деления a на b с округлением в меньшую сторону: %d\n", a / b);
        System.out.printf("Результат деления a на b с математическим округлением: %d\n", ((2 * (a % b) >= b) ? ((a + b - 1) / b) : (a / b)));
        System.out.printf("Остаток от деления b на c: %d\n", b % c);
        System.out.printf("Наименьшее значение из a и b: %d\n", Math.min(a, b));
        System.out.printf("Наибольшее значение из b и c: %d\n", Math.max(a, b));
    }
}