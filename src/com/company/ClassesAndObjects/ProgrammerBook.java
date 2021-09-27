package com.company.ClassesAndObjects;

import java.util.Comparator;

class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public ProgrammerBook clone() {
        Object cloneBook = super.clone();
        ProgrammerBook cloneProgrammerBook = (ProgrammerBook) cloneBook;
        cloneProgrammerBook.language = new String(language);
        return cloneProgrammerBook;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result += language.hashCode();
        result += level;
        return result;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object) && object instanceof ProgrammerBook &&
                language.equals(((ProgrammerBook) (object)).language) &&
                level == ((ProgrammerBook) (object)).level;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLanguage: " + language +
                "\nLevel: " + level;
    }

    public ProgrammerBook(String title, String author, int price,
                          String language, int level, String isbn) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class SortByName implements Comparator<Book> {
    @Override
    public int compare(Book lhs, Book rhs) {
        return lhs.getTitle().compareTo(rhs.getTitle());
    }
}

class SortByNameAuthor implements Comparator<Book> {
    @Override
    public int compare(Book lhs, Book rhs) {
        int compare = lhs.getTitle().compareTo(rhs.getTitle());
        if (compare == 0) {
            return lhs.getAuthor().compareTo(rhs.getAuthor());
        }
        return compare;
    }
}

class SortByAuthorName implements Comparator<Book> {
    @Override
    public int compare(Book lhs, Book rhs) {
        int compare = lhs.getAuthor().compareTo(rhs.getAuthor());
        if (compare == 0) {
            return lhs.getTitle().compareTo(rhs.getTitle());
        }
        return compare;
    }
}

class SortByAuthorNamePrice implements Comparator<Book> {
    @Override
    public int compare(Book lhs, Book rhs) {
        int compare = lhs.getAuthor().compareTo(rhs.getAuthor());
        if (compare == 0) {
            compare = lhs.getTitle().compareTo(rhs.getTitle());
            if (compare == 0) {
                return Integer.compare(lhs.getPrice(), rhs.getPrice());
            }
            return compare;
        }
        return compare;
    }
}
