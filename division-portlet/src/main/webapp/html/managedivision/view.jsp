<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%-- 
<portlet:resourceURL var="jqGridFormResourceURL">
	<portlet:param name="jspPage" value="/html/jqgridaction/form.jsp"></portlet:param>
</portlet:resourceURL> --%>
<portlet:actionURL name="update" var="updates" />
<portlet:actionURL name="editOrDeleteDivision" var="editDivision" />
<portlet:actionURL name="deleteDivision" var="deleteDivision" />
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
	/* $(".ui-jqgrid-sortable").each(function() {
		this.style.cursor = "cursor";
		this.style.color = "#000";
		this.style.fontWeight = "bold";
		
	}); */
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
		
		
/* $('#jqGrid').navGrid("#jqGridPager", {edit: false, add: true}); */
/* $('#jqGrid').inlineNav('#jqGridPager',
    // the buttons to appear on the toolbar of the grid
    { 
        edit: true, 
        add: false, 
        del: true, 
        cancel: true,
        editParams: {
            keys: true,
        },
        addParams: {
            keys: true
        }
    }); */
/* jQuery("#list3").jqGrid('navGrid','#pager3',
{edit:false,add:false,del:false},
{},
{},
{},
{multipleSearch:true, multipleGroup:true}
); */
<%-- jQuery("#jqGrid").jqGrid({
    data:'<%=obj%>',
    datatype: "json",
    colNames:['id', 'department', 'created by','Updated By','CompanyId','GroupId'],
    colModel:[
    {name:'departmentId',index:'departmentId', width:60, sorttype:"int"},
    {name:'departmentName',index:'departmentName', width:100},
    {name:'createdBy',index:'createdBy', width:80, align:"right",sorttype:"float"},
    {name:'updatedBy',index:'updatedBy', width:80, align:"right",sorttype:"float"},
    {name:'companyId',index:'companyId', width:80,align:"right",sorttype:"float"},
    {name:'groupId',index:'groupId', width:150, sortable:false}
    ],
    multiselect: true,
    rowNum:20,
    rowList:[10,20,30],
    pager: '#pager3',
    sortname: 'id',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    caption: "Load Once Example"
});
jQuery("#list3").jqGrid('navGrid','#pager3',
{edit:false,add:false,del:false},
{},
{},
{},
{multipleSearch:true, multipleGroup:true}
); --%>



</script>
