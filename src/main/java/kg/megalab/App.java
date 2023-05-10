package kg.megalab;

import kg.megalab.config.properties.UrlClass;
import kg.megalab.model.GeoPlugins;
import kg.megalab.test.RestService;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * 1.  Cоздать новый проект
 * 2. Получить по ссылке xml документ
 * 3. Смаппить xml в объект
 * а. С помощью DOM Parser (как на занятии)
 * б. С помощью Jackson
 * 4. Вывести оба объекта на консоль и подписать где какой способ использовался
 * ВАЖНО!!! Разбить по пакетам все, по разным классам!
 * И прикрепить ссылку на github
 */
public class App {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        UrlClass u = new UrlClass();
        RestService restService = new RestService();
        FileWriter fw = new FileWriter("file.txt");
        String sb = restService.getRest(u.getUrl());
        for (int i = 0; i < sb.length(); i++) {
            fw.write(sb.charAt(i));
        }
        System.out.println("Writing successful");
        fw.close();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("file.txt"));
        List<GeoPlugins> List = new ArrayList<>();
        NodeList nodeList = document.getElementsByTagName("geoPlugin");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String request = element.getElementsByTagName("geoplugin_request").item(0).getChildNodes().item(0).getNodeValue();
                int status = Integer.parseInt(element.getElementsByTagName("geoplugin_status").item(0).getTextContent());
                String delay = element.getElementsByTagName("geoplugin_delay").item(0).getTextContent();
                String credit = element.getElementsByTagName("geoplugin_credit").item(0).getTextContent();
                String city = element.getElementsByTagName("geoplugin_city").item(0).getTextContent();
                String region = element.getElementsByTagName("geoplugin_region").item(0).getTextContent();
                String regionCode = element.getElementsByTagName("geoplugin_regionCode").item(0).getTextContent();
                String regionName = element.getElementsByTagName("geoplugin_regionName").item(0).getTextContent();
                String countryCode = element.getElementsByTagName("geoplugin_countryCode").item(0).getTextContent();
                String countryName = element.getElementsByTagName("geoplugin_countryName").item(0).getTextContent();
                int inEU = Integer.parseInt(element.getElementsByTagName("geoplugin_inEU").item(0).getTextContent());
                String continentCode = element.getElementsByTagName("geoplugin_continentCode").item(0).getTextContent();
                String continentName = element.getElementsByTagName("geoplugin_continentName").item(0).getTextContent();
                double latitude = Double.parseDouble(element.getElementsByTagName("geoplugin_latitude").item(0).getTextContent());
                double longitude = Double.parseDouble(element.getElementsByTagName("geoplugin_longitude").item(0).getTextContent());
                int locationAccuracyRad = Integer.parseInt(element.getElementsByTagName("geoplugin_locationAccuracyRadius").item(0).getTextContent());
                String timezone = element.getElementsByTagName("geoplugin_timezone").item(0).getTextContent();
                String curCode = element.getElementsByTagName("geoplugin_currencyCode").item(0).getTextContent();
                String curSymb = element.getElementsByTagName("geoplugin_currencySymbol").item(0).getTextContent();
                String curSymbUTF8 = element.getElementsByTagName("geoplugin_currencySymbol_UTF8").item(0).getTextContent();
                double curConverter = Double.parseDouble(element.getElementsByTagName("geoplugin_currencyConverter").item(0).getTextContent());
                List.add(new GeoPlugins(request, status, delay, credit, city, region, regionCode, regionName,
                        countryCode, countryName, inEU, continentCode, continentName, latitude, longitude, locationAccuracyRad, timezone,
                        curCode, curSymb, curSymbUTF8, curConverter));
            }
        }
        System.out.println(List);


    }
}

