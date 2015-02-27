package com.lftechnology.sbwbusers.service.messaging;

import com.lftechnology.sbwbusers.service.ClpSerializer;
import com.lftechnology.sbwbusers.service.EmployeeLocalServiceUtil;
import com.lftechnology.sbwbusers.service.EmployeeServiceUtil;

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
            EmployeeLocalServiceUtil.clearService();

            EmployeeServiceUtil.clearService();
        }
    }
}
