<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<portlet:actionURL name="editOrDeleteDivision" var="editDivision" />
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:actionURL name="addNewDivision" var="addDivision" />
<portlet:defineObjects />
<div class="form-wrapper cfix">
	<div class="displayDep">DEPARTMENTS</div>
	<div class="displayDep displayDepC">NO OF DEPAREMENTS:${noDep}</div>
</div>
<div class="form-wrapper cfix">
	<div class="wrapper-add">
		<h1 class="add-title">Add your own Department</h1>
		<form action="${addDivision}" method="post" id="formDepartment">
				<input id ="divName" type="text" name="divisionName" placeholder="Department Name" />
				<input type="button" value="Add" onclick="notBlank()">
				<label id="labelErr"></label>
		</form>
		
	</div>
	<div class="wrapper-display">
		<table id="jqGridDep"></table>
		<div id="jqGridPagerDep"></div>
	</div>
</div>
<script>
jQuery("#jqGridDep").jqGrid({
	url:'${serve}',
	editurl:'${editDivision}',
    datatype: 'json',
    edit: true, add: true, del: true,
    postData: {ids:23} ,
	loadComplete : function() {
		ModifyGridDefaultStyles();
	},
    colNames:['id', 'Department', 'created by','Created On','CompanyId','GroupId','Actions'],
    colModel:[
    {name:'divisionId',index:'divisionId', width:60,align:"center", sorttype:"int",key:true},
    {name:'divisionName',index:'divisionName',align:"center", width:300, editable: true,
    	editrules: {
    	    required: true}
        },
    {name:'createdBy',index:'createdBy', width:125, align:"center", editable: false},
    {name:'createdOn',index:'createdOn', width:120, align:"center", editable: false},
    {name:'companyId',index:'companyId', width:120,align:"center",sorttype:"float", editable: false},
    {name:'groupId',index:'groupId', width:120,align:"center", sortable:false, editable: false},{
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
    sortname: 'divisionId',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    pager:'#jqGridPagerDep'
},{},{},{},{});


function ModifyGridDefaultStyles() {
	$('#' + "jqGridEmp" + ' tr').removeClass("ui-widget-content");
	$('#' + "jqGridEmp" + ' tr:nth-child(even)').addClass("evenTableRow");
	$('#' + "jqGridEmp" + ' tr:nth-child(odd)').addClass("oddTableRow");
	$('#' + "jqGridDep" + ' tr').removeClass("ui-widget-content");
	$('#' + "jqGridDep" + ' tr:nth-child(even)').addClass("evenTableRow");
	$('#' + "jqGridDep" + ' tr:nth-child(odd)').addClass("oddTableRow");
}
function notBlank(){
	if($("#divName").val() == ''){
		$("#labelErr").html("Department name is empty.");
	}else{
		$("#labelErr").empty();
		$("#formDepartment").submit();
	}
}
</script>
