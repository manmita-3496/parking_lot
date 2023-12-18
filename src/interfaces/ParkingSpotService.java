import enums.ParkingSpotEnum;
import parking_spot.ParkingSpot;

public interface ParkingSpotService {
    ParkingSpot create(ParkingSpotEnum parkingSpotEnum,Integer floor);
}
