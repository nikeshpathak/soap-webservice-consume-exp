package hello;

import hello.wsdl.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/{code}")
public class CountryCtrl {

    @Autowired
    QuoteClient quoteClient;

    @GetMapping
    public GetCountryResponse getMessage(@PathVariable("code")String code)
    {
        GetCountryResponse response = quoteClient.getQuote(code);
        return response;
    }
}
