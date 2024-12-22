import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Solution {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            Info info = mapper.readValue(new URL("https://ipinfo.io/json"), Info.class);

            System.out.println(info.getIp());
            System.out.println(info.getCity());
            System.out.println(info.getRegion());
            System.out.println(info.getCountry());
            System.out.println(info.getLoc());
            System.out.println(info.getOrg());
            System.out.println(info.getPostal());
            System.out.println(info.getTimezone());
            System.out.println(info.getReadme());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
