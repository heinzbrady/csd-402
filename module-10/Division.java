public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract display method
    public abstract void display();
}