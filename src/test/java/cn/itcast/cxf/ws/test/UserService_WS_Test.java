package cn.itcast.cxf.ws.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.cxf.domain.User;
import cn.itcast.cxf.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
public class UserService_WS_Test {
	@Autowired
	@Qualifier("userServiceClient")
	private IUserService userService;

	@Test
	public void testCall() {
		System.out.println(userService.sayHello("传智播客"));
		User user = new User();
		user.setUsername("xiaoming");
		System.out.println(userService.findCarsByUser(user));
	}

}
