<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:actionURL var="userInfoURL" name="goToUserInfo">
	<portlet:param name="id" value="$('#hiddenField').val()" />
	<portlet:param name="sds" value="sd" />
</portlet:actionURL>
<portlet:resourceURL var="showUserInfo"></portlet:resourceURL>
<portlet:actionURL name="editOrDeleteSBWBUsers"
	var="editOrDeleteSBWBUsers" />
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:actionURL name="addUser" var="addUserURL" />
<portlet:actionURL name="addUser" var="updateUserURL" />
<portlet:actionURL name="getList" var="getListURL" />
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:resourceURL var="view"></portlet:resourceURL>
<portlet:defineObjects />
<script>
	function search(){
	var urlNew='${getListURL}'+"&search="+$("#search").val();
	 jQuery("#jqGrid").setGridParam({rowNum:10,datatype:"json",url: urlNew}).trigger('reloadGrid')
} 				
	
	</script>
	<input type="text" name="searchItem" id="search"/>
 <button onclick="search()">Click me</button> 


<a href="<%=getListURL.toString()%>"> sdlfjlsjdf</a>
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

<div class="main-wrapper">
	<div class="navi-wrapper cfix">
		<h1>
			<strong>Employee.</strong>
		</h1>

		<form action="${addDepartment}" method="post" class="cfix">
			<input type="text" name="departmentName" placeholder="Search By Name." size="45" /> <input
				type="submit" />
		</form>
	</div>
	
	<div class="slider-wrapper cfix" id="slideWrap">
		<button id ="hideInfo" class="hide-info">Hide</button>
		<img alt="hjkk" src="${pageContext.request.contextPath}/images/user.png">
		<form action="${userInfoURL}" method="post" id="revealUser">
			<label id="fnameLabel">Sanjib</label> 
			<label id="lnameLabel" class="bold-label">Maharjan</label> 
			<label id="addLabel">Lalitpur</label> 
			<label id="phoneLabel">909090909</label> 
			<label id="emailLabel" class="light-label">cshanjib@gmail.com</label> 
			<input type="hidden" id="idSelected" name="idSelected" value="initial" />
			<input type="submit" value="show More" />
		</form>

	</div>

	<div class="table-display">
		<table id="jqGridEmp"></table>
		<div id="jqGridPagerEmp"></div>
	</div>
</div>
<script>
	$("#slideWrap").hide();
	var lastSel;
	jQuery("#jqGridEmp").jqGrid(
			{
				url : '${serve}',
				editurl : '${editOrDeleteSBWBUsers}',
				datatype : 'json',
				edit : true,
				add : true,
				del : true,
				autowidth : true,
				shrinkToFit : true,
				onSelectRow : function(id) {
					if (id && id !== lastSel) {
						jQuery(this).restoreRow(lastSel);
						lastSel = id;
						$('#idSelected').val(id);
						//$("#revealUser").submit();
						$.ajax({
						        type: 'POST',
						        url: '${showUserInfo}',
						        data: {uid:id},
						        dataType: 'json',
						        success: function (result) {
						        	
						        	$('#fnameLabel').text(result.firstName);
						        	$('#lnameLabel').text(result.lastName);
						        	$('#addLabel').text(result.address);
						        	$('#phoneLabel').text(result.phoneNumber);
						        	$('#emailLabel').text(result.email);
						        	$("#slideWrap").show(1000);
						            console.log("ajax call complete "+result.firstName);
						           // window.location.href='${userInfoURL}';
						        },
						        error: function (result) {
						            console.log("ajax call error complete");
						        }
						    }); 

					}
					//jQuery(this).editRow(id, true); 
				},
				loadComplete : function() {
					ModifyGridDefaultStyles();
				},
				colNames : [ 'userid', 'firstName', 'LastName', 'Address',
						'Phone Number', 'Email', 'Company Name', 'Company Id',
						'Group Id', 'Actions' ],
				colModel : [ {
					name : 'userId',
					index : 'userId',
					width : 30,
					align : "center",
					sorttype : "int",
					key : true
				}, {
					name : 'firstName',
					index : 'firstName',
					align : "left",
					width : 110,
					editable : true
				}, {
					name : 'lastName',
					index : 'lastName',
					width : 110,
					align : "center",
					editable : true
				}, {
					name : 'address',
					index : 'address',
					width : 100,
					align : "center",
					editable : true
				}, {
					name : 'phoneNumber',
					index : 'phoneNumber',
					width : 150,
					align : "center",
					editable : true
				}, {
					name : 'email',
					index : 'email',
					width : 110,
					align : "center",
					editable : true
				}, {
					name : 'companyName',
					index : 'companyName',
					width : 150,
					align : "center",
					editable : false
				}, {
					name : 'companyId',
					index : 'companyId',
					width : 150,
					align : "center",
					sorttype : "float",
					editable : false
				}, {
					name : 'groupId',
					index : 'groupId',
					width : 150,
					align : "center",
					sortable : false,
					editable : false
				}, {
					label : "Edit Actions",
					name : "actions",
					width : 50,
					align : 'center',
					formatter : "actions",
					formatoptions : {
						keys : true,
						editOptions : {},
						addOptions : {},
						delOptions : {}
					}
				} ],
				height : 'auto',
				rowNum : 10,
				sortname : 'userId',
				viewrecords : true,
				sortorder : "desc",
				loadonce : true,
				pager : '#jqGridPagerEmp'
			}, {
				closeAfterEdit : true
			}, {
				url : '${editOrDeleteSBWBUsers}',
				closeAfterAdd : true
			}, {}, {});

	function ModifyGridDefaultStyles() {
		/* $(".ui-jqgrid-sortable").each(function() {
			this.style.cursor = "cursor";
			this.style.color = "#000";
			this.style.fontWeight = "bold";
			
		}); */
		$('#' + "jqGridEmp" + ' tr').removeClass("ui-widget-content");
		$('#' + "jqGridEmp" + ' tr:nth-child(even)').addClass("evenTableRow");
		$('#' + "jqGridEmp" + ' tr:nth-child(odd)').addClass("oddTableRow");
	}
	function getSelectedId() {
		return $('#hiddenField').val();
	}
	$("#hideInfo").click(function(){
		$("#slideWrap").hide(1000);
	});
