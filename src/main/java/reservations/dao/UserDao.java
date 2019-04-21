package reservations.dao;

import reservations.entity.User;
import javax.persistence.EntityManager;

public class UserDao extends AbstractDao<User> {
    public UserDao(EntityManager em) {
        super (em, User.class);
    }
}