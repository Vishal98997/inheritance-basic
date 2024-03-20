class vehicle{
    public void start(){
        System.out.println("starting ...");
    }
    public void accelerate(){
    System.out.println("accelerating..");
    }
    public void turnleft(){
        System.out.println("turning left...");

    }
    public void turnright(){
        System.out.println("turning right..");
    }
}
class car extends vehicle{
public void reverse(){
    System.out.println("reverse..");
}
}
public class inheritance1 {
    public static void main(String[] args) {
        car audi=new car();
        audi.start();
        audi.accelerate();
        audi.turnright();
        audi.turnleft();
        audi.reverse();

    }
}
