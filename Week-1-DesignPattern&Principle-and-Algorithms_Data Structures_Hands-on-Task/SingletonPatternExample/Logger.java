public class Logger {
    private static Logger Instance;
    private Logger() {
        System.out.println("Logger initialized");
    }

    public static Logger getInstance() {
        if(Instance == null) {
            Instance = new Logger();
        }
        return Instance;
    }
}