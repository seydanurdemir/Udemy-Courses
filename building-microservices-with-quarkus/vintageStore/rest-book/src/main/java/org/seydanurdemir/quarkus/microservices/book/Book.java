package org.seydanurdemir.quarkus.microservices.book;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

@Schema(description = "")
public class Book {
    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;

    @Schema(required = true)
    public String title;

    @Schema(required = true)
    public String author;

    @Schema(required = true)
    @JsonbProperty("year_of_publication")
    public int yearOfPublication;

    @Schema(required = true)
    public String genre;

    @Schema(implementation = String.class, format = "date")
    @JsonbDateFormat("yyyy-MM-dd")
    @JsonbProperty("creation_date")
    public Instant creationDate;

    @Override
    public String toString() {
        // {"author":"Agoncal","creation_date":"2022/12/08","genre":"IT","isbn_13":"will be edited","title":"Quarkus","year_of_publication":2019}
        // {"author":"Agoncal","creation_date":"2022-12-09","genre":"IT","isbn_13":"13-00000000","title":"Quarkus","year_of_publication":2019}
        // {"author":"Agoncal","creation_date":"2022-12-09","genre":"IT","isbn_13":"13-32749936","title":"Quarkus","year_of_publication":2019}
        return "{" +
                "\"isbn_13\":\"" + isbn13 + "\"" + "," +
                "\"title\":\"" + title + "\"" + "," +
                "\"author\":\"" + author + "\"" + "," +
                "\"year_of_publication\":\"" + yearOfPublication + "\"" + "," +
                "\"genre\":\"" + genre + "\"" + "," +
                "\"creation_date\":\"" + creationDate + "\"" +
                "}";
    }
}
