package com.comaymanagement.cmd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comaymanagement.cmd.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {



}
