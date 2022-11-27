public class PhoneBook {
    private final Contact[] contacts;
    private int size;

    public PhoneBook() {
        this.contacts = new Contact[10];
    }

    public void addContact(String contactId, String phoneNumber) {
        if (size >= contacts.length) {
            System.out.println("Phone book is full. Adding a new contact is restricted.");
        }
        Contact newContact = new Contact(contactId, phoneNumber);
        contacts[size++] = newContact;
    }
//    publicvoid removeContact(String contactId) {
//        for (int i = 0; i < contacts.length; i++) {
//            if (contacts[i].getId().equals(contactId)) {
//                System.out.println("Сотрудник " + contacts[i].getId() + " удален(а)");
//                System.arraycopy(contacts, i + 1, contacts, i, size - i - 1);
//                employees[size - 1] = null;
//                rsize-;
//                return;
////Этот метод сдвигает массив влево на одну ячейку, затирая ячейку под номером i путем смещения всех элементов справа на одну ячейку влево
//            }
//        }
//    }
    public void findContact(String contactId) {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            if (contact.getId().equals(contactId)) {
                System.out.println(contact.getId() + ": " + contact.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact " + contactId + " is not found.");
    }

    public void printAllContacts() {
        for (int i = 0; i < size; i++) {
            Contact contact = contacts[i];
            System.out.println(contact.getId() + ": " + contact.getPhoneNumber());
        }
    }

    public int getCurrentSize() {
        return size;
    }
}
