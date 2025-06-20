public class Main {
    public static void main(String[] args) {
        Logger Logger1 = Logger.getInstance();
        System.out.println("This is first log massage");
        
        Logger Logger2 = Logger.getInstance();
        System.out.println("This is second log massage");
        if(Logger1 == Logger2) {
            System.out.println(Logger1.hashCode());
            System.out.println(Logger1.hashCode());
            System.out.println("Both Logger instances are the same and singleton verified");
        }
        else {
            System.out.println("Both Logger instance are different and singleton not verified");
        }
       
    }

}