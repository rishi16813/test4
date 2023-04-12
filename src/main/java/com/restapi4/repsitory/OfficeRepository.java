package com.restapi4.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi4.entity.OfficeEntity;

@Repository
public interface OfficeRepository extends JpaRepository<OfficeEntity, Integer>{

}
