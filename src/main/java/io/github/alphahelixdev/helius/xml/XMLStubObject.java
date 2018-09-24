package io.github.alphahelixdev.helius.xml;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class XMLStubObject<T> extends XMLObject {
	
	private T value;
	
	public XMLStubObject(String name, T value) {
		super(name);
		this.value = value;
	}
	
	public XMLStubObject(String name, XMLObject[] childs, T value) {
		super(name, childs);
		this.value = value;
	}
	
	public XMLStubObject(XMLObject parent, String name, T value) {
		super(parent, name);
		this.value = value;
	}
	
	public XMLStubObject(XMLObject parent, String name, XMLObject[] childs, T value) {
		super(parent, name, childs);
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public XMLStubObject<T> setValue(T value) {
		this.value = value;
		return this;
	}
	
	@Override
	public List<XMLObject> getChilds() {
		return ImmutableList.of();
	}
	
	@Override
	public XMLObject addChild(XMLObject child) {
		return this;
	}
	
	@Override
	public String childXML() {
		return String.valueOf(value);
	}
}