import java.net.URLDecoder;
import java.net.URLEncoder;
//  w w w  . j  a  v a  2  s. co m
public class incoder {
  public static void main(String[] args) throws Exception {
    String source = "https://en.wikipedia.org/wiki/Teleprinter";
    String encoded = URLEncoder.encode(source, "utf-8");
    String decoded = URLDecoder.decode(encoded, "utf-8");
    System.out.println("Source: " + source);
    System.out.println("Encoded: " + encoded);
    System.out.println("Decoded: " + decoded);

  }
}