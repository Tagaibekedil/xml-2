package kg.megalab.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)

public class GeoPlugins {

 @JacksonXmlProperty(localName = "geoplugin_request")
    private String request;
@JacksonXmlProperty(localName = "geoplugin_status")
    private int status;
 @JacksonXmlProperty(localName = "geoplugin_delay")
    private String delay;
 @JacksonXmlProperty(localName = "geoplugin_credit")
    private String credit;
 @JacksonXmlProperty(localName = "geoplugin_city")
    private String city;
 @JacksonXmlProperty(localName = "geoplugin_region")
    private String region;
 @JacksonXmlProperty(localName = "geoplugin_regionCode")
    private String regionCode;
 @JacksonXmlProperty(localName = "geoplugin_regionName")
    private String regionName;
 @JacksonXmlProperty(localName = "geoplugin_countryCode")
    private String countryCode;
 @JacksonXmlProperty(localName = "geoplugin_countryName")
    private String countryName;
 @JacksonXmlProperty(localName = "geoplugin_inEU")
    private int inEU;
 @JacksonXmlProperty(localName = "geoplugin_continentCode")
    private String continentCode;
 @JacksonXmlProperty(localName = "geoplugin_continentName")
    private String continentName;
 @JacksonXmlProperty(localName = "geoplugin_latitude")
    private double latitude;
 @JacksonXmlProperty(localName = "geoplugin_longitude")
    private double longitude;
 @JacksonXmlProperty(localName = "geoplugin_locationAccuracyRad")
    private int locationAccuracyRad;
 @JacksonXmlProperty(localName = "geoplugin_timezone")
    private String timezone;
 @JacksonXmlProperty(localName = "geoplugin_currencyCode")
    private String currencyCode;
 @JacksonXmlProperty(localName = "geoplugin_currencySymbol")
    private String currencySymbol;
 @JacksonXmlProperty(localName = "geoplugin_currencySymbol_UTF8")
    private String currencySymbol_UTF8;
 @JacksonXmlProperty(localName = "geoplugin_currencyConverter")
    private double curConverter;

    @Override
    public String toString() {
        return "GeoPlugins{" +
                "*****"+
                "request='" + request + '\'' +
                ", status=" + status +
                ", delay='" + delay + '\'' +
                ", credit='" + credit + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", regionName='" + regionName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", inEU=" + inEU +
                ", continentCode='" + continentCode + '\'' +
                ", continentName='" + continentName + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", locationAccuracyRad=" + locationAccuracyRad +
                ", timezone='" + timezone + '\'' +
                ", curCode='" + currencyCode + '\'' +
                ", curySymb='" + currencySymbol + '\'' +
                ", curSymbUTF8='" + currencySymbol_UTF8 + '\'' +
                ", curConverter=" + curConverter +
                "**********}";
    }

}
