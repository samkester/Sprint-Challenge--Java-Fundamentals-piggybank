package lambda.work.piggybank.repositories;

import lambda.work.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long> {
}
