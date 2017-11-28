package loga;

import java.util.Scanner;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Embeddable;

public class Signup {

        
        String username;
        String password;
        String email_id;
        @Id
    	@Column(name = "email_id", nullable = false)
    	public String getEmail_id() {
    		return email_id;
    	}

    	@Column(name = "password", nullable = false)
    	public String getPassword() {
    		return password;
    		
    	}
    	@Column(name = "password", nullable = false)
    	public String getUsername() {
    		return username;
    		
    	}
        }

