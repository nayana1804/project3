package basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testbike {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("ioc1.xml");
	bike b=(bike) ac.getBean("bike");
	b.price();
}

}
