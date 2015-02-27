package com.lftechnology.sbwbtraining.service.messaging;

import com.lftechnology.sbwbtraining.service.ClpSerializer;
import com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil;
import com.lftechnology.sbwbtraining.service.DepartmentServiceUtil;

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
            DepartmentLocalServiceUtil.clearService();

            DepartmentServiceUtil.clearService();
        }
    }
}
