package com.yungu.demo.mapper;


import com.yungu.demo.entity.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {
    //查询所有信息
    @Select("select * from person")
    public List<Person> getList();

    //添加一条记录
    @Insert("insert into person(id,name,age) values (#{id},#{name},#{age})")
    public void addPerson(Person person);

    //查询单条记录
    @Select("select * from person where id=#{id}")
    public Person getPersonOne(Integer id);

    //修改一条记录
    @Update("update person set name=#{name},age=#{age} where id=#{id}")
    public void updatePerson(Person person);
    //删除一条记录
    @Delete("delete from person where id=#{id}")
    public void deletePersonById(Integer id);




}
