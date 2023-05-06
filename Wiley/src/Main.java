import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Main(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        String csvFile = "product.csv";
        CSVReader reader = null;
        ArrayList<Main> products = new ArrayList<Main>();

        try {
            reader = new CSVReader(new FileReader(csvFile));
            String[] tokens;
            while ((tokens = reader.readNext()) != null) {
                Main product = new Main(tokens[0], tokens[1], Double.parseDouble(tokens[2]), Integer.parseInt(tokens[3]));
                products.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (Main product : products) {
            System.out.println(product);
        }
    }
}
