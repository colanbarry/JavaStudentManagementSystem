package Model;
// TODO: Auto-generated Javadoc

/**
 * The Class Teacher.
 */
//firstName, middleName, lastName, emailAdd, phoneNum;
public class Teacher extends Person {
	
	/** The degree qual. */
	private String degreeQual;
	
	/**
	 * Instantiates a new teacher.
	 *
	 * @param firstName the first name
	 * @param middleName the middle name
	 * @param lastName the last name
	 * @param emailAdd the email add
	 * @param phoneNum the phone num
	 * @param degreeQual the degree qual
	 */
	public Teacher(String firstName, String middleName, String lastName, String emailAdd, String phoneNum, String degreeQual) {
		super.setFirstName(firstName);
		super.setMiddleName(middleName);
		super.setLastName(lastName);
		super.setEmailAdd(emailAdd);
		super.setPhoneNum(phoneNum);
		this.degreeQual = degreeQual;
		
	}

	/**
	 * Gets the degree qual.
	 *
	 * @return the degree qual
	 */
	public String getDegreeQual() {
		return degreeQual;
	}

	/**
	 * Sets the degree qual.
	 *
	 * @param degreeQual the new degree qual
	 */
	public void setDegreeQual(String degreeQual) {
		this.degreeQual = degreeQual;
	}
}
