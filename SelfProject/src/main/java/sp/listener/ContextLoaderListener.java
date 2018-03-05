package sp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextLoaderListener implements ServletContextListener{
	static ClassPathXmlApplicationContext applicationContext;
	
	public static ClassPathXmlApplicationContext getApplicationContext() {
		return applicationContext;
	}
 
	@Override
	public void contextInitialized(ServletContextEvent event) {
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
