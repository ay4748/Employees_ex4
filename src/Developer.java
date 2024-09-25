public class Developer extends Employee{
    @Override
    public void calculateSalary()
    {
        System.out.println("salary Developer");
    }

    @Override
    public void getDetails()
    {
        System.out.println("details Developer");
    }
    @Override
    public void performTask()
    {
        System.out.println("develop");
    }
}
