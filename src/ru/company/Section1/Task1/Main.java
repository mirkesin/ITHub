//package ru.company.Section1.Task1;
//
//public class Main {
//    public static void main(String[] args) {
//        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
//        System.out.println(ahTeck);
//        ahTeck.setEmail("paulTan@nowhere.com");
//        System.out.println("name is: " + ahTeck.getName());
//        System.out.println("email is: " + ahTeck.getEmail());
//        System.out.println("gender is: " + ahTeck.getGender());
//
//
//        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
//        System.out.println(dummyBook);
//
//        dummyBook.setPrice(29.95);
//        dummyBook.setQty(28);
//        System.out.println("name is: " + dummyBook.getName());
//        System.out.println("price is: " + dummyBook.getPrice());
//        System.out.println("qty is: " + dummyBook.getQty());
//        System.out.println("Author is: " + dummyBook.getAuthor());
//        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
//        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
//
//        Book anotherBook = new Book("more Java", new Author("paul Tan", "paul@somewhere.com", 'm'), 29.95);
//        System.out.println(anotherBook);
//
//        Book aBook = new Book();
//        aBook = dummyBook;
//
//        System.out.println(aBook.getAuthor().getName());
//        System.out.println(aBook.getAuthor().getEmail());
//
//    }
//}
