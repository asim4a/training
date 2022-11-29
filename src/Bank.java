public class Bank {
        // class member variable
        private long accno;
    private String name,email;
    private float amount;
    private double deposit;
    public Bank(long accno, String name, String email, float amount, double deposit) {
        this.accno = accno;
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.deposit = deposit;
    }


    public long getAccno() {
        return accno;
    }

    public void setAccno(long accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", amount=" + amount +
                ", deposit=" + deposit +
                '}';
    }


    public void displayBank()
    {
        System.out.println("accno: "+accno+ "name: "+name+ "email"+ email +"amount: "+ amount +"deposit :" +deposit);
    }
    }
