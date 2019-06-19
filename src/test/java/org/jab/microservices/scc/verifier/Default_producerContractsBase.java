package org.jab.microservices.scc.verifier;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.jab.microservices.MainApplication;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

/**
 * Base class for the generated Spring Cloud Contract verification tests.
 * <p>
 * This test validates the contract of the API, including response codes, headers, content type, etc.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Default_producerContractsBase {

    @Autowired
    WebApplicationContext applicationContext;

    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(applicationContext);
    }
}
