<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@include file="/init.jsp"%>
<portlet:actionURL name="addUser" var="addUserURL" />
<portlet:actionURL name="addUser" var="updateUserURL" />
<portlet:actionURL name="searchUser" var="searchUserURL" />
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:defineObjects />
<a href="<%=searchUserURL.toString()%>"> sdlfjlsjdf</a>
<div class="add-employee">
	<form action="<%=addUserURL.toString()%>" method="post"
		id="register-form" class="clearfix">
		<h1>
			Add Employee<span>Enter the information of new employee</span>
		</h1>
		<div id="errors"></div>
		<label>First-Name</label> <input type="text" name="firstName"
			placeholder="firstname" /> <span class="error"></span> 
		<label>Last-Name</label>
		<input type="text" name="lastName" placeholder="lastname" /> <label>Address</label>
		<input type="text" name="address" placeholder="jawalakhel" /> <label>Phone-Number</label>
		<input type="text" name="phoneNumber" placeholder="9845733874" /> 
		<label>Email-Address</label>
		<input type="text" name="email" placeholder="abc@gmail.com" />
		<select name="dep-name">
			<option>java</option>
			<option>php</option>
			<option>ruby</option>
		</select>
		<label>Company-Name</label><input type="text" name="companyName" placeholder="leapfrog" /> 
		<input type="submit" value="Submit">
	</form>
</div>
<table id="jqGrid"></table>
<div id="jqGridPager"></div>
<%
	//JSONObject obj = (JSONObject)renderRequest.getAttribute("df");
%>
<script>
jQuery("#jqGrid").jqGrid({
	url:'${serve}',
	editurl:'${updateUserURL}',
    datatype: 'json',
    edit: true, add: true, del: true,
    colNames:['userid', 'firstName', 'LastName','Address','Phone Number','Email','Company Name','Company Id','Group Id','Actions'],
    colModel:[
    {name:'userId',index:'userId', width:80,align:"center", sorttype:"int", editable: true,search: true },
    {name:'firstName',index:'firstName',align:"left", width:110, editable: true,search: true },
    {name:'lastName',index:'lastName', width:110, align:"center", editable: true,search: true },
    {name:'address',index:'address', width:100, align:"center", editable: true,search: true },
    {name:'phoneNumber',index:'phoneNumber', width:150, align:"center", editable: true},
    {name:'email',index:'email', width:110, align:"center", editable: true},
    {name:'companyName',index:'companyName', width:150, align:"center", editable: true},
    {name:'companyId',index:'companyId', width:150,align:"center",sorttype:"float", editable: false},
    {name:'groupId',index:'groupId', width:150,align:"center", sortable:false, editable: false},{
		label: "Edit Actions",
        name: "actions",
        width: 50,
        align:'center',
        formatter: "actions",
        formatoptions: {
            keys: true,
            editOptions: {},
            addOptions: {},
            delOptions: {}
        }       
    }
    ],
    height:'auto',
    rowNum:5,
    sortname: 'userId',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    pager:'#jqGridPager'
},{closeAfterEdit:true},{url:'${updateUserURL}',closeAfterAdd: true},{},{});
$('#jqGrid').navGrid("#jqGridPager", {edit: false, add: true});
$('#list').jqGrid('filterToolbar', { searchOnEnter: true, enableClear: false });
</script>