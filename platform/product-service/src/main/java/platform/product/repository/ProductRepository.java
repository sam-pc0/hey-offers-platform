package platform.product.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import platform.product.entity.ProductEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author sam-pc
 */
@Repository
public class ProductRepository implements MongoRepository<ProductEntity, String> {
    @Override
    public <S extends ProductEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ProductEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ProductEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<ProductEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ProductEntity> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(ProductEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends ProductEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ProductEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ProductEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ProductEntity> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends ProductEntity> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends ProductEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ProductEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ProductEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ProductEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ProductEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ProductEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ProductEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
