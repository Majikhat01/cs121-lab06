
/**
 * Lesson 13: Activity - Gradebook
 *
 * @author CS121 Instructors
 * @version Fall 2020
 * @author Calvin Hatfield
 */
public class GradeBook
{
	/* Instance Variables */
	private Student[] gradeData;
	private int index;				// The index of where to add the next student record

	/* Constructor */
	public GradeBook()
	{
		this.gradeData = new Student[4];
		this.index = 0;
	}

	/* Other Methods */

	// TODO: Add student method
	public void addStudentRecord(Student s)
	{
		if (this.index >= gradeData.length)
		{
			growGradeDataArray();

		}
		
		gradeData[this.index] = s;
		this.index++;
	}

	public String toString()
	{
		String output = "";
		for (int i =0; i< this.index; i++)
		{
			output += this.gradeData[i].toString() + "\n";
		}

		return output;
	}

	private void growGradeDataArray()
	{
		Student[] largerArray = new Student[this.gradeData.length * 2];

		for (int i = 0; i < this.gradeData.length; i++)
		{
			largerArray[i] = this.gradeData[i];
		}
		System.out.println("Growing Array: " + this.gradeData.length + " -> " + largerArray.length);
		this.gradeData = largerArray;
	}

}