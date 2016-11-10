import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by mac on 9/9/2016 AD.
 */

public class CurrencyExchangeTest1 {
    @Test
    public void testGetCurrency(){
        Currency USD = new Currency("USD",1);
        // 1 is exchange rate
        CurrencyExchange currencyExchange = new CurrencyExchange();
        assertThat(currencyExchange.getExchangeRate(USD,USD),is(1.0));
    }

}
