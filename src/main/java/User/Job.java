/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author ryota
 */
public class Job {
    
    static int Id = 0;
    private String title;
    private String company;
    private String link;

    public Job(String title, String company, String link) {
        this.title = title;
        this.company = company;
        this.link = link;
        
    }
    
    public Job(){
        Id++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

 

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Job{" + "title=" + title + ", company=" + company + ", link=" + link + '}';
    }

    
}
