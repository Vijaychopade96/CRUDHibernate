package util;

import model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertProduct {
    public static void main(String[] args) {

        Configuration cfg;
        SessionFactory factory;
        Session  ses = null;
        Transaction tx;

        cfg=new Configuration().configure().addAnnotatedClass(Process.class);
        factory=cfg.buildSessionFactory();
        ses=factory.openSession();

        Product p1=new Product();
       p1.setProductId(1);
       p1.setProductName("Tv");
       p1.setProductPrice(2000.00);


        tx=ses.beginTransaction();
        ses.save(p1);

        tx.commit();
        System.out.println("Product Added SuccessFully");



    }
}
