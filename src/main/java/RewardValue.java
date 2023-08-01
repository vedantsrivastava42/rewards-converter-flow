import java.util.*;

public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;

    }

    public Double getCashValue() {
        RewardValue obj = new RewardValue(cashValue);
        return cashValue;
    }

    public double getMilesValue() {

        double miles = cashValue * 0.0035;
        return miles;
    }

}
