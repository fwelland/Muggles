
package fhw;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MarketingContent implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)        
    private Integer marketingContentId;
    
    private String content;
    private String contentOwner;
    
    
    public Integer getId() {
        return getMarketingContentId();
    }

    public void setId(Integer id) {
        this.setMarketingContentId(id);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getMarketingContentId() != null ? getMarketingContentId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarketingContent)) {
            return false;
        }
        MarketingContent other = (MarketingContent) object;
        if ((this.getMarketingContentId() == null && other.getMarketingContentId() != null) || (this.getMarketingContentId() != null && !this.marketingContentId.equals(other.marketingContentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fhw.MarketingContent[ id=" + getMarketingContentId() + " ]";
    }

    /**
     * @return the marketingContentId
     */
    public Integer getMarketingContentId() {
        return marketingContentId;
    }

    /**
     * @param marketingContentId the marketingContentId to set
     */
    public void setMarketingContentId(Integer marketingContentId) {
        this.marketingContentId = marketingContentId;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the contentOwner
     */
    public String getContentOwner() {
        return contentOwner;
    }

    /**
     * @param contentOwner the contentOwner to set
     */
    public void setContentOwner(String contentOwner) {
        this.contentOwner = contentOwner;
    }
    
}
