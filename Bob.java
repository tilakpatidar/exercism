public class Bob {

  public String hey(String dialog) {
    if (dialog.trim().isEmpty()) {
      return "Fine. Be that way!";
    }
    try {
      //check if String represents number
      int temp = Integer.parseInt(removePunctuations(dialog));
      //last char ?
      if (dialog.charAt(dialog.length() - 1) == '?') {
        return "Sure.";
      }
      return "Whatever.";
    } catch (NumberFormatException e) {
      //if String uppercase
      if (dialog.equals(dialog.toUpperCase())) {
        return "Whoa, chill out!";
      }
      if (dialog.charAt(dialog.length() - 1) == '?') {
        return "Sure.";
      }

      return "Whatever.";
    }


  }

  private String removePunctuations(String word) {
    return word.replaceAll("[^A-Za-z0-9]", "");
  }
}
