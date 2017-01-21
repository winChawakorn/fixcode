package fixcode;
/**
 * A simple model for a person with a name for equal test.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.22
 */
public class Person {
	/** the person's full name. */
	public String name;

	/**
	 * Initialize a new Person object.
	 * 
	 * @param name
	 *            is the starting name of the person.
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Return the person's name.
	 * 
	 * @return the person's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set or change the person's name.
	 * 
	 * @param newname
	 *            is the new name of this person.
	 */
	public void setname(String newname) {
		this.name = newname;
	}

	/**
	 * Compare person's by name and class. If its in the different class, so it
	 * can't compare and this method will return false. If its in the same class
	 * and have same name, this method will return true.
	 * 
	 * @param obj
	 *            is another Person to compare to this one.
	 * @return true if the name and the class is same, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		if (name.equalsIgnoreCase(other.name)) {
			return true;
		}
		return false;
	}

	/**
	 * Return a string representation of this Person.
	 * 
	 * @return String "Person " follow with the person's name.
	 */
	@Override
	public String toString() {
		return "Person " + name;
	}
}
