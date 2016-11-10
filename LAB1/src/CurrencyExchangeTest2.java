import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by mac on 9/9/2016 AD.
 */
public class CurrencyExchangeTest2 {
    @Test
    public void testGetCurrency(){
        Currency USD = new Currency("USD",1.00);  // 1 is exchange rate
        Currency THB = new Currency("THB",0.0280);
        Currency EUR = new Currency("EUR",1.1200);

        CurrencyExchange currencyExchange = new CurrencyExchange();
        // ExchangeRate
        assertThat(currencyExchange.getExchangeRate(USD,USD),is(1.0));
        assertThat(currencyExchange.getExchangeRate(USD,THB),is(35.7143));
        assertThat(currencyExchange.getExchangeRate(USD,EUR),is(0.8929));
        assertThat(currencyExchange.getExchangeRate(THB,USD),is(0.0280));
        assertThat(currencyExchange.getExchangeRate(THB,THB),is(1.0));
        assertThat(currencyExchange.getExchangeRate(THB,EUR),is(0.0250));
        assertThat(currencyExchange.getExchangeRate(EUR,EUR),is(1.0000));
        assertThat(currencyExchange.getExchangeRate(EUR,USD),is(1.1200));
        assertThat(currencyExchange.getExchangeRate(EUR,THB),is(40.0000));

        //Exchange amount
         // ,is(XXX.XXXX) is expected result
        assertThat(currencyExchange.getExchange(USD,USD,100),is(100.0000));
        assertThat(currencyExchange.getExchange(USD,THB,100),is(3571.4286));
        assertThat(currencyExchange.getExchange(USD,EUR,100),is(89.2858));
        assertThat(currencyExchange.getExchange(THB,USD,100),is(2.8001));
        assertThat(currencyExchange.getExchange(THB,THB,100),is(100.0000));
        assertThat(currencyExchange.getExchange(THB,EUR,100),is(2.5000));
        assertThat(currencyExchange.getExchange(EUR,EUR,100),is(100.0000));
        assertThat(currencyExchange.getExchange(EUR,USD,100),is(112.0001));
        assertThat(currencyExchange.getExchange(EUR,THB,100),is(4000.0000));

    }
}
