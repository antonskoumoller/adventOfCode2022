import java.util.Scanner;
import java.util.Arrays;

public class dec1_1 {
    public static int[] elfs = new int[1];
    public static int elfsSize = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cal = 0;

        while (sc.hasNextLine()) {
            String n = sc.nextLine();
            // System.out.println(n);

            if (n.equals("")) {
                add(cal);
                cal = 0;
                // System.out.println("add");
            } else {
                int x = Integer.parseInt(n);
                cal += x;
                // System.out.println(cal);
            }  
        }
        add(cal);

        int max = recursivelyFindMax(elfs,elfsSize);
        System.out.println(max);
        int i = 0;
        int sum = 0;
        for (int j = 0; j <= 2; j++) {
            while ( max != elfs[i] ) {
                i++;
            }
            sum += elfs[i];
            elfs[i] = 0;
            i = 0;
            max = recursivelyFindMax(elfs,elfsSize);
        }


        System.out.println(sum);

    }

    public static void add(int n) {
        
        
      // dynamically resize the array, if needed
      if (elfsSize >= elfs.length)
      {
        int[] newElfs = new int[elfs.length*2]; // new array with double size
        System.arraycopy(elfs, 0, newElfs, 0, elfs.length);// data copy
        elfs = newElfs;
      }        
           
      elfs[elfsSize] = n;      // Add Int to elfs
      elfsSize++;              // increment of element counter

    }

    public static int recursivelyFindMax(int a[], int aSize) {
        
        if (aSize == 1){
            return a[0];
        }
        return Math.max(a[aSize-1], recursivelyFindMax(a, aSize-1));
    } 


}