import java.util.*;
public class BookSearch {
    // Linear Search
    public static Book linearSearch(List<Book> books, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    // Binary Search
    public static Book binarySearch(List<Book> books, String title) {
        books.sort(Comparator.comparing(book -> book.getTitle().toLowerCase()));
        int low = 0, high = books.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books.get(mid).getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return books.get(mid);
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
