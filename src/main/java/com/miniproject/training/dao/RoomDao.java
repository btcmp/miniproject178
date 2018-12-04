package com.miniproject.training.dao;

import com.miniproject.training.model.Room;

public interface RoomDao {

	void save(Room room);

	void update(Room room);

	void delete(long id);

}
