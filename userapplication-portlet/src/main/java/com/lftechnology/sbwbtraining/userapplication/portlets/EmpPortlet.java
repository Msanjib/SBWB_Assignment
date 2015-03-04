package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class EmpPortlet extends MVCPortlet{
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Emp moUser = EmpLocalServiceUtil.createEmp(0);
		moUser.setAddress("bbbb");
		moUser.setAddress("dfdf");
		try {
			System.out.println( EmpLocalServiceUtil.addUpdateEmp(moUser));
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}
}
