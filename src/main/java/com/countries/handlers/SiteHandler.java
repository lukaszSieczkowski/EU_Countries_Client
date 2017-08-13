package com.countries.handlers;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.ibm.wsdl.extensions.soap.SOAPConstants;

public class SiteHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(isRequest){
			SOAPMessage message = context.getMessage();
			try {
				SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = envelope.getHeader();
				if(soapHeader == null){
					soapHeader = envelope.addHeader();
				}
				
				QName name = new QName("http://www.countries.com/", "SiteName");
				
				SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(name);
				soapHeaderElement.addTextNode("http://www.countries.com");
				message.saveChanges();
				
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
