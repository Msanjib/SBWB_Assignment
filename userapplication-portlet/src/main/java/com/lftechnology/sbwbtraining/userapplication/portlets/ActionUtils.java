package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;
import java.util.List;
<<<<<<< HEAD

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
=======
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
>>>>>>> SBWB-bibhushan
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ActionUtils {
	/**
	 * This method converts the given {@link Emp} instance to {@link JSON}
	 * format with the keys as per the columns name in database and values as per the entry stored in <code>user</user> as parameter.
	 * 
	 * @param user the {@link Emp} instance to format as {@link JSON}
	 * @return the formated {@link JSON} instance.
	 * @author sanjib maharjan
	 */

	public static JSONObject convertUsersDataToJson(Emp user) {
		JSONObject recordsjsonObject = JSONFactoryUtil.createJSONObject();
		recordsjsonObject.put("firstName", user.getFirstName());
		recordsjsonObject.put("lastName", user.getLastName());
		recordsjsonObject.put("address", user.getAddress());
		recordsjsonObject.put("phoneNumber", user.getPhoneNumber());
		recordsjsonObject.put("email", user.getEmail());
				Emp entry = objectList.get(i);
				rowjsonObject = JSONFactoryUtil.createJSONArray();
				cell = JSONFactoryUtil.createJSONObject();
				cell.put("firstName",String.valueOf(entry.getFirstName()));
				cell.put("lastName",String.valueOf(entry.getLastName()));
				cell.put("address",String.valueOf(entry.getAddress()));
				cell.put("email",String.valueOf(entry.getEmail()));
				cell.put("phoneNumber",String.valueOf(entry.getPhoneNumber()));
				cell.put("companyName",String.valueOf(entry.getCompanyName()));
				cell.put("companyId",String.valueOf(entry.getCompanyId()));
				cell.put("groupId", String.valueOf(entry.getGroupId()));
				cell.put("userId", String.valueOf(entry.getUserId()));
				recordsjsonArray.put(cell);

			}
			// recordsjsonObject.put("id",String.valueOf(invheaderObject.getInvId()));
			recordsjsonObject.put("rows", recordsjsonArray);
		}
