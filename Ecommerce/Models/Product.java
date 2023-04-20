package Ecommerce.Models;

import java.util.ArrayList;

public class Product {

  private String id;
  private String name;
  private String img;
  private String description;
  private ArrayList<String> categories;
  private ArrayList<String> colors;
  private ArrayList<Integer> size;
  private double price;
  private double reviews;

  public Product() {
  }

  // Getters
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getImg() {
    return img;
  }

  public String getDescription() {
    return description;
  }

  public ArrayList<String> getCategories() {
    return categories;
  }

  public ArrayList<String> getColors() {
    return colors;
  }

  public ArrayList<Integer> getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public double getReviews() {
    return reviews;
  }

  // Setters
  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setCategories(ArrayList<String> categories) {
    this.categories = categories;
  }

  public void setColors(ArrayList<String> colors) {
    this.colors = colors;
  }

  public void setSize(ArrayList<Integer> size) {
    this.size = size;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setReviews(double reviews) {
    this.reviews = reviews;
  }

  public void printProductDetails() {
    System.out.println("Product ID: " + id);
    System.out.println("Product Name: " + name);
    System.out.println("Product Image: " + img);
    System.out.println("Product Description: " + description);
    System.out.println("Product Categories: " + categories);
    System.out.println("Product Colors: " + colors);
    System.out.println("Product Size: " + size);
    System.out.println("Product Price: $" + price);
  }
}
