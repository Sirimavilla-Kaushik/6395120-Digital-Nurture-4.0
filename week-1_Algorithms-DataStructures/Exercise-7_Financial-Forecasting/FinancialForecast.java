import java.util.Scanner;
public class FinancialForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment amount: ");
        double initialAmount = scanner.nextDouble();
        System.out.print("Enter annual growth rate as a percentage: ");
        double growthRate = scanner.nextDouble() / 100;  
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        Forecast forecast = new RecursiveForecast();
        double futureValue = forecast.forecast(initialAmount, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
        scanner.close();
    }
}
