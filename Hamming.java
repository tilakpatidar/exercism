class Hamming {
  public static int compute(String first_word, String second_word) {
    if (first_word.length() != second_word.length()) {
      throw new IllegalArgumentException();
    }

    int counter = 0;
    for (int index = 0; index < first_word.length(); index++) {
      if (first_word.charAt(index) != second_word.charAt(index)) {
        counter++;
      }
    }

    return counter;

  }
}
