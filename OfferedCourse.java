public class OfferedCourse extends Course{
   //TODO: Declare private fields
   private String instructorName;
   private String location;
   private String time;
   private int creditHours;


   public OfferedCourse(String courseNum, String courseTitle, String instructorName, String location, String time, int creditHours) {
      super(courseNum, courseTitle);
      this.instructorName = instructorName;
      this.location = location;
      this.time = time;
      this.creditHours = creditHours;
  }


  public void printInfo() {
      System.out.println("Course Number: " + getCourseNumber());
      System.out.println("Course Title: " + getCourseTitle());
      System.out.println("Instructor Name: " + instructorName);
      System.out.println("Location: " + location);
      System.out.println("Time: " + time);
      System.out.println("Credit Hours: " + creditHours);
      System.out.println("Expected number of weekly hours for this course = " + computeExpectedWorkHours());
   }

   public void printInfo(String header) {
      System.out.println(header);
      printInfo();
   }

   // Public method computeExpectedWorkHours
   public int computeExpectedWorkHours() {
      return creditHours * getWorkPerCreditHour();
   }
}

   // TODO: Define mutator methods -

   //      setInstructorName(), setLocation(), setClassTime()

    // TODO: write the code for a constructor that uses this set of parameters
    // to initialize the object data

   // TODO: implement two public printInfo methods, as described in the 
   // quiz document.

   // TODO: implement computeExpectedWorkHours, as describes in the quiz document
