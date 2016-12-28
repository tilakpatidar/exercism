//Greets user with Hello
public class HelloWorld {
  public static String hello(String name) {
    return "Hello, " + greeter(name) + "!";
  }

  private static String greeter(String name){
    if(name == null || "".equals(name)){
      return "World";
    }
    return name;
  }
}