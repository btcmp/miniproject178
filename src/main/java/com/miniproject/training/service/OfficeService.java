package com.miniproject.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miniproject.training.dao.OfficeDao;
import com.miniproject.training.dao.RoomDao;
import com.miniproject.training.model.Office;
import com.miniproject.training.model.Room;

@Service
@Transactional
public class OfficeService {

	@Autowired
	OfficeDao officeDao;
	
	@Autowired
	RoomDao roomDao;
	
	public List<Office> getAllOffices() {
		// TODO Auto-generated method stub
		return officeDao.getAllOffices();
	}
	
	public void saveOffice(Office office) {
		List<Room> rooms = office.getRooms();
		officeDao.save(office);
		
		//java foreach
		for (Room room: rooms) {
			room.setOffice(office);
			roomDao.save(room);
		}
	}

	public Office getOfficeById(int id) {
		// TODO Auto-generated method stub
		return officeDao.getOfficeById(id);
	}

}
