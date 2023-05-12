package kg.megalab.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import kg.megalab.model.GeoPlugins;
import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)

public class JsonMapper {
    XmlMapper xmlMapper = new XmlMapper();

    public GeoPlugins gentGeo(String url) throws IOException {
        return xmlMapper.readValue(url, GeoPlugins.class);
    }
}

