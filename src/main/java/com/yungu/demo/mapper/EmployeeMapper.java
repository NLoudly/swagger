package com.yungu.demo.mapper;

import com.yungu.demo.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    //进行多表联查
    @Select("SELECT * FROM company c,emp e WHERE c.id = e.comid AND e.id=#{e.id}")
    public List<Employee> getlist(Integer id);

}
