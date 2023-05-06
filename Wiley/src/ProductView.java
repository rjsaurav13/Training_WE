
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductView {
    private static final String CSV_SPLIT_BY = ",";

    public static void main(String[] args) {
        String csvFile = "users.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(CSV_SPLIT_BY);
                // Process the data as needed
                for (String datum : data) {
                    System.out.print(datum + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean searchCSV(String csvFile, String keyword) {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            System.out.println("");
            while ((line = br.readLine()) != null) {
                String[] data = line.split(CSV_SPLIT_BY);
                for (String datum : data) {
                    if (datum.contains(keyword)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
