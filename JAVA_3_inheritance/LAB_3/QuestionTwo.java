package JAVA_3_inheritance.LAB_3;

public class QuestionTwo {
    public static void main(String[] args) {
        Book book = new Book("C", "Denish", "Bell", "CCCC", "Denish Store", "Nepal");
        book.displayInfo();
    }
}

class Store {
    String store_name, address;

    Store(String store_name, String address) {
        this.store_name = store_name;
        this.address = address;
    }
}

class Music extends Store {
    String music_company, name_of_music;

    Music(String music_company, String name_of_music, String store_name, String address) {
        super(store_name, address);
        this.music_company = music_company;
        this.name_of_music = name_of_music;
    }
}

class Book extends Music {
    String name_of_book, author;

    Book(String name_of_book, String author, String music_company, String name_of_music, String store_name,
            String address) {
        super(music_company, name_of_music, store_name, address);
        this.name_of_book = name_of_book;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Store name :" + super.store_name);
        System.out.println("Store address :" + super.address);
        System.out.println("Music Company :" + super.music_company);
        System.out.println("Music Name :" + super.name_of_music);
        System.out.println("Book Name :" + name_of_book);
        System.out.println("Author Name :" + author);
    }
}