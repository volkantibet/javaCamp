
public class User {
	String id;
	String firstName;
	String surName;
	String email;
	String passWord;
	
	    
	
         public User(String id, String firstName, String surName, String email, String passWord) {
		
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.email = email;
		this.passWord = passWord;
	}
         public User() {
 	    	
 	    }
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
