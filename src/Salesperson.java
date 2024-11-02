public class Salesperson extends Employee{
    float salaryperhour;
    String details;
    public Salesperson(String details) {
        this.salaryperhour = 35;
        this.details = details;
    }

    @Override
    public float calculateSalary()
    {
        return 35*8*20 + 500 - 100;
    }

    @Override
    public String getDetails()
    {
        return "salesperson " + details;
    }

    @Override
    public void performTask()
    {
        System.out.println("sale");
    }
}
