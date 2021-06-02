// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.7.2.
// **********************************************************************

package com.tencent.tars.client.testapp;

import com.qq.tars.protocol.util.*;
import com.qq.tars.protocol.annotation.*;
import com.qq.tars.protocol.tars.*;
import com.qq.tars.protocol.tars.annotation.*;

@TarsStruct
public class BankAccount {

	@TarsStructProperty(order = 0, isRequire = true)
	public String code = "";
	@TarsStructProperty(order = 1, isRequire = true)
	public int bal = 0;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	public BankAccount() {
	}

	public BankAccount(String code, int bal) {
		this.code = code;
		this.bal = bal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TarsUtil.hashCode(code);
		result = prime * result + TarsUtil.hashCode(bal);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BankAccount)) {
			return false;
		}
		BankAccount other = (BankAccount) obj;
		return (
			TarsUtil.equals(code, other.code) &&
			TarsUtil.equals(bal, other.bal) 
		);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("BankAccount(");
		sb.append("code:");
		if (this.code == null) {
			sb.append("null");
		} else {
			sb.append(this.code);
		}
		sb.append(", ");
		sb.append("bal:");
		sb.append(this.bal);
		sb.append(")");
		return sb.toString();
	}

	public void writeTo(TarsOutputStream _os) {
		_os.write(code, 0);
		_os.write(bal, 1);
	}


	public void readFrom(TarsInputStream _is) {
		this.code = _is.readString(0, true);
		this.bal = _is.read(bal, 1, true);
	}

}
