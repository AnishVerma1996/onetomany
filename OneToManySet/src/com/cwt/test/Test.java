package com.cwt.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cwt.entity.Pane;
import com.cwt.entity.PaneDetails;
import com.sathya.util.HibernateUtil;

public class Test 
{
	public static void main(String[] args)
	{
		 Session session = HibernateUtil.getSessionfactory().openSession();
		 Transaction
		  tx= (Transaction) session.beginTransaction();
	 
	        Pane pane=new Pane();
	        
	        pane.setPaneId("");
	        pane.setRegion("Y");
	       
	        
	        Set<PaneDetails> detailsset=new HashSet<PaneDetails>();
	        PaneDetails paneDetails1=new PaneDetails();
	        paneDetails1.setRegion("ynn");
	        
	        paneDetails1.setAxis("my axies");
	        paneDetails1.setSection("A");
	        detailsset.add(paneDetails1);
	        
	        
	        pane.setDetails(detailsset);
	        
	        
	        
	        Long saveId =(Long)session.save(pane);
	        
	        System.out.println("-------------------"+saveId);
	        
	        pane.setPaneId("sse000"+saveId);
	        
	        
	        session.merge(pane);
	        
	        
	        tx.commit();
	        
	        
	       
	}
	
	

}
