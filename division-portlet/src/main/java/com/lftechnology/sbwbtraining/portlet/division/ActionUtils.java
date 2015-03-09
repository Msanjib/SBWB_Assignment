package com.lftechnology.sbwbtraining.portlet.division;

import java.io.IOException;
import java.util.List;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONSerializer;
/**
 * This is the utility class for handling the operations for {@link Division} model
 * @author sanjib maharjan
 *
 */
public class ActionUtils {
	/**
	 * This method retrives all the {@link Division} entry from the database,
	 * converts it into the {@link JSON} format as per the format required for
	 * jqGrid plugin library and finally returns the formatted {@link JSON}
	 * 
	 * @return the formatted {@link JSON} instance with all {@link Division}
	 *         information stored in database
	 * @throws IOException
	 * @throws SystemException
	 * @author sanjib maharjan
	 */
	public static JSONObject getDepartmentAsJson() throws IOException, SystemException {
		List<Division> objectList = DivisionLocalServiceUtil
				.getEveryDivisions();
		JSONObject recordsjsonObject = JSONFactoryUtil.createJSONObject();
		JSONObject cell = null;
		JSONArray recordsjsonArray = JSONFactoryUtil.createJSONArray();
		recordsjsonObject.put("page", "1");
		double total_pages = Math.ceil(objectList.size() / 5.0);
		recordsjsonObject.put("total", String.valueOf(total_pages));
		recordsjsonObject.put("records ", String.valueOf(objectList.size()));
		if (!objectList.isEmpty()) {
			for (int i = 0; i < objectList.size(); i++) {
				Division entry = objectList.get(i);
				cell = JSONFactoryUtil.createJSONObject();
				cell.put("divisionName",
						String.valueOf(entry.getDivisionName()));
				cell.put("createdBy", String.valueOf(entry.getCreatedBy()));
				cell.put("createdOn", String.valueOf(entry.getCreatedOn()));
				cell.put("companyId", String.valueOf(entry.getCompanyId()));
				cell.put("groupId", String.valueOf(entry.getGroupId()));
				cell.put("divisionId", String.valueOf(entry.getDivisionId()));
				recordsjsonArray.put(cell);
			}
			recordsjsonObject.put("rows", recordsjsonArray);
		}
		return recordsjsonObject;
	}
}
