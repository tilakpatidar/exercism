import java.util.HashMap;
import java.util.Map;

public class WordCount {

  public Map<String,Integer> phrase(String text) {

    HashMap<String, Integer> word_count_map = new HashMap<>();
    text = this.filterPhrase(text);

    String[] tokens = text.split("\\s");

    for(String token : tokens){
      if(!word_count_map.containsKey(token)){
        word_count_map.put(token, 0);
      }
      int count = word_count_map.get(token);
      word_count_map.put(token, ++ count);
    }

    return word_count_map;
  }

  private String filterPhrase(String phrase){
    String removePunctuations = phrase.replaceAll("[^a-zA-Z0-9 ]", " ");
    String unwantedSpaces = removePunctuations.replaceAll("\\s+", " ");
    return unwantedSpaces.toLowerCase();
  }
}
