package tests.api;

import org.junit.Test;
import static io.restassured.RestAssured.given;

public class HealthCheckTest extends BaseTest {

    @Test
    public void test_first(){
        given()
                .baseUri(baseURI)
                 .when()
                        .get(path)
                .then()
                        .statusCode(OK_CODE);
    }

    @Test
    public void test_post_healthcheck(){
        given()
                     .baseUri(baseURI)
                .when()
                    .post(path)
                .then()
                    .statusCode(NOT_OK_CODE);
    }

    @Test
    public void test_put_healthcheck() {
        given()
                .baseUri(baseURI)
                .when()
                .put(path)
                .then()
                .statusCode(NOT_OK_CODE);
    }
}

