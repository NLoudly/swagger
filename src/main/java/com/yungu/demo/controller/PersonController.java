package com.yungu.demo.controller;

import com.yungu.demo.entity.Employee;
import com.yungu.demo.entity.Person;
import com.yungu.demo.service.EmployeeService;
import com.yungu.demo.service.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@Api(value = "简单test",description ="swagger测试" )
@RestController
public class PersonController {
    @Resource
    private PersonService personService;
    @Resource
    private EmployeeService employeeService;

    //personList
    @ApiOperation("查询全部记录")
    @RequestMapping(value = "/personList",method = RequestMethod.GET)
    public List<Person> getList(){
        List<Person> list = this.personService.getList();
        return list;
    }
    @ApiOperation("添加一条记录")
    @RequestMapping(value = "/addPerson",method = RequestMethod.POST)
    public String addPerson(@ModelAttribute Person person){
        Person p = new Person();
        p.setId(person.getId());
        p.setName(person.getName());
        p.setAge(person.getAge());
        this.personService.addPerson(p);
        return "success";
    }

    @ApiOperation("根据ID查询")
    @RequestMapping(value = "/getPersonOne/{id}",method = RequestMethod.GET)
    public Person getPersonOne(@ApiParam("ID")@PathVariable Integer id){
        Person person = this.personService.GetPersonOne(id);
        return person;
    }

    @ApiOperation("根据ID修改记录")
    @RequestMapping(value = "/updatePerson/{id}",method = RequestMethod.PUT)
    public String updatePerson(@ApiParam("被修改的ID")@PathVariable Integer id,@RequestBody Person person){
        Person p = new Person();
        p.setId(id);
        p.setName(person.getName());
        p.setAge(person.getAge());
        this.personService.updatePerson(p);
        return "success";
    }

    @ApiOperation("根据ID删除记录")
    @RequestMapping(value = "/deletePerson/{id}",method = RequestMethod.DELETE)
    public String deletePersonById(@ApiParam("被删除的ID")@PathVariable Integer id){
        this.personService.deletePersonById(id);
        return "success";
    }

    @ApiOperation("根据ID查询指定记录(多表)")
    @RequestMapping(value = "/EmployeeList",method = RequestMethod.GET)
    public List<Employee> getList2(@ApiParam("ID")@PathVariable Integer id){

        List<Employee> list=this.employeeService.getlist(id);
        return list;
    }
}
