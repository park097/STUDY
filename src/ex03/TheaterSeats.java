package ex03;

import java.util.Arrays;

public class TheaterSeats {

    public static void main(String[] args) {
        int[][] rarry = new int[3][];
        rarry[0] = new int[] { 1, 2, 3, 4 };
        rarry[1] = new int[] { 5, 6, 7 };
        rarry[2] = new int[] { 8, 9 };

        for (int[] row : rarry) {
            System.out.println(Arrays.toString(row));
        }
    }

}
