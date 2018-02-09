<jsp:include page="HarinaamsankirtanBookingHeader.jsp"></jsp:include>
<!-- End page header -->
<script src="https://maps.googleapis.com/maps/api/js?libraries=places&key=AIzaSyD4dO12ubnxgrSYlPPSuINO89wfBzl1R8k"></script>

<!-- property area -->
<div class="content-area submit-property" style="background-color: #FCFCFC;">&nbsp;
    <div class="container">
        <div class="clearfix" >
            <div class="wizard-container">

                <div class="wizard-card ct-wizard-orange" id="wizardProperty">
                    <form action="/bookharinaamsankirtan" method="post" autocomplete="off">
                        <div class="wizard-header">
                            <h3>
                                <b>Submit</b> YOUR PROPERTY <br>
                                <small>Lorem ipsum dolor sit amet, consectetur adipisicing.</small>
                            </h3>
                        </div>

                        <ul>
                            <li><a href="#step1" data-toggle="tab">Step 1 </a></li>
                            <li><a href="#step2" data-toggle="tab">Step 2 </a></li>
                            <li><a href="#step3" data-toggle="tab">Step 3 </a></li>
                            <li><a href="#step4" data-toggle="tab">Finished </a></li>
                        </ul>

                        <div class="tab-content">

                            <div class="tab-pane" id="step1">
                                <div class="row p-b-15  ">
                                    <h4 class="info-text" style="color: black;"> HARINAAM SANKIRTAN BOOKING FORM<BR><marquee><SMALL style="color: black;font-style: italic;">Hare Krishna Hare Krishna Krishna Krishna Hare Hare Hare Rama Hare Rama Rama Rama Hare Hare</SMALL></marquee></h4>
                                    <div class="col-sm-4 col-sm-offset-1">
                                        <div class="picture-container">
                                            <div class="picture">
                                                <img src="/resources/assets/img/prabhuji.jpg" class="picture-src" id="wizardPicturePreview" height="300px"/>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Username <small> (full name)</small></label>
                                            <input type="text" name="userName"  class="form-control" placeholder="Sahil Verma..." required >
                                        </div>

                                        <div class="form-group">
                                            <label>Email ID <small></small></label>
                                            <input  type="email" name="eMail" class="form-control" placeholder="sahil.verma@gmail.com" required>
                                        </div>
                                        <div class="form-group">
                                            <label>Your permnenet Address </label>
                                            <input  type="text" name="currentAddress" class="form-control" placeholder="B-block,raj nagar,ghaziabad" required >
                                        </div>
                                        <div class="form-group">
                                            <label>Mobile No. </label>
                                            <input  type="number" name="mobileNumber" minlength="10" maxlength="10" size="10" class="form-control" placeholder="9899xxxxxx" required >
                                        </div>
                                        <div class="form-group">
                                            <label>Alternate mobile No.</label>
                                            <input type="number" name="alternateMobileNumber" minlength="10" maxlength="10" size="10" class="form-control" placeholder="Alternate Mobile Number...." required>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--  End step 1 -->

                            <div class="tab-pane" id="step2">
                                <h4 class="info-text">...About Sankirtanam...</h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Venue <small>(locatiion from where sankirtan starts)</small></label>
                                                <input type="text" name="venue" class="form-control" placeholder="sec-11,  ISKCON CHOWK, R-11/35, Hare Krishna Marg, Block 11, Raj Nagar, Ghaziabad" required>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Street</label>
                                                <input type="text" class="form-control" id="us3-address" placeholder="Raj Nagar" name="street" />
                          <%--1                      <input type="text" name="street" class="form-control"  required>--%>
                                                <%--<div id="us3" ></div>--%>
                                                <div class="map_canvas" style="display: none;"></div>

                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="col-sm-3">
                                            <div class="form-group">
                                                <label for="dtp_input3" >Time</label>

                                                <input type="time" name="time" id="dtp_input3" value="" placeholder="HH:MM" required/><br/>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-12">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="dtp_input2" class="col-md-2 control-label" >Date Picking</label>
                                                <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                                                    <input class="form-control" size="16" type="text" value="" readonly required>
                                                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                                                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                                                </div>
                                                <input type="hidden" name="date" id="dtp_input2" value="" /><br/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label>Hs Admin <small>(Resource)</small></label>
                                                <select  required id="hsadmin" class="selectpicker show-tick form-control" name="hsAdmin">
                                                    <option value="">Hs Admin Name</option>
                                                    <option value="Jagbandu Prabhu ji"> Jagbandu Prabhu ji </option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>

                                    <br>
                                </div>
                            </div>
                            <!-- End step 2 -->

                            <div class="tab-pane" id="step3">
                                <h4 class="info-text">...Facilities you want to provide... </h4>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Music system <small>(<b>with mic</b>)</small></label>
                                        <div class="radio">
                                            <label> <input  required type="radio" value="Yes" name="musicSystem">&nbsp;yes</label>
                                        </div>
                                        <div class="radio">
                                            <label><input  required type="radio" value="No" name="musicSystem">&nbsp;No</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Prasadam / Bhojan</label>
                                        <div class="radio">
                                            <label> <input  required type="radio" value="Yes" name="krishnaPrasadam">&nbsp;yes</label>
                                        </div>
                                        <div class="radio">
                                            <label><input  required type="radio" value="No" name="krishnaPrasadam">&nbsp;No</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Trolley For Music System</label>
                                        <div class="radio">
                                            <label> <input  required type="radio" value="Yes" name="trolly">&nbsp;yes</label>
                                        </div>
                                        <div class="radio">
                                            <label>

                                                <input  required type="radio" value="No" name="trolly" >&nbsp;No</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Vehicle <small>(Resource)</small></label>
                                        <select  required id="basic" class="selectpicker show-tick form-control" name="vechile" >
                                            <option  value="">Vehicle</option>
                                            <option value="No"> No </option>
                                            <option value="4-seater Car"> 4-seater Car </option>
                                            <option value="7-seater Car"> 7-seater Car </option>
                                            <option value="Bus"> Bus </option>
                                            <option value="mini bus"> Mini Bus </option>
                                        </select>
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label> Number Of Vechiles Provided </label>
                                        <input  required type="number" placeholder="4" name="numberOfVechiles">
                                    </div>
                                </div>
                            </div>
                            <!--  End step 3 -->


                            <div class="tab-pane" id="step4">
                                <h4 class="info-text"> Finished and submit </h4>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="">
                                            <p>
                                                <label><strong>Terms and Conditions</strong></label>
                                                You Are About To Make Request To Harinaam Sankirtan Admin
                                            </p>
                                            <%--<div class="checkbox">--%>
                                            <%--<label>--%>
                                            <%--<input type="checkbox" /> <strong>Accept termes and conditions.</strong>--%>
                                            <%--</label>--%>
                                            <%--</div>--%>

                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!--  End step 4 -->

                        </div>
                        <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                        <div class="wizard-footer">
                            <div class="pull-right">
                                <input type='button' class='btn btn-next btn-primary' name='next' value='Next' />
                                <input type='submit' class='btn btn-finish btn-primary ' name='finish' value='Finish' />
                            </div>

                            <div class="pull-left">
                                <input type='button' class='btn btn-previous btn-default' name='previous' value='Previous' />
                            </div>
                            <div class="clearfix"></div>
                        </div>

                    </form>
                </div>

                <!-- End submit form -->
            </div>
        </div>
    </div>
