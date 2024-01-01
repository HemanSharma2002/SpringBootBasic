package com.hemanProject.baseProject.repositry;

import com.hemanProject.baseProject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepositroy extends JpaRepository<Department,Long> {
    public Department findBydepartmentName( String Name);
    public Department findByDepartmentNameIgnoreCase(String Name);
}
