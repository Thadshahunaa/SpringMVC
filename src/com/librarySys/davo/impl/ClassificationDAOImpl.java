package com.librarySys.davo.impl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import com.librarySys.davo.ClassificationDAO;
import com.librarySys.model.Classification;


public class ClassificationDAOImpl  implements ClassificationDAO{
	
	private DataSource dataSource ;
	
	

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Classification createClassification(Classification classification) {
		Connection conn =null;
		PreparedStatement ps=null;
		
		
		
		try {
			conn=dataSource.getConnection();
			String SQL="INSERT INTO classification(classification_id,classification_name)VALUES(?,?)";
		   ps=conn.prepareStatement(SQL);
		   ps.setInt(1,classification.getClassificationId());
		   ps.setString(1, classification.getClassificationName());
		   
		   if (ps.executeUpdate()>0) {
			  System.out.println("inserted");
		   }
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer deleteClassification(Integer classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification updateClassification(Integer classificationId, Classification classification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classification getClassificationById(Integer classificationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Classification> getClassificationList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
