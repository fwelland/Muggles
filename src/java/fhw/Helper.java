
package fhw;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "helper")
@RequestScoped
public class Helper {


    public Helper() {
    }
    
    public Date getDate()
    {
        return(new Date());
    }
    
    public void setDate(Date d)
    {
        
    }
}
