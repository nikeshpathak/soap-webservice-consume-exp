package hello;

import hello.wsdl.GetCountryRequest;
import hello.wsdl.GetCountryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class QuoteClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(QuoteClient.class);

    public GetCountryResponse getQuote(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        log.info("Requesting quote for " + country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws",
                        request,
                        new SoapActionCallback("http://spring.io/guides/gs-producing-web-service/CountriesPort/getCountryRequest"));

        return response;
    }

}
