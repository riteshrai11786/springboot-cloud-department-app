package com.ritesh.techexamples.department.service;

import com.ritesh.techexamples.department.entity.Department;
import com.ritesh.techexamples.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findByDepartmentId method of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }

    public List<Department> findAll() {
        log.info("Inside findAll method of DepartmentService");
        return departmentRepository.findAll();
    }
}
