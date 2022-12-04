import java.util.Scanner;
import java.util.Arrays;


public class dec3_2 {
    public static void main (String[] args) {
        final String items = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner sc = new Scanner(System.in);
        String commonItems = "";
        int sum = 0;

        while (sc.hasNext()) {
            String ruck1 = sc.nextLine();
            String ruck2 = sc.nextLine();
            String ruck3 = sc.nextLine();
            
            for (int i = 0; i < items.length(); i++) {
                if (ruck1.contains(Character.toString(items.charAt(i))) && ruck2.contains(Character.toString(items.charAt(i))) && ruck3.contains(Character.toString(items.charAt(i)))) {
                    commonItems += items.charAt(i);
                }
            }
        }

        for (int i = 0; i < commonItems.length(); i++) {
            sum = sum + items.indexOf(commonItems.charAt(i)); 
        }
        System.out.println(commonItems);
        System.out.println(sum);
    }
}

