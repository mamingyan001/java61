package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * sessionfactory的工具类
 *
 */
public class HibernateUtils {

	private static SessionFactory factory;
	
	static{
		//1.加载配置文件
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.构建sessionfactory
		factory = cfg.buildSessionFactory();
	}
	
	public static Session getSession() {
		return factory.openSession();
	}
	
	/**
	 * 获取与当前线程绑定的session
	 */
	public static Session getCurrentSession() {
		return factory.getCurrentSession();
	}
	
	public static void main(String[] args) {
		HibernateUtils.getSession();
	}
	
}
