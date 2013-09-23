
package fhw;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class MarketingContentFacade extends AbstractFacade<MarketingContent> {
    @PersistenceContext(unitName = "MugglesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MarketingContentFacade() {
        super(MarketingContent.class);
    }
    
}
