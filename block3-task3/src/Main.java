
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, List<User>> userHashMap = new HashMap<Integer, List<User>>();
        for (int i = 0; i < 5; i++){
            System.out.printf("Введите имя пользователя %d\n", i + 1);
            String name = in.nextLine();
            System.out.printf("Введите возраст пользователя %d\n", i + 1);
            int age = in.nextInt();
            in.nextLine();
            User a = new User(name, age);
            if (!userHashMap.containsKey(age)){
                List<User> tmp = new ArrayList<>();
                tmp.add(a);
                userHashMap.put(age, tmp);
            }
            else{
                List<User> tmp = userHashMap.get(age);
                tmp.add(a);
                userHashMap.put(age, tmp);
            }
        }
        System.out.println("Введите требуемый возраст");
        int age = in.nextInt();
        if (userHashMap.containsKey(age)){
            List<User> tmp = userHashMap.get(age);
            Collections.sort(tmp, new Comparator<User>(){
                public int compare(User a, User b){
                    return a.getName().compareTo(b.getName());
                }
            });
            for (int i = 0; i < tmp.size(); i++){
                System.out.println(tmp.get(i).toString());
            }
        }
        else{
            System.out.printf("Пользователь с возрастом %d не найден\n", age);
        }
    }


}