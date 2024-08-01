package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    List<Department> list;

    public DepartmentService() {
        List<Department> list = new ArrayList<>();
        list.add(Department.builder().departmentId(1L).departmentName("departmentName1").departmentAddress("departmentAddress1").departmentCode("departmentCode1").build());
        list.add(Department.builder().departmentId(2L).departmentName("departmentName2").departmentAddress("departmentAddress2").departmentCode("departmentCode2").build());
        list.add(Department.builder().departmentId(3L).departmentName("departmentName3").departmentAddress("departmentAddress3").departmentCode("departmentCode3").build());
        list.add(Department.builder().departmentId(4L).departmentName("departmentName4").departmentAddress("departmentAddress4").departmentCode("departmentCode4").build());
        list.add(Department.builder().departmentId(5L).departmentName("departmentName5").departmentAddress("departmentAddress5").departmentCode("departmentCode5").build());
        list.add(Department.builder().departmentId(6L).departmentName("departmentName6").departmentAddress("departmentAddress6").departmentCode("departmentCode6").build());
        list.add(Department.builder().departmentId(7L).departmentName("departmentName7").departmentAddress("departmentAddress7").departmentCode("departmentCode7").build());
        list.add(Department.builder().departmentId(8L).departmentName("departmentName8").departmentAddress("departmentAddress8").departmentCode("departmentCode8").build());
        list.add(Department.builder().departmentId(9L).departmentName("departmentName9").departmentAddress("departmentAddress9").departmentCode("departmentCode9").build());
        list.add(Department.builder().departmentId(10L).departmentName("departmentName10").departmentAddress("departmentAddress10").departmentCode("departmentCode10").build());
        this.list = list;
    }

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DepartmentService");
        //departmentRepository.saveAll(list);
        log.info("Created 10 department entries Inside findDepartmentById of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
