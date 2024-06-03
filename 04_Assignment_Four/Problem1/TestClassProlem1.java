package lesson5.Problem1;

import com.sun.source.tree.EnhancedForLoopTree;

public class TestClassProlem1 {
    public static void main(String[] args) {
        //products[0] = new Clothing("Shirt", 29.99, "Nike", 10);
        Product[] products = new Product[5];
        products[0] = new Product("Shirt", 29.99);
        products[1] = new Electronics("Phone", 499.99, 12, 29.99);
        products[2] = new Furniture("Table", 149.99, "Wood", 19.99);
        products[3] = new Clothing("Jeans", 39.99, "Levi's", 15);
        products[4] = new Electronics("Laptop", 899.99, 24, 49.99);

        for(Product p : products) {

            if(p instanceof Clothing) {
                Clothing clothing = (Clothing) p;
                System.out.println("Product Name : " + clothing.getProductName());
                System.out.println("Price : " + clothing.getPrice());
                System.out.println("Brand : " + clothing.getBrand());
                System.out.println("Discount Brand : " + clothing.getDiscountPercentage());
            } else if (p instanceof Electronics) {
                Electronics electronics = (Electronics) p;
                System.out.println("Product Name : " + electronics.getProductName());
                System.out.println("Price : " + electronics.getPrice());
                System.out.println("Warranty : " + electronics.getWarranty());
                System.out.println("Warranty Cost : " + electronics.getWarrantyCost());
            } else  if (p instanceof Furniture) {
                Furniture furniture = (Furniture) p;
                System.out.println("Product Name : " + furniture.getProductName());
                System.out.println("Price : " + furniture.getPrice());
                System.out.println("Material : " + furniture.getMaterial());
                System.out.println("Shipping Cost : " + furniture.getShippingCost());
            } else if (p instanceof Product) {
                System.out.println("Product: " + p.getProductName());
                System.out.println("Price: $" + p.getPrice());
            }
        }

        System.out.println("Sum of Products : " + sumProducts(products));
    }

    public static double sumProducts(Product[] products) {
        double sum = 0.0;
        if(products != null) {
            for(Product product : products) {
                if(product !=null) {
                    sum += product.getPrice();
                }
            }
        }
        return sum;
    }


}
