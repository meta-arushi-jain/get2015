function show(){
	
		var text=document.getElementById("text_area");
		text.innerHTML="This is Text";
		document.getElementById("show_hide").value="hide";
		document.getElementById("show_hide").onclick=hide;
}
function hide(){
		var text=document.getElementById("text_area");
		text.innerHTML="";
		document.getElementById("show_hide").value="show";
		document.getElementById("show_hide").onclick=show;
}