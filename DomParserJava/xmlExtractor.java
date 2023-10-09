import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class xmlExtractor {
    public static void main(String argv[]){
        try {
            File file = new File(
                "D:\\Programming\\WorkPlace\\java\\dom\\myFile.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);

            doc.getDocumentElement().normalize();
            System.out.println("Root element: "+ doc.getDocumentElement().getNodeName());

            NodeList nodeList = doc.getElementsByTagName("student");

    for (int i = 0; i < nodeList.getLength(); ++i) {
            Node node = nodeList.item(i);
                System.out.println("\nNode Name :" + node.getNodeName());
        if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element tElement = (Element)node;
                    System.out.println("User id: " + tElement.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("User Name: "+ tElement.getElementsByTagName("username").item(0).getTextContent());
                    System.out.println("Enrolled Course: "+ tElement.getElementsByTagName("EnrolledCourse").item(0).getTextContent());
                    System.out.println("Mode: "+ tElement.getElementsByTagName("mode").item(0).getTextContent());
                    System.out.println("Duration: "+ tElement.getElementsByTagName("duration").item(0).getTextContent());
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


