<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<div class="prof-wrapper">
	<div class="fix-height">
	
	</div>	
	<div class="nav-prof">
		<ul class="cfix">
			<li>sadsa</li>
			<li>sadsa</li>
			<li>sadsa</li>
			<li class="flt-right">Department:Java</li>
		</ul>
	</div>	
	<div class="upload-prof-pics">
		<img alt="hjkk" src="${pageContext.request.contextPath}/images/user.png">
	</div>
	<div class="strip">
		<h1>${userInfo.firstName} ${userInfo.lastName}</h1>
		${userInfo.email}
	</div>
	<div class="info-wrapper cfix">
		<div class="info-wrapper-left">
			<ul>
				<li>Name           :   ${userInfo.firstName} ${userInfo.lastName}</li>
				<li>Address        :   ${userInfo.address}</li>
				<li>Email          :   ${userInfo.email}</li>
				<li>Phone Number   :   ${userInfo.phoneNumber}</li>
				<li>Company Name   :   ${userInfo.companyName}</li>
				<li>Company Id     :   ${userInfo.companyId}</li>
				<li>Group Id       :   ${userInfo.groupId}</li>
				<li>Department     :   Java</li>
				<li>Status         :   Active</li>
			</ul>
		</div>
		<div class="info-wrapper-right">
			<ul>
				<li>Associate</li>
				<li>Skills</li>
				<li>Experience</li>
				<li>Group Id       :   ${userInfo.groupId}</li>
				<li>Company Id     :   ${userInfo.companyId}</li>
				<li>Phone Number   :   ${userInfo.phoneNumber}</li>
			</ul>
		</div>
	</div>		

</div>
