public class Manager extends Employee {
    float salaryperhour;
    String details;

    public Manager(String details) {
        this.salaryperhour = 50;
        this.details = details;
    }

    @Override
    public float calculateSalary()
    {
        return 50*8*20 + 1000 - 100;
    }

    @Override
    public String getDetails()
    {
        return "manager" + details;
    }

    @Override
    public void performTask()
    {
        System.out.println("manage");
    }

}
