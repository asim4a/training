public class Box {
    public double width;
    public double height;
    public double depth;

    public Box(double width, double height) {
        System.out.println("para with overloading");
        this.width = width;
        this.height = height;
        depth=2;
    }

    public Box(double width, double height, double depth) {
        System.out.println("parametarized constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(Box s){
        System.out.println("copy constructor");
        width=s.width;
        height=s.height;
        depth=s.depth;
    }
    Box()
    {
        System.out.println("default constructor");
        width=10;
        height=10;
        depth=10;
    }
    public double volume()
    {
        return (width*height*depth);
    }

        public static void main(String[] args) {
            Box mybox1=new Box();
            Box mybox2=new Box(3,4,6);
            Box mybox3=new Box(6,7);
            Box mybox4=new Box(mybox2);
            System.out.println(mybox1.volume());
            System.out.println(mybox2.volume());
            System.out.println(mybox3.volume());
            System.out.println(mybox4.volume());

        }
    }

