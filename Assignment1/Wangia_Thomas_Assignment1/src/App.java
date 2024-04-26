import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Users\\tuwan\\OneDrive\\Desktop\\CS401_Spring24\\Algorithms\\Assignment1\\Wangia_Thomas_Assignment1\\src\\sample2.txt"));
            int n = reader.readLine().length();
            reader.close();
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\tuwan\\OneDrive\\Desktop\\CS401_Spring24\\Algorithms\\Assignment1\\Wangia_Thomas_Assignment1\\src\\sample2.txt"));

            //String lineLen = reader.readLine();
            //int lineLength = lineLen.length();
            System.out.println("N is :" + n);
            int[][] soil = new int[n][n];

            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                System.out.println("i: " + i);
                for (int j = 0; j < n; j++) {
                    soil[i][j] = Character.getNumericValue(line.charAt(j));
                }
            }
            reader.close();

            SoilWaterDrainage soilWaterDrainage = new SoilWaterDrainage(n);
            boolean allowsWaterToDrain = soilWaterDrainage.allowsWaterToDrain(soil);

            // Soil soil = new Soil("C:\\Users\\tuwan\\Downloads\\Assignment1
            // (1)\\Assignment1\\TestFiles\\sample1.txt");

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
