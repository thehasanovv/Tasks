package classtasks.hashmap;

import java.util.HashMap;

public class ContactApp {
    private HashMap hashMap;

    public ContactApp(HashMap hashMap) {
        this.hashMap = hashMap;
    }

    public void addContact(String name, String number) {
        this.hashMap.put(name, number);
    }

    public void removeContact(String name) {
        this.hashMap.remove(name);
    }

    public void findAllContacts() {
        System.out.println(this.hashMap);
    }

    public void findByContactName(String name) {
        this.hashMap.containsKey(name);
    }

}
