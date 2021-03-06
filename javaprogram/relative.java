import java.net.URI;
/*from ww w .  j a  v a2  s  .c  om*/
public class relative {
  public static void main(String[] args) throws Exception {
    String baseURIStr = "http://www.java2s.com/a/b/c/index.html?id=1&rate=5%25#foo";
    String relativeURIStr = "../x/y/z/welcome.html";

    URI baseURI = new URI(baseURIStr);
    URI relativeURI = new URI(relativeURIStr);

    URI resolvedURI = baseURI.resolve(relativeURI);

    printURIDetails(baseURI);
    printURIDetails(relativeURI);
    printURIDetails(resolvedURI);
  }
  public static void printURIDetails(URI uri) {
    System.out.println("URI:" + uri);
    System.out.println("Normalized:" + uri.normalize());
    String parts = "[Scheme=" + uri.getScheme() + ", Authority="
        + uri.getAuthority() + ", Path=" + uri.getPath() + ", Query:"
        + uri.getQuery() + ", Fragment:" + uri.getFragment() + "]";
    System.out.println(parts);
    System.out.println();
  }
}
