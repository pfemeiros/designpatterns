package br.com.pfemeiros.designpatterns.builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/builder")
public class BuilderController {

    @GetMapping
    public void testBuilder() {
        CreditCard creditCard = new CreditCard.Builder(123L)
                .withBrand("Visa")
                .withLimit(100000.0)
                .build();
        System.out.println(creditCard);
        CreditCard creditCard1 = new CreditCard.Builder(456L)
                .withBrand("Elo")
                .build();
        System.out.println(creditCard1);
    }

}
