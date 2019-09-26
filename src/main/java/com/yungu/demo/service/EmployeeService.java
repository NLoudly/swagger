package com.yungu.demo.service;

import com.yungu.demo.entity.Employee;
import com.yungu.demo.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;
    public List<Employee> getlist(Integer id){
        List<Employee>  list=employeeMapper.getlist(id);
        return  list;
    }


}
