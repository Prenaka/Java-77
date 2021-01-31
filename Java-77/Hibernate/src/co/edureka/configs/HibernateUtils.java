package co.edureka.configs;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils 
{
 private static SessionFactory sfactory;
 
 public static SessionFactory getSessionFactory() {
	if(sfactory == null) { 
	 Configuration config = new Configuration();
 	 config.configure("co/edureka/configs/hibernate.cfg.xml");
 	 sfactory = config.buildSessionFactory();
	}
 	return sfactory;
 }
}
