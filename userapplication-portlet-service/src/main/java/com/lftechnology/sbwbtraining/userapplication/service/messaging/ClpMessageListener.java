package com.lftechnology.sbwbtraining.userapplication.service.messaging;

import com.lftechnology.sbwbtraining.userapplication.service.ClpSerializer;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.service.EmpServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            EmpLocalServiceUtil.clearService();

            EmpServiceUtil.clearService();
        }
    }
}
