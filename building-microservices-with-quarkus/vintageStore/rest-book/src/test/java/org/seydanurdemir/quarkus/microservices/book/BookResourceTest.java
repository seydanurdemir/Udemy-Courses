package org.seydanurdemir.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import javax.inject.Inject;
//import org.eclipse.microprofile.rest.client.inject.RestClient;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
public class BookResourceTest {

//    @InjectMocks
//    @Inject
//    @RestClient
//    MockNumberProxy mock;

    @Test
    public void testCreateABookEndpoint() {
        given()
            .formParam("title","Quarkus")
            .formParam("author","Agoncal")
            .formParam("year",2019)
            .formParam("genre","IT")
        .when()
            .post("/api/books")
        .then()
            .statusCode(201)
            .body("isbn_13",startsWith("13-"))
            .body("title",is("Quarkus"))
            .body("author",is("Agoncal"))
            .body("year_of_publication",is(2019))
            .body("genre",is("IT"))
            .body("creation_date",startsWith("20"));
    }

}