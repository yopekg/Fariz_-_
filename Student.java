
package src;
public class Student extends Person
{
  private String program;

  public Student(String n, int byear, String p)
  {
     super(n, byear);
     program = p;
  }

  public String toString()
  {
    return "Student[super=" + super.toString() + ",major=" + program + "]";
  }
}