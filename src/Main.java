public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        ContactsManager myContactManager = new ContactsManager();
        Contact emori = new Contact();
        emori.name = "Godfrey";
        emori.phoneNumber = "08065786535";
        myContactManager.addContact(emori);

        Contact erunke = new Contact();
        erunke.name = "Robert";
        erunke.phoneNumber = "090656343323";
        myContactManager.addContact(erunke);

        myContactManager.searchContact("Robert");
        myContactManager.searchContact("Godfrey");

    }
}
