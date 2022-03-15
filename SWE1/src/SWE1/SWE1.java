package SWE1;

/**
 *
 * @author Ommar selim
 */
    

public class SWE1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws NotYetSetException {
        // TODO code application logic here
          // Student context
        Student std1 = new Student();
        
        std1.setName("Omar");
        
        Student std2 = new Student();
        
        std2.setName("Selim");
        
        
        Course c1 = new Course();
        
        c1.setTitle("Bioinformatics");
        
        Course c2 = new Course();
        
        c2.setTitle("Software engineering");
        
        Assignment as1 = new Assignment();
        
        as1.setMark(22);
        
        Assignment as2 = new Assignment();
        
        as2.setMark(11);
        
        CourseRecord cr1 = new CourseRecord();
        
        cr1.setStudent(std1);
        
        cr1.addAssignment(as1);
        
        cr1.addAssignment(as2);
        
        cr1.addAssignment(as1);
        
        CourseRecord cr2 = new CourseRecord();
        
        cr2.setStudent(std2);
        
        c1.addCourseRecord(cr1);
        
        c1.addCourseRecord(cr2);
        
        
        System.out.println(cr1.average());
        System.out.println((cr1.canTakeFinalExam())?"the student will take the exam " : "student can not take the exam");
        c1.printCourceStudents();
        c1.printBestStudent();
        c1.printFinalExamStudents();
       
        

        
    }
    
    
}
