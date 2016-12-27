/**
 *
 */

function href(url){
	  location.href =url;

};





function creatOrderHtml(name,quntity,addclass,subclass,qutityid,toltalid)
{
	var a= '	<div class="row ">	<div class="col-xs-4 ">		<p>'+name+'</p>	</div>	<div class="col-xs-2 ">		￥<i id="'+toltalid+'">'+quntity+
	'</i>	</div>	<div class="col-xs-2 '+subclass+'">		<button class="btn  btn-info" type="button " style="float: right;">-</button>	</div>'+
	'<div class="col-xs-2  " style="text-align: center">		<p id="'+qutityid+'">1</p>	</div>	<div class="col-xs-2 '+addclass+'">'+
	'	<button class="btn btn-info"  type="button ">+</button>	</div></div>';
	
	return a;
}

top