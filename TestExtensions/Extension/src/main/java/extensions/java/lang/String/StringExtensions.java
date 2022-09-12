package extensions.java.lang.String;

import huh.stuff.StringFunction;
import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

@Extension
public class StringExtensions {

    public static String sayHello(@This String thiz) {
        return StringFunction.hello(thiz);
    }

    @Extension
    public static String sayHelloFrom(String thiz) {
        return StringFunction.hello(thiz);
    }

}
