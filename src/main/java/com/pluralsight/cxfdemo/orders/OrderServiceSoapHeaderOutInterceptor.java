package com.pluralsight.cxfdemo.orders;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.interceptor.SoapOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.phase.Phase;

public class OrderServiceSoapHeaderOutInterceptor extends AbstractSoapInterceptor{

	public OrderServiceSoapHeaderOutInterceptor(){
		super(Phase.WRITE);
		this.addBefore(SoapOutInterceptor.class.getName());
	}
	
	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		QName qname = new QName("http://www.pluralsight.com/service/Orders", "apiKey");
		String apiKey = "a1b2c3";
		try {
			SoapHeader header = new SoapHeader(qname, apiKey, new JAXBDataBinding(apiKey.getClass()));
			message.getHeaders().add(header);
		} catch (JAXBException e) {
			throw new Fault(e);
		}
		
		
	}

}
