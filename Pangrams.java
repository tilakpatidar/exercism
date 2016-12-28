public class Pangrams {

  private static final String atoz;

  static {
    String az = "";
    for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
      az += alphabet;
    }
    atoz = az;
  }

  public static boolean isPangram(String sentence) {
    String temp = atoz;
    for (char letter : sentence.toCharArray()) {
      temp = temp.replace("" + letter, "");
    }
    return temp.length() == 0;
  }
}
