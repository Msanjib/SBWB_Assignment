<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%-- 
<portlet:resourceURL var="jqGridFormResourceURL">
	<portlet:param name="jspPage" value="/html/jqgridaction/form.jsp"></portlet:param>
</portlet:resourceURL> --%>
<portlet:actionURL name="update" var="updates" />
<portlet:actionURL name="editOrDeleteDepartment" var="editDepartment" />
<portlet:actionURL name="deleteDepartment" var="deleteDepartment" />
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:resourceURL var="serve"></portlet:resourceURL>
<portlet:actionURL name="addNewDepartment" var="addDepartment" />
<portlet:defineObjects />
<div class="form-wrapper cfix">
	<div class="wrapper-display">
		<h1 class="add-title">Available Departments</h1>
		<table id="jqGrid"></table>
		<div id="jqGridPager"></div>
	</div>
	<div class="wrapper-add">
		<h1 class="add-title">Add your own Department</h1>
		<aui:form action="${addDepartment}" method="post">
			<aui:fieldset>
				<aui:input name="departmentName" size="45" />
				<aui:button-row>
					<aui:button value="Add" type="submit" />
				</aui:button-row>
			</aui:fieldset>
		</aui:form>
	</div>
</div>

<script>

jQuery("#jqGrid").jqGrid({
	url:'${serve}',
	editurl:'${editDepartment}',
    datatype: 'json',
    edit: true, add: true, del: true,
    postData: {ids:23} ,
    colNames:['id', 'department', 'created by','Created On','CompanyId','GroupId','Actions'],
    colModel:[
    {name:'departmentId',index:'departmentId', width:60,align:"center", sorttype:"int",key:true},
    {name:'departmentName',index:'departmentName',align:"left", width:300, editable: true,
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
    rowNum:10,
    sortname: 'departmentId',
    viewrecords: true,
    sortorder: "desc",
    loadonce: true,
    pager:'#jqGridPager'
},{},{},{},{});
		
		
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

