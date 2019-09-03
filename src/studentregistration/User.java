
package studentregistration;


public class User {
    private String  name , password, email, contact;
    
//    public User( String Username, String Password,String Email, String Contact){
//    this.name = Username;
//    this.password = Password;
//    this.email = Email;
//    this.contact = Contact;  
//    }
    
    public String getPassword() {
	return password;
}
public void setPassword(String Password) {
	this.password = Password;
}
public String getEmail() {
	return email;
}
public void setEmail(String Email) {
	this.email = Email;
}

public String getContact() {
	return contact;
}
public void setContact(String Contact) {
	this.contact = Contact;
}
public String getUsername() {
	return name;
}
public void setUsername(String Username) {
	this.name = Username;
}


    
    
    
    
    
}
