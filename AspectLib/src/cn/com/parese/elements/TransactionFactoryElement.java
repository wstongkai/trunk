package cn.com.parese.elements;


import cn.com.byd.factory.builder.FactoryBuilder;
import cn.com.parese.exception.PareseException;

import org.dom4j.Attribute;
import org.dom4j.Element;

public class TransactionFactoryElement implements FactoryElement {
	public TransactionFactoryElement() {
		super();
	}

	public void doParese(Element element) throws PareseException {
		Attribute attr = element.attribute(ATTRIBUTE_TYPE);
		if (attr == null) {
			throw new PareseException("Not found necessary attribute.");
		}

		FactoryBuilder.createTransactionactory(attr.getStringValue());
	}
}
