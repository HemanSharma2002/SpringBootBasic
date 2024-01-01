package com.hemanProject.baseProject.service;

import com.hemanProject.baseProject.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);
   public List<Department> fetchDeparrtmentList();
   public Department fetchbyId(Long departmentId);
   public void deletedepartmentbyid(Long departmentid);
   public Department putById(Long departmentId,Department department);
   public Department fetchbyName(String Name);
}
