package lambda.work.piggybank.controllers;

import lambda.work.piggybank.models.Coin;
import lambda.work.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoinController {
    @Autowired
    CoinRepository coinRepository;

    // http://localhost:2019/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> getTotal()
    {
        List<Coin> coins = new ArrayList<>();
        double total = 0;

        coinRepository.findAll().iterator().forEachRemaining(coins::add);

        for(Coin coin : coins)
        {
            System.out.println(coin);
            total += coin.getValueTotal();
        }

        System.out.println("The piggy bank holds " + total);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