</div>

<!-- Footer area-->
<jsp:include page="IskcongzbFooter.jsp"></jsp:include>

<script src="/resources/assets/js/modernizr-2.6.2.min.js"></script>

<%--<script src="/resources/assets/js//jquery-1.10.2.min.js"></script>--%>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<%--<script type="text/javascript" src='http://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>--%>
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>

<%--<script src="/resources/assets/js/locationpicker.jquery.js"></script>--%>
<%--<script src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>--%>
<script src="/resources/assets/js/jquery.geocomplete.js"></script>
<%--<script src="https://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>--%>
<%--<script type="text/javascript" src='https://maps.google.com/maps/api/js?sensor=false&libraries=places'></script>--%>
<%--<script src="/resources/assets/js/locationpicker.jquery.min.js"></script>--%>
<script type="text/javascript" src="/resources/assets/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="/resources/assets/js/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script src="/resources/assets/js/bootstrap-select.min.js"></script>
<script src="/resources/assets/js/bootstrap-hover-dropdown.js"></script>
<script src="/resources/assets/js/easypiechart.min.js"></script>
<script src="/resources/assets/js/jquery.easypiechart.min.js"></script>
<script src="/resources/assets/js/owl.carousel.min.js"></script>
<script src="/resources/assets/js/wow.js"></script>
<script src="/resources/assets/js/icheck.min.js"></script>

<script src="/resources/assets/js/price-range.js"></script>
<script src="/resources/assets/js/jquery.bootstrap.wizard.js" type="text/javascript"></script>
<script src="/resources/assets/js/jquery.validate.min.js"></script>
<script src="/resources/assets/js/wizard.js"></script>
<script src="/resources/assets/js/main.js"></script>
<script src="/resources/assets/js/logger.js"></script>

<script type="text/javascript">
    $('.form_date').datetimepicker({
        language:  'Eng',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        minView: 2,
        forceParse: 0
    });
//    $('#us3-address').locationpicker({
//        location: {
//            latitude: 46.15242437752303,
//            longitude: 2.7470703125,
//        },
//        radius: 30,
//        inputBinding: {
//            latitudeInput: $('#us3-lat'),
//            longitudeInput: $('#us3-lon'),
//            radiusInput: $('#us3-radius'),
//            locationNameInput: $('#us3-address'),
//
//        },
//        enableAutocomplete: true,
//        onchanged: function (currentLocation, radius, isMarkerDropped) {
//            console.log(isMarkerDropped);
//            // Uncomment line below to show alert on each Location Changed event
//            //alert("Location changed. New location (" + currentLocation.latitude + ", " + currentLocation.longitude + ")");
//        }
//    });
    $(function(){

        var $geocomplete = $("#us3-address");
//            $multiple = $("#multiple");

        $geocomplete
            .geocomplete({ map: ".map_canvas" })
            .bind("geocode:multiple", function(event, results){
                $.each(results, function(){
                    var result = this
//                    $("<li>")
//                        .html(result.formatted_address)
//                        .appendTo($multiple)
                        .click(function(){
                            $geocomplete.geocomplete("update", result)
                        });
                });
            });

//        $("#find").click(function(){
//            $("#geocomplete").trigger("geocode");
//        });

    });
</script>
</body>
</html>