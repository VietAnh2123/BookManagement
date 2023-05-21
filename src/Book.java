/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class Book extends Document {

    private String authorName;
    private int pageNumber;

    public Book(String id, String nxb, int number, String authorName, int pageNumber) {
        super(id, nxb, number);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book: " + "\n Author: " + authorName + "\n Number Page: " + pageNumber + "\n ID: " + id + "\n NXB: " + nxb + "\n Number: " + number;
    }

}
