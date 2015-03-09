package com.lftechnology.sbwbtraining.division.service.http;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link com.lftechnology.sbwbtraining.division.service.DivisionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.lftechnology.sbwbtraining.division.model.DivisionSoap}.
 * If the method in the service utility returns a
 * {@link com.lftechnology.sbwbtraining.division.model.Division}, that is translated to a
 * {@link com.lftechnology.sbwbtraining.division.model.DivisionSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/api/secure/axis. Set the property
 * <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       DivisionServiceHttp
 * @see       com.lftechnology.sbwbtraining.division.model.DivisionSoap
 * @see       com.lftechnology.sbwbtraining.division.service.DivisionServiceUtil
 * @generated
 */
public class DivisionServiceSoap {
}
