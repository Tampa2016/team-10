/**
 * 
 */

function initMap() {
  var latLng = new google.maps.LatLng(
		  27.987907, 
		  -82.328976);
  var homeLatLng = new google.maps.LatLng(27.987907, 
		  -82.328976);

  var map = new google.maps.Map(document.getElementById('map_canvas'), {
    zoom: 17,
    center: latLng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
    
  });

  var marker = new MarkerWithLabel({
    position: homeLatLng,
    map: map,
    draggable: true,
    raiseOnDrag: true,
    labelContent: "ABLE!",
    labelAnchor: new google.maps.Point(15, 65),
    labelClass: "labels", // the CSS class for the label
    labelInBackground: false,
    icon: pinSymbol('red')
  });

  var iw = new google.maps.InfoWindow({
    content: "[ABLE] Ramp Available<br/>" +
    "[ABLE] Automated Doors<br/>" +
	"[ABLE] Double Doors<br/>" +
	"[ABLE] Elevators<br/>" +
	"[ABLE] Handicap Parking<br/>" +
	"[ABLE] Handicap Bathrooms"
  });
  google.maps.event.addListener(marker, "click", function(e) {
    iw.open(map, this);
  });

}

function pinSymbol(color) {
  return {
    path: 'M 0,0 C -2,-20 -10,-22 -10,-30 A 10,10 0 1,1 10,-30 C 10,-22 2,-20 0,0 z',
    fillColor: color,
    fillOpacity: 1,
    strokeColor: '#000',
    strokeWeight: 2,
    scale: 2
  };
  
}
google.maps.event.addDomListener(window, 'load', initMap);