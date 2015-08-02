package com.naren.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naren.stock.bo.LoginService;
import com.naren.stock.model.Login;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/beans/Stock.xml");
	
    	LoginService stockBo = (LoginService)appContext.getBean("LoginService");
    	
    	/** insert **/
    	Login login = new Login();
    	login.setUserName("naren");
    	login.setPassWord("password");
    	stockBo.save(login);
    	
    	/** select **/
    	Login login1 = stockBo.findByUserID(1);
    	System.out.println(login1);
    	
    	/** update **/
    	login1.setUserName("narendar");
    	stockBo.update(login1);
    	
    	/** delete **/
    	stockBo.delete(login1);
    	
    	System.out.println("Done");
    }
}
