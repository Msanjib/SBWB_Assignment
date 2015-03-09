package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ActionUtils {
	/**
	 * This method retrives all the {@link Emp} entry from the database,
	 * converts it into the {@link JSON} format as per the format required for
	 * jqGrid plugin library and finally returns the formatted {@link JSON}
	 * 
	 * @return the formatted {@link JSON} insstance with all {@link Emp}
	 *         information stored in database
	 * @throws IOException
	 * @throws SystemException
	 * @author sanjib maharjan
	 */
	public static JSONObject getAllEmployeeAsJson() throws IOException,
			SystemException {
		List<Emp> objectList = EmpLocalServiceUtil.getEveryEmployee();
		JSONObject recordsjsonObject = JSONFactoryUtil.createJSONObject();
		JSONObject cellObject = null;
		List<Division> departments = DivisionLocalServiceUtil.getEveryDivisions();
		Emp entry = null;
		String status = "Inactive";
		JSONArray recordsjsonArray = JSONFactoryUtil.createJSONArray();
		recordsjsonObject.put("page", "1");
		double total_pages = Math.ceil(objectList.size() / 10.0);
		recordsjsonObject.put("total", String.valueOf(total_pages));
		recordsjsonObject.put("records ", String.valueOf(objectList.size()));
		if (!objectList.isEmpty()) {
			for (int i = 0; i < objectList.size(); i++) {
				entry = objectList.get(i);
				cellObject = JSONFactoryUtil.createJSONObject();
				cellObject.put("firstName",
						String.valueOf(entry.getFirstName()));
				cellObject.put("lastName", String.valueOf(entry.getLastName()));
				cellObject.put("address", String.valueOf(entry.getAddress()));
				cellObject.put("phoneNumber",
						String.valueOf(entry.getPhoneNumber()));
				cellObject.put("email", String.valueOf(entry.getEmail()));
				cellObject.put("companyName",
						String.valueOf(entry.getCompanyName()));
				cellObject.put("departmentName",
						String.valueOf(mapToDepartmentNameById(departments, entry.getDepId())));
				if(entry.getStatus()){
					status = "Active";
				}else{
					status = "Inactive";
				}
				cellObject.put("status",
						status);
				cellObject.put("companyId", String.valueOf(entry.getGroupId()));
				cellObject.put("groupId", String.valueOf(entry.getGroupId()));
				cellObject.put("userId", String.valueOf(entry.getUserId()));
				recordsjsonArray.put(cellObject);
			}
			recordsjsonObject.put("rows", recordsjsonArray);
		}
		return recordsjsonObject;

	}
	
	public static String mapToDepartmentNameById(List<Division> departments, long depId){
		String departmentName="Executive";
		for(Division division : departments){
			if(division.getDivisionId() == depId){
				departmentName = division.getDivisionName();
				break;
			}
		}
		return departmentName;
	}
	
	public static JSONObject getDepartmentsAsJson(List<Division> departments){
		JSONObject departmentJson = JSONFactoryUtil.createJSONObject();
		for(Division division : departments){
			departmentJson.put(division.getDivisionId()+"", division.getDivisionName());
		}
		return departmentJson;
	}

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
		return recordsjsonObject;

	}
}
