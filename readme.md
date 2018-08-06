
Java Service Provider Interface demo project. 


See http://www.baeldung.com/java-spi & https://github.com/eugenp/tutorials/tree/master/java-spi


## Structure



```

➜  hellospi tree -L 1
.
├── build
├── build.gradle
├── exchange-rate-api  ........................... (API Declaration )
├── exchange-rate-app  ........................... (API consumer / client )
├── exchange-rate-impl ........................... (API implementation )
├── gradle
├── gradlew
├── gradlew.bat
├── readme.md
├── repos
├── settings.gradle
└── src

```

## DEV & Compile


```sh
➜  hellospi ./gradlew clean jar

BUILD SUCCESSFUL in 0s
12 actionable tasks: 12 executed
➜  hellospi ./gradlew clean jar
➜  hellospi java -cp exchange-rate-api/build/libs/exchange-rate-api-1.0-SNAPSHOT.jar:./exchange-rate-app/build/libs/exchange-rate-app-1.0-SNAPSHOT.jar:./exchange-rate-impl/build/libs/exchange-rate-impl-1.0-SNAPSHOT.jar ExchangeRate
hello, spi
refresh providers
find one 
rate.impl.YahooFinanceExchangeRateProvider
➜  hellospi 


```