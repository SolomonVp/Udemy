package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5_2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        // удаление работника по Id
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee " +
                    "where name = 'Alexandr'").executeUpdate();

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            factory.close();                                                                          // закрываем транзакцию
        }
    }
}
