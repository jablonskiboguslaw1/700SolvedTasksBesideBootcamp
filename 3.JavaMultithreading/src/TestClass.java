import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class TestClass {


    public static void main(String[] args) throws UnsupportedEncodingException {

        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        System.out.println("!@#$%^&*()");

        String text = "!@#$%^&*()";
        System.out.println();
        byte[] bytes = text.getBytes("GB18030");

        String str = new String(bytes, "EUC-JP");
        System.out.println(str);
    }
}