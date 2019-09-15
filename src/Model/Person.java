package Model;

// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 */
public class Person {

	/** The phone num. */
	private String firstName, middleName, lastName, emailAdd, phoneNum;
	
	/** The count. */
	public static int count = 0; 
	
	/** The person ID. */
	private int personID = 1;
	
	/**
	 * Instantiates a new person.
	 */
	public Person() {
		personID = ++count;
	}


	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * Gets the middle name.
	 *
	 * @return the middle name
	 */
	public String getMiddleName() {
		return middleName;
	}


	/**
	 * Sets the middle name.
	 *
	 * @param middleName the new middle name
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * Gets the email add.
	 *
	 * @return the email add
	 */
	public String getEmailAdd() {
		return emailAdd;
	}


	/**
	 * Sets the email add.
	 *
	 * @param emailAdd the new email add
	 */
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}


	/**
	 * Gets the phone num.
	 *
	 * @return the phone num
	 */
	public String getPhoneNum() {
		return phoneNum;
	}


	/**
	 * Sets the phone num.
	 *
	 * @param phoneNum the new phone num
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	/**
	 * Gets the person ID.
	 *
	 * @return the person ID
	 */
	public int getPersonID() {
		return this.personID;
	} 
	
	/**
	 * Sets the person ID.
	 */
	public void setPersonID() {
		this.personID = personID;
	}
	
}
