package test;


import java.io.*;
import javax.xml.parsers.*;

import org.w3c.dom.*;



public class ReadXML {
public static Object getObject(){
    try {
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dFactory.newDocumentBuilder();
        Document doc;
        doc = (Document) builder.parse(new File("src/test/config.xml"));
        NodeList nl = ((org.w3c.dom.Document) doc).getElementsByTagName("className");
        Node classNode = (Node) nl.item(0).getFirstChild();
        String cName =  classNode.getNodeValue();
        System.out.println("ÐÂÀàÃû:" + cName);
        Class<?> c = Class.forName(cName);
        Object obj = c.newInstance();
        return obj;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
}
