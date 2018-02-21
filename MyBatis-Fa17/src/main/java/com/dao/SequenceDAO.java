package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import com.domain.Sequence;
import com.util.ConnectionFactory;

public class SequenceDAO {
	private SqlSession session;
	public SequenceDAO() {
		//set the connection in the constructor
		this.session =ConnectionFactory.getSqlSessionFactory().openSession();
	}
   
	public Short nextRestaurant(){
		 List<Sequence> recordList = new ArrayList<Sequence>();
		 try {
			 recordList=session.selectList("com.mapper.SequenceMapper.nextRestaurant");
				} finally {
				  session.close();
				}		 
		 return recordList.get(0).getSequencenumber();
	 };

		public Short nextOrder(){
			 List<Sequence> recordList = new ArrayList<Sequence>();
			 try {
				 recordList=session.selectList("com.mapper.SequenceMapper.nextOrder");
					} finally {
					  session.close();
					}		 
			 return recordList.get(0).getSequencenumber();
		 };
		 
			public Short nextReview(){
				 List<Sequence> recordList = new ArrayList<Sequence>();
				 try {
					 recordList=session.selectList("com.mapper.SequenceMapper.nextReview");
						} finally {
						  session.close();
						}		 
				 return recordList.get(0).getSequencenumber();
			 };

}
