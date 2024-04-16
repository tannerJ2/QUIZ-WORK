public class OfferedCourse extends Course{
   private String instructorName;
   private String location;
   private String time;
   private int creditHours;


   public OfferedCourse(String courseNum, String courseTitle, String instructorName, String location, String time, int creditHours) {
      setCourseNumber(courseNumber);
      setCourseTitle(courseTitle);
      this.instructorName = instructorName;
      this.location = location;
      this.time = time;
      this.creditHours = creditHours;
  }


  public void printInfo() {
      System.out.println("Course Number: " + courseNumber);
      System.out.println("Course Title: " + courseTitle);
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

   //computed the work hours 
   public int computeExpectedWorkHours() {
      return creditHours * getWorkPerCreditHour();
   }
}
