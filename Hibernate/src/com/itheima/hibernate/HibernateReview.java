package com.itheima.hibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.entity.LinkMan;

import antlr.collections.impl.LList;
import utils.HibernateUtils;

public class HibernateReview {
	
	@Test
	public void hibernateFirst(){
				Session session = HibernateUtils.getSession();
				Transaction tx = session.beginTransaction();
				Query query = session.createQuery("from LinkMan");
				@SuppressWarnings("rawtypes")
				List list = query.list();
				System.out.println(list);
				tx.commit();
				session.close();
	}
}
