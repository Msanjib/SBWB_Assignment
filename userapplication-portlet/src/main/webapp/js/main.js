function ModifyGridDefaultStyles() {
	$('#' + "jqGridEmp" + ' tr').removeClass("ui-widget-content");
	$('#' + "jqGridEmp" + ' tr:nth-child(even)').addClass("evenTableRows");
	$('#' + "jqGridEmp" + ' tr:nth-child(odd)').addClass("oddTableRows");

	$('#' + "jqGridDep" + ' tr').removeClass("ui-widget-content");
	$('#' + "jqGridDep" + ' tr:nth-child(even)').addClass("evenTableRows");
	$('#' + "jqGridDep" + ' tr:nth-child(odd)').addClass("oddTableRows");
}
function getSelectedId() {
	return $('#hiddenField').val();
}
$("#hideInfo").click(function() {
	$("#slideWrap").hide(500);
});

function isValidEmailAddress(email_add) {
	var pattern = new RegExp(
			/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);
	return pattern.test(email_add);
}

function looksLikeMail(email) {
    var lastAtPos = email.lastIndexOf('@');
    var lastDotPos = email.lastIndexOf('.');
    return (lastAtPos < lastDotPos && lastAtPos > 0 && email.indexOf('@@') == -1 && lastDotPos > 2 && (email.length - lastDotPos) > 2);
}