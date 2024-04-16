public class Course {
        private String courseNumber;
        private String courseTitle;
        private int workPerCreditHour; 
     
        public Course() {
            this.workPerCreditHour = 3;
        }
    
        // Mutator methods
        public void setCourseNumber(String courseNumber) {
            this.courseNumber = courseNumber;
        }
    
        public void setCourseTitle(String courseTitle) {
            this.courseTitle = courseTitle;
        }
    
        // Accessor method
        public int getWorkPerCreditHour() {
            return workPerCreditHour;
        }
            // Method computeExpectedWorkHours
        public int computeExpectedWorkHours() {
            System.out.println("ERROR: expected work hours can only be computed for offered classes");
            return -1;
        }

        // Method printInfo
        public void printInfo() {
            System.out.println("Course Number: " + courseNumber);
            System.out.println("Course Title: " + courseTitle);
        }
}
        // TODO: Implement a constrcutor with no parameters. Constructor should
        // set workPerCreditHour to 3 

        // TODO: Implement mutator methods - 
        //       setCourseNumber, setCourseTitle
          
        // TODO: Implement accessor methods - 
        //       getWorkPerCreditHour

        // TODO: Implement method computeExpectedWorkHours  
        //   A method should 
        //      print out the message: 
        //           "ERROR: expected work hours can only be computed for offered classes"
        //      return -1 