package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

//    @Bean
//    CommandLineRunner lookup(QuoteClient quoteClient) {
//        return args -> {
//            String ticker = "Spain";
//
//            if (args.length > 0) {
//                ticker = args[0];
//            }
//            GetCountryResponse response = quoteClient.getQuote(ticker);
//            System.err.println(response.getCountry());
//        };
//    }

}