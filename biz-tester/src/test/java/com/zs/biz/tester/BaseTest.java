package com.zs.biz.tester;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional(transactionManager="txManager",rollbackFor=RuntimeException.class,readOnly=true)
@ContextConfiguration(locations="{"
+ "classpath:applicationContext.xml,"
+ "classpath*:applicationContext-*.xml,"
+ "classpath*:beans/*-bean.xml}"
)
public abstract class BaseTest {
	
	public void test(){};

}
