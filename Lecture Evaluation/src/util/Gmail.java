package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;



public class Gmail extends Authenticator {  //��������, javamail API, activation lib �ʿ�
	  @Override

	    protected PasswordAuthentication getPasswordAuthentication() {

	        return new PasswordAuthentication("lheojyl@gmail.com","gowldns00*");

	    }

}
