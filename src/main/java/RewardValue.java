public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    //initialise cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    //initialise miles
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
    // cash-->miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
    // miles-->cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
