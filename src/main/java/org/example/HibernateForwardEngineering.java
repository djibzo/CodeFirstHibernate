package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateForwardEngineering {
    public static void main(String[] args) {
        final StandardServiceRegistry registry=new StandardServiceRegistryBuilder()
                .configure("hybernate.cfg.xml").build();
        SessionFactory factory =new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction =session.beginTransaction();
        Specialiste specialiste=new Specialiste();
        Medecin medecin=new Medecin();
        medecin.setNom("SOW");
        medecin.setPrenom("LALLA");
        medecin.setGrade("GENERALISTE");
        medecin.setSalaire(30000000);
        session.save(medecin);
        specialiste.setName("OPHTALMOLOGUE");
        specialiste.setMedecin_id(medecin);
        session.save(specialiste);
        transaction.commit();
        session.close();
        factory.close();
    }
}
