
class BookShop {
    String Book[] = { "The alchemist", "How to win friends and influence people", "Rich dad Poor dad" };
    String Author[] = { "Paulo Coelho ", "Dale Carnegie", "Robert Kiyosaki" };
    int Price[] = { 150, 220, 250 };
    int Stock[] = { 20, 15, 22 };

    public void book(String b, int n) {
        int p = 0;
        for (int i = 0; i < Book.length; i++) {
            if (Book[i] == b)
                break;
            else
                p++;
        }
        if (p == Book.length) {
            System.out.println("book not available");
        } else {
            System.out.println("Book:" + Book[p]);
            System.out.println("author:" + Author[p]);
            System.out.println("price:" + Price[p]);
            System.out.println("quantity demanded :" + n);
        }
        if (n <= Stock[p]) {
            System.out.println("Total Amount:" + Price[p] * n);
            Stock[p] = Stock[p] - n;
        } else {
            System.out.println("limited stock available");
            System.out.println("only " + Stock[p] + " book are available which cost " + Price[p] * Stock[p]);
            Stock[p] = 0;
        }
        if (Stock[p] == 0) {
            System.out.println("Stock is not available");
        }
    }
}

public class Book {
    public static void main(String args[]) {
        BookShop h = new BookShop();
        System.out.println("BOOK 1");
        h.book("The alchemist", 12);
        System.out.println("\nBOOK 2");
        h.book("How to win friends and influence people", 8);
        System.out.println("\nBOOK 3");
        h.book("The alchemist", 9);
        System.out.println("\nBOOK 4");
        h.book("Rich dad Poor dad", 13);
    }
}