</script>
<%-- <%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@include file="/init.jsp"%>
<portlet:actionURL name="addUser" var="addUserURL" />
<portlet:actionURL name="addUser" var="updateUserURL" />
<portlet:actionURL name="getList" var="getListURL" />
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:resourceURL var="view"></portlet:resourceURL>
<portlet:defineObjects />
<script>
	function search(){
	var urlNew='${getListURL}'+"&search="+$("#search").val();
	 jQuery("#jqGrid").setGridParam({rowNum:10,datatype:"json",url: urlNew}).trigger('reloadGrid')
} 				
	
	</script>
	<input type="text" name="searchItem" id="search"/>
 <button onclick="search()">Click me</button> 



<a href="<%=getListURL.toString()%>"> sdlfjlsjdf</a>
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
<table id="jqGrid"></table>
<div id="jqGridPager"></div>
<%
	//JSONObject obj = (JSONObject)renderRequest.getAttribute("df");
%>
<script>
	jQuery("#jqGrid").jqGrid(
			{
				url : '${getListURL}',
				editurl : '${updateUserURL}',
				datatype : 'json',
				edit : true,
				add : true,
				del : true,
				colNames : [ 'userid', 'firstName', 'LastName', 'Address',
						'Phone Number', 'Email', 'Company Name', 'Company Id',
						'Group Id', 'Actions' ],
				colModel : [ {
					name : 'userId',
					index : 'userId',
					width : 80,
					align : "center",
					sorttype : "int",
					editable : true,
					search : true
				}, {
					name : 'firstName',
					index : 'firstName',
					align : "left",
					width : 110,
					editable : true,
					search : true
				}, {
					name : 'lastName',
					index : 'lastName',
					width : 110,
					align : "center",
					editable : true,
					search : true
				}, {
					name : 'address',
					index : 'address',
					width : 100,
					align : "center",
					editable : true,
					search : true
				}, {
					name : 'phoneNumber',
					index : 'phoneNumber',
					width : 150,
					align : "center",
					editable : true
				}, {
					name : 'email',
					index : 'email',
					width : 110,
					align : "center",
					editable : true
				}, {
					name : 'companyName',
					index : 'companyName',
					width : 150,
					align : "center",
					editable : true
				}, {
					name : 'companyId',
					index : 'companyId',
					width : 150,
					align : "center",
					sorttype : "float",
					editable : false
				}, {
					name : 'groupId',
					index : 'groupId',
					width : 150,
					align : "center",
					sortable : false,
					editable : false
				}, {
					label : "Edit Actions",
					name : "actions",
					width : 50,
					align : 'center',
					formatter : "actions",
					formatoptions : {
						keys : true,
						editOptions : {},
						addOptions : {},
						delOptions : {}
					}
				} ],
				height : 'auto',
				rowNum : 5,
				sortname : 'userId',
				viewrecords : true,
				sortorder : "desc",
				loadonce : true,
				pager : '#jqGridPager'
			}, {
				closeAfterEdit : true
			}, {
				url : '${updateUserURL}',
				closeAfterAdd : true
			}, {}, {});
	$('#jqGrid').navGrid("#jqGridPager", {
		edit : false,
		add : true
	});
	$('#list').jqGrid('filterToolbar', {
		searchOnEnter : true,
		enableClear : false
	});
</script> --%>
