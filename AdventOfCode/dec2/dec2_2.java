import java.util.Scanner;

public class dec2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int A = 1; int B = 2; int C = 3; int X = 1; int Y = 2; int Z = 3;
        int score = 0;
        int i = 0;
        while (sc.hasNext()) {
            String tools = "ZXYZX";
            String oppTools = "0ABC0";
            String opp = sc.next();
            String result = sc.next();
            int pos = oppTools.indexOf(opp);
            String me = "";

            System.out.println(opp + " vs " + result);

            if (result.equals("X")) {
                me = Character.toString(tools.charAt(pos-1));
            }
            if (result.equals("Y")) {
                me = Character.toString(tools.charAt(pos));
            }
            if (result.equals("Z")) {
                me = Character.toString(tools.charAt(pos+1));
            }
            System.out.println(me);
            System.out.println();

            if ( opp.equals("A") && me.equals("X")) {
                score = score + 4;
            }
            if ( opp.equals("A") && me.equals("Y")) {
                score = score + 8;
            }
            if ( opp.equals("A") && me.equals("Z")) {
                score = score + 3;
            }
            if ( opp.equals("B") && me.equals("X")) {
                score = score + 1;
            }
            if ( opp.equals("B") && me.equals("Y")) {
                score = score + 5;
            }
            if ( opp.equals("B") && me.equals("Z")) {
                score = score + 9;
            }
            if ( opp.equals("C") && me.equals("X")) {
                score = score + 7;
            }
            if ( opp.equals("C") && me.equals("Y")) {
                score = score + 2;
            }
            if ( opp.equals("C") && me.equals("Z")) {
                score = score + 6;
            }
            i++;
        }
        System.out.println(i);
        System.out.println(score);

        
    }
}
