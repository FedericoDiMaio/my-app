package it.dipartimentale.myapp.service.common;


import it.dipartimentale.myapp.model.pojo.CrudPojoAb;
import it.dipartimentale.myapp.repository.IRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 * @author : f.dimaio
 * @date : 13/12/2022
 * @Project : my-app
 */
public abstract class AbstractCrudService <T extends CrudPojoAb,Repository extends IRepository<T, String>> implements CRUDService<T> {

    private Repository repository;

    protected AbstractCrudService(Repository repository) {
        this.repository = repository;

    }

    @Override
    public T insert(T Entity) {
        return this.insert(Entity);
    }


}
