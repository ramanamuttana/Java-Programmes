package org.pack9A;

 public class Book {

    protected void read(){
         System.out.println(" read from book");
    }
}
class NonFictionBook extends Book {
    public void doThings(){
        read();
    }
}

class Magnifier{
    void magnify(){
        Book b =new Book();
        b.read();
    }
}



