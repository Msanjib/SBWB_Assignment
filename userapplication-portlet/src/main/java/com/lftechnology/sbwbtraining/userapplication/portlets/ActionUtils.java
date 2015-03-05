package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;
import java.util.List;
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ActionUtils {
	public static JSONObject getData() throws IOException, SystemException {
		List<Emp> objectList = EmpLocalServiceUtil.getAllEmployees();
		JSONObject recordsjsonObject = JSONFactoryUtil.createJSONObject();
		JSONArray rowjsonObject = null;
		JSONObject cell = null;
		JSONArray recordsjsonArray = JSONFactoryUtil.createJSONArray();
		recordsjsonObject.put("page", "1");
		double total_pages = Math.ceil(objectList.size() / 5.0);
		recordsjsonObject.put("total", String.valueOf(total_pages));
		recordsjsonObject.put("records ", String.valueOf(objectList.size()));
		if (!objectList.isEmpty()) {
			for (int i = 0; i < objectList.size(); i++) {

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
//		resourceResponse.getWriter().print(recordsjsonObject.toString());
//		System.out.println(recordsjsonObject.toString());
		return recordsjsonObject;

	}
}
