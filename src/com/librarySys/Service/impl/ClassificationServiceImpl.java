package com.librarySys.Service.impl;

import java.util.List;

import com.librarySys.Service.ClassificationService;
import com.librarySys.davo.ClassificationDAO;
import com.librarySys.model.Classification;

public class ClassificationServiceImpl implements ClassificationService{
	
	private ClassificationDAO classificationDAO;

	public ClassificationDAO getClassificationDAO() {
		return classificationDAO;
	}

	public void setClassificationDAO(ClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	public Classification addClassification(Classification classification) {
		
		return classificationDAO.createClassification(classification);
	}

	@Override
	public Integer deleteClassification(Integer classification) {
		
		return null;
	}

	@Override
	public Classification updateClassification(Integer classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification fetchClassificationById(Integer classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classification> fetchClassificationList() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
