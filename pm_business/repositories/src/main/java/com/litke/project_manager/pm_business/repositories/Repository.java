package com.litke.project_manager.pm_business.repositories;

import java.util.List;

public interface Repository<T,D>{
    T create(D value);
    T update(D updatedValue) throws Exception;
    T deleteById(Long id);
    T getById(Long id);
    List<T> getAll();
}
