// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package com.tencent.tars.client.testapp;

import com.qq.tars.rpc.protocol.tars.support.TarsAbstractCallback;

public abstract class HelloPrxCallback extends TarsAbstractCallback {

	public abstract void callback_hello(String ret);

	public abstract void callback_getAllUserInfo(int ret, java.util.List<User> resp);

	public abstract void callback_getAllUserInfoAsReturn(java.util.List<User> ret);

}
