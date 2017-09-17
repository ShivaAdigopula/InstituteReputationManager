package com.manager.reputation.institute.publisher.controller;

import com.manager.reputation.institute.publisher.dao.Department;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @RequestMapping(value = "/{instituteId}",method = RequestMethod.POST)
    public void add(@RequestBody Department department){

    }
    @RequestMapping(method = RequestMethod.GET)
    public void get(){

    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public void get(@PathVariable String id){

    }

    @RequestMapping(value="/{instituteId}/{id}",method = RequestMethod.GET)
    public void get(@PathVariable String instituteId,@PathVariable String id){

    }
    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody Department department){

    }

    @RequestMapping(value="/{instituteId}/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable String instituteId,@PathVariable String id){

    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){

    }

}
