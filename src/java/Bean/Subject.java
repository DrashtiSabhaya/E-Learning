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
public class Subject {
    private int id;
    private int school_id;
    private String medium;
    private int standard;
    private String name;
    
    public int getSchool_id() {
        return school_id;
    }
    
    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getMedium() {
        return medium;
    }
    
    public void setMedium(String medium) {
        this.medium = medium;
    }
    
    public int getStandard() {
        return standard;
    }
    
    public void setStandard(int standard) {
        this.standard = standard;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
