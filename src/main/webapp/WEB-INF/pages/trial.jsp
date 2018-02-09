<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<meta name="viewport" content="initial-scale=1.0, user-scalable=no">--%>
    <%--<meta charset="utf-8">--%>
    <%--<title>Travel modes in directions</title>--%>
    <%--<style>--%>
        <%--/* Always set the map height explicitly to define the size of the div--%>
         <%--* element that contains the map. */--%>
        <%--#map {--%>
            <%--height: 100%;--%>
        <%--}--%>
        <%--/* Optional: Makes the sample page fill the window. */--%>
        <%--html, body {--%>
            <%--height: 100%;--%>
            <%--margin: 0;--%>
            <%--padding: 0;--%>
        <%--}--%>
        <%--#floating-panel {--%>
            <%--position: absolute;--%>
            <%--top: 10px;--%>
            <%--left: 25%;--%>
            <%--z-index: 5;--%>
            <%--background-color: #fff;--%>
            <%--padding: 5px;--%>
            <%--border: 1px solid #999;--%>
            <%--text-align: center;--%>
            <%--font-family: 'Roboto','sans-serif';--%>
            <%--line-height: 30px;--%>
            <%--padding-left: 10px;--%>
        <%--}--%>
    <%--</style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div id="floating-panel">--%>
    <%--<b>Mode of Travel: </b>--%>
    <%--<select id="mode">--%>
        <%--<option value="DRIVING">Driving</option>--%>
        <%--<option value="WALKING">Walking</option>--%>
        <%--<option value="BICYCLING">Bicycling</option>--%>
        <%--<option value="TRANSIT">Transit</option>--%>
    <%--</select>--%>
<%--</div>--%>
<%--<div id="map" style="height: 50%;"></div>--%>
<%--<div id="demo"></div>--%>
<%--<script>--%>
    <%--var clat,clon,long,latt;--%>
    <%--var flightPath;--%>
        <%--var x = document.getElementById("demo");--%>

