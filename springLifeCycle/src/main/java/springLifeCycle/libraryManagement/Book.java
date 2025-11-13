package springLifeCycle.libraryManagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("books")
public class Book {

    @Value("10")
    private int bookId;

    @Value("Good things take time")
    private String title;

    @Value("Mahendra")
    private String author;

    public Book() {
        super();
    }

    // Lifecycle init method - no parameters
    @PostConstruct
    public void bookLoaded() {
        System.out.println("Book data: " + title + " by " + author);
    }

    // Lifecycle destroy method - no parameters
    @PreDestroy
    public void bookRemoved() {
        System.out.println("Book " + title + " removed from library");
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
    }
}
