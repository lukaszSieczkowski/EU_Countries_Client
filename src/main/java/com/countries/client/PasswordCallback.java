package com.countries.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class PasswordCallback implements CallbackHandler {

	@SuppressWarnings("unused")
	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback wpc = (WSPasswordCallback) callbacks[i];
			wpc.setIdentifier(Menu.getUserName());
			wpc.setPassword(Menu.getPassword());
			return;
		}
	}
}
