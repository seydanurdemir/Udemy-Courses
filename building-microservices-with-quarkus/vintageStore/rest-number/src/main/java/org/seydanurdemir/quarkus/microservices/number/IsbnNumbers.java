package org.seydanurdemir.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

@Schema(description = "Several ISBN numbers for books")
public class IsbnNumbers {
    @Schema(required = true)
    @JsonbProperty("isbn_13")
    public String isbn13;

    @Schema(required = true)
    @JsonbProperty("isbn_10")
    public String isbn10;

    @JsonbTransient
    public Instant generationDate;

    @Override
    public String toString() {
        // {"isbn_10":"10-40376","isbn_13":"13-72687414"}
        return "{" +
                "\"isbn_13\":\"" + isbn13 + "\"" + "," +
                "\"isbn_10\":\"" + isbn10 + "\"" +
                "}";
    }
}
