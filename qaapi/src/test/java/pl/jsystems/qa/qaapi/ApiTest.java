package pl.jsystems.qa.qaapi;

import org.junit.jupiter.api.Test;
import pl.jsystems.qa.qaapi.model.Author;


public class ApiTest {

    @Test
    public void firstApiTest() {
            RestAsured
                .given()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
                .then()
                .assertThat()
                .statusCode(200)
                .body("[0].id", equalTo(1))
                .body("[0].title", equalTo("Activity 1"))
                .body("[0].dueDate", startsWith("2021-11"))
                .body("[0].completed", is(false));
    }
}

    @Test
    public void apiTest() {
    Author author = RestAssured
            .given()
            .get
    }