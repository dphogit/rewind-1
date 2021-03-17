class Main {

  public static void main(String[] args) {
    // Create BookSeller instance and print details
    BookSeller shop = new BookSeller("Books 'r' Us", 100.0);
    System.out.println("Starting balance: $" + shop.getCashBalance());
    System.out.println();

    // Create a few Book instances
    Book hp1 = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95);
    Book hp2a = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 11.50, 31.95);
    Book hp2b = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 9.50, 31.95);
    Book phil = new Book("Philosophy 101", "Paul Kleinman", 2013, 8.75, 15.99);

    // Check for increment ID
    System.out.println(hp1.getId()); // ID: 0
    System.out.println(hp2a.getId()); // ID: 1
    System.out.println(hp2b.getId()); // ID: 2
    System.out.println(phil.getId()); // ID: 3
    System.out.println();

    // Check for Override
    System.out.println(hp1.toString()); // 'Book'
    System.out.println();

    // BookSeller purchases one of the Books as stock
    shop.purchaseStock(hp2b);
    System.out.println("Balance after purchasing stock: $" + shop.getCashBalance()); // 100 - 9.50 = 90.50
    System.out.println("Total books: " + shop.totalNumberOfBooks()); // 1 book
    System.out.println();

    // BookSeller purchases more Books as stock
    shop.purchaseStock(hp1);
    shop.purchaseStock(hp2a);
    shop.purchaseStock(phil);
    System.out.println("Balance after purchasing more stock: $" + shop.getCashBalance()); // 59.75
    System.out.println("Total books: " + shop.totalNumberOfBooks()); // 4
    System.out.println();

    // Scan a barcode to find a Book
    Book result = shop.scanByID(3);
    if (result != null) {
      System.out.println("Search by ID found: " + result.getTitle());
      // Philosophy 101 (ID 3)
    } else {
      System.out.println("Search by ID didn't find anything.");
    }

    // Try to sell a Book
    boolean success = shop.sellBook(3);
    if (success) {
      System.out.println("Sold book: " + result.getTitle());
      // Philosophy 101 (ID 3)
    } else {
      System.out.println("Could not sell: " + result.getTitle());
    }
    System.out.println();

    // Reduce the selling prices of these books
    phil.reduceSellPrice(1.1);
    hp2a.reduceSellPrice(50);
    System.out.println("Reduced Prices:");
    System.out.println("$" + phil.getSellPrice()); // 14.89
    System.out.println("$" + hp2a.getSellPrice()); // 11.50
    System.out.println();

    // Check for number of unsold books
    System.out.println("No. Unsold Books:");
    System.out.println(shop.totalNumberOfUnsoldBooks()); // 3
    System.out.println();

    // Search for a Book that contains the specified keyword
    result = shop.searchKeyword("SeCReTs");
    if (result != null) {
      System.out.println("Search by keyword 'SeCReTs' found: " + result.getTitle()); // Harry Potter Chamber Secrets
      int num = shop.sellAllCopiesOfBook(result);
      System.out.println("Sold " + num + " copies."); // 2
    } else {
      System.out.println("Could not find something with that keyword.");
    }

    // System.out.println("At the end of the day, balance is $" +
    // shop.getCashBalance());
  }

}