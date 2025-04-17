import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String name;
        name = in.nextLine();
        System.out.println("Введите возраст первого пользователя");
        int age = in.nextInt();
        in.nextLine();
        User a = new User(name, age);

        System.out.println("Введите имя второго пользователя");
        String name2 = in.nextLine();
        System.out.println("Введите возраст второго пользователя");
        int age2 = in.nextInt();

        User b = new User(name2, age2);
        if (a.getAge() < b.getAge()){
            System.out.println(a.toString());
        }
        else{
            System.out.println(b.toString());
        }
    }
}

