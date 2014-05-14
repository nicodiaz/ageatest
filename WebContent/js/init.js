/**
 * Common Initializations
 */
$(function() {

	$("select option:eq(0)").attr("disabled", "disabled");

	$('#systemselect').change(function() {
		var systemId = this.value;

		$.get("xml.action?requestSystemId=" + systemId, function(data) {
			$("#info").val(data);
		});
	});

});