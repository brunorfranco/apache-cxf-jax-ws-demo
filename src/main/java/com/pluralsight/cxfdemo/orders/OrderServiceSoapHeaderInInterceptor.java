package com.pluralsight.cxfdemo.orders;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

public class OrderServiceSoapHeaderInInterceptor extends AbstractSoapInterceptor{

	public OrderServiceSoapHeaderInInterceptor(){
		super(Phase.USER_PROTOCOL);
	}
	
	@Override
	public void handleMessage(SoapMessage arg0) throws Fault {
		QName qname = new QName("http://www.pluralsight.com/service/Orders", "apiKey");
		SoapHeader header = (SoapHeader) arg0.getHeader(qname);
		String apiKey = ((Element) header.getObject()).getTextContent();
		System.out.println("@@@@#### Api Key:" + apiKey);
	}

}
