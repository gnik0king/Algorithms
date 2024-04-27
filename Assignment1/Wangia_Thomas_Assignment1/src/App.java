import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Users\\tuwan\\OneDrive\\Desktop\\CS401_Spring24\\Algorithms\\Assignment1\\Wangia_Thomas_Assignment1\\src\\sample1.txt"));
            int n = reader.readLine().length(); // Checking size of array to be created
            reader.close(); // Closing reader to reread the first line as a string
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\tuwan\\OneDrive\\Desktop\\CS401_Spring24\\Algorithms\\Assignment1\\Wangia_Thomas_Assignment1\\src\\sample1.txt"));

            int[][] soil = new int[n][n];

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                for (int j = 0; j < n; j++) {
                    soil[i][j] = Character.getNumericValue(line.charAt(j));
                }
            }
            reader.close();

            SoilWaterDrainage soilWaterDrainage = new SoilWaterDrainage(n);
            boolean allowsWaterToDrain = soilWaterDrainage.allowsWaterToDrain(soil);

            if (allowsWaterToDrain) {
                System.out.println("Allows water to drain");
            } else {
                System.out.println("Doesn't allow water to drain");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
