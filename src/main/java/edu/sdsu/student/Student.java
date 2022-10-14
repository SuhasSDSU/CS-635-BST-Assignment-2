package edu.sdsu.student;

public class Student implements Comparable<Student> {
   private float gpa;
   private int redId;
   private String firstName;
   private String lastName;

   public Student(String firstName, String lastName, float gpa, int redId){
      this.redId = redId;
      this.gpa = gpa;
      this.lastName = lastName;
      this.firstName = firstName;
   }
   public float getGpa() {
      return gpa;
   }

   public void setGpa(float gpa) {
      this.gpa = gpa;
   }

   public int getRedId() {
      return redId;
   }

   public void setRedId(int redId) {
      this.redId = redId;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   @Override
   public int compareTo(Student object) {
      return 0;
   }

   @Override
   public String toString(){
      return "{" +
            "\"redId\":" + this.getRedId() +
            ", \"first-name\":\"" + this.getFirstName() + '\"' +
            ", \"last-name\":" + this.getLastName() +
            ", \"gpa\":" + String.format("%.2f", this.getGpa()) +
            '}';
   }
}
