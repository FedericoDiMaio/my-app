package it.dipartimentale.myapp.repository.commonRepository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author : Federico Di Maio
 * @date : 22/12/2022
 * @Project : tesi
 */
@NoRepositoryBean
public interface IRepository<K, S> extends MongoRepository<K, S> {
}
