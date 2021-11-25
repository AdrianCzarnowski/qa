package pl.jsystems.qa.qaapi;


import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void firstApiTest() {
        RestAssured
                .given()
                .get()
                .assertThat()
                .statusCode(200)
                .body

    }
}