<%--//    function initMap() {--%>
<%--//        var directionsDisplay = new google.maps.DirectionsRenderer;--%>
<%--//        var directionsService = new google.maps.DirectionsService;--%>
<%--//        var map = new google.maps.Map(document.getElementById('map'), {--%>
<%--//            zoom: 14,--%>
<%--//            center: {lat: 37.77, lng: -122.447}--%>
<%--//        });--%>
<%--//        directionsDisplay.setMap(map);--%>
<%--//--%>
<%--//        calculateAndDisplayRoute(directionsService, directionsDisplay);--%>
<%--//        document.getElementById('mode').addEventListener('change', function() {--%>
<%--//            calculateAndDisplayRoute(directionsService, directionsDisplay);--%>
<%--//        });--%>
<%--//    }--%>
<%--//    function calculateAndDisplayRoute(directionsService, directionsDisplay) {--%>
<%--//        var selectedMode = document.getElementById('mode').value;--%>
<%--//        directionsService.route({--%>
<%--//            origin: {lat: 37.77, lng: -122.447},  // Haight.--%>
<%--//            destination: {lat: 37.768, lng: -122.511},  // Ocean Beach.--%>
<%--//            // Note that Javascript allows us to access the constant--%>
<%--//            // using square brackets and a string value as its--%>
<%--//            // "property."--%>
<%--//            travelMode: google.maps.TravelMode[selectedMode]--%>
<%--//        }, function(response, status) {--%>
<%--//            if (status == 'OK') {--%>
<%--//                directionsDisplay.setDirections(response);--%>
<%--//            } else {--%>
<%--//                window.alert('Directions request failed due to ' + status);--%>
<%--//            }--%>
<%--//        });--%>
<%--//    }--%>
    <%--var directionsDisplay;--%>
    <%--var directionsService;--%>
    <%--function initMap() {--%>
        <%--directionsDisplay= new google.maps.DirectionsRenderer;--%>
       <%--directionsService = new google.maps.DirectionsService;--%>
        <%--var map = new google.maps.Map(document.getElementById('map'), {--%>
            <%--zoom: 10,--%>
            <%--center: {lat: 37.77, lng: -122.447}--%>
        <%--});--%>
        <%--directionsDisplay.setMap(map);--%>


    <%--}--%>
    <%--setInterval(function () {--%>
        <%--getLocation();--%>
        <%--function getLocation() {--%>
            <%--if (navigator.geolocation) {--%>
                <%--navigator.geolocation.getCurrentPosition(showPosition);--%>
            <%--} else {--%>
                <%--x.innerHTML = "Geolocation is not supported by this browser.";--%>
            <%--}--%>
        <%--}--%>

        <%--function showPosition(position) {--%>
        <%--x.innerHTML = "Latitude: " + position.coords.latitude +--%>
        <%--"<br>Longitude: " + position.coords.longitude;--%>
            <%--clat=position.coords.latitude;--%>
            <%--clon=position.coords.longitude;--%>
            <%--parameters()--%>
        <%--}--%>
        <%--function parameters() {--%>
            <%--$.ajax({url: "/location", success: function(result){--%>
                <%--console.log(result);--%>

                <%--long = result.substring(0,result.indexOf("^"))*1;--%>
                <%--latt = result.substring(result.indexOf("^")+1,result.length)*1;--%>

                <%--console.log(long);--%>
                <%--console.log(latt);--%>
                <%--calculateAndDisplayRoute(directionsService, directionsDisplay);--%>
                <%--document.getElementById('mode').addEventListener('change', function() {--%>
                    <%--calculateAndDisplayRoute(directionsService, directionsDisplay);--%>
                <%--});--%>
            <%--}});--%>
        <%--}--%>



        <%--// Handler for .ready() called.--%>


    <%--function calculateAndDisplayRoute(directionsService, directionsDisplay) {--%>
        <%--var selectedMode = document.getElementById('mode').value;--%>
        <%--directionsService.route({--%>
            <%--origin: {lat: clat, lng: clon},  // Haight.--%>
            <%--destination: {lat: latt, lng: long},--%>
            <%--// Ocean Beach.--%>
            <%--// Note that Javascript allows us to access the constant--%>
            <%--// using square brackets and a string value as its--%>
            <%--// "property."--%>
            <%--travelMode: google.maps.TravelMode[selectedMode]--%>
        <%--}, function(response, status) {--%>
            <%--if (status == 'OK') {--%>
                <%--directionsDisplay.setDirections(response);--%>
            <%--} else {--%>
                <%--window.alert('Directions request failed due to ' + status);--%>
            <%--}--%>
        <%--});--%>
    <%--}--%>
    <%--},10000);--%>
<%--</script>--%>
<%--<script async defer--%>
        <%--src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC5x6aDJ3iIfQhXyclRQGD5BNB0OcENyL0&callback=initMap">--%>
<%--</script>--%>
<%--<script src="/resources/assets/js/jquery-1.10.2.min.js"></script>--%>

<%--</body>--%>
<%--</html>--%>





































<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Rath Yatra Iskcon GZB</title>
    <link href="/resources/bootstrap/css/bootstrap.min.css">
    <style>
        /* Always set the map height explicitly to define the size of the div
         * element that contains the map. */
        #map {
            height: 100%;
        }
        /* Optional: Makes the sample page fill the window. */
        html, body {
            height: 100%;
            margin: 0;
            padding: 0;
        }


    </style>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC5x6aDJ3iIfQhXyclRQGD5BNB0OcENyL0"></script>
<script src="/resources/assets/js/jquery-1.10.2.min.js"></script>
<script src="/resources/assets/js/bootstrap.min.js"></script>
</head>
<body onload="getLocation();">
<header style="background-color: yellow;font-size:200%;font-weight: bolder ">
    <center>
    <div id="yatraheader">
    Iskcon rath Yatra Live Tracking<br>
    Please Wait We are Tracking The Location Of Yatra
    </div>
        <div>
            <marquee behavior="" direction=""> Hare Krishna Hare Krishna Krishna krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare </marquee>
        </div>
    </center>
