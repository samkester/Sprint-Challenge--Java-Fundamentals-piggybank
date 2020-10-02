package lambda.work.piggybank.repositories;

import lambda.work.piggybank.models.CoinModel;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<CoinModel, Long> {
}
