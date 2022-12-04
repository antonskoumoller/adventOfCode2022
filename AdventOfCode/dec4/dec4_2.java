import java.util.Scanner;
import java.util.Arrays;


public class dec4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
        while (sc.hasNext()){
            String line = sc.next();
            line = line.substring(1,line.length()-1);            
            String[] arr = line.split(",|-");

            int from1 = Integer.parseInt(arr[0]);
            int to1 = Integer.parseInt(arr[1]);
            int from2 = Integer.parseInt(arr[2]);
            int to2 = Integer.parseInt(arr[3]);
            
            
            if (from1 <= from2 && from2 <= to1 || from1 <= to2 && to2 <= to1 || from2 <= from1 && from1 <= to2 || from2 <= to1 && to1 <= to2) {
                i++;

            }
            System.out.println(from1 + "-" + to1);
            System.out.println(from2 + "-" + to2);
            System.out.println();
            

        }
        System.out.println(i);
        sc.close();
    }   

}