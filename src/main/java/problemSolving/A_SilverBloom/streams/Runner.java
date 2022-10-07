package problemSolving.A_SilverBloom.streams;

public class Runner {
	public static void main(String[] args) {

		Hostel h = new Hostel();

		h.createRoom(1);
		h.createRoom(1);

		h.allocateRoom("Shailendra1", 1);
		h.allocateRoom("Shailendra1", 1);
		h.allocateRoom("Shailendra3", -2);
		h.allocateRoom("Shailendra4", 2);

		h.printRoomDetails();

		h.de_allocateRoom("Shailendra4");

		h.calcMonthlyRoomRent("Shailendra1", 100, 4500);

		h.printRoomDetails();

	}
}
