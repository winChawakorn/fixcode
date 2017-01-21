package fixcode;

/**
 * A simple model for a student with a name and id for equal test.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.22
 */
public class Student extends Person {
	/** the student's id */
	private long id;

	/**
	 * Initialize a new Student object.
	 * 
	 * @param name
	 *            is the student's name.
	 * @param id
	 *            is the student's id.
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/**
	 * Return a string representation of this Student.
	 * 
	 * @return detail of this student consist of name and id.
	 */
	@Override
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * @param obj
	 *            is another student to compare to this one.
	 * @return true if the name, id, and class is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if ((name.equalsIgnoreCase(other.name)) && (this.id == other.getId())) {
			return true;
		}
		return false;
	}

	/**
	 * Set the student's id to the new id from the parameter.
	 * 
	 * @param id
	 *            is the new id for this student.
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Return the student's id.
	 * 
	 * @return this student's id.
	 */
	public long getId() {
		return this.id;
	}
}
