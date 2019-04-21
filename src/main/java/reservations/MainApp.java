package reservations;

import javax.persistence.*;

public class MainApp {
    public static void main(String[] args) {

        EntityManager entityManager = HibernateUtil.getEntityManager();

    }

    public static class HibernateUtil {

        // Configuration from file resources/META-INF/persistence.xml
        private static EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("persistenceUnit-h2");

        private static EntityManager entityManager;

        private HibernateUtil() {
        }

        public static EntityManager getEntityManager() {
            if (entityManager == null) {
                entityManager = emf.createEntityManager();
            }
            return entityManager;
        }

        public static void closeEntityManager() {
            entityManager.close();
            emf.close();
        }
    }
}