</header>

    <div id="map" class="center-block" style="height: 50%;width: 50%;margin-left: 25%;margin-top: 5%;margin-bottom: 2%"></div>
<center>
<div id="demo"></div>
<b>Current Address Of Rath Yatra : &nbsp;<div id="addr" class="center-block"></div></b>
<div id="viewongoogle"></div>
</center>
</body>
<script>
//    $( document ).ready(function() {
//getUserLocation();
//
//    });
var clat,clon,long,latt;
var flightPath;
var geocoder;
    var x = document.getElementById("demo");
var viewongoogle = document.getElementById("viewongoogle");

    // Handler for .ready() called.
    function getLocation() {
        geocoder = new google.maps.Geocoder();
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(showPosition);
        } else {
            x.innerHTML = "Geolocation is not supported by this browser.";
        }
    }

    function showPosition(position) {
//        x.innerHTML = "Latitude: " + position.coords.latitude +
//            "<br>Longitude: " + position.coords.longitude;
        clat=position.coords.latitude;
        clon=position.coords.longitude;
    }


    setInterval(function () {

        var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    var labelIndex = 0;
    parameters()
        function parameters() {
            $.ajax({url: "/location", success: function(result){
console.log(result);

                long = result.substring(0,result.indexOf("^"))*1;
                 latt = result.substring(result.indexOf("^")+1,result.length)*1;
                 $("#viewongoogle").empty();
                 $("#yatraheader").empty();
                 $("#yatraheader").text('Iskcon Ghazibad Rath Yatra Live tracking');
                  $('#viewongoogle').append('click Here To Get Direction <br><a target="_blank" href="https://maps.google.com/maps?q='+latt+','+long+'&hl=es;z=14&amp;/" >Get Directions</a>');
                initialize(latt,long);

            }});
        }


    function initialize(lat,longi) {
        var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
        var labelIndex = 0;
        var India = { lat:lat, lng:longi};
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 13,
            center: India
        });

        // This event listener calls addMarker() when the map is clicked.
//        google.maps.event.addListener(map, 'click', function(event) {
//            addMarker(event.latLng, map);
//        });

        // Add a marker at the center of the map.
        addMarkerToRathYatra(India, map);
        var clocation={lat:clat,lng :clon};
        addMarkerToYourLocation(clocation,map);
    }

    // Adds a marker to the map.
    function addMarkerToRathYatra(location, map) {
        // Add the marker at the clicked location, and add the next-available label
        // from the array of alphabetical characters.
        var marker = new google.maps.Marker({
            position: location,
            label: "Yatra",
            map: map
        });
    }
        function addMarkerToYourLocation(location, map) {
            // Add the marker at the clicked location, and add the next-available label
            // from the array of alphabetical characters.

            var marker = new google.maps.Marker({
                position: location,
                label: "You",
                map: map
            });
            var flightPlanCoordinates = [
                {lat: clat, lng: clon},
                {lat: latt, lng: long}
            ];
            flightPath= new google.maps.Polyline({
                path: flightPlanCoordinates,
                geodesic: true,
                strokeColor: '#000000',
                strokeOpacity: 1.0,
                strokeWeight: 2,

            });

            flightPath.setMap(map);
//        distance(latt,long,clat,clon);
            $("#addr").empty();
        codeLatLng(latt,long);
    }
        function codeLatLng(lat, lng) {

            var latlng = new google.maps.LatLng(lat, lng);
            geocoder.geocode({'latLng': latlng}, function(results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                    console.log(results)
                    if (results[1]) {
                        //formatted address

                        $("#addr").text(results[0].formatted_address);
                        //find country name
                        for (var i=0; i<results[0].address_components.length; i++) {
                            for (var b=0;b<results[0].address_components[i].types.length;b++) {

                                //there are different types that might hold a city admin_area_lvl_1 usually does in come cases looking for sublocality type will be more appropriate
                                if (results[0].address_components[i].types[b] == "administrative_area_level_1") {
                                    //this is the object you are looking for
                                    city= results[0].address_components[i];
                                    break;
                                }
                            }
                        }
                        //city data
//                        alert(city.short_name + " " + city.long_name)


                    } else {
//                        alert("No results found");
                    }
                } else {
//                    alert("Geocoder failed due to: " + status);
                }
            });
        }


        google.maps.event.addDomListener(window, 'load', initialize);

