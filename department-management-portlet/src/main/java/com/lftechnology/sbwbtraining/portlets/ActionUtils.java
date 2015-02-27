package com.lftechnology.sbwbtraining.portlets;

import java.io.IOException;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.model.Department;
import com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONSerializer;

public class ActionUtils {
	public static JSONObject getData() throws IOException, SystemException {
		
		List<Department> objectList = DepartmentLocalServiceUtil.getEveryDepartments();
//		JSONArray jsonArray = (JSONArray)JSONSerializer.toJSON(objectList);
//        String json = "{'page':1,'total':'2','records':'1','rows':"+jsonArray+"}";
//        JSONObject jsonObject = (JSONObject)JSONSerializer.toJSON(json);
		
		JSONObject recordsjsonObject = JSONFactoryUtil.createJSONObject();
		JSONArray rowjsonObject = null;
		JSONObject cell = null;
		JSONArray recordsjsonArray = JSONFactoryUtil.createJSONArray();
		recordsjsonObject.put("page", "1");
		double total_pages = Math.ceil(objectList.size() / 10.0);
		recordsjsonObject.put("total", String.valueOf(total_pages));
		recordsjsonObject.put("records ", String.valueOf(objectList.size()));
		if (!objectList.isEmpty()) {
			for (int i = 0; i < objectList.size(); i++) {

				Department entry = objectList.get(i);
				rowjsonObject = JSONFactoryUtil.createJSONArray();
				cell = JSONFactoryUtil.createJSONObject();
				cell.put("departmentName",String.valueOf(entry.getDepartmentName()));
				cell.put("createdBy",String.valueOf(entry.getCreatedBy()));
				cell.put("createdOn",String.valueOf(entry.getCreatedOn()));
				cell.put("companyId",String.valueOf(entry.getCompanyId()));
				cell.put("groupId", String.valueOf(entry.getGroupId()));
				cell.put("departmentId", String.valueOf(entry.getDepartmentId()));
//				cell.put("cell", rowjsonObject);
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
