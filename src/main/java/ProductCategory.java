import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
  String productName;
  String category;
  int quantity;
  
  Product(String productName, String category, int quantity){
    this.productName = productName;
    this.category = category;
    this.quantity = quantity;
  }
  
  public String getProductName(){
    return productName;
  }
  public String getCategory(){
    return this.category;
  }
  public int getQuantity(){
    return this.quantity;
  }
}

public class ProductCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
	      products.add(new Product("Laptop", "Electronics", 50));
	      products.add(new Product("Headphones", "Electronics", 120));
	      products.add(new Product("Shirt", "Clothing", 200));
	      products.add(new Product("Pants", "Clothing", 150));
	      products.add(new Product("Smartphone", "Electronics", 80));
	      
	      
	      Map<String, Integer> productFilter=products.stream().collect(Collectors.groupingBy(Product :: getCategory, Collectors.summingInt(Product::getQuantity)));
	      
	      //products.stream().filter(p -> p.category).reduce(0,products.)
	      
	      
	      productFilter.entrySet().stream().forEach(m -> System.out.println(m));
	      
	      System.out.println(productFilter.entrySet().stream().min(Comparator.comparingInt(m -> m.getValue())));
	      System.out.println(productFilter.entrySet().stream().max(Comparator.comparingInt(m -> m.getValue())));
	      
	      
	      
	      int totalElectronicsSold = 0;
	      int totalClothingSold= 0;
	      for(Product p : products){
	        if(p.getCategory() == "Electronics"){
	          totalElectronicsSold++;
	        }else if(p.getCategory() == "Clothing"){
	          totalClothingSold++;
	        }
	      }
	      System.out.println(totalElectronicsSold);
	      System.out.println(totalClothingSold);
	      
	      System.out.println("Hello, World!");
	}

}
