import java.util.*;

public class RemoveColoredPiecesifBothNeighborsAreTheSameColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colors = sc.nextLine();
        boolean ans = winnerOfGame(colors);
        System.out.println(ans);
    }    

    public static boolean winnerOfGame(String colors) {
        int countA = 0;    
        int countB = 0;    
        for(int i = 1; i < colors.length() - 1; i++) {
            char prevColor = colors.charAt(i - 1);
            char currColor = colors.charAt(i);
            char nextColor = colors.charAt(i + 1);
            if(prevColor == 'A' && currColor == 'A' && nextColor == 'A') {
                countA++;
            } else if(prevColor == 'B' && currColor == 'B' && nextColor == 'B') {
                countB++;
            }
        }
        return countA > countB;
    }

}
