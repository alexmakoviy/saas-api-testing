package tests.api;

import commonLibs.api.BaseAPI;

public class BaseTest extends BaseAPI {
    public final Integer OK_CODE = 200;
    public final Integer NOT_OK_CODE = 405;


    public static String baseURI = "http://localhost:8182";
    public static String path = "/healthcheck";

}
