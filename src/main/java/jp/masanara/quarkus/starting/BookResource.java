package jp.masanara.quarkus.starting;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/books")
//@Produces(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @GET
    public List<Book> getAllBooks() {
        return List.of(
            new Book(1, "Understanding Quarkus", "masanori", 2024, "IT"),
            new Book(2, "Practicing Quarkus", "masanori", 2024, "IT"),
            new Book(3, "Effective Java", "nagomi", 2023, "IT"),
            new Book(4, "Thinking Java", "marie", 2019, "IT"),
            new Book(5, "Understanding TCP/IP", "masanori", 1995, "IT")
        );
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)

    public int countAllBooks() {
        return getAllBooks().size();
    }
}
