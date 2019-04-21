package reservations.dao;

import reservations.entity.Reservation;
import javax.persistence.EntityManager;

public class ReservationDao extends AbstractDao<Reservation>{
    public ReservationDao(EntityManager em) {
        super(em, Reservation.class);
    }
}