public class Developer extends Employee{
    float salaryperhour;
    String details;

    public Developer(String details) {
        this.salaryperhour = 70;
        this.details = details;
    }

    @Override
    public float calculateSalary()
    {
        return 70*8*20 + 1000 - 100;
    }

    @Override
    public String getDetails()
    {
        return "developer" + details;
    }

    @Override
    public void performTask()
    {
        System.out.println("develop");
    }
}
