package com.epam.spb.lection2;

public class ClassExample {
    public static class Book {
        private String title;

        public Book() {
        }

        public Book(String title) {
            this.title = title;
        }

        public void setTitle(String title) {
            this.title = null == title ? "no title" : title;
        }

        public String getTitle() {
            return title;
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Java");
        System.out.println(book.getTitle());
    }
}
