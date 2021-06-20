import java.util.ArrayList;
import java.util.List;

public class Level {
	private final List<ParkingSpot> spots;

	public Level(int numOfSpots) {
		spots = new ArrayList<>(numOfSpots);
		for (int i = 0; i < numOfSpots; i++) {
			if (i < numOfSpots / 2) {
				spots.add(new ParkingSpot(VehicleSize.Compact));
			} else {
				spots.add(new ParkingSpot(VehicleSize.Large));
			}
		}
	}

	public boolean hasSpot(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.fit(v)) {
				return true;
			}
		}
		return false;
	}

	public boolean park(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.fit(v)) {
				s.park(v);
				return true;
			}
		}
		return false;
	}

	public boolean leave(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.getVehicle() == v) {
				s.leave();
				return true;
			}
		}
		return false;
	}
}