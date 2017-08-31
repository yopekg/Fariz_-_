package src;

public class PersonTester
{
  public static void main(String[] args)
  {
    Person a = new Person("ram", 1992);
    Student b = new Student("Nikto", 1919, "IBM");
    staff c = new staff("Borda", 1998, 95000);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}