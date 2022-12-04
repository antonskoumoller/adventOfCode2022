import java.util.Scanner;
import java.util.Arrays;


public class dec3_1 {
    public static void main (String[] args) {
        final String items = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        Scanner sc = new Scanner(System.in);
        String dupItems = "";
        int sum = 0;
        


        while (sc.hasNext()) {
            String ruck = sc.nextLine();
            int mid = ruck.length()/2;
            String ruck1 = ruck.substring(0, mid);
            String ruck2 = ruck.substring(mid, ruck.length());
            
            for (int i = 0; i < ruck1.length(); i++) {
                for (int j = 0; j < ruck2.length();j++) {
                    if (ruck1.charAt(i) == ruck2.charAt(j)){
                        dupItems += ruck1.charAt(i) + "";
                        j = ruck2.length();
                        i = ruck1.length();
                    }
                }      
            } 
            
        }

        for (int i = 0; i < dupItems.length(); i++) {
            sum = sum + items.indexOf(dupItems.charAt(i)); 
        }

        System.out.println(sum);


    }

}