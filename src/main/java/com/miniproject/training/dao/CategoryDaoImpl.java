package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.SessionCookieConfig;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(Category category) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(category);
	}

	public List<Category> getAllCategorys() {
		// TODO Auto-generated method stub
		String hql = "from Category c where c.active = '1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Category> categorys = query.list();
		if (!categorys.isEmpty()) {
			return categorys;
		}
		return new ArrayList();
	}

	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		String hql = "from Category o where o.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<Category> Categorys = query.list();
		if (!Categorys.isEmpty()) {
			return Categorys.get(0);
		}
		return new Category();
	}

	public void update(Category Category) {
		String hql = "update Category c set c.code = :code, c.name = :name, c.description = :desc where c.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("code", Category.getCode());
		query.setParameter("name", Category.getName());
		query.setParameter("desc", Category.getDescription());
		session.update(Category);
	}

	public List<Category> searchByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Category c where c.active = '1' and lower(c.name) like lower('%"+name+"%') or lower(c.code) like lower('%"+name+"%')";
		Session session = sessionFactory.getCurrentSession();
		List<Category> categorys = session.createQuery(hql).list();
		return categorys;
	}

	public void deactiveCategory(Long id) {
		// TODO Auto-generated method stub
		String hql ="update Category c set c.active ='0' where c.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

}
