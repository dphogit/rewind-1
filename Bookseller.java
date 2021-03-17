import java.util.ArrayList;

public class BookSeller {

  // Fields
  private String shopName;
  private double cashBalance;
  private ArrayList<Book> collection = new ArrayList<>();

  // Constructor
  public BookSeller(String shopName, double initialBalance) {
    this.shopName = shopName;
    this.cashBalance = initialBalance;
  }

  // Getter method for the cash balance
  public double getCashBalance() {
    return this.cashBalance;
  }

  // Purchasing stock (books)
  public void purchaseStock(Book book) {
    this.cashBalance -= book.getCostPrice();
    this.collection.add(book);
  }

  // Returning the number of books in the collection
  public int totalNumberOfBooks() {
    return collection.size();
  }

}
