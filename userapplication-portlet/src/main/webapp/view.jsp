<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@include file="/init.jsp"%>
<portlet:actionURL name="addUser" var="addUserURL" />
<portlet:defineObjects />
<div class="add-employee">
	<form action="<%=addUserURL.toString()%>" method="post"
		id="register-form" class="clearfix">
		<h1>
			Add Employee<span>Enter the information of new employee</span>
		</h1>
		<div id="errors"></div>
		<label>First-Name</label> <input type="text" name="firstName"
			placeholder="firstname" /> <span class="error"></span> <label>Last-Name</label>
		<input type="text" name="lastName" placeholder="lastname" /> <label>Address</label>
		<input type="text" name="address" placeholder="jawalakhel" /> <label>Phone-Number</label>
		<input type="text" name="phoneNumber" placeholder="9845733874" /> <label>Email-Address</label>
		<input type="text" name="email" placeholder="abc@gmail.com" /> <select
			name="dep-name">
			<option>java</option>
			<option>php</option>
			<option>ruby</option>
		</select> <label>Company-Name</label><input type="text" name="companyName"
			placeholder="leapfrog" /> <input type="submit" value="Submit">
	</form>
</div>
