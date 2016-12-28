import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {

  public Map<String, Integer> transform(Map<Integer, List<String>> old_map) {

    HashMap<String, Integer> new_map = new HashMap<String, Integer>();

    old_map.forEach((integer_key, letter_list) -> {
      letter_list.forEach((letter) -> {
            new_map.put(letter.toLowerCase(), integer_key);
        }
      );
    });

    return new_map;
  }

}

