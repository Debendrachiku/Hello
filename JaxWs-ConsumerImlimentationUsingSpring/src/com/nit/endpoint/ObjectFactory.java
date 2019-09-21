
package com.nit.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nit.endpoint package. 
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

    private final static QName _StockProviderResponse_QNAME = new QName("http://endpoint.nit.com/", "stockProviderResponse");
    private final static QName _StockProvider_QNAME = new QName("http://endpoint.nit.com/", "stockProvider");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nit.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockProvider }
     * 
     */
    public StockProvider createStockProvider() {
        return new StockProvider();
    }

    /**
     * Create an instance of {@link StockProviderResponse }
     * 
     */
    public StockProviderResponse createStockProviderResponse() {
        return new StockProviderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockProviderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.nit.com/", name = "stockProviderResponse")
    public JAXBElement<StockProviderResponse> createStockProviderResponse(StockProviderResponse value) {
        return new JAXBElement<StockProviderResponse>(_StockProviderResponse_QNAME, StockProviderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockProvider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.nit.com/", name = "stockProvider")
    public JAXBElement<StockProvider> createStockProvider(StockProvider value) {
        return new JAXBElement<StockProvider>(_StockProvider_QNAME, StockProvider.class, null, value);
    }

}
