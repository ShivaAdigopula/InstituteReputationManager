package com.manager.reputation.institute.publisher.services;

import com.manager.reputation.institute.publisher.dao.Institute;
import com.manager.reputation.institute.publisher.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adigopuv on 9/15/17.
 */
@Service("instituteService")
public class InstituteServiceImpl implements InstituteService {

    @Autowired
    InstituteRepository instituteRepository;

    @Override
    public Institute save(Institute institute) {
        return instituteRepository.save(institute);
    }

    @Override
    public boolean delete(String id) {
        instituteRepository.delete(id);
        return true;
    }

    @Override
    public List<Institute> get() {
        List<Institute> institutes = new ArrayList<Institute>();
        instituteRepository.findAll().forEach(institutes::add);
        return institutes;
    }

    @Override
    public Institute get(String id) {
        return instituteRepository.findOne(id);
    }


}
