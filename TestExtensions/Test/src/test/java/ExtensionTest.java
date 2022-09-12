import huh.stuff.StringFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtensionTest {

    @Test
    void testExtension() {
        String input = "hello";
        String expected = StringFunction.hello(input);
        String output = input.sayHello();
        assertEquals(expected, output);
    }

    @Test
    void testString() {
        String input = "hello";
        String expected = StringFunction.hello(input);
        String output =  String.sayHelloFrom(input);
        assertEquals(expected, output);
    }

}
