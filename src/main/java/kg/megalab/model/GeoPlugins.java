package kg.megalab.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class GeoPlugins {


    private String request;

    private int status;

    private String delay;

    private String credit;
    private String city;
    private String region;
    private String regionCode;
    private String regionName;
    private String countryCode;
    private String countryName;
    private int inEU;
    private String continentCode;
    private String continentName;
    private double latitude;
    private double longitude;
    private int locationAccuracyRad;
    private String timezone;
    private String curCode;
    private String curySymb;
    private String curSymbUTF8;
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
                ", curCode='" + curCode + '\'' +
                ", curySymb='" + curySymb + '\'' +
                ", curSymbUTF8='" + curSymbUTF8 + '\'' +
                ", curConverter=" + curConverter +
                "**********}";
    }
    /*
(request, status, delay, credit, city, region, regionCode, regionName,
                        countryCode, countryName, inEU, continentCode, continentName, latitude, longitude, locationAccuracyRad, timezone,
                        curCode, curSymb, curSymbUTF8, curConverter))
 */

}
