package cn.itcast.cxf.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

import cn.itcast.cxf.domain.Car;
import cn.itcast.cxf.domain.User;

@WebService(targetNamespace = "http://server.com/")
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_MTOM_BINDING)
public interface IUserService {
	@WebMethod(action = "http://server.com/sayHello")
	public String sayHello(@WebParam(name="name") String name);

	@WebMethod(action = "http://server.com/findCarsByUser")
	public List<Car> findCarsByUser(User user);
}
