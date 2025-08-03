package com.caiohudak.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiohudak.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{



}
