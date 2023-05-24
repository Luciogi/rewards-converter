public class RewardValue {
    double cash;
    int miles;
    static double rate = 0.0035;
    RewardValue(double cash){
        // Conversion of cash to miles
        this.cash = cash;
        this.miles = (int) (cash / rate);
    }
    RewardValue(int miles){
        // Conversion of miles to cash
        this.miles = miles;
        this.cash = (miles * rate);
    }
    double getCashValue(){
        return cash;
    }
    int getMilesValue(){
        return miles;
    }
}

