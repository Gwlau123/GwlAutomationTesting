package problemSolving.A_SilverBloom;

public class Runner {
	public static void main(String[] args) {

		Hostel h = new Hostel();

		h.createRoom(1);
		h.createRoom(2);
		h.createRoom(3);

		h.allocateRoom("Shailendra1", 1);
		h.allocateRoom("Shailendra2", 1);
		h.allocateRoom("Shailendra3", 1);
		h.allocateRoom("Shailendra4", 1);

		h.printRoomDetails();

		h.de_allocateRoom("Shailendra4");

		h.calcMonthlyRoomRent("Shailendra3", 30, 500);

		h.printRoomDetails();

	}
}
