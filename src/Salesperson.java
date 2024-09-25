public class Salesperson extends Employee{
    @Override
    public void calculateSalary()
    {
        System.out.println("salary Salesperson");
    }

    @Override
    public void getDetails()
    {
        System.out.println("details Salesperson");
    }
    @Override
    public void performTask()
    {
        System.out.println("sale");
    }
}
