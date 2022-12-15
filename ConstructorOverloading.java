package OopConcept;
class User
{
	int userid;
	String userName,password,firstname,lastname,address;
	long phone;
	
	public User(int userid, String firstname,String lastname)
	{
		this.userid=userid;
		this.firstname= firstname;
		this.lastname=lastname;
	}
	
	public User(int userid, String firstname,String lastname,String address,long phone )
	{
		this(userid,firstname,lastname);
		this.address=address;
		this.phone=phone;		
	}
	public int getUserid() {
		return userid;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAddress() {
		return address;
	}
	public long getPhone() {
		return phone;
	}
	
	
}
public class ConstructorOverloading {
	public static void main(String []args) {
		User user1=new User(1,"nikhil","wagh","pune",8605306634L);                 
		System.out.println("id: "+user1.getUserid()+"\nfirstname: "+user1.getFirstname()+"\nlastname: "+user1.getLastname()+"\naddress: "+user1.getAddress()+"\nphonenum: "+user1.getPhone());
		
		
		
	}

}
