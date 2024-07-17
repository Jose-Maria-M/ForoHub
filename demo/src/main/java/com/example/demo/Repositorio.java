package com.example.demo;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Repositorio extends JpaRepository<Clasetopico, Long> {
    Clasetopico findByTitleAndMessage(String title, String message);

    @Override
    public void flush() {

    }

    @Override
    public <S extends Clasetopico> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Clasetopico> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Clasetopico> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Clasetopico getOne(Long aLong) {
        return null;
    }

    @Override
    public Clasetopico getById(Long aLong) {
        return null;
    }

    @Override
    public Clasetopico getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Clasetopico> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Clasetopico> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Clasetopico> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Clasetopico> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Clasetopico> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Clasetopico> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Clasetopico, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Clasetopico> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Clasetopico> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Clasetopico> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Clasetopico> findAll() {
        return List.of();
    }

    @Override
    public List<Clasetopico> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Clasetopico entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Clasetopico> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Clasetopico> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Clasetopico> findAll(Pageable pageable) {
        return null;
    }
}