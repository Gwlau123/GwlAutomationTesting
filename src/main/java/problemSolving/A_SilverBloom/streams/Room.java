package problemSolving.A_SilverBloom.streams;

import java.util.ArrayList;
import java.util.List;

public class Room {


	private double dailyRoomRent = 100.00;
	private int roomNumber=1;
	private List<Student> studentInRoom = new ArrayList<Student>();

	
	public double getDailyRoomRent() {
		return dailyRoomRent;
	}

	public void allocateStudentInRoom(Student st) {
		studentInRoom.add(st);
	}

	public void de_allocateStudentFromRoom(Student st) {
		studentInRoom.remove(st);
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
		
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public int getCurrentOccupancy() {
		return studentInRoom.size();
	}
	
	public List<Student> getStudentList() {
		return studentInRoom;
	}

}
