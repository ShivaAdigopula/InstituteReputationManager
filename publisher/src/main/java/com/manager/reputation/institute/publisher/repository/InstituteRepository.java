package com.manager.reputation.institute.publisher.repository;

import com.manager.reputation.institute.publisher.dao.Institute;
import com.manager.reputation.institute.publisher.services.InstituteService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by adigopuv on 9/15/17.
 */
@Repository
@Transactional
public interface InstituteRepository extends CrudRepository<Institute,String> {

}
