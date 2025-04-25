import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> userArrayList = new ArrayList<User>();
        for (int i = 0; i < 5; i++){
            System.out.printf("Введите имя пользователя %d\n", i + 1);
            String name = in.nextLine();
            System.out.printf("Введите возраст пользователя %d\n", i + 1);
            int age = in.nextInt();
            in.nextLine();
            User a = new User(name, age);
            userArrayList.add(a);
        }
        Collections.sort(userArrayList, new Comparator<User>(){
                    public int compare(User a, User b){
                        return a.getAge() - b.getAge();
                    }
                }
        );
        for (int i = 0; i < 5; i++){
            System.out.println(userArrayList.get(i).toString());
        }

    }
}
