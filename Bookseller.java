// import java.util.ArrayList;

public class BookSeller {

  // Fields
  private String shopName;
  private double cashBalance;
  // private ArrayList<Book> collection;

  // Constructor
  public BookSeller(String shopName, double initialBalance) {
    this.shopName = shopName;
    this.cashBalance = initialBalance;
  }

  // Getter method for the cash balance
  public double getCashBalance() {
    return this.cashBalance;
  }

}
