/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class NewsPaper extends Document {

    private int issueDate;

    public NewsPaper(String id, String nxb, int number, int issueDate) {
        super(id, nxb, number);
        this.issueDate = issueDate;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "News Paper: " + "\n Issue Day: " + issueDate + "\n ID: " + id + "\n NXB: " + nxb + "\n Number: " + number;
    }

}
