package com.analysis.bean.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import static org.assertj.core.api.Assertions.assertThat;

class MyTestBeanTest {

	@Test
	void testSimpleLoad() {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("bean/BeanFactoryTest.xml"));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean/BeanFactoryTest.xml");
		MyTestBean bean = (MyTestBean) context.getBean("myTestBean");
		assertThat(bean.getTestStr()).isEqualTo("testStr");
	}
}