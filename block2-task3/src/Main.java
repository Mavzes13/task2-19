
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] arr = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < 20; i++){
            arr[i] = rnd.nextInt(15) + 1;
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 1; i <= 15; i++){
            int k = 0;
            for (int j = 0; j < 20; j++){
                if (arr[j] == i) k++;
            }
            if (k <= 1) continue;
            if (k <= 4){
                System.out.printf("Число '%d' встречается %d раза\n", i, k);
            }
            else{
                System.out.printf("Число '%d' встречается %d раз\n", i, k);
            }
        }
    }
}