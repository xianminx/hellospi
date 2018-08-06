package rate.impl;

import rate.api.ExchangeRateProvider;
import rate.api.QuoteManager;

public class YahooFinanceExchangeRateProvider  implements ExchangeRateProvider {

    @Override
    public QuoteManager create() {
        return new YahooQuoteManagerImpl();
    }
}