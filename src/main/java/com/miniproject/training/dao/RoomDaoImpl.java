package com.miniproject.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.training.model.Office;
import com.miniproject.training.model.Room;

@Repository
public class RoomDaoImpl implements RoomDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public void save(Room room) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(room);
	}
	
	public void delete(long id) {
		// TODO Auto-generated method stub
		String hql = "delete Room r where r.office.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public void update(Room room) {
		// TODO Auto-generated method stub
		String hql = "update Room r set r.code = :code, r.name = :name, r.capacity = :capacity, r.active = :active, r.any_projector = :radio, r.notes = :desc where r.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", room.getId());
		query.setParameter("code", room.getCode());
		query.setParameter("name", room.getName());
		query.setParameter("capacity", room.getCapacity());
		query.setParameter("radio", room.getAny_projector());
		query.setParameter("desc", room.getNotes());
		query.setParameter("active", room.getActive());
		query.executeUpdate();
	}

	public void deactiveRoom() {
		// TODO Auto-generated method stub
		String hql = "update Room r set r.active = '0'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.executeUpdate();
	}

	public List<Room> getActivateRoomsByOfficeId(Office office) {
		// TODO Auto-generated method stub
		String hql = "from Room r where r.active='1'";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		List<Room> listRoom = query.list();
		if(listRoom.isEmpty()) {
			return new ArrayList();
		}
		return  listRoom;
	}

	public void deactiveRoom(Long id) {
		// TODO Auto-generated method stub
		String hql = "update Room r set r.active = '0' where r.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public List<Room> getRoomByOfficeId(Office office) {
		// TODO Auto-generated method stub
		String hql = "from Room r where r.office.id = :id";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("id", office.getId());
		List<Room> listRoom = query.list();
		if(listRoom.isEmpty()) {
			return new ArrayList();
		}
		return  listRoom;
	}

}
