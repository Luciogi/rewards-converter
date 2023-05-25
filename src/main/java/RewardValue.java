public class RewardValue {
    double cash;
    int miles;
    static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    RewardValue(double cash){
        this.cash = cash;
        this.miles = convertToMiles(cash);
    }
    RewardValue(int miles){
        this.miles = miles;
        this.cash = convertToCash(miles);
    }
    public double getCashValue(){
        return cash;
    }
    public int getMilesValue(){
        return miles;
    }
    private static double convertToCash(int miles){
        return (miles * MILES_TO_CASH_CONVERSION_RATE);
    }
    private static int convertToMiles(double cash){
        return (int) ((cash / MILES_TO_CASH_CONVERSION_RATE));
    }
}

