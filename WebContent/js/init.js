/**
 * Common Initializations
 */
$(function() {

	$("select option:eq(0)").attr("disabled", "disabled");

	$('#systemselect').change(function() {

		$.get("/agea_test/xml.action", function(data) {
			$("#info").val(data);
		});
	});

});