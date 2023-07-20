import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class HashProbing {

    public static void main(String[] args) {
        // random object to use later
        double misses;

        // define constant of proportionality
        double k = 1.25;

        for (int N = 1000; N <= 1000000; N *= 10) {
            int M = (int) Math.round(k * N);

            // create boolean array of size kN, initializes all as false
            boolean array[] = new boolean[M];

            // place N random elements
            for (int i = 0; i < N; i++) {
                Random ran = new Random();
                int index = ran.nextInt(M);

                while (array[index]) {
                    index = (index + 1) % (M);
                }

                array[index] = true;
            }

            // probe with 10,000 random numbers
            // reinitialize misses
            misses = 0;
            for (int j = 0; j < 10000; j++) {

                // get random probe index
                Random newRan = new Random();
                int probe = newRan.nextInt(M);

                // keep probing until finding empty cell
                while (array[probe]) {
                    misses++;
                    probe = (probe + 1) % (M);
                }

                // is the cell empty?
                misses++;
            }

            double mean = misses / 10000;

            // print mean
            StdOut.println("Average probes for a miss with N=" + N + " is: " + mean);
        }
    }
}
