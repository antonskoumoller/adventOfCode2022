import java.util.Arrays;
import java.util.Scanner;

public class rockPaperScissors {
	
	final static int INITIAL_CAPACITY = 1;
    final String SENTINEL = "";
    static int Size = 0;
    static char[] opp = new char[INITIAL_CAPACITY];
    static char[] me = new char[INITIAL_CAPACITY];
    static int points = 0;
   
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = "";
		
		while (sc.hasNext()) {
			s = sc.nextLine();
			if (s.equals("Q")) 
				break; 
			newBattle(s);
		}

		System.out.println(Arrays.toString(opp));
		System.out.println(Arrays.toString(me));	
		
		System.out.println(ToolPoints(me));
		System.out.println(BattlePoints(opp,me));
	}
	
    public static void newBattle(String s) {
    	
    	if (Size >= opp.length) {
    		char[] newOpp = new char[opp.length*2];
    		char[] newMe = new char[me.length*2];
    		System.arraycopy(opp, 0, newOpp, 0, Size);
    		System.arraycopy(me, 0, newMe, 0, Size);
    		opp = newOpp;
    		me = newMe;
    	}
    	opp[Size] = s.charAt(0);
    	me[Size] = s.charAt(2);
    	Size++;		
    }
	
    public static int ToolPoints(char[] me) {
    	
    	for (int i = 0; i < me.length; i++) {
    		if (me[i] == 'X')		    {points = points + 1;}
    		else if (me[i] == 'Y') 		{points = points + 2;}
    		else if (me[i] == 'Z') 		{points = points + 3;}
 
    	}
    	return points;
    }
    
    public static int BattlePoints(char[] opp, char[] me) {
    	
    	for (int i = 0; i < me.length; i++) {
    		if (opp[i] == 'A' && me[i] == 'X' || opp[i] == 'B' && me[i] == 'Y' || 
    		opp[i] == 'C' && me[i] == 'Z') {points = points +3;}
    		else if (me[i] == 'Z' && opp[i] == 'B') {points = points +6;}
    		else if (me[i] == 'Y' && opp[i] == 'A') {points = points +6;}
    		else if (me[i] == 'X' && opp[i] == 'C') {points = points +6;}
    	}
    	return points;
    }


}