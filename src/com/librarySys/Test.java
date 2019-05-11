package com.librarySys;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.librarySys.Service.ClassificationService;
import com.librarySys.Service.impl.ClassificationServiceImpl;
import com.librarySys.model.Classification;

public class Test {

	public static void main(String arg[]) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");

		ClassificationService classificationService = context.getBean("classifictionService",
				ClassificationServiceImpl.class);

		Classification classification = new Classification();
		classification.setClassificationId(1);
		classification.setClassificationName("maths");
		classificationService.addClassification(classification);
		
		System.out.print(classification.getClassificationId());
		System.out.print(classification.getClassificationName());
		

	}

}
