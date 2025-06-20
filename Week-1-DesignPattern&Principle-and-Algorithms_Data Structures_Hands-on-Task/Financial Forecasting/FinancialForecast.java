public class FinancialForecast {

    public static double Forecast(double InitialValue, double rate, int years) {
        if (years == 0) {
            return InitialValue;
        }
        else {
            return Forecast(InitialValue, rate, years - 1) * (1 + rate);
        }
    }
    public static void main(String[] args) {
        double InitialValue = 50000; 
        double rate = 0.05;   
        int years = 10;

        double FutureValue = Forecast(InitialValue, rate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, FutureValue);
    }
}
