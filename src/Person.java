public class Person {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Kirtan";
        student1.age = 22;
        student1.introduce();

        Students student2 = new Students();
        student2.name = "Shweta";
        student2.age = 20;
        student2.introduce();

        Book book1 = new Book();
        book1.title = "Days of My Years";
        book1.author = "H.P. Nanda";
        book1.pages = 180;
        book1.read();
    }
}

class Students {
    String name;
    int age;
    
    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

class Book {
    String title;
    String author;
    int pages;
    
    void read() {
        System.out.println("Reading the book titled '" + title + "' by " + author + " with " + pages + " pages.");
    }
}
