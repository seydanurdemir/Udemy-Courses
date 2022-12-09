package org.seydanurdemir.quarkus.microservices.book;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Book Microservice",
                description = "Creates books",
                version = "1.0",
                contact = @Contact(name="@seydanurdemir", email = "dmrsydnr@gmail.com", url="linkedin.com/in/seydanurdemir")
        ),
        externalDocs = @ExternalDocumentation(
                url = "udemy.com/course/quarkus-building-microservices-with-quarkus/",
                description = "Udemy Course named as Building Microservices with Quarkus by Agoncal"
        ),
        tags = {
                @Tag(name = "api", description = "Public API"),
                @Tag(name = "book", description = "Interested in books")
        }
)
public class BookMicroservice extends Application {
}
