package Unit4.W4.Qustion4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ecommerce {
	
	List<Product> productList=new ArrayList<>();
	
	void addProductToList(Product product){
		HashSet<Product> hs = new HashSet<>(productList);
		
		if(hs.add(product)) {
			System.out.println("Product added successfully");
		}else {
			System.out.println("Count updated Product already exists");
			for(Product p : hs) {
				if(p == product) {
					p.count += product.count;
				}
			}
		}
		
		productList=new ArrayList<>(hs);
	}
	
	List<Product> showAllProduct(){
		
		return productList;
		
	}
	
}
