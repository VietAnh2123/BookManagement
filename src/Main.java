
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author AD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BookManagement bm = new BookManagement();
        while (true) {
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Book");
                    System.out.println("Enter b: to insert Newspaper");
                    System.out.println("Enter c: to insert Magazine");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter ID: ");
                            String id = sc.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = sc.nextLine();
                            System.out.print("Enter number: ");
                            int number = sc.nextInt();
                            System.out.print("Enter author: ");
                            sc.nextLine();
                            String author = sc.nextLine();
                            System.out.print("Enter page number: ");
                            int pageNumber = sc.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            bm.addDocument(book);
                            System.out.println(book.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b": {
                            System.out.print("Enter ID: ");
                            String id = sc.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = sc.nextLine();
                            System.out.print("Enter number: ");
                            int number = sc.nextInt();
                            System.out.print("Enter Day issue: ");
                            int dayIssue = sc.nextInt();
                            Document newspaper = new NewsPaper(id, nxb, number, dayIssue);
                            bm.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            sc.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Enter ID: ");
                            String id = sc.nextLine();
                            System.out.print("Enter nxb:");
                            String nxb = sc.nextLine();
                            System.out.print("Enter number: ");
                            int number = sc.nextInt();
                            System.out.print("Enter issue number : ");
                            int issueNumber = sc.nextInt();
                            System.out.print("Enter issue month : ");
                            int issueMonth = sc.nextInt();
                            Document magazine = new Magazine(id, nxb, number, issueNumber, issueMonth);
                            bm.addDocument(magazine);
                            System.out.println(magazine.toString());
                            sc.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a to search book");
                    System.out.println("Enter b to search newspaper");
                    System.out.println("Enter a to search magazine");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "a": {
                            bm.searchByBook();
                            break;
                        }
                        case "b": {
                            bm.searchByNewsPaper();
                            break;
                        }
                        case "c":
                            bm.searchByMagazine();
                            break;
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    bm.showInfor();
                    break;
                }
                case "4": {
                    System.out.println("Enter id tro remove: ");
                    String id = sc.nextLine();
                    System.out.println(bm.deleteDocument(id) ? "Success" : "Fail");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }

}
 