import java.util.HashMap;
import java.util.Map;

public class DNA {
  private final HashMap<Character, Integer> nucleotide_count;

  DNA(String dna_sequence){
    nucleotide_count = new HashMap<>();

    nucleotide_count.put('A', 0);
    nucleotide_count.put('G', 0);
    nucleotide_count.put('C', 0);
    nucleotide_count.put('T', 0);

    for(char nucleotide : dna_sequence.toCharArray()){
      int count = nucleotide_count.get(nucleotide);
      nucleotide_count.put(nucleotide, ++count);
    }
  }

  int count(char nucleotide){
    if(!"AGCT".contains("" + nucleotide)){
      throw new IllegalArgumentException();
    }
    return this.nucleotide_count.get(nucleotide);
  }

  Map<Character,Integer> nucleotideCounts() {
    return this.nucleotide_count;
  }

}
