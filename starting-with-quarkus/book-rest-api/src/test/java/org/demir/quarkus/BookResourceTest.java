package org.demir.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldGetAllBooks() {
        given()
            .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON).
        when()
            .get("/api/books").
        then()
            .statusCode(200)
            .body("size()", is(5));
    }

    @Test
    public void shouldCountAllBooks() {
        given()
            .header(HttpHeaders.ACCEPT, MediaType.TEXT_PLAIN).
        when()
            .get("/api/books/count").
        then()
            .statusCode(200)
            .body(is("5"));
    }

    @Test
    public void shouldGetBook() {
        given()
            .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
            .pathParam("id", 0).
        when()
            .get("/api/books/{id}").
        then()
            .statusCode(200)
            .body("id", is(0))
            .body("title", is("Unknown"))
            .body("author", is("Unknown"))
            .body("yearOfPublication", is(1970))
            .body("genre", is("Unknown"));
    }

}