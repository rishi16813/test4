package com.restapi4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi4.entity.OfficeEntity;
import com.restapi4.repsitory.OfficeRepository;

@Service
public class OfficeServiceImpl implements OfficeService{
	@Autowired
	private OfficeRepository repo;

	@Override
	public List<OfficeEntity> getAllData() {
	List<OfficeEntity> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public OfficeEntity getById(int id) {
		Optional<OfficeEntity> findById = repo.findById(id);
		return findById.get();
	}

	@Override
	public int resister(OfficeEntity officeEntity) {
		OfficeEntity save = repo.save(officeEntity);
		if (save!=null) {
			return 1;
		}else {
			return 0;
		}
		
	}

	@Override
	public void deleteEntityById(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public OfficeEntity updateOffice(OfficeEntity officeEntity) {
		OfficeEntity save = repo.save(officeEntity);
		return save;
	}

	
	
	

}
