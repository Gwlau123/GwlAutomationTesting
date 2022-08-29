package problemSolving.A_SilverBloom;

import java.util.ArrayList;
import java.util.List;

public class Hostel {

	private int MAX_STUD_IN_ROOM = 3;
	private List<Room> rooms = new ArrayList<Room>();

	public void createRoom(int roomNum) {
		Room r = new Room();
		r.setRoomNumber(roomNum);
		rooms.add(r);
	}

	public void allocateRoom(String studName, int preferredRoomNumber) {
		Student s = new Student();
		s.setName(studName);
		Room r = getRoomByRoomNumber(preferredRoomNumber);
		if (r == null) {
			r = getFirstAvailableRoom();
		}

		if (r != null) {
			r.allocateStudentInRoom(s);
		} else {
			System.out
					.println("No rooms available! for " + studName + " with prefer room number " + preferredRoomNumber);
		}

	}

	private Room getFirstAvailableRoom() {
		for (Room room : rooms) {
			if (room.getCurrentOccupancy() < MAX_STUD_IN_ROOM) {
				return room;
			}
		}
		return null;
	}

	private Room getRoomByRoomNumber(int preferredRoomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == preferredRoomNumber && room.getCurrentOccupancy() < MAX_STUD_IN_ROOM) {
				return room;
			}
		}
		return null;
	}

	public void de_allocateRoom(String studName) {
		for (Room room : rooms) {
			for (Student s : room.getStudentList()) {
				if (studName.equals(s.getName())) {
					room.de_allocateStudentFromRoom(s);
					break;
				}
			}
		}
	}

	public void calcMonthlyRoomRent(String studName, int days, double messFees) {
		for (Room room : rooms) {
			for (Student s : room.getStudentList()) {
				if (studName.equals(s.getName())) {
					double dailyrent = room.getDailyRoomRent();
					s.setTotalFees(dailyrent * days + messFees);
					break;
				}
			}
		}
	}

	public void printRoomDetails() {
		System.out.println("======================================");
		System.out.println("Room#		|	studCnt		|	Name			|	Total Fees	|	Paid Fees");
		for (Room room : rooms) {
			for (Student s : room.getStudentList()) {
				System.out.println(room.getRoomNumber() + "		|	" + room.getCurrentOccupancy() + "		|	"
						+ s.getName() + "		|	" + s.getTotalFees() + "		|	" + s.getPaidFees());
			}
		}

	}

}
