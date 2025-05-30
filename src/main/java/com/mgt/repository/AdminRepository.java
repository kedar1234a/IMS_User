package com.mgt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgt.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}