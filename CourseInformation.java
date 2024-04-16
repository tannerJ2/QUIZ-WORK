
public class CourseInformation {

    public static void main(String[] args) {
        int workload;
  
        Course myCourse = new Course();
        myCourse.setCourseNumber("CSC 491");
        myCourse.setCourseTitle("Independent Study");
        myCourse.printInfo();
        workload = myCourse.computeExpectedWorkHours();
        System.out.println("Expected number of weekly work hours for this course = "+workload);
        System.out.print("\n\n");

        OfferedCourse offeredCourse1 = new OfferedCourse("CSC 229", "Object Oriented Programming","Al Seesi", "MO 13", "T/H 11:00 am", 3);
        offeredCourse1.printInfo();
        workload = offeredCourse1.computeExpectedWorkHours();
        System.out.println("Expected number of weekly work hours for this course = "+workload);
        System.out.print("\n\n");

        OfferedCourse offeredCourse2 = new OfferedCourse("CSC 212", "Data Structures","Yu", "MO 113", "T/H 1:50 pm", 4);
        offeredCourse2.printInfo("Another offered course:");
        workload = offeredCourse2.computeExpectedWorkHours();
        System.out.println("Expected number of weekly work hours for this course = "+workload);

  }
}
