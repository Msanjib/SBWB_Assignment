<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<portlet:actionURL var="userInfoURL" name="goToUserInfo">
	<portlet:param name="id" value="$('#hiddenField').val()" />
	<portlet:param name="sds" value="sd" />
</portlet:actionURL>
<portlet:resourceURL var="showUserInfo"></portlet:resourceURL>
<portlet:resourceURL var="addNewUser"></portlet:resourceURL>
<portlet:actionURL name="editOrDeleteSBWBUsers"
	var="editOrDeleteSBWBUsers" />
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:defineObjects />
<div class="main-wrapper">
	<div class="navi-wrapper cfix">
		<h1>
			<strong>Employee.</strong>
		</h1>

		<form action="${addDepartment}" method="post" class="cfix">
			<input type="text" name="departmentName"
				placeholder="Search By Name." size="45" /> <input type="submit" />
		</form>
		<a href="#add_form" id="addNewEmp">Add New</a>
	</div>
	<div class="slider-wrapper cfix" id="slideWrap">
		<button id="hideInfo" class="hide-info">Hide</button>
		<img alt="hjkk"
			src="${pageContext.request.contextPath}/images/user.png">
		<form action="${userInfoURL}" method="post" id="revealUser">
			<label id="fnameLabel">Sanjib</label> <label id="lnameLabel"
				class="bold-label">Maharjan</label> <label id="addLabel">Lalitpur</label>
			<label id="phoneLabel">909090909</label> <label id="emailLabel"
				class="light-label">cshanjib@gmail.com</label> <input type="hidden"
				id="idSelected" name="idSelected" value="initial" /> <input
				type="submit" value="show More" />
		</form>

	</div>

	<div class="table-display">
		<table id="jqGridEmp"></table>
		<div id="jqGridPagerEmp"></div>
	</div>
</div>


<div id="add_form">
	<h1>Add a New Employee</h1>
	<p class="unhide">
		<span class="errormsg"></span>
	</p>

	<!-- <label for="name">* Name </label> -->
	<div class="clear"></div>
	<p class="left">
		<input name="fname" type="text" id="fname" maxlength="20"
			placeholder="first name" required />
	</p>
	<p class="right">
		<input name="lname" type="text" id="lname" maxlength="20"
			placeholder="last name" required />
	</p>
	<div class="clear"></div>

	<p class="left">
		<input name="address" type="text" id="address" maxlength="20"
			placeholder="Address" required />
	</p>
	<p class="right">
		<input name="phone" type="text" id="phone" maxlength="20"
			placeholder="phone number" required />
	</p>
	<div class="clear"></div>

	<label for="dep" class="left"> Department: </label> <select
		class="left" id="department">
		<c:forEach items="${departments}" var="role">
			<option value="<c:out value="${role.divisionId}" />"><c:out
					value="${role.divisionName}" /></option>
		</c:forEach>
		<option value="0">Executive</option>
	</select> <select class="right" id="status">
		<option value="true">Active</option>
		<option value="false">Inactive</option>
	</select> <label for="dep" class="right">
		Status:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </label>
	<div class="clear"></div>

	<!-- 	<label for="email">* Email </label> -->
	<p class="mail">
		<input name="email" type="text" id="email" required
			placeholder="email" />
	</p>


	<p class="right last">
		<input value="Add" type="button" id="send_form" />
	</p>
	<div class="clear"></div>
</div>










