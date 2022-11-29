public class Demo {
    public double id;
    public String name;
    public String address;
    public double contact;

    public Demo(double id, String name, String address, double contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }

    public void displayDemo()
    {
        System.out.println(id +name + address + contact);
    }
}
