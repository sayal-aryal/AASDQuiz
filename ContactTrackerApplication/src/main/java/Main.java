import com.edu.miu.model.Contact;
import com.edu.miu.model.EmailAddress;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // Sample usage of the contact management system
        Contact sayal = new Contact("Sayal", "Aryal", "MIU", "Software developer" );
        sayal.addPhoneNumber("555-555-555", "Home");
        sayal.addPhoneNumber("666-666-666", "Mobile");
        sayal.addEmailAddress("sayal@gmail.com", "Home");
        sayal.addEmailAddress("saryal.com", "Work");

        Contact john = new Contact("John", "doe", "Amazon", "Software tester" );
        john.addPhoneNumber("677-555-555", "Home");
        john.addPhoneNumber("987-666-666", "Mobile");
        john.addEmailAddress("john.doe@gmail.com", "Home");
        john.addEmailAddress("dJohn.com", "Work");

        Contact[] contacts = {sayal, john};


        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));

        // Print contacts in JSON-like format
        for (Contact contact : contacts) {
            contact.printAsJson();
        }


    }


}
