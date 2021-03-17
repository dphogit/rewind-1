class Main {

  public static void main(String[] args) {
    // Create BookSeller instance and print details
    BookSeller shop = new BookSeller("Books 'r' Us", 100.0);
    System.out.println("Starting balance: $" + shop.getCashBalance());
    System.out.println();

    // Create a few Book instances
    Book hp1 = new Book("Harry Potter Philosopher Stone", "J. K. Rowling", 1997, 10.50, 29.95); // ID: 0
    Book hp2a = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 11.50, 31.95); // ID: 1
    Book hp2b = new Book("Harry Potter Chamber Secrets", "J. K. Rowling", 1998, 9.50, 31.95); // ID: 2
    Book phil = new Book("Philosophy 101", "Paul Kleinman", 2013, 8.75, 15.99);

    System.out.println(hp1.getId());
    System.out.println(hp2a.getId());
    System.out.println(hp2b.getId());
    System.out.println(phil.getId());

    // // BookSeller purchases one of the Books as stock
    // shop.purchaseStock(hp2b);
    // System.out.println("Balance after purchasing stock: $" +
    // shop.getCashBalance());
    // System.out.println("Total books: " + shop.totalNumberOfBooks());
    // System.out.println();

    // // BookSeller purchases more Books as stock
    // shop.purchaseStock(hp1);
    // shop.purchaseStock(hp2a);
    // shop.purchaseStock(phil);
    // System.out.println("Balance after purchasing more stock: $" +
    // shop.getCashBalance());
    // System.out.println("Total books: " + shop.totalNumberOfBooks());
    // System.out.println();

    // // Scan a barcode to find a Book
    // Book result = shop.scanByID(3);
    // if (result != null) {
    // System.out.println("Search by ID found: " + result);
    // } else {
    // System.out.println("Search by ID didn't find anything.");
    // }

    // // Reduce the selling prices of these books
    // phil.reduceSellPrice(1.1);
    // hp2a.reduceSellPrice(50);

    // // Try to sell a Book
    // boolean success = shop.sellBook(3);
    // if (success) {
    // System.out.println("Sold book: " + result);
    // } else {
    // System.out.println("Could not sell: " + result);
    // }
    // System.out.println();

    // // Search for a Book that contains the specified keyword
    // result = shop.searchKeyword("SeCReTs");
    // if (result != null) {
    // System.out.println("Search by keyword found: " + result);

    // int num = shop.sellAllCopiesOfBook(result);
    // System.out.println("Sold " + num + " copies.");
    // } else {
    // System.out.println("Could not find something with that keyword." );
    // }

    // System.out.println("At the end of the day, balance is $" +
    // shop.getCashBalance());
  }

}