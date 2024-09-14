package org.packB;

import org.pack9A.Book;
class FictionBook extends Book {
    public void doThings(){
        read();
        this.read();
        FictionBook fb=new FictionBook();
        fb.read();

        Book b=new Book();
        b.read();
    }
}

class SpaceFictionBook extends FictionBook {
    public void doThings(){
        read();
        this.read();
        new Book().read(); // direct access not allowed
        new FictionBook().read();
        new SpaceFictionBook().read();


        SpaceFictionBook b=new SpaceFictionBook();
        b.read();
    }
}

public class DemoTests{
    public static void main(String[] args ){
    }
}
