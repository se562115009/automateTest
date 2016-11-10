import java.math.BigDecimal;

/**
 * Created by mac on 9/9/2016 AD.
 */
public class CurrencyExchange {

    // get exchange value
    // what is input parameter
    public double getExchangeRate(Currency source, Currency target)

    {
        double rateSource = source.getRate();
        double rateTarget = target.getRate();
        double rateExchange = rateSource/rateTarget;
        double ExchangeRate = new BigDecimal(rateExchange)
                .setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        return ExchangeRate;
    }

    // BigDecimal = java math
    // ROUND HALF UP = round half toward positive infinity
    // ROUND UP = round toward plus infinity

    public double getExchange (Currency source, Currency target, double amount){
        double rateSource = source.getRate();
        double rateTarget = target.getRate();
        double rateExchange = rateSource/rateTarget;
        double amountResult = amount*rateExchange;

        // truncate = chop off the decimal portion of number,
        // use truncate because need the actual result equal the expected result

        double truncateDouble = new BigDecimal(amountResult)
                .setScale(4, BigDecimal.ROUND_UP).doubleValue();

        // setScal(int newScal, int RoundingMode)

        return truncateDouble;

        // set return same as we epxpected
        // return we will construct the math for return
    }
}
