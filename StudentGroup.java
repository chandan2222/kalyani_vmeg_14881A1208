import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup extends Exception implements StudentArrayOperation {

	private Student[] students;
	
	
	
	
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		/*Add your implementation here
		al.size();

		if(index<0||index>this.al.length){
			try{
				throw IllegalArgumentException;
			}catch(Exception e){
				System.out.println(e);
			
		}else{
			
		}
		return null;
		*/
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		
			try{
				if(student==null){
				throw new IllegalArgumentException();
				}
			}catch(Exception e){
				System.out.println(e);
			
		}	
			
		
		
		students[0]=student;
		
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		/* Add your implementation here
		
			try{
				if(student==null){
				throw IllegalArgumentException;
				}
			}catch(Exception e){
				System.out.println(e);
			
		}	
			
		
		int len=al.size();
		
		al.add(len,student);
		*/
		
	}

	@Override
	public void add(Student student, int index) {
		/* Add your implementation here
		
			try{
				if(student==null){
				throw IllegalArgumentException;
				}
			}catch(Exception e){
				System.out.println(e);
			
		}	
			
		
		
			try{
				if(index<0||index>al.size()){
					throw IllegalArgumentException;
				}
			}catch(Exception e){
				System.out.println(e);
			}
		
		
		al.add(index,student);
		*/
	}

	@Override
	public void remove(int index) {
		/* Add your implementation here
		try{
				if(index<0||index>al.size()){
					throw IllegalArgumentException;
				}
			}catch(Exception e){
				System.out.println(e);
			}
		
		al.remove(index);
		*/
	}

	@Override
	public void remove(Student student) {
		/* Add your implementation here
		try{
				if(student==null){
				throw IllegalArgumentException;
				}
			}catch(Exception e){
				System.out.println(e);
			
		}
		try{
		if(!al.contains(student)){
			throw IllegalArgumentException;
		}
		}catch{
			System.out.println(e);
		}
		al.remove(student);
		al.contains(student)
		*/
	}

	@Override
	public void removeFromIndex(int index) {
		/* Add your implementation here
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(students));
		al.remove(index);
		al.toArray(students);
		*/
	}

	@Override
	public void removeFromElement(Student student) {
		/* Add your implementation here
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(students));
		al.remove(student);
		al.toArray(students);
		*/
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
