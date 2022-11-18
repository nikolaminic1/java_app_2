package project.projectConfig;

import java.util.Date;

public class ProjectConfig {

    public long getDateCreated(){
        Date dateCreated = new Date();
        return dateCreated.getTime();
    }
}
