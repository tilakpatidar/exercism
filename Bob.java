public class Bob {

  public String hey(String dialog) {
    if (dialog.trim().isEmpty()) {
      return "Fine. Be that way!";
    }
    //check if String represents number
    String regex = "\\d+";
    String removed_puncs = removePunctuations(dialog);
    if (removed_puncs.matches(regex)) {
      //is a number
      //last char ?
      if (dialog.charAt(dialog.length() - 1) == '?') {
        return "Sure.";
      }
      return "Whatever.";
    }


    //if String uppercase
    if (dialog.equals(dialog.toUpperCase())) {
      return "Whoa, chill out!";
    }
    if (dialog.charAt(dialog.length() - 1) == '?') {
      return "Sure.";
    }

    return "Whatever.";


  }

  private String removePunctuations(String word) {
    return word.replaceAll("[^A-Za-z0-9]", "");
  }
}
