package com.docusign.utils;

import com.docusign.model.APIServiceSoap;
import com.sun.org.apache.xml.internal.serializer.utils.Utils;

/**
 * Created with IntelliJ IDEA.
 * User: pedro.barroso
 * Date: 3/12/14
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ServiceUtil {

    public static APIServiceSoap getAPI(HttpServletRequest request) {
        HttpSession session = request.getSession();
        DocusignAPICredentials apiCreds = new DocusignAPICredentials();
        apiCreds.setAccountId(session.getAttribute(Utils.SESSION_ACCOUNT_ID).toString());
        apiCreds.setUserId(session.getAttribute(Utils.SESSION_USER_ID).toString());
        apiCreds.setIntegratorsKey(session.getAttribute(Utils.SESSION_INTEGRATORS_KEY).toString());
        apiCreds.setPassword(session.getAttribute(Utils.SESSION_PASSWORD).toString());
        apiCreds.setUserEmail(session.getAttribute(Utils.SESSION_EMAIL).toString());
        apiCreds.setDocusignWebserviceEndpoint(
                session.getAttribute(Utils.DOCUSIGN_WEBSERVICE_ENDPOINT).toString());

        DocusignWebserviceFactory wsFactory = new DocusignWebserviceFactory();
        wsFactory.setEmail(apiCreds.getUserEmail());
        wsFactory.setIntegratorsId(apiCreds.getIntegratorsKey());
        wsFactory.setUserId(apiCreds.getUserId());

        return wsFactory.setupClient(apiCreds.getDocusignWebserviceEndpoint()).authorizeAPI(apiCreds);
    }
}
