public class Employee {
    String details;
    float salaryperhour;
    public float calculateSalary()
    {
        return salaryperhour*8*20;
    }
    public String getDetails()
    {
        return details;
    }

    public void performTask()
    {
        System.out.println("do task");
    }
}
