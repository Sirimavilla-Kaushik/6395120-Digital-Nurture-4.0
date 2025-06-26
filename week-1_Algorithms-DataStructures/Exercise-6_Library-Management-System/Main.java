import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(4, "Pride and Prejudice", "Jane Austen"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title to search:");
        String searchTitle = sc.nextLine();
        System.out.println("\n Using Linear Search:");
        Book resultLinear = BookSearch.linearSearch(books, searchTitle);
        System.out.println(resultLinear != null ? resultLinear : "Book not found.");
        System.out.println("\n Using Binary Search:");
        Book resultBinary = BookSearch.binarySearch(books, searchTitle);
        System.out.println(resultBinary != null ? resultBinary : "Book not found.");
        sc.close();
    }
}
