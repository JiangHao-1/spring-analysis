package com.analysis.bean.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

class MyTestBeanTest {

	@Test
	void testSimpleLoad() {
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("bean/BeanFactoryTest.xml"));
		System.setProperty("spring", "classpath");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("${spring}:bean/BeanFactoryTest.xml");
//		MyTestBean bean = (MyTestBean) context.getBean("myTestBean");
		MyTestBean bean =  context.getBean(MyTestBean.class);
		context.close();
		System.out.println("-----------:" + bean.getTestStr());
		assertThat(bean.getTestStr()).isEqualTo("testStr");

	}
}