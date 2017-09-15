package com.manager.reputation.institute.publisher.services;

import com.manager.reputation.institute.publisher.dao.Institute;

import java.util.List;

/**
 * Created by adigopuv on 9/15/17.
 */
public interface InstituteService {
    Institute save(Institute institute);

    boolean delete(String id);

    List<Institute> get();

    Institute get(String id);

}
