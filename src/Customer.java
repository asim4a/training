public class Customer {
    String name;
    int cus_id;

    public Customer(String name, int cus_id) {
        this.name = name;
        this.cus_id = cus_id;
    }
    void display()
    {
        System.out.println(name+cus_id);
    }
}
