import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
	{	

        GradeBook myBook = new GradeBook();
        
		File gradebookFile = new File("gradebook-xl.csv");
		
		try
		{
			Scanner fileScanner = new Scanner(gradebookFile);

			while (fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();

				Scanner lineScanner = new Scanner(line);
				lineScanner.useDelimiter(",");

                String lastName, firstName, id, grade;
				lastName = lineScanner.next();
				firstName = lineScanner.next();
				id = lineScanner.next();
				grade = lineScanner.next();

				Student student = new Student(firstName, lastName, Integer.parseInt(id));
                student.setGrade(Integer.parseInt(grade));
                
                // gradebook.add(student);
                myBook.addStudentRecord(student);

				lineScanner.close();
			}
			fileScanner.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Unable to open file: " + gradebookFile.getName());
			System.out.println(e.getMessage());
			System.exit(1);
		}

        System.out.println(myBook);
	}
}
