package com.jdbc_PROJECT_designPattern_factory;

import com.jdbc_PROJECT_designPattern_proxy.RemoteControl;
import com.jdbc_PROJECT_designPattern_proxy.RemoteControlProxy;

public class RemoteControlFactory {
	public static RemoteControlProxy createRemoteControl(String url) {
		return new RemoteControlProxy(url);
	}
}

