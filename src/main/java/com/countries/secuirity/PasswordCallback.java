package com.countries.secuirity;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import com.countries.client.Menu;

public class PasswordCallback implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (Callback callback : callbacks) {
			WSPasswordCallback wpc = (WSPasswordCallback) callback;
			wpc.setIdentifier(Menu.getUserName());
			wpc.setPassword(Menu.getPassword());
			return;
		}
	}
}
