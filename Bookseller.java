import java.util.ArrayList;

public class BookSeller {

  // Fields
  private String shopName;
  private double cashBalance;
  private ArrayList<Book> collection;

  // Constructor
  public BookSeller(String shopName, double initialBalance) {
    this.shopName = shopName;
    this.cashBalance = initialBalance;
    this.collection = new ArrayList<>();
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
    return this.collection.size();
  }

  // Attempts to find a book in the collection
  public Book scanByID(int id) {
    for (Book book : this.collection) {
      if (book.getId() == id) {
        return book;
      }
    }
    return null; // Not Found
  }

  // Sell a book
  public boolean sellBook(int id) {
    Book bookFound = scanByID(id);

    // Check for no book found OR if it hasn't been sold already
    if (bookFound == null || bookFound.isSold()) {
      return false;
    }

    // Successfully sold => update status to sold and cash balance
    bookFound.sell();
    this.cashBalance -= bookFound.getCostPrice();
    return true;
  }

}
