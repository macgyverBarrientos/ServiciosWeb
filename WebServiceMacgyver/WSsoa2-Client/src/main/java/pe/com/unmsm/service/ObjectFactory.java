
package pe.com.unmsm.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.unmsm.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListParentResponse_QNAME = new QName("http://service.unmsm.com.pe/", "listParentResponse");
    private final static QName _ListParent_QNAME = new QName("http://service.unmsm.com.pe/", "listParent");
    private final static QName _ListParentsPageResponse_QNAME = new QName("http://service.unmsm.com.pe/", "listParentsPageResponse");
    private final static QName _ListParentsPage_QNAME = new QName("http://service.unmsm.com.pe/", "listParentsPage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.unmsm.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Parent }
     * 
     */
    public Parent createParent() {
        return new Parent();
    }

    /**
     * Create an instance of {@link ListParentsPage }
     * 
     */
    public ListParentsPage createListParentsPage() {
        return new ListParentsPage();
    }

    /**
     * Create an instance of {@link ListParentResponse }
     * 
     */
    public ListParentResponse createListParentResponse() {
        return new ListParentResponse();
    }

    /**
     * Create an instance of {@link ListParent_Type }
     * 
     */
    public ListParent_Type createListParent_Type() {
        return new ListParent_Type();
    }

    /**
     * Create an instance of {@link ListParentsPageResponse }
     * 
     */
    public ListParentsPageResponse createListParentsPageResponse() {
        return new ListParentsPageResponse();
    }

    /**
     * Create an instance of {@link Child }
     * 
     */
    public Child createChild() {
        return new Child();
    }

    /**
     * Create an instance of {@link Parent.Childs }
     * 
     */
    public Parent.Childs createParentChilds() {
        return new Parent.Childs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListParentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unmsm.com.pe/", name = "listParentResponse")
    public JAXBElement<ListParentResponse> createListParentResponse(ListParentResponse value) {
        return new JAXBElement<ListParentResponse>(_ListParentResponse_QNAME, ListParentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListParent_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unmsm.com.pe/", name = "listParent")
    public JAXBElement<ListParent_Type> createListParent(ListParent_Type value) {
        return new JAXBElement<ListParent_Type>(_ListParent_QNAME, ListParent_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListParentsPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unmsm.com.pe/", name = "listParentsPageResponse")
    public JAXBElement<ListParentsPageResponse> createListParentsPageResponse(ListParentsPageResponse value) {
        return new JAXBElement<ListParentsPageResponse>(_ListParentsPageResponse_QNAME, ListParentsPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListParentsPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.unmsm.com.pe/", name = "listParentsPage")
    public JAXBElement<ListParentsPage> createListParentsPage(ListParentsPage value) {
        return new JAXBElement<ListParentsPage>(_ListParentsPage_QNAME, ListParentsPage.class, null, value);
    }

}
