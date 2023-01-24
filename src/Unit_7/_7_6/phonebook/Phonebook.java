package Unit_7._7_6.phonebook;

import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        sort(contacts);
    }

    private static void sort(ArrayList<Contact> contacts){
        //get last item
        int index = contacts.size()-1;
        Contact contact = contacts.get(index);

        //find insertion place
        while(index > -1) {
            if(contact.getName().compareTo(contacts.get(index).getName()) > 0) break;
            index--;
        }

        //add the contact and remove it from the end
        contacts.add(index+1, contact);
        contacts.remove(contacts.size()-1);
    }

    public void printPhonebook() {
        contacts.forEach(contact -> System.out.println(contact.getName()));
    }
}
