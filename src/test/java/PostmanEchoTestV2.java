package ru.netology.PostmanEchoTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTestV2 {
    @Test
    void shouldTestTheTextIsCyrillic() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Проверка шрифта")
                .contentType("text/plain; charset=UTF-8")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo ("Test шрифт"))
        ;
    }
}