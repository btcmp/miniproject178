package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.User;
import com.miniproject.training.model.Version;
import com.miniproject.training.model.VersionDetail;

@Repository
public class VersionDetailDaoImpl implements VersionDetailDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	HttpSession httpSession;

	public void save(VersionDetail versionDetail) {
		// TODO Auto-generated method stub
		User user = (User) httpSession.getAttribute("application-user");
		versionDetail.setCreatedBy(user.getId());
		Session session = sessionFactory.getCurrentSession();
		session.save(versionDetail);
	}

	public List<VersionDetail> getVersionDetailByVersion(Version ver) {
		// TODO Auto-generated method stub
		String hql = "from VersionDetail vd where vd.version.id = :ver";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("ver", ver.getId());
		List<VersionDetail> versionDetails = query.list();
		if (!versionDetails.isEmpty()) {
			return versionDetails;
		}
		return new ArrayList();
	}
	
}