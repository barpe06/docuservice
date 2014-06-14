package com.docusign.proxy;

import com.docusign.model.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pedro.barroso
 * Date: 3/12/14
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApiServiceProxy {

    @Resource
    private APIServiceSoap apiServiceSoap;

    public EnvelopeStatus createAndSendEnvelope(List<Document> documents, List<Recipient> recipients) {

        Envelope envelope = new Envelope();


        EnvelopeStatus envelopeStatus = apiServiceSoap.createAndSendEnvelope(envelope);
        return envelopeStatus;
    }

}


