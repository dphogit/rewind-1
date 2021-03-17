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

  // Get the cash balance
  public double getCashBalance() {
    return this.cashBalance;
  }

  // Get the number of books in the collection
  public int totalNumberOfBooks() {
    return this.collection.size();
  }

  // Get the number of unsold books
  public int totalNumberOfUnsoldBooks() {
    int numUnsoldBooks = 0;
    for (Book book : this.collection) {
      if (!book.isSold()) {
        numUnsoldBooks++;
      }
    }
    return numUnsoldBooks;
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

  // Purchasing stock (books)
  public void purchaseStock(Book book) {
    this.cashBalance -= book.getCostPrice();
    this.collection.add(book);
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

  // Search for keywords and return matched book (first one + case insensitive).
  public Book searchKeyword(String keyword) {
    for (Book book : this.collection) {
      if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
        return book;
      }
    }
    return null; // No book found
  }

  // Sell all copies of a book given a Book object parameter
  public int sellAllCopiesOfBook(Book bookToSell) {
    int count = 0;
    for (Book book : this.collection) {
      // Check if the current book and the book to sell are the same
      if (book.equals(bookToSell)) {
        // If the same, attempt to sell it => increment count if so.
        boolean successful = this.sellBook(book.getId());
        if (successful) {
          count++;
        }
      }
    }
    return count;
  }

}
