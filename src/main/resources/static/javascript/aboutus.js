var i=1;
var values = ["Best website design and development company","Make your local business to global business with us","Don't just dream up your great ideas tell us now"," We will make your dream ideas into reality","Opportunities don't happen. You create them.","Contact now on 8435999567 for Quotation","Money back gurantee within 30 days in webdesign"];
setInterval(function(){
	document.getElementById('autotype1').innerHTML=values[i];
	i++;
	if(i<6){
		i=0;
	}
}, 6000);