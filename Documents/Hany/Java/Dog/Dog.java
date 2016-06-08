public class Dog extends Animal {
  public Dog(String aName)  {
  super("Dog");
  name = aName;
  breed = "unknown";

}

public Dog(String aName, String aBreed) {
  super("Dog");
  name = aName;
  breed = "unknown";

}

protected String name;
protected String breed;
}