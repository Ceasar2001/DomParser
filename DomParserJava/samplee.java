import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.util.*;

public class samplee {

   public static void main(String[] args) {

      Scanner ian = new Scanner(System.in);
      String id;

      System.out.println("Enter Id number: ");
      id = ian.nextLine();
      
      try {
         // Read from student.xml
         File studentFile = new File("student.xml");
         DocumentBuilderFactory studentDbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder studentDBuilder = studentDbFactory.newDocumentBuilder();
         Document studentDoc = studentDBuilder.parse(studentFile);
         studentDoc.getDocumentElement().normalize();
    
         // Read from course.xml
         File courseFile = new File("course.xml");
         DocumentBuilderFactory courseDbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder courseDBuilder = courseDbFactory.newDocumentBuilder();
         Document courseDoc = courseDBuilder.parse(courseFile);
         courseDoc.getDocumentElement().normalize();
    
         // Search for the student with the specified ID number in student.xml
         NodeList studentList = studentDoc.getElementsByTagName("student");
         for (int i = 0; i < studentList.getLength(); i++) {
            Node studentNode = studentList.item(i);
            if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
               Element studentElement = (Element) studentNode;
               String studentId = studentElement.getAttribute("id");
               if (studentId.equals(id)) {
                  // Print the student's information from student.xml
                  System.out.println("Student ID: " + studentId);
                  System.out.println("First Name: " + studentElement.getElementsByTagName("firstname").item(0).getTextContent());
                  System.out.println("Last Name: " + studentElement.getElementsByTagName("lastname").item(0).getTextContent());
    
                  // Search for the courses taken by the student in course.xml
                  NodeList courseList = courseDoc.getElementsByTagName("course");
                  for (int j = 0; j < courseList.getLength(); j++) {
                     Node courseNode = courseList.item(j);
                     if (courseNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element courseElement = (Element) courseNode;
                        String courseId = courseElement.getAttribute("id");
                        if (courseId.equals(studentId)) {
                           // Print the course information
                           System.out.println("Course ID: " + courseId);
                           System.out.println("Course Name: " + courseElement.getElementsByTagName("name").item(0).getTextContent());
                           System.out.println("Course Grade: " + courseElement.getElementsByTagName("grade").item(0).getTextContent());
                        }
                     }
                  }
                  break;
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
    
   }
}