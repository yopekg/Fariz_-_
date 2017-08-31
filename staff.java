package src;

public class staff extends Person
{
	private double salary;

	public staff(String n, int byear, double s)
    {
      super(n, byear);
      salary = s;
    }

    public String toString()
    {
      return "Employee[super=" + super.toString() + ",salary=" + salary + "]";
    }
}