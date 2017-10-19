package journaldev.creational.builder.demo2;

public class Student {

	private String fName;
	private String mName;
	private String lName;
	private String regNumber;
	private String phoneNum;
	private String emailAddr;

	//private constructor with mandatory parameters
	private Student(StudentBuilder builder){
		this.fName = builder.fName;
		this.mName = builder.mName;
		this.lName = builder.lName;
		this.regNumber = builder.regNumber;
		this.phoneNum = builder.phoneNum;
		this.emailAddr = builder.emailAddr;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	@Override
	public String toString() {
		return "Student{" +
				"fName='" + fName + '\'' +
				", mName='" + mName + '\'' +
				", lName='" + lName + '\'' +
				", regNumber='" + regNumber + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", emailAddr='" + emailAddr + '\'' +
				'}';
	}

	//static nested class with all attributes copied from outer class

	public static class StudentBuilder{
		private String fName;
		private String mName;
		private String lName;
		private String regNumber;
		private String phoneNum;
		private String emailAddr;

		//public constructor with all required attributes as parameters
		public StudentBuilder(String fName,String lName,String regNumber,String emailAddr){
			this.fName = fName;
			this.lName = lName;
			this.regNumber = regNumber;
			this.emailAddr = emailAddr;
		}

		//methods to set optional attributes and return the builder object
		public StudentBuilder setmName(String mName){
			this.mName = mName;
			return this;
		}

		public StudentBuilder setPhoneNumber(String phoneNum){
			this.phoneNum = phoneNum;
			return this;
		}

		//method  to be used by client..will return an instance of Student
		public Student build(){
			return new Student(this);
		}


	}
}
