package com.pluralsight.cxfdemo.orders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.pluralsight.schema.order.AccountType;
import com.pluralsight.schema.order.BookType;
import com.pluralsight.schema.order.ObjectFactory;
import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderItemType;
import com.pluralsight.schema.order.OrderStatusType;
import com.pluralsight.schema.order.OrderType;

@Service
public class DefaultOrderService implements OrderService{

	@Override
	public OrderInquiryResponseType processOrder(int uniqueOrderId,
			int orderQuantity, int accountId, long ean13) {
		ObjectFactory factory = new ObjectFactory();
		OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
		AccountType account = factory.createAccountType();
		account.setAccountId(accountId);
		response.setAccount(account);
		OrderItemType orderItem = factory.createOrderItemType();
		BookType book = factory.createBookType();
		book.setEan13(ean13);
		book.setTitle("A CXF Book");
		orderItem.setBook(book);
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date(System.currentTimeMillis()));
			XMLGregorianCalendar estimateShippingDate;
			
				estimateShippingDate = DatatypeFactory.newInstance().
						newXMLGregorianCalendar(cal);
				orderItem.setExpectedShippingDate(estimateShippingDate);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		
		orderItem.setLineNumber(1);
		orderItem.setPrice(new BigDecimal(5));
		orderItem.setQuantityShipped(orderQuantity);
		
		OrderType order = factory.createOrderType();
		order.setOrderStatus(OrderStatusType.READY);
		order.getOrderItems().add(orderItem);
		ArrayList<OrderType> arrayList = new ArrayList<OrderType>();
		arrayList.add(order);
		response.setOrder(arrayList);
		
		return response;
	}

}
