import com.fasterxml.jackson.databind.ObjectMapper;
import com.homeworkexcercise2.Address;

import java.io.File;
import java.io.IOException;


public class Application {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("C:\\Users\\User\\IdeaProjects\\HomeExcercise2\\src\\main\\resources\\example.json");
        Address address = objectMapper.readValue(file, Address.class);
        System.out.println(address.toString());
        String jsonString = objectMapper.writeValueAsString(address);
        System.out.println(jsonString);
    }
}