//        function distance(lat1,lon1,lat2,lon2) {
//            var R = 6371; // km (change this constant to get miles)
//            var dLat = (lat2-lat1) * Math.PI / 180;
//            var dLon = (lon2-lon1) * Math.PI / 180;
//            var a = Math.sin(dLat/2) * Math.sin(dLat/2) +
//                Math.cos(lat1 * Math.PI / 180 ) * Math.cos(lat2 * Math.PI / 180 ) *
//                Math.sin(dLon/2) * Math.sin(dLon/2);
//            var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
//            var d = R * c;
//            if (d>1) {
//                document.getElementById("distance").innerHTML="You Are "+Math.round(d)+"km Far From Rath yatra";
//            }
//            else if (d<=1)
//            {
//                document.getElementById("distance").innerHTML="You Are "+Math.round(d*1000)+"m Far From Rath yatra";
//            }
//           else {
//                document.getElementById("distance").innerHTML="You Are "+d+"meter Far From Rath yatra";
//
//            }
//
//        }
//        function distance(lat1, lon1, lat2, lon2, unit) {
//            var radlat1 = Math.PI * lat1 / 180
//            var radlat2 = Math.PI * lat2 / 180
//            var theta = lon1 - lon2
//            var radtheta = Math.PI * theta / 180
//            var dist = Math.sin(radlat1) * Math.sin(radlat2) + Math.cos(radlat1) * Math.cos(radlat2) * Math.cos(radtheta);
//            dist = Math.acos(dist)
//            dist = dist * 180 / Math.PI
//            dist = dist * 60 * 1.1515
//            unit="K";
//            if (unit == "K") {
//                dist = dist * 1.609344
//            }
//            if (unit == "N") {
//                dist = dist * 0.8684
//            }
//            document.getElementById("distance").innerHTML="You Are "+dist+" Far From Rath yatra";
//        }

    }, 10000);

    // In the following example, markers appear when the user clicks on the map.
    // Each marker is labeled with a single alphabetical character.
    </script>
</html>




<%--&lt;%&ndash;<!DOCTYPE html>&ndash;%&gt;--%>
<%--&lt;%&ndash;<html>&ndash;%&gt;--%>
<%--&lt;%&ndash;<head>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<meta name="viewport" content="initial-scale=1.0, user-scalable=no">&ndash;%&gt;--%>
    <%--&lt;%&ndash;<meta charset="utf-8">&ndash;%&gt;--%>
    <%--&lt;%&ndash;<title>Simple Polylines</title>&ndash;%&gt;--%>
    <%--&lt;%&ndash;<style>&ndash;%&gt;--%>
        <%--&lt;%&ndash;/* Always set the map height explicitly to define the size of the div&ndash;%&gt;--%>
         <%--&lt;%&ndash;* element that contains the map. */&ndash;%&gt;--%>
        <%--&lt;%&ndash;#map {&ndash;%&gt;--%>
            <%--&lt;%&ndash;height: 100%;&ndash;%&gt;--%>
        <%--&lt;%&ndash;}&ndash;%&gt;--%>
        <%--&lt;%&ndash;/* Optional: Makes the sample page fill the window. */&ndash;%&gt;--%>
        <%--&lt;%&ndash;html, body {&ndash;%&gt;--%>
            <%--&lt;%&ndash;height: 100%;&ndash;%&gt;--%>
            <%--&lt;%&ndash;margin: 0;&ndash;%&gt;--%>
            <%--&lt;%&ndash;padding: 0;&ndash;%&gt;--%>
        <%--&lt;%&ndash;}&ndash;%&gt;--%>
    <%--&lt;%&ndash;</style>&ndash;%&gt;--%>
