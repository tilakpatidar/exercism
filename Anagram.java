import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Anagram {
  private final String word;

  Anagram(String word) {
    this.word = word;
  }

  public List<String> match(List<String> words) {
    Iterator<String> word_iterator = words.iterator();
    ArrayList<String> anagrams = new ArrayList<String>();
    while (word_iterator.hasNext()) {
      String test_word = word_iterator.next();
      if (isAnagram(test_word)) {
        anagrams.add(test_word);
      }
    }
    return anagrams;
  }

  private boolean isAnagram(String that_word) {
    that_word = that_word.toLowerCase();
    String this_word = this.word.toLowerCase();

    if (that_word.length() != this_word.length()) {
      return false;
    }

    if (this_word.equals(that_word)) {
      return false;
    }

    char[] uniq_chars_word = this_word.toCharArray();
    Arrays.sort(uniq_chars_word);

    char[] uniq_chars_other_word = that_word.toCharArray();
    Arrays.sort(uniq_chars_other_word);


    return Arrays.equals(uniq_chars_word, uniq_chars_other_word);
  }


}
