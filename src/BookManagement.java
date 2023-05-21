/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AD
 */
public class BookManagement {

    private List<Document> documents;
    
    public BookManagement() {
        this.documents = new ArrayList<>();
    }
    
    public void addDocument(Document document) {
        this.documents.add(document);
        
    }
    
    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream().filter(document -> document.getId().equals(id)).findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }
    
    public void showInfor() {
        this.documents.forEach(documents -> System.out.println(documents.toString()));
    }
    
    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
    }
    
    public void searchByNewsPaper() {
        this.documents.stream().filter(doc -> doc instanceof NewsPaper).forEach(doc -> System.out.println(doc.toString()));
    }
    
    public void searchByMagazine() {
        this.documents.stream().filter(doc -> doc instanceof Magazine).forEach(doc -> System.out.println(doc.toString()));
    }
    
}
