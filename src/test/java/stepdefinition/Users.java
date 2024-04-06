package stepdefinition;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Users {

    @Given("I hit the url for creating a user")
    public void i_hit_the_url_for_creating_a_user(){
        RestAssured.baseURI="https://reqres.in/";
        RequestSpecification res= RestAssured.given();
        res.get("");
    }
}
