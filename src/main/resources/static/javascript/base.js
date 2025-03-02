
let element = document.getElementById("nava11");
	      element.addEventListener("mouseover", function( event ) {
//	            console.log("hovered")
	            document.getElementById('navigation').style.position="sticky";  
	            
	            let navbar=document.getElementById('nava11');
	             navbar.addEventListener("mouseover",function( event ){
	            	 document.getElementById('nava11').style.top="53px";
	             })
	             
	              navbar.addEventListener("mouseout",function( event ){
	            	  
	            	  document.getElementById('nava11').style.top="0px";
	            	  
	             }, false);
	             
	            // do what you want to do here
	      }, false);
	      element.addEventListener("mouseout", function( event ) {
	    
//	    	  console.log("removed")
	            document.getElementById('navigation').style.position="relative";
	    	 // do what you want to do here
	      }, false);

	      let uppernav = document.getElementById('navigation');
	      uppernav.addEventListener("mouseover", function( event ) {
	    	  document.getElementById('navigation').style.position="sticky"; 
	    	  document.getElementById('nava11').style.top="53px";
	      }, false);
	      uppernav.addEventListener("mouseout", function( event ) {
	    	  document.getElementById('navigation').style.position="relative";
	    	  document.getElementById('nava11').style.top="0px";
	      }, false);


$(document).ready(function()
{


if($('.bbb_viewed_slider').length)
{
var viewedSlider = $('.bbb_viewed_slider');

viewedSlider.owlCarousel(
{
loop:true,
margin:30,
autoplay:true,
autoplayTimeout:6000,
nav:false,
dots:false,
responsive:
{
0:{items:1},
575:{items:2},
768:{items:3},
991:{items:4},
1199:{items:6}
}
});

if($('.bbb_viewed_prev').length)
{
var prev = $('.bbb_viewed_prev');
prev.on('click', function()
{
viewedSlider.trigger('prev.owl.carousel');
});
}

if($('.bbb_viewed_next').length)
{
var next = $('.bbb_viewed_next');
next.on('click', function()
{
viewedSlider.trigger('next.owl.carousel');
});
}
}


});