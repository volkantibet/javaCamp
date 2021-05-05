

public class Customer {
	 int id;
	String firstName;
	String lastName;
	java.util.Date DateOfBirth;
	String NationalityId;
	public Customer(int id, String firstName, String lastName, java.util.Date dateOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.DateOfBirth = dateOfBirth;
		this.NationalityId = nationalityId;
		
		
	}
	public Customer() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public java.util.Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(java.util.Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	
	
	

}
