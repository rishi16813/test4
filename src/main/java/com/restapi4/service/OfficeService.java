package com.restapi4.service;


import java.util.List;

import com.restapi4.entity.OfficeEntity;

public interface OfficeService {
	
	public List<OfficeEntity>getAllData();
	public OfficeEntity getById(int id);
	public int resister(OfficeEntity officeEntity);
	public OfficeEntity updateOffice(OfficeEntity officeEntity);
	public void deleteEntityById(int id);
	

}
