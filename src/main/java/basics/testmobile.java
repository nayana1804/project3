package basics;

import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class testmobile {
	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("ioc1.xml");
//		BeanFactory b=new XmlBeanFactory(resource);
//		mobile m=(mobile) b.getBean("mymobile");
//		m.musicplayer();
//		
		ApplicationContext c=new ClassPathXmlApplicationContext("ioc1.xml");
		mobile m=(mobile) c.getBean("mymobile");
		m.musicplayer();
	}

}
