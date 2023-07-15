import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TaxiService {

	/**
	 * Assemble the Vehicles into a list. Be sure the order of the Vehicles remain:
	 * one, two, three.
	 * 
	 * @param one
	 * @param two
	 * @param three
	 * @return
	 */
	public List<Vehicle> list(Vehicle one, Vehicle two, Vehicle three) {
        List<Vehicle> list = new ArrayList<Vehicle>();
        list.add(one);
        list.add(two);
        list.add(three);
		return list;
	}

	/**
	 * Ride cannot have more than 4 passengers. Ride must have a driver and at least
	 * 1 passenger.
	 * 
	 * If the Ride is not valid, throw the InvalidRideException.
	 * 
	 * @param ride
	 * @return
	 */
	public void validate(Ride ride) throws InvalidRideException {
        Driver driver = ride.getDriver();
        HashSet<Passenger> passengers = (HashSet<Passenger>) ride.getPassengers();
		if (driver == null) {
			throw new InvalidRideException();
		}else if (passengers == null) {
			throw new InvalidRideException();
		}else if (passengers.size()<1 ){
			throw new InvalidRideException();
		} else if (passengers.size()>4){
			throw new InvalidRideException();
		}
	}

}
