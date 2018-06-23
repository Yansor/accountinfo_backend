package com.example.demo.repository;

import com.example.demo.entity.DigitalAccount;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DigitalAccountRepository extends JpaRepository<DigitalAccount , Integer> ,JpaSpecificationExecutor<DigitalAccount> {


}
