import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws ParseException {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        s = in.nextLine();
        Date baseDate = new SimpleDateFormat("dd.MM.yyyy").parse(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(baseDate);
        calendar.add(Calendar.DATE, 45);
        SimpleDateFormat ans = new SimpleDateFormat("dd.MM.yyyy");
        System.out.print("Дата после увеличения на 45 дней: ");
        System.out.println(ans.format(calendar.getTime()));

        calendar.setTime(baseDate);
        calendar.set(calendar.get(Calendar.YEAR),Calendar.JANUARY,1);
        System.out.print("Дата после сдвига на начало года: ");
        System.out.println(ans.format(calendar.getTime()));

        calendar.setTime(baseDate);
        calendar.add(Calendar.DATE, 14);
        System.out.print("Дата после увеличения на 10 рабочих дней: ");
        System.out.println(ans.format(calendar.getTime()));

        calendar.setTime(baseDate);
        System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
        s = in.nextLine();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new SimpleDateFormat("dd.MM.yyyy").parse(s));

        Calendar c = Calendar.getInstance();
        c.setTime(new SimpleDateFormat("dd.MM.yyyy").parse("07.01.2024"));
        int days = 0;
        if (calendar2.before(calendar)){
            Calendar tmp = calendar;
            calendar = calendar2;
            calendar2 = tmp;
        }
        int cur_d;
        while (calendar.before(calendar2)){
            cur_d = calendar.get(Calendar.DAY_OF_WEEK);
            if (cur_d >= 2 && cur_d <= 6) days += 1;
            calendar.add(Calendar.DATE, 1);
        }
        cur_d = calendar.get(Calendar.DAY_OF_WEEK);
        if (cur_d >= 2 && cur_d <= 6) days += 1;
        System.out.printf("Количество рабочих дней между введенными датами: %d\n", days);
    }
}