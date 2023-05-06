import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Product {
   private String name;
   private int price;
   private String category;
   private double rating;


   public Product(String name, int price, String category, double rating) {
       this.name = name;
       this.price = price;
       this.category = category;
       this.rating = rating;
   }


   public String getName() {
       return name;
   }


   public void setName(String name) {
       this.name = name;
   }


   public int getPrice() {
       return price;
   }
   public String getCategory() {
       return category;
   }
   public double getRating() {
       return rating;
   }
   public String getData(){
       return "Product --> Name: "+this.name+" price: "+this.price+" category: "+this.category+" rating: "+this.rating;
   }


   public static void main(String[] args) throws FileNotFoundException {
       BufferedReader br;


       List<Product> productList = new ArrayList<>();


       try{
           FileReader fr  =new FileReader("C:\\Users\\Faizan\\Downloads\\Assigment2\\src\\products.csv");//yaha tumhre products.csv ka location
           br  = new BufferedReader(fr);


           String i;
           while((i= br.readLine())!=null){
               String[] productInfo = i.split(",");


               //split krne pe array ke index p accordingly elements honge like
//                splitting Watch,4000,wearables,4.5 will result into an array as
//                        ["Watch","4000","warbles","4.5"]
//                System.out.println(productInfo.length);
               String name  = productInfo[0];
               int price = Integer.parseInt(productInfo[1]);
               String category  = productInfo[2];
               double rating  = Double.parseDouble(productInfo[3]);//string to double krega
//                private String name;
//                private int price;
//                private String category;
//                private double rating;
               Product product = new Product(name,price,category,rating);
               productList.add(product);
       }}
       catch(Exception e){
           e.printStackTrace();
       }
       for (Product product: productList) {
           System.out.println(product.getData());
       }
   }
}
