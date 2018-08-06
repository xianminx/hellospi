import rate.api.ExchangeRateProvider;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ExchangeRate {
    ServiceLoader<ExchangeRateProvider> loader = ServiceLoader
            .load(ExchangeRateProvider.class);

    public Iterator<ExchangeRateProvider> providers(boolean refresh) {
        System.out.println("refresh providers");

        if (refresh) {
            loader.reload();
        }
        return loader.iterator();
    }

    public static void main(String[] args) {
        System.out.println("hello, spi");
        ExchangeRate exchangeRate = new ExchangeRate();
        Iterator<ExchangeRateProvider> iterator = exchangeRate.providers(true);

        while (iterator.hasNext()) {
            System.out.println("find one ");
            ExchangeRateProvider provider = iterator.next();
            System.out.println(provider.getClass().getCanonicalName());
        }
    }
}
