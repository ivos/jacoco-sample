package net.sample.it;

import org.apache.http.client.fluent.Request;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyIT {
    @Test
    public void test() throws Exception {
        String response = Request.Get("http://localhost:8080/api").execute()
                .returnContent().asString().trim();
        assertEquals("My servlet response.", response);
    }
}
