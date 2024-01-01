package com.hemanProject.baseProject.service;

import com.hemanProject.baseProject.entity.Department;
import com.hemanProject.baseProject.repositry.DepartmentRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class DepartmentServiceImplimentation implements DepartmentService {
    @Override
    public Department fetchbyId(Long departmentId) {
        return departmentRepositroy.findById(departmentId).get();
    }

    @Override
    public Department putById(Long departmentId, Department department) {
        Department dp=departmentRepositroy.findById(departmentId).get();
        if(Objects.nonNull(department.getDepartmentName())&& !"".equalsIgnoreCase(department.getDepartmentName())){
            dp.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())&& !"".equalsIgnoreCase(department.getDepartmentCode())){
            dp.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmenAddress())&& !"".equalsIgnoreCase(department.getDepartmenAddress())){
        }
        return departmentRepositroy.save(dp);
    }

    @Autowired
    private DepartmentRepositroy departmentRepositroy;

    @Override
    public Department fetchbyName(String Name) {
        return departmentRepositroy.findByDepartmentNameIgnoreCase(Name);
    }

    @Override
    public void deletedepartmentbyid(Long departmentid) {
        departmentRepositroy.deleteById(departmentid);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepositroy.save(department);
    }

    @Override
    public List<Department> fetchDeparrtmentList() {
        return departmentRepositroy.findAll();
    }

}
