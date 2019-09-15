package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class Student extends Person {
	
	/** The dob. */
	private String dob;
	
	/**
	 * Instantiates a new student.
	 *
	 * @param firstName the first name
	 * @param middleName the middle name
	 * @param lastName the last name
	 * @param emailAdd the email add
	 * @param phoneNum the phone num
	 * @param dob the dob
	 */
	public Student(String firstName, String middleName, String lastName, String emailAdd, String phoneNum, String dob) {
		super.setFirstName(firstName);
		super.setMiddleName(middleName);
		super.setLastName(lastName);
		super.setEmailAdd(emailAdd);
		super.setPhoneNum(phoneNum);
		this.dob = dob;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
}
