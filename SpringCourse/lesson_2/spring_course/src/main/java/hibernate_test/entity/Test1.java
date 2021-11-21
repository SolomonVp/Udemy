package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()                                                   //создаем SessionFactory
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();                                                 // получаем из SessionFactory сессию

        try {
            Employee emp = new Employee("Alexandr", "Iv.", "IT", 600);     // создаем объект
            session.beginTransaction();                                                               // начинаем транзакцию с БД
            session.save(emp);                                                                        // сохраняем объект в БД с помощью save, а hibernate производит insert за кулисами
            session.getTransaction().commit();                                                        // закрываем транзакцию

            System.out.println("Done!");
            System.out.println(emp);
        } finally {
            factory.close();                                                                          // закрываем транзакцию
        }
    }
}
