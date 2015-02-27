(function($, W, D) {
	var JQUERY4U = {};

	JQUERY4U.UTIL = {
		setupFormValidation : function() {
			$("#register-form")
					.validate(
							{	
								focusInvalid: true,
								errorElement: 'span',
								rules : {
									firstName : "required",
									lastName : "required",
									email : {
										required : true,
										email : true
									},
									phoneNumber : {
										required : true,
									},
									address :{
										required : true,
									},
									agree : "required"
								},
								messages : {
									firstName : "Please enter your firstname",
									lastName : "Please enter your lastname",
									email : "Please enter a valid email address",
									phoneNumber: "Please enter your phone number",
									agree : "Please accept our policy"
								},
								submitHandler : function(form) {
									form.submit();
								}
							});
		}
	}
	// when the dom has loaded setup form validation rules
	$(D).ready(function($) {
		JQUERY4U.UTIL.setupFormValidation();
	});

})(jQuery, window, document);