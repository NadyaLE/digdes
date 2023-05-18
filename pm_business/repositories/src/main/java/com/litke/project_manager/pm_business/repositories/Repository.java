package com.litke.project_manager.pm_business.repositories;

import java.util.List;

public interface Repository<T>{
    T create(T value);
    T update(T updatedValue) throws Exception;
    T deleteById(Long id);
    T getById(Long id);
    List<T> getAll();
}
