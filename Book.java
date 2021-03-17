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

  // Override the Object.equals() method
  @Override
  public boolean equals(Object obj) {
    // Check for exactly same instance (identity)
    if (this == obj) {
      return true;
    }

    // Check if other reference is null or they are dissimmilar types
    if (obj == null || this.getClass() != obj.getClass()) {
      return false;
    }

    // They are the same types => case the Object `obj` to a Book type
    Book otherBook = (Book) obj;

    // Check attributes we care about are the same values (title, author, year)
    boolean same = this.title == otherBook.title && this.author == otherBook.author && this.year == otherBook.year;

    return same;
  }

  // Strictly speaking, overide the hashCode as well
  @Override
  public int hashCode() {
    // Not the best hash function as Id is unique for every book but not important.
    return this.id;
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

  // Getting the sell price of the book
  public double getSellPrice() {
    return this.sellPrice;
  }

  // Getter for if it is sold
  public boolean isSold() {
    return this.sold;
  }

  // Setting sold status
  public void sell() {
    this.sold = true;
  }

  // Reduce the selling price (discount)
  public void reduceSellPrice(double deltaAmount) {
    // Check for sell price dropping below cost price
    if (this.sellPrice - deltaAmount < this.costPrice) {
      this.sellPrice = this.costPrice;
    } else {
      this.sellPrice -= deltaAmount;
    }
  }

}
