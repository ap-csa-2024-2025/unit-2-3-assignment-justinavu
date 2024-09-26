public class Classwork
{
  public static void main(String[] args)
  {
    String word1 = firstLastN("dictionary", 1);
    System.out.println(word1);
    String word2 = delEnd("library", 5);
    System.out.println(word2);
    int word3 = compareLower("sterling", "candLes");
    System.out.println(word3);
    int word4 = lengthFirst("Everything in its right place");
    System.out.println(word4);
  }
  public static String firstLastN(String a, int n)
  {
    int length = a.length();
    String first = a.substring(0, n);
    String last = a.substring(length-n);
    String join = String.join("",first, last);
    return join;
  }
  public static String delEnd(String a, int n)
  {
    int length = a.length();
    String modified = a.substring(0, length - n);
    return modified;
  }
  public static int compareLower(String a, String b)
  {
    a = a.toLowerCase();
    b = b.toLowerCase();
    int resultig = a.compareTo(b);
    return resultig;
  }
  public static int lengthFirst(String a)
  {
    int firstSpace = a.indexOf(" ");
    return firstSpace;
  }
}
