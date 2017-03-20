import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingTest {
    @Test
    public void shouldReturnHelloWorldAsString(){
        Greeting greeting= new Greeting();
        String expected = "Hello World!";
        assertEquals(expected,greeting.sayHello());
    }

}
