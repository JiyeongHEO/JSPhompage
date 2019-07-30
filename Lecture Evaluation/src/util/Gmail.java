package util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;



public class Gmail extends Authenticator {  //계정정보, javamail API, activation lib 필요
	  @Override

	    protected PasswordAuthentication getPasswordAuthentication() {

	        return new PasswordAuthentication("lheojyl@gmail.com","gowldns00*");

	    }

}
