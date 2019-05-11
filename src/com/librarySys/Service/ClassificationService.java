package com.librarySys.Service;

import java.util.List;

import com.librarySys.model.Classification;

public interface ClassificationService {
	
	public abstract Classification  addClassification(Classification  classification);
	public abstract Integer deleteClassification(Integer classification );
	public abstract Classification updateClassification (Integer classificationId, Classification classification );
	public abstract Classification fetchClassificationById(Integer classificationId);
	public abstract List<Classification> fetchClassificationList();
	

}
