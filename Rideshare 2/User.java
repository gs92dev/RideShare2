import java.util.Objects;

/**
*  There is nothing required to do in this class. 
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User user)) return false;
		return Objects.equals(getName(), user.getName()) && Objects.equals(getEmail(), user.getEmail());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getEmail());
	}
}
