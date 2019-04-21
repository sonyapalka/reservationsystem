package reservations.dao;

import reservations.entity.Room;
import javax.persistence.EntityManager;

public class RoomDao extends AbstractDao<Room> {
    public RoomDao(EntityManager em) {
        super (em, Room.class);
    }
}
