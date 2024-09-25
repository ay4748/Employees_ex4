public class Manager extends Employee {
    @Override
    public void calculateSalary()
    {
        System.out.println("salary manager");
    }

    @Override
    public void getDetails()
    {
        System.out.println("details manager");
    }

    @Override
    public void performTask()
    {
        System.out.println("manage");
    }

}
