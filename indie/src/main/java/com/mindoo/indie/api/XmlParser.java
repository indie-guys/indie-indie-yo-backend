package com.mindoo.indie.api;


import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.mindoo.indie.api.dto.album.AlbumSearchRoot;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class XmlParser extends DefaultHandler {

    public String parse(String resource){

        JAXBContext jaxbContext;
        try{
//
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.parse(new InputSource(new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8))))
//
//

            jaxbContext = JAXBContext.newInstance(AlbumSearchRoot.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            AlbumSearchRoot searchRoot = (AlbumSearchRoot) unmarshaller.unmarshal(
                    new ByteArrayInputStream(resource.getBytes(StandardCharsets.UTF_8)));

            System.out.println(searchRoot);
        } catch (JAXBException e){
            e.printStackTrace();
        }

//
//        try {
//            InputSource is = new InputSource(new StringReader(resource));
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document document = builder.parse(is);
//            NodeList list = document.getElementsByTagName("channel");
//
//
//            for(int i=0;i<list.getLength();i++){
//                Node album = list.item(i);
//                NodeList cList = album.getChildNodes();
//
//
//                for(int k=0;k<cList.getLength();k++){
//                    Node node = cList.item(k);
////                    String value = item.getNodeName();
//                    System.out.println("현재 노드 이름 : " + node.getNodeName());
//                    System.out.println("현재 노드 이름 : " + node.getLocalName());
//                    System.out.println("현재 노드 타입 : " + node.getNodeType());
//                    System.out.println("현재 노드 값 : " + node.getTextContent());
//                    System.out.println("현재 노드 네임스페이스 : " + node.getPrefix());
//                    System.out.println("현재 노드의 다음 노드 : " + node.getAttributes().item(0));
//                    System.out.println("");
//                }
//
//            }
//
//            doc = builder.parse(is);
//            XPathFactory xpathFactory = XPathFactory.newInstance();
//            XPath xpath = xpathFactory.newXPath();
//            // XPathExpression expr = xpath.compile("/response/body/items/item");
//            XPathExpression expr = xpath.compile("//channel/item");
//            NodeList nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                NodeList child = nodeList.item(i).getChildNodes();
//                for (int j = 0; j < child.getLength(); j++) {
//                    Node node = child.item(j);
//                    System.out.println("현재 노드 이름 : " + node.getNodeName());
//                    System.out.println("현재 노드 이름 : " + node.getLocalName());
//                    System.out.println("현재 노드 타입 : " + node.getNodeType());
//                    System.out.println("현재 노드 값 : " + node.getTextContent());
//                    System.out.println("현재 노드 네임스페이스 : " + node.getPrefix());
//                    System.out.println("현재 노드의 다음 노드 : " + node.getAttributes().item(0));
//                    System.out.println("");
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        return "null ^^";
    }
}

//class XmlExtraction {
//
//    public void getXmlData(File xmlFile) throws Exception {
//        //1.문서를 읽기위한 공장을 만들어야 한다.
//        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//
//        //2.빌더 생성
//        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//
//        //3.생성된 빌더를 통해서 xml문서를 Document객체로 파싱해서 가져온다
//        Document doc = dBuilder.parse(xmlFile);
//        doc.getDocumentElement().normalize();//문서 구조 안정화
//
//        Element root = doc.getDocumentElement();
//
//        NodeList n_list = root.getElementsByTagName("person");
//        Element el = null;
//        NodeList sub_n_list = null; //sub_n_list
//        Element sub_el = null; //sub_el
//
//        Node v_txt = null;
//        String value="";
//
//        String[] tagList = {"name", "age", "job"};
//
//        for(int i=0; i<n_list.getLength(); i++) {
//            el = (Element) n_list.item(i);
//            for(int k=0; k< tagList.length; k++) {
//                sub_n_list = el.getElementsByTagName(tagList[k]);
//                for(int j=0; j<sub_n_list.getLength(); j++) {
//                    sub_el = (Element) sub_n_list.item(j);
//                    v_txt = sub_el.getFirstChild();
//                    value = v_txt.getNodeValue();
//
//                    System.out.println(sub_el.getNodeName() + "::::value="+value);
//                    if(sub_el.getAttributes().getNamedItem("id")!=null)
//                        System.out.println("id="+ sub_el.getAttributes().getNamedItem("id").getNodeValue() );
//                }
//            }
//
//        }
//    }
//
//}
//
