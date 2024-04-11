import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import java.lang.Math;

public class App {
    // function from page 181 of textbook
    private static int count(int[] a) {
        // Count tripletes that sum to 0
        int N = a .length;
        int cnt = 0;

        for(int i = 0; i< N; i++) {
            for(int j = i + 1;j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    if(a[i] + a[j] + a[k] == 0)
                        cnt++;
                }
            }
        }

        return cnt;
    }

    private static double timeTrial(int N) {
        int MAX = 1000000;
        int[] a = new int[N];
        
        // Generate N random integers and put them in array a
        for(int i = 0;i < N;i++) {
            a[i] = StdRandom.uniformInt(-MAX, MAX);
        }

        Stopwatch timer = new Stopwatch();
        // Count how many triplets add up to 0
        count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        StdOut.println("N\t\tTime (sec)\t\tLog(N)\t\tLog(Time)");
        StdOut.println("-\t\t----------\t\t------\t\t---------\n");

        // These 2 variables determine the size N we pass to function timeTrial and the size of array a the function creates
        int minN = 1000;
        int maxN = 16000;

        // N += N (in the for loop) has the effect of doubling N in every iteration of the loop
        // So if N starts at 1000, the next iterantion N will be 2000, then 4000, etc.
        for(int N = minN; N <= maxN; N += N) {
            double time = timeTrial(N);
            // Print N, time, log_10(N), and log_10(time)
            StdOut.printf("%5d\t\t%5.1f\t\t\t%f\t%f\n", N, time, Math.log10(N), Math.log10(time));
        }
    }
}

