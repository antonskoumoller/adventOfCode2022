import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class codeDec2 {

    public static Map<String, Integer> scoring = Map.of(
                                            "A X", 4,
                                            "A Y", 8,
                                            "A Z", 9,
                                            "B X", 1,
                                            "B Y", 5,
                                            "B Z", 9,
                                            "C X", 1,
                                            "C Y", 2,
                                            "C Z", 6
                                            );

    public static int score = 0;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String line = sc.nextLine();            
            score += scoring.get(line);
        }   
        System.out.println(score);

    }
}