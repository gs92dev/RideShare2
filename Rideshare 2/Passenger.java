import java.util.Objects;

/**
*  There is nothing required to do in this class. 
*/
public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

	public Passenger() {
		super();
	}

	public Passenger(String accountType) {
		super();
		this.accountType = accountType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Passenger passenger)) return false;
		return Objects.equals(getAccountType(), passenger.getAccountType());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getAccountType());
	}

	// Do not delete this constructor.
	public Passenger(String name, String accountType) {
		super();
		this.setName(name);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