<script>
	$("#slideWrap").hide();
	var lastSel = 1;
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
							type : 'POST',
							url : '${showUserInfo}',
							data : {
								uid : id
							},
							dataType : 'json',
							success : function(result) {

								$('#fnameLabel').text(result.firstName);
								$('#lnameLabel').text(result.lastName);
								$('#addLabel').text(result.address);
								$('#phoneLabel').text(result.phoneNumber);
								$('#emailLabel').text(result.email);
								$("#slideWrap").show(500);
								console.log("ajax call complete "
										+ result.firstName);
								// window.location.href='${userInfoURL}';
							},
							error : function(result) {
								console.log("ajax call error complete");
							}
						});

					}
					//jQuery(this).editRow(id, true); 
				},
				loadComplete : function() {
					ModifyGridDefaultStyles();
				},
				colNames : [ 'userid', 'firstName', 'LastName', 'Department',
						'Address', 'Phone Number', 'Email', 'Status',
						'Company Id', 'Group Id', 'Actions' ],
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
					align : "center",
					width : 110,
					editrules:{required:true},
					editable : true
				}, {
					name : 'lastName',
					index : 'lastName',
					width : 110,
					align : "center",
					editrules:{required:true},
					editable : true
				}, {
					name : 'departmentName',
					index : 'departmentName',
					width : 110,
					align : "center",
					editable : true,
					edittype : "select",
					editoptions : {
						value : JSON.parse('${jsonDepartments}'),

					}
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
					editrules:{required:true},
					editable : true
				}, {
					name : 'email',
					index : 'email',
					width : 110,
					align : "center",
					editrules:{required:true,email:true},
					editable : true
				}, {
					name : 'status',
					index : 'status',
					width : 80,
					align : "center",
					editable : true,
					edittype : "select",
					cellattr: function(rowId, cellValue, rawObject, cm, rdata) {
					    if (cellValue=='Active') {
					        return ' class="green"';
					    }else{
					    	return ' class="red"';
					    }
					},
					editoptions : {
						value : {
							'true' : 'Active',
							'false' : 'Inactive'
						}
					},
				}, {
					name : 'companyId',
					index : 'companyId',
					width : 70,
					align : "center",
					sorttype : "float",
					editable : false
				}, {
					name : 'groupId',
					index : 'groupId',
					width : 70,
					align : "center",
					sortable : false,
					editable : false
				}, {
					label : "Edit Actions",
					name : "actions",
					width : 55,
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

	$("#addNewEmp").fancybox({
		type : "inline",
		padding : 10,
		wrapCSS : 'boxx'
	});
	$("#addNewEmp").click(function() {
		emptyAllFields();
	});
	$("#send_form")
			.click(
					function() {

						var fname = $("#fname").val();
						var lname = $("#lname").val();
						var address = $("#address").val();
						var phone = $("#phone").val();
						var department = $("#department").val();
						var status = $("#status").val();
						var email = $("#email").val();
						var errorMsg = "";
						if (fname.trim() == "") {
							errorMsg = "First name";
						} else if (lname.trim() == "") {
							errorMsg = "Last name";
						} else if (address.trim() == "") {
							errorMsg = "Address";
						} else if (phone.trim() == "") {
							errorMsg = "Phone Number";
						} else if (email.trim() == "") {
							errorMsg = "Email";
						} else {
							errorMsg = "";
						}
						if (errorMsg != "") {
							$(".errormsg").html(errorMsg + " is empty").fadeIn(
									"Slow").fadeOut(3000);
						} else if (!looksLikeMail(email)) {
							$(".errormsg").html("Email is Invalid..").fadeIn(
									"Slow").fadeOut(3000);
						} else {
							$(".errormsg").fadeOut();
							$
									.ajax({
										type : 'POST',
										url : '${addNewUser}',
										dataType : 'json',
										data : {
											fname : fname,
											lname : lname,
											phone : phone,
											address : address,
											department : department,
											status : status,
											uid : 'add',
											email : email,
										},
										beforeSend : function() {
											$("#add_form")
													.empty()
													.html(
															"<h3>Adding Employee "
																	+ fname
																	+ " "
																	+ lname
																	+ ".Please wait... </h3>");
										},
										error : function() {
											alert("Something went wrong!");
										},
										success : function(returnData) {
											emptyAllFields();
											$("#add_form")
													.empty()
													.html(
															"<h3>Successfully Added! <br/> Thank you</h3>");
											window.location.reload();

										}
									});
						}

					});

	function NewDeviceformatter(cellvalue, options, rowObject)

	{

		$("#" + options.rowId).addClass("selected highlight");

		return cellvalue;

	}

	function emptyAllFields() {
		$('#fname').val('');
		$('#lname').val('');
		$('#address').val('');
		$('#phone').val('');
		$('#email').val('');
	}
</script>
