/*!
 * common.js
 */
function log() {
	return false;
};
$(function() {
	$("#q").keypress(function(event) {
		if (event.keyCode == 13) {
			$("#search-form").submit();
		}
	});
});