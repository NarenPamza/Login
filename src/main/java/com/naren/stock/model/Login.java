package com.naren.stock.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "userID")
	private int userID;

	@Column(name = "loginname")
	private String loginname;

	@Column(name = "password")
	private String password;

	@OneToOne(mappedBy = "Login", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private UserDetails userDetails;

	public Login() 
	{
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return this.loginname;
	}

	public void setUserName(String userName) {
		this.loginname = userName;
	}

	public String getPassWord() {
		return this.password;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}

	@Override
	public String toString() {
		return "UserName [userName=" + loginname + ", UserID=" + userID
				+ ", PassWord=" + password + "]";
	}

}
