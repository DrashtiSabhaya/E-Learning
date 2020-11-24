/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Bean;

/**
 *
 * @author Drashti
 */
public class MailInfo {
    private int id;
    private int school_id;
    private String school_name;
    private String mailto;
    private String subject;
    private String message;
    private String date;
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }
    
    public void setMailto(String mailto) {
        this.mailto = mailto;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public int getId() {
        return id;
    }
    
    public int getSchool_id() {
        return school_id;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }
    
    public String getMailto() {
        return mailto;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getDate() {
        return date;
    }
    
}
