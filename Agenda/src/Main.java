public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        Contact contact = new Contact();
        contact.name = "Joao";
        contact.phoneNumber = "555";


        myContactsManager.addContact(contact);
        System.out.println(myContactsManager.searchContact("Joao").phoneNumber);
        
    }
}
