package com.pluralsight.cxfdemo.orders;

import static org.junit.Assert.*;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pluralsight.schema.order.ObjectFactory;
import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderInquiryType;
import com.pluralsight.service.orders.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test-beans.xml"})
public class DefaultOrdersEndpointTest {

	private Orders orderService;
	private OrderInquiryType orderInquiryType;
	
	@Autowired
	private JaxWsProxyFactoryBean testOrdersClient;
	
	@Before
	public void setup(){
		orderService = testOrdersClient.create(Orders.class);
		ObjectFactory factory = new ObjectFactory();
		orderInquiryType = factory.createOrderInquiryType();
		orderInquiryType.setAccountId(999);
		orderInquiryType.setEan13(1856956L);
		orderInquiryType.setOrderQuantity(4);
		orderInquiryType.setUniqueOrderId(12345);
	}
	
	@Test
	public void testProcessOrderPlacement() {
		OrderInquiryResponseType response = orderService.processOrderPlacement(orderInquiryType);
		assertTrue(response.getAccount().getAccountId() == 999);
	}

	@Test(expected=SOAPFaultException.class)
	public void testInvalidParameter(){
		orderService.processOrderPlacement(null);
	}
}
