public class RewardValue {

    private double cashValue;
    private int milesValue;
    private final double MILES_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue){
        this.cashValue  = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue  = convertToCash(milesValue);
    }

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return milesValue;
    }

    private double convertToCash(int miles){
        return miles * MILES_TO_CASH_RATE;
    }

    private int convertToMiles(double cash){
        return (int)Math.floor(cash / MILES_TO_CASH_RATE);
    }
}
