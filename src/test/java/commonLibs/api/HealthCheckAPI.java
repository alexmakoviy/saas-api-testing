package commonLibs.api;
import org.hamcrest.Matchers;
import org.junit.Test;


import static io.restassured.RestAssured.given;


public class HealthCheckAPI extends BaseAPI {
    @Test
    public void test_first(){
                    given()
                            .baseUri("http://localhost:8182")
                            .basePath("/healthcheck")
                    .when()
                            .get()
                    .then()
                            .statusCode(200);
    }
}
