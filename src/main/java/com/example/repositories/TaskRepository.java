package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
