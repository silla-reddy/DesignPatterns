package com.pattern1.factory;

public class OperatingSystemFactory {
		public InterfaceOS getInstance(String name) {
			if(name.equals("open source"))
				return new ImplAndroid();
			else
				return new ImplIOS();
		}
}