<%--&lt;%&ndash;</head>&ndash;%&gt;--%>
<%--&lt;%&ndash;<body>&ndash;%&gt;--%>
<%--&lt;%&ndash;<div id="map"></div>&ndash;%&gt;--%>
<%--&lt;%&ndash;<script>&ndash;%&gt;--%>

    <%--&lt;%&ndash;// This example creates a 2-pixel-wide red polyline showing the path of&ndash;%&gt;--%>
    <%--&lt;%&ndash;// the first trans-Pacific flight between Oakland, CA, and Brisbane,&ndash;%&gt;--%>
    <%--&lt;%&ndash;// Australia which was made by Charles Kingsford Smith.&ndash;%&gt;--%>

    <%--&lt;%&ndash;function initMap() {&ndash;%&gt;--%>
        <%--&lt;%&ndash;var map = new google.maps.Map(document.getElementById('map'), {&ndash;%&gt;--%>
            <%--&lt;%&ndash;zoom: 50,&ndash;%&gt;--%>
            <%--&lt;%&ndash;center: {lat: 28.676832499999996, lng: 77.41997179999998},&ndash;%&gt;--%>
            <%--&lt;%&ndash;mapTypeId: 'terrain'&ndash;%&gt;--%>
        <%--&lt;%&ndash;});&ndash;%&gt;--%>

        <%--&lt;%&ndash;var flightPlanCoordinates = [&ndash;%&gt;--%>
            <%--&lt;%&ndash;{lat: 28.676832499999996, lng: 77.41997179999998},&ndash;%&gt;--%>
            <%--&lt;%&ndash;{lat: 28.676832499101010, lng: 77.41997179999788},&ndash;%&gt;--%>
            <%--&lt;%&ndash;{lat: 28.676832499292827, lng: 77.419971799999688},&ndash;%&gt;--%>
            <%--&lt;%&ndash;{lat: 28.676832499928498, lng: 77.419971799998588}&ndash;%&gt;--%>
        <%--&lt;%&ndash;];&ndash;%&gt;--%>
        <%--&lt;%&ndash;var flightPath = new google.maps.Polyline({&ndash;%&gt;--%>
            <%--&lt;%&ndash;path: flightPlanCoordinates,&ndash;%&gt;--%>
            <%--&lt;%&ndash;geodesic: true,&ndash;%&gt;--%>
            <%--&lt;%&ndash;strokeColor: '#FF0000',&ndash;%&gt;--%>
            <%--&lt;%&ndash;strokeOpacity: 1.0,&ndash;%&gt;--%>
            <%--&lt;%&ndash;strokeWeight: 2&ndash;%&gt;--%>
        <%--&lt;%&ndash;});&ndash;%&gt;--%>

        <%--&lt;%&ndash;flightPath.setMap(map);&ndash;%&gt;--%>
    <%--&lt;%&ndash;}&ndash;%&gt;--%>
<%--&lt;%&ndash;</script>&ndash;%&gt;--%>
<%--&lt;%&ndash;<script async defer&ndash;%&gt;--%>
        <%--&lt;%&ndash;src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC5x6aDJ3iIfQhXyclRQGD5BNB0OcENyL0&callback=initMap">&ndash;%&gt;--%>
<%--&lt;%&ndash;</script>&ndash;%&gt;--%>
<%--&lt;%&ndash;</body>&ndash;%&gt;--%>
<%--&lt;%&ndash;</html>&ndash;%&gt;--%>

