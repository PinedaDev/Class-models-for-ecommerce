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

  public Product(String name, String img, String description, ArrayList<String> categories,
                 ArrayList<String> colors, ArrayList<Integer> size, Double price) {

    this.name = name;
    this.img = img;
    this.description = description;
    this.categories = categories;
    this.colors = colors;
    this.size = size;
    this.price = price;

  }
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getImg() {
    return img;
  }
  public void setImg(String img) {
    this.img = img;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public ArrayList<String> getCategories() {
    return categories;
  }
  public void setCategories(ArrayList<String> categories) {
    this.categories = categories;
  }

  public void addCategory(String category) {
    if (!categories.contains(category)) {
      categories.add(category);
    }
  }
  public void removeCategory(String category) {
    categories.remove(category);
  }
  public ArrayList<String> getColors() {
    return colors;
  }
  public void setColors(ArrayList<String> colors) {
    this.colors = colors;
  }

  public void addColor(String color) {
    if (!colors.contains(color)) {
      colors.add(color);
    }
  }
  public void removeColor(String color) {
    colors.remove(color);
  }
  public ArrayList<Integer> getSize() {
    return size;
  }
  public void setSize(ArrayList<Integer> size) {
    this.size = size;
  }
  public void addSize(int size) {
    if (!this.size.contains(size)) {
      this.size.add(size);
    }
  }

  public void removeSize(int size) {
    if (this.size.contains(size)) {
      this.size.remove(Integer.valueOf(size));
    }
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
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
