package com.miniproject.training.dao;


import java.math.BigInteger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GeneratedVersionDaoImpl implements GeneratedVersionDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public Long nextVersion() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select versionSequence2.nextVal as num from dual").addScalar("num", StandardBasicTypes.BIG_INTEGER);
		return ((BigInteger) query.uniqueResult()).longValue();
	}
	
	public Long nextCat() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select versionSequence2.nextVal as num from dual").addScalar("num", StandardBasicTypes.BIG_INTEGER);
		return ((BigInteger) query.uniqueResult()).longValue();
	}

}
