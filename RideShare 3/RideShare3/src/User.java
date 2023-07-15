/**
* You need to implement a hashCode and equals in this class so Passenger class will work correctly.
*/
public abstract class User {

	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
  public boolean equals(Object o) {
      User other = (User) o;
		if(this.getName().equals(other.getName())){
            
          if(this.getEmail().equals(other.getEmail())){
            
              return true;
          }             
        }
      return false;
  }
   public int hashCode(){
       return name.hashCode()*email.hashCode();
   }
    
    
    
}
