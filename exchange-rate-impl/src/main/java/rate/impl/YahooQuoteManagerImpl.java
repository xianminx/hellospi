package rate.impl;

import rate.api.Quote;
import rate.api.QuoteManager;

import java.time.LocalDate;
import java.util.List;

public class YahooQuoteManagerImpl implements QuoteManager {


    @Override
    public List<Quote> getQuotes(String baseCurrency, LocalDate date) {
        return null;
    }
}