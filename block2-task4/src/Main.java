import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //4.1
        String s, t;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        s = in.nextLine();
        System.out.println("Введите подстроку");
        t = in.nextLine();
        int k = 0;
        for (int i = 0; i + t.length() < s.length(); i++){
            if (s.startsWith(t, i)) k++;
        }
        System.out.printf("Подстрока '%s' встречается %d раза\n", t, k);

        //4.2
        System.out.println("Введите строку");
        s = in.nextLine();
        System.out.println( s.replace("кака", "вырезано цензурой").replace("бяка", "вырезано цензурой"));


        //4.3
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        s = in.nextLine();
        System.out.printf("%s-%s-%s\n", s.substring(6), s.substring(3,5), s.substring(0,2));

        //4.4
        Date date = new SimpleDateFormat("dd.MM.yyyy").parse(s);
        String ans = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(ans);


    }
}