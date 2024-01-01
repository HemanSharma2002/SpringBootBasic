package com.hemanProject.baseProject.controler;

import com.hemanProject.baseProject.entity.Department;
import com.hemanProject.baseProject.repositry.DepartmentRepositroy;
import com.hemanProject.baseProject.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@RestController
class Departmentcontroler {
    @Autowired
    private DepartmentService departmentService;
    private final Logger logger= LoggerFactory.getLogger(Departmentcontroler.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("Inside saveDepartment of departmentcontroler");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDeparrtmentList();

    }
    @GetMapping("/departments/{Id}")
    public Department fetchbyId(@PathVariable("Id") Long departmentId){
        return  departmentService.fetchbyId(departmentId);
    }
    @DeleteMapping("/departments/{Id}")
    public String deletebyid(@PathVariable("Id") Long departmentId){
        departmentService.deletedepartmentbyid(departmentId);
        return "Department had been deleted";
    }
    @PutMapping("/departments/{Id}")
    public Department putById(@PathVariable("Id") Long departmentId,@RequestBody Department department){
        return departmentService.putById(departmentId,department);
    }
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String Name){
        return departmentService.fetchbyName(Name);
    }
}
