package session_10_OOP;

import java.util.ArrayList;

public class ShopingCart {
    private ArrayList<Product> products;
    private int id;

    private static int cartCounter = 0;

    public ShopingCart() {
        this.products = new ArrayList<>();
        cartCounter++;
        this.id = cartCounter;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void addDiscount(){
        for (Product p:products){
            p.setPrice(p.getPrice()*0.9);
        }
    }

    public void displayCart(){
        System.out.println("cart id: " + id);
        products.forEach(System.out::println);
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + ": " + name + " " + price + " $";
    }
}

class MainS{
    public static void main(String[] args) {
        Product product1 =new Product(1,"lenovo",1200);
        Product product2 =new Product(2,"mac",3200);
        Product product3 =new Product(3,"iphone",1600);

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

        ShopingCart shopingCart1 = new ShopingCart();
        ShopingCart shopingCart2 = new ShopingCart();

        shopingCart1.addProduct(product1);
        shopingCart1.addProduct(product3);
        shopingCart2.addProduct(product2);

        shopingCart1.displayCart();
        shopingCart2.displayCart();

        ShopingCart shopingCart3 =new ShopingCart();
        shopingCart3.addProduct(product1);
        shopingCart3.addProduct(product2);
        shopingCart3.addProduct(product3);

        shopingCart3.addDiscount();
        shopingCart3.displayCart();

    }
}