package problemSolving.A_SilverBloom.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hostel {

	private int MAX_STUD_IN_ROOM = 3;
	private List<Room> rooms = new ArrayList<Room>();

	public void createRoom(int roomNum) {
		
		// Validation for valid room num check
		if (roomNum<=0 || roomNum>999) {
			System.out.println("Invalid Room number "+roomNum);
			return;
		}
		
		// Validation for duplicate room num check
		boolean flag = rooms.stream().anyMatch(r->r.getRoomNumber()==roomNum);
		if (flag) {
			System.out.println("Room number "+roomNum+" already exist!");
			return;
		}
		
		/*
		for (Room room : rooms) {
			if(room.getRoomNumber()==roomNum) {
				System.out.println("Room number "+roomNum+" already exist!");
				return;
			}
		}
		*/
		
		// valid code
		Room r = new Room();
		r.setRoomNumber(roomNum);
		rooms.add(r);
	}

	public void allocateRoom(String studName, int preferredRoomNumber) {
		
		// Validation for null/blank check
		if (studName == null || "".equals(studName.trim())) {
			System.out.println("Invalid student name [" + studName + "]");
			return;
		}
		
		// Validation for duplicate check
		
		boolean flag = rooms.stream().anyMatch(r->r.getStudentList().stream().anyMatch(s->s.getName().equals(studName)));
		if (flag) {
			System.out
			.println("Duplicate student [" + studName + "]");
			return;
		}
		
		/*
		for (Room room : rooms) {
			for (Student s : room.getStudentList()) {
				if(s.getName().equals(studName)) {
					System.out
					.println("Duplicate student [" + studName + "]");
					return;
				}
			}
		}
		*/
		
		// valid code
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
		// Using Stream
		return rooms.stream().filter(r->r.getCurrentOccupancy()<MAX_STUD_IN_ROOM).findFirst().orElse(null);

		/*
		for (Room room : rooms) {
			if (room.getCurrentOccupancy() < MAX_STUD_IN_ROOM) {
				return room;
			}
		}
		*/
	}

	private Room getRoomByRoomNumber(int preferredRoomNumber) {
		// Using Stream
		return rooms.stream().filter(r->r.getRoomNumber()==preferredRoomNumber && r.getCurrentOccupancy() < MAX_STUD_IN_ROOM).findFirst().orElse(null);

		/*
		for (Room room : rooms) {
			if (room.getRoomNumber() == preferredRoomNumber && room.getCurrentOccupancy() < MAX_STUD_IN_ROOM) {
				return room;
			}
		}
		return null;
		*/
	}

	public void de_allocateRoom(String studName) {
		
		// Using Stream
		rooms.stream().forEach(r -> r.getStudentList().stream().forEach(s -> s.getName().equals(studName)));
		
		
		boolean flag = true;
		for (Room room : rooms) {
			for (Student s : room.getStudentList()) {
				if (studName.equals(s.getName())) {
					flag = false;	
					room.de_allocateStudentFromRoom(s);
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Student does not exist! "+studName);
		}
	}

	public void calcMonthlyRoomRent(String studName, int days, double messFees) {
		//Validations
		if (days<0 || messFees<0) {
			System.out.println("Invalid days="+days+" and messFees="+messFees+" for student "+studName);
			return;
		}
		
		
		boolean flag= true;
		for (Room room : rooms) {
			for (Student s : room.getStudentList()) {
				if (studName.equals(s.getName())) {
					double dailyrent = room.getDailyRoomRent();
					s.setTotalFees(dailyrent * days + messFees);
					flag= false;
					break;
				}
			}
		}
		
		if (flag) {
			System.out.println("Can not Calc Monthly Room Rent as Student does not exist! "+studName);
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
