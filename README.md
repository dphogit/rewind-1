# rewind-1
SOFTENG 281 Rewind #1 Project

<ol>
    <li>Define a <code class="language-plaintext highlighter-rouge">BookSeller</code> class inside a <code class="language-plaintext highlighter-rouge">BookSeller.java</code> file.
      <ul>
        <li>Declare and define a <code class="language-plaintext highlighter-rouge">BookSeller</code> constructor <code class="language-plaintext highlighter-rouge">public BookSeller(String shopName, double initialBalance)</code>.</li>
        <li>Declare and define a getter method <code class="language-plaintext highlighter-rouge">public double getCashBalance()</code>.</li>
        <li>Inside the <code class="language-plaintext highlighter-rouge">main()</code> method, create an instance of <code class="language-plaintext highlighter-rouge">BookSeller</code> and print its starting cash balance as in the <em>Example Usage</em> section above.</li>
      </ul>
    </li>
    <li>Define a <code class="language-plaintext highlighter-rouge">Book</code> class inside a <code class="language-plaintext highlighter-rouge">Book.java</code> file.
      <ul>
        <li>Implement a <code class="language-plaintext highlighter-rouge">Book</code> constructor that expects:
          <ul>
            <li>a <em>title</em>,</li>
            <li>an <em>author</em>,</li>
            <li>a <em>year</em>,</li>
            <li>a <em>cost price</em>, and</li>
            <li>a <em>sell price</em>.</li>
          </ul>
        </li>
        <li>Assign a unique ID to the book when it is constructed, using a <code class="language-plaintext highlighter-rouge">static</code> variable.</li>
      </ul>
    </li>
    <li>Create a few <code class="language-plaintext highlighter-rouge">Book</code> instances, as in the example above.
      <ul>
        <li>Add a <code class="language-plaintext highlighter-rouge">getID()</code> method for the <code class="language-plaintext highlighter-rouge">Book</code> class.</li>
        <li>Test that each book instance has a unique ID returned.</li>
      </ul>
    </li>
    <li>Override the <code class="language-plaintext highlighter-rouge">public String toString()</code> method for the <code class="language-plaintext highlighter-rouge">Book</code> class.
      <ul>
        <li>Test it by calling it on the <code class="language-plaintext highlighter-rouge">Book</code> instances you made above.</li>
      </ul>
    </li>
    <li>Add a <code class="language-plaintext highlighter-rouge">public void purchaseStock(Book book)</code> in <code class="language-plaintext highlighter-rouge">BookSeller</code>.
      <ul>
        <li>Decrement the book seller’s cash balance (will need to add a <code class="language-plaintext highlighter-rouge">getCostPrice()</code> instance method for <code class="language-plaintext highlighter-rouge">Book</code>).</li>
        <li>Store the book inside an <code class="language-plaintext highlighter-rouge">ArrayList</code>. Hints: Inside <code class="language-plaintext highlighter-rouge">BookSeller</code>, you will need to:
          <ul>
            <li><code class="language-plaintext highlighter-rouge">import java.util.ArrayList;</code>,</li>
            <li>Declare a <code class="language-plaintext highlighter-rouge">private ArrayList&lt;Book&gt; collection</code> field, and</li>
            <li>Make use of the <code class="language-plaintext highlighter-rouge">add()</code> method on the <code class="language-plaintext highlighter-rouge">ArrayList</code>.</li>
          </ul>
        </li>
      </ul>
    </li>
    <li>
      <p>Implement a method <code class="language-plaintext highlighter-rouge">public int totalNumberOfBooks()</code> inside <code class="language-plaintext highlighter-rouge">BookSeller</code>.</p>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public Book scanByID(int id)</code> inside <code class="language-plaintext highlighter-rouge">BookSeller</code>.
      <ul>
        <li>Loop through each book in the <code class="language-plaintext highlighter-rouge">collection</code>. If a book’s ID matches the id we want, return the book.</li>
        <li>If a book with that id wasn’t found, return <code class="language-plaintext highlighter-rouge">null</code>.</li>
        <li>Test it by retrieving existing/missing books in the collection:
          <ul>
            <li>Print its details out (either use its <code class="language-plaintext highlighter-rouge">toString()</code> or add a <code class="language-plaintext highlighter-rouge">getTitle()</code> method).</li>
            <li>Be sure to safe-guard this printing with an if-statement, just in case <code class="language-plaintext highlighter-rouge">null</code> was returned.</li>
          </ul>
        </li>
      </ul>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public boolean sellBook(int id)</code> inside <code class="language-plaintext highlighter-rouge">BookSeller</code>.
      <ul>
        <li>Reuse the <code class="language-plaintext highlighter-rouge">scanByID()</code> method to find the <code class="language-plaintext highlighter-rouge">Book</code>.</li>
        <li>If no book was found in the scan, then return <code class="language-plaintext highlighter-rouge">false</code> from <code class="language-plaintext highlighter-rouge">sellBook()</code>.</li>
        <li>Add a <code class="language-plaintext highlighter-rouge">sold</code> status to <code class="language-plaintext highlighter-rouge">Book</code>, with its respective setter (<code class="language-plaintext highlighter-rouge">public void sell()</code>) and getter (<code class="language-plaintext highlighter-rouge">public boolean isSold()</code>).
          <ul>
            <li>You will also need to initialise this variable in the <code class="language-plaintext highlighter-rouge">Book</code>’s constructor.</li>
          </ul>
        </li>
        <li>For the retrieved book, check it isn’t already sold.
          <ul>
            <li>If it is already sold, return <code class="language-plaintext highlighter-rouge">false</code> from <code class="language-plaintext highlighter-rouge">sellBook()</code>.</li>
            <li>Otherwise, update its status to <em>sold</em>, update the <code class="language-plaintext highlighter-rouge">BookSeller</code>’s <em>cash balance</em>, and return <code class="language-plaintext highlighter-rouge">true</code> from <code class="language-plaintext highlighter-rouge">sellBook()</code>.</li>
          </ul>
        </li>
      </ul>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public void reduceSellPrice(double deltaAmount)</code> inside <code class="language-plaintext highlighter-rouge">Book</code>:
      <ul>
        <li>It reduces the sell price of a particular book instance by (at most) the specified <code class="language-plaintext highlighter-rouge">deltaAmount</code>.</li>
        <li>However, the book seller <em>never wants to sell a book below cost!</em> So you need to make sure the <em>sell price</em> never drops below its <em>cost price</em>!</li>
        <li>If the <code class="language-plaintext highlighter-rouge">deltaAmount</code> causes the <em>sell price</em> to drop below the <em>cost price</em>, then make the <em>sell price</em> equal to the <em>cost price</em>.</li>
        <li>Test it out with a few different deltas on the books we have already.</li>
        <li><strong>Notice:</strong> Hopefully this makes you appreciate why we would want fields to be <code class="language-plaintext highlighter-rouge">private</code>! It allows us to safeguard the state of our instance (in this case, to ensure that the sell price doesn’t change to something too low!).</li>
      </ul>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public int totalNumberOfUnsoldBooks()</code> inside <code class="language-plaintext highlighter-rouge">BookSeller</code>.
      <ul>
        <li>Loop through all books and count how many books aren’t sold yet. Return that count.</li>
      </ul>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public Book searchKeyword(String keyword)</code> inside <code class="language-plaintext highlighter-rouge">BookSeller</code>.
      <ul>
        <li>Loop through the collection. If the keyword is in the title, return the book. Otherwise return <code class="language-plaintext highlighter-rouge">null</code>.</li>
        <li>Make the search case insensitive.</li>
      </ul>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public int sellAllCopiesOfBook(Book bookToSell)</code> inside <code class="language-plaintext highlighter-rouge">BookSeller</code>.
      <ul>
        <li>Define equality for <code class="language-plaintext highlighter-rouge">Book</code> by overriding the <code class="language-plaintext highlighter-rouge">public boolean equals(Object obj)</code> method.
          <ul>
            <li>Equality of books depends on the title, author, and year.</li>
            <li>Strictly speaking, you should also override the <code class="language-plaintext highlighter-rouge">public int hashCode()</code> method.</li>
          </ul>
        </li>
        <li>Inside <code class="language-plaintext highlighter-rouge">sellAllCopiesOfBook()</code>, define a <code class="language-plaintext highlighter-rouge">count</code> for the number of copies (initially set to zero).</li>
        <li>For each “equal book” in the collection, attempt to sell it using the existing <code class="language-plaintext highlighter-rouge">sellBook()</code> method.
          <ul>
            <li>Check if it was successful (according to the returned value <code class="language-plaintext highlighter-rouge">sellBook()</code>). If so, increment the count.</li>
          </ul>
        </li>
        <li>Finally, return the count.</li>
      </ul>
    </li>
    <li>Implement a method <code class="language-plaintext highlighter-rouge">public static int getOldestBookYear()</code> inside <code class="language-plaintext highlighter-rouge">Book</code>. It will return the year of the oldest book that exists. You will need to also make changes to your <code class="language-plaintext highlighter-rouge">Book</code> constructor (e.g. to figure out if the book instance constructed is older than the current oldest book).</li>
  </ol>
