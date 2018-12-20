package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil
{
	private static SessionFactory factory;
	public synchronized static SessionFactory getSessionfactory()
	{
		if(factory==null)
		{
			Configuration conf= new Configuration();
			conf.configure("com/cwt/config/user.cfg.xml");
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
			ServiceRegistry registry=new  StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
			factory=conf.buildSessionFactory(registry);
		}
		return factory;
	}

}
