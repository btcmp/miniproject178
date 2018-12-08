package com.miniproject.training.dao;

import java.util.List;

import com.miniproject.training.model.Office;
import com.miniproject.training.model.Room;

public interface RoomDao {

	void save(Room room);

	void update(Room room);

	void delete(long id);

	void deactiveRoom();

	List<Room> getActivateRoomsByOfficeId(Office office);

	void deactiveRoom(Long id);

	List<Room> getRoomByOfficeId(Office office);

}
