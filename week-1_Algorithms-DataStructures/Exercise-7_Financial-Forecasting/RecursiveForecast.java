public class RecursiveForecast implements Forecast {
    @Override
    public double forecast(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return forecast(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }
}
