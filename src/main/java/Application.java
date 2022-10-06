import com.fasterxml.jackson.databind.ObjectMapper;
import com.homeworkexcercise2.Address;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String pathSeparator = File.separator;
        File file = new File(System.getProperty("user.dir") + pathSeparator + "src" + pathSeparator + "main" + pathSeparator + "resources" + pathSeparator + "example.json");
        Address address = objectMapper.readValue(file, Address.class);
        System.out.println(address.toString());
        String jsonString = objectMapper.writeValueAsString(address);
        System.out.println(jsonString);
    }
}
