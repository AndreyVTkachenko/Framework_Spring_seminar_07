package ru.gb.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;

@NoRepositoryBean
public interface ReadOnlyRepository<T, ID> extends Repository<T, ID> {

    List<T> findAllById(ID id);

    List<T> findAll();

}
