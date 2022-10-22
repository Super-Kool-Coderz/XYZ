public class Patient {
	protected String name;
	protected int age;
	protected int rank;
	protected String condition;
	protected String roomStatus;
	protected int roomNum;
	
	public Patient(String name, int age, int rank, String condition,
				   int roomNum) {
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.condition = condition;
		this.roomNum = roomNum;
}
	
	public Patient(String name, int age, int rank, String condition, 
				   String roomStatus) {
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.condition = condition;
		this.roomStatus = roomStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
}