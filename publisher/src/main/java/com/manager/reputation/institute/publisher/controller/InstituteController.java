package com.manager.reputation.institute.publisher.controller;

import com.manager.reputation.institute.publisher.dao.Institute;
import com.manager.reputation.institute.publisher.services.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/institute")
public class InstituteController {

    @Autowired
    InstituteService instituteService;

    @RequestMapping(method = RequestMethod.POST)
    public Institute add(@RequestBody Institute institute){
        return instituteService.save(institute);

    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Institute> get(){
        return instituteService.get();

    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Institute get(@PathVariable String id){
        return instituteService.get(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Institute update(@RequestBody Institute institute){
        return instituteService.save(institute);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable String id){
        instituteService.delete(id);
    }


}
