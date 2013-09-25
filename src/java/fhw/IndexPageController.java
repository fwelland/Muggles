
package fhw;

import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "indexPageController")
@RequestScoped
public class IndexPageController 
{

    @Inject
    private transient Logger logger; 
    
    
    @EJB
    private fhw.MarketingContentFacade ejbFacade;

    public IndexPageController() {
    }
    
    
    public List<MarketingContent> getMarketingContent()
    {
        logger.info("getting a batch of marketing content");
        return(ejbFacade.findAll()); 
    }
   
}
