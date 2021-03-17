public class Book {

  // Fields
  private String title;
  private String author;
  private int year;
  private double costPrice;
  private double sellPrice;
  private int id;
  private boolean sold;

  // Determines the Id for each Book Instance (increments everytime a new Book
  // object is instantiated.)
  private static int nextId = 0;

  // Constructor
  public Book(String title, String author, int year, double costPrice, double sellPrice) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.costPrice = costPrice;
    this.sellPrice = sellPrice;
    this.id = nextId;
    nextId++;
    this.sold = false;
  }

  // Overiding the .toString() method
  @Override
  public String toString() {
    return this.getClass().getName();
  }

  // Get the Id of the Book instance
  public int getId() {
    return this.id;
  }

  // Get the title
  public String getTitle() {
    return this.title;
  }

  // Get the cost price of the book
  public double getCostPrice() {
    return this.costPrice;
  }

  // Getter for if it is sold
  public boolean isSold() {
    return this.sold;
  }

  // Setting sold status
  public void sell() {
    this.sold = true;
  }

}
