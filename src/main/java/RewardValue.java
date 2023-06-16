public class RewardValue {
    double cash;
    double milesToCashRate=0.0035;



    public RewardValue(double cash) {
        this.cash=cash;

    }
    public RewardValue(int miles) {
        this.cash=convertToCash(miles);
    }

    public double convertToMiles(double cash){

        return cash/milesToCashRate;
    }
    public double convertToCash(int miles){

        return miles*milesToCashRate;
    }

    public double getMilesValue(){

        return this.cash*milesToCashRate;
    }
    public double getCashValue(){

        return convertToMiles(this.cash);
    }
}
