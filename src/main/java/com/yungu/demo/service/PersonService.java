package com.yungu.demo.service;

import com.yungu.demo.entity.Person;
import com.yungu.demo.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonService {

@Resource
  private PersonMapper personMapper;

           public List <Person> getList(){
            List<Person> list=personMapper.getList();
            return list;
           }

          public void addPerson(Person person){
               personMapper.addPerson(person);

          }
          public  Person GetPersonOne(Integer id){
               Person person=personMapper.getPersonOne(id);
               return person;
          }

          public void updatePerson(Person person){
               personMapper.updatePerson(person);
         }

         public void deletePersonById(Integer id){
               personMapper.deletePersonById(id);
         }

}
