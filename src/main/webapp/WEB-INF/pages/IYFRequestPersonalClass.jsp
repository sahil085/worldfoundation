<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>GARO ESTATE | Register page</title>
    <meta name="description" content="GARO is a real-estate template">
    <meta name="author" content="Kimarotec">
    <meta name="keyword" content="html5, css, bootstrap, property, real-estate theme , bootstrap template">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800' rel='stylesheet' type='text/css'>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

    <link rel="stylesheet" href="/resources/assets/css/normalize.css">
    <%--<link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css">--%>
    <link rel="stylesheet" href="/resources/assets/css/fontello.css">
    <link href="/resources/assets/fonts/icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet">
    <link href="/resources/assets/fonts/icon-7-stroke/css/helper.css" rel="stylesheet">
    <link href="assets/css/animate.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="/resources/assets/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/assets/css/icheck.min_all.css">
    <link rel="stylesheet" href="/resources/assets/css/price-range.css">
    <link rel="stylesheet" href="/resources/assets/css/owl.carousel.css">
    <link rel="stylesheet" href="/resources/assets/css/owl.theme.css">
    <link rel="stylesheet" href="/resources/assets/css/owl.transitions.css">
    <link rel="stylesheet" href="/resources/assets/css/style.css">
    <link rel="stylesheet" href="/resources/assets/css/responsive.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
          rel = "Stylesheet" type="text/css" />
    <link href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css" rel="stylesheet">



</head>
<body>

<div id="preloader">
    <div id="status">&nbsp;</div>
</div>
<!-- Body content -->


<div class="header-connect">
    <div class="container">
        <div class="row">
            <div class="col-md-5 col-sm-8  col-xs-12">
                <div class="header-half header-call">
                    <p>
                        <span><i class="pe-7s-call"></i> +1 234 567 7890</span>
                        <span><i class="pe-7s-mail"></i> your@company.com</span>
                    </p>
                </div>
            </div>
            <div class="col-md-2 col-md-offset-5  col-sm-3 col-sm-offset-1  col-xs-12">
                <div class="header-half header-social">
                    <ul class="list-inline">
                        <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="#"><i class="fa fa-vine"></i></a></li>
                        <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                        <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                        <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!--End top header -->

<nav class="navbar navbar-default ">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navigation">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.html"><img src="/resources/assets/img/logo.png" alt=""></a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse yamm" id="navigation">
            <div class="button navbar-right">
                <button class="navbar-btn nav-button wow bounceInRight login" onclick=" window.open('register.html')" data-wow-delay="0.4s">Login</button>
                <button class="navbar-btn nav-button wow fadeInRight" onclick=" window.open('submit-property.html')" data-wow-delay="0.5s">Submit</button>
            </div>
            <ul class="main-nav nav navbar-nav navbar-right">
                <li class="dropdown ymm-sw " data-wow-delay="0.1s">
                    <a href="index.html" class="dropdown-toggle active" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Home <b class="caret"></b></a>
                    <ul class="dropdown-menu navbar-nav">
                        <li>
                            <a href="index-2.html">Home Style 2</a>
                        </li>
                        <li>
                            <a href="index-3.html">Home Style 3</a>
                        </li>
                        <li>
                            <a href="index-4.html">Home Style 4</a>
                        </li>
                        <li>
                            <a href="index-5.html">Home Style 5</a>
                        </li>

                    </ul>
                </li>

                <li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="properties.html">Properties</a></li>
                <li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="property.html">Property</a></li>
                <li class="dropdown yamm-fw" data-wow-delay="0.1s">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Template <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <div class="yamm-content">
                                <div class="row">
                                    <div class="col-sm-3">
                                        <h5>Home pages</h5>
                                        <ul>
                                            <li>
                                                <a href="index.html">Home Style 1</a>
                                            </li>
                                            <li>
                                                <a href="index-2.html">Home Style 2</a>
                                            </li>
                                            <li>
                                                <a href="index-3.html">Home Style 3</a>
                                            </li>
                                            <li>
                                                <a href="index-4.html">Home Style 4</a>
                                            </li>
                                            <li>
                                                <a href="index-5.html">Home Style 5</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="col-sm-3">
                                        <h5>Pages and blog</h5>
                                        <ul>
                                            <li><a href="blog.html">Blog listing</a>  </li>
                                            <li><a href="single.html">Blog Post (full)</a>  </li>
                                            <li><a href="single-right.html">Blog Post (Right)</a>  </li>
                                            <li><a href="single-left.html">Blog Post (left)</a>  </li>
                                            <li><a href="contact.html">Contact style (1)</a> </li>
                                            <li><a href="contact-3.html">Contact style (2)</a> </li>
                                            <li><a href="contact_3.html">Contact style (3)</a> </li>
                                            <li><a href="faq.html">FAQ page</a> </li>
                                            <li><a href="404.html">404 page</a>  </li>
                                        </ul>
                                    </div>
                                    <div class="col-sm-3">
                                        <h5>Property</h5>
                                        <ul>
                                            <li><a href="property-1.html">Property pages style (1)</a> </li>
                                            <li><a href="property-2.html">Property pages style (2)</a> </li>
                                            <li><a href="property-3.html">Property pages style (3)</a> </li>
                                        </ul>

                                        <h5>Properties list</h5>
                                        <ul>
                                            <li><a href="properties.html">Properties list style (1)</a> </li>
                                            <li><a href="properties-2.html">Properties list style (2)</a> </li>
                                            <li><a href="properties-3.html">Properties list style (3)</a> </li>
                                        </ul>
                                    </div>
                                    <div class="col-sm-3">
                                        <h5>Property process</h5>
                                        <ul>
                                            <li><a href="submit-property.html">Submit - step 1</a> </li>
                                            <li><a href="submit-property.html">Submit - step 2</a> </li>
                                            <li><a href="submit-property.html">Submit - step 3</a> </li>
                                        </ul>
                                        <h5>User account</h5>
                                        <ul>
                                            <li><a href="/logout">logout</a>   </li>
                                            <li><a href="user-properties.html">Your properties</a>  </li>
                                            <li><a href="submit-property.html">Submit property</a>  </li>
                                            <li><a href="change-password.html">Change password</a> </li>
                                            <li><a href="user-profile.html">Your profile</a>  </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <!-- /.yamm-content -->
                        </li>
                    </ul>
                </li>

                <li class="wow fadeInDown" data-wow-delay="0.4s"><a href="contact.html">Contact</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<!-- End of nav bar -->

<div class="page-head">
    <div class="container">
        <div class="row">
            <div class="page-head-content">
                <h1 class="page-title">Home New account / Sign in </h1>
            </div>
        </div>
    </div>
</div>
<!-- End page header -->


<!-- register-area -->
<div class="register-area" style="background-color: rgb(249, 249, 249);">
    <div class="container">
        <div class="col-sm-12">
            <div class="row" style="color: red;">
                <center><h2><b>Kindly Fill All the Details<br></b></h2>
                    <h3><b>To Arrange Lecture At Your College</b></h3></center>
            </div>
        </div>
        <div class="col-md-12">
            <div class="box-for overflow">
                <div class="col-md-12 col-xs-12 register-blocks">

                    <form id="RequestForpc" action="/RequestForPersonalClassProcess" method="post" autocomplete="off" data-toggle="validator">
                        <div class="form-group">
                            <label for="tittle">Lecture Tittle</label>
                            <input type="text" class="form-control" id="tittle" name="LectureTittle" required>
                        </div>
                        <div class="form-group">
                            <label for="query">Query</label>
                            <input type="text" class="form-control" id="query" name="Query" required>
                        </div>
                        <%--<div class="form-group">--%>
                            <%--<label for="lname">Description</label>--%>
                            <%--<textarea class="form-control" id="lname" name="LectureDescription" required></textarea>--%>
                        <%--</div>--%>
                        <div class="form-group">
                            <label>Select Speaker Name <small>From Whom Do You Want To Take Your Class</small></label>
                            <select  required id="Speaker" class="selectpicker show-tick form-control" name="SpeakerName">
                                <option value="">Select Speaker</option>
                                <option value="Charu Govind prabhu ji,">Charu Govind prabhu ji</option>
                                <option value="Sanatan Gaur Chandra Prabhu Ji,">Sanatan Gaur Chandra Prabhu Ji</option>
                                <option value="Vishnu Gaur Prabhu Ji,">Vishnu Gaur Prabhu Ji</option>
                                <option value="venu Govind Das">venu Govind Das</option>
                            </select>
                        </div>
                        <%--<div class="form-group">--%>
                        <%--<label>Sewa Coordinators</label>--%>
                        <%--<select  required id="sewa" class="selectpicker show-tick form-control" name="SewaCoordinators">--%>
                        <%--<option value="Charu Govind prabhu ji,">Charu Govind prabhu ji</option>--%>
                        <%--<option value="Sanatan Gaur Chandra Prabhu Ji,">Sanatan Gaur Chandra Prabhu Ji</option>--%>
                        <%--<option value="Vishnu Gaur Prabhu Ji,">Vishnu Gaur Prabhu Ji</option>--%>
                        <%--<option value="venu Govind Das">venu Govind Das</option>--%>
                        <%--</select>--%>
                        <%--</div>--%>

                        <div class="col-sm-12">
                            <div class="col-sm-6">
                                <div class="form-group">
                                    <label for="dtp_input2" class="col-md-2 control-label" >Date</label>
                                    <div class="input-group date form_date col-md-5" data-date="" data-date-format="dd MM yyyy" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                                        <input class="form-control" size="16" type="text" value="" readonly required>
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                                        <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                                    </div>
                                    <input type="hidden" name="Date" id="dtp_input2" value="" /><br/>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-12">
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <label for="dtp_input3" > Time</label>
                                    <input type="time" name="Time" id="dtp_input3" value="" placeholder="HH:MM" required/><br/>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <label for="duration" >Duration Of Class</label>
                                    <input type="text" name="Duration" id="duration" value="" placeholder="HH:MM" required/><br/>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-12">
                            <div class="col-sm-12">
                                <div class="form-group">
                                    <label for="venue">Venue</label>
                                    <input type="text" class="form-control" id="venue" placeholder="Raj Nagar" name="Venue" />
                                    <%--1                      <input type="text" name="street" class="form-control"  required>--%>
                                    <%--<div id="us3" ></div>--%>
                                    <%--<div class="map_canvas" style="display: none;"></div>--%>

                                </div>
                            </div>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                        <div class="form-actions">
                            <%--<button type="button" class="btn btn-primary btn-lg" id="load" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Processing Order">Submit Order</button>--%>
                            <input type="submit"
                                   class="btn btn-block btn-primary btn-default"
                                   data-loading-text="<i class='fa fa-spinner fa-spin '></i> Creating Request"
                                   value="Register" onclick="disabled">
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
</div>

<!-- Footer area-->
<div class="footer-area">

    <div class=" footer">
        <div class="container">
            <div class="row">

                <div class="col-md-3 col-sm-6 wow fadeInRight animated">
                    <div class="single-footer">
                        <h4>About us </h4>
                        <div class="footer-title-line"></div>

                        <img src="/resources/assets/img/footer-logo.png" alt="" class="wow pulse" data-wow-delay="1s">
                        <p>Lorem ipsum dolor cum necessitatibus su quisquam molestias. Vel unde, blanditiis.</p>
                        <ul class="footer-adress">
                            <li><i class="pe-7s-map-marker strong"> </i> 9089 your adress her</li>
                            <li><i class="pe-7s-mail strong"> </i> email@yourcompany.com</li>
                            <li><i class="pe-7s-call strong"> </i> +1 908 967 5906</li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 wow fadeInRight animated">
                    <div class="single-footer">
                        <h4>Quick links </h4>
                        <div class="footer-title-line"></div>
                        <ul class="footer-menu">
                            <li><a href="properties.html">Properties</a>  </li>
                            <li><a href="#">Services</a>  </li>
                            <li><a href="submit-property.html">Submit property </a></li>
                            <li><a href="contact.html">Contact us</a></li>
                            <li><a href="faq.html">fqa</a>  </li>
                            <li><a href="faq.html">Terms </a>  </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 wow fadeInRight animated">
                    <div class="single-footer">
                        <h4>Last News</h4>
                        <div class="footer-title-line"></div>
                        <ul class="footer-blog">
                            <li>
                                <div class="col-md-3 col-sm-4 col-xs-4 blg-thumb p0">
                                    <a href="single.html">
                                        <img src="/resources/assets/img/demo/small-proerty-2.jpg">
                                    </a>
                                    <span class="blg-date">12-12-2016</span>

                                </div>
                                <div class="col-md-8  col-sm-8 col-xs-8  blg-entry">
                                    <h6> <a href="single.html">Add news functions </a></h6>
                                    <p style="line-height: 17px; padding: 8px 2px;">Lorem ipsum dolor sit amet, nulla ...</p>
                                </div>
                            </li>

                            <li>
                                <div class="col-md-3 col-sm-4 col-xs-4 blg-thumb p0">
                                    <a href="single.html">
                                        <img src="/resources/assets/img/demo/small-proerty-2.jpg">
                                    </a>
                                    <span class="blg-date">12-12-2016</span>

                                </div>
                                <div class="col-md-8  col-sm-8 col-xs-8  blg-entry">
                                    <h6> <a href="single.html">Add news functions </a></h6>
                                    <p style="line-height: 17px; padding: 8px 2px;">Lorem ipsum dolor sit amet, nulla ...</p>
                                </div>
                            </li>

                            <li>
                                <div class="col-md-3 col-sm-4 col-xs-4 blg-thumb p0">
                                    <a href="single.html">
                                        <img src="/resources/assets/img/demo/small-proerty-2.jpg">
                                    </a>
                                    <span class="blg-date">12-12-2016</span>

                                </div>
                                <div class="col-md-8  col-sm-8 col-xs-8  blg-entry">
                                    <h6> <a href="single.html">Add news functions </a></h6>
                                    <p style="line-height: 17px; padding: 8px 2px;">Lorem ipsum dolor sit amet, nulla ...</p>
                                </div>
                            </li>


                        </ul>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 wow fadeInRight animated">
                    <div class="single-footer news-letter">
                        <h4>Stay in touch</h4>
                        <div class="footer-title-line"></div>
                        <p>Lorem ipsum dolor sit amet, nulla  suscipit similique quisquam molestias. Vel unde, blanditiis.</p>

                        <form>
                            <div class="input-group">
                                <input class="form-control" type="text" placeholder="E-mail ... ">
                                <span class="input-group-btn">
                                            <button class="btn btn-primary subscribe" type="button"><i class="pe-7s-paper-plane pe-2x"></i></button>
                                        </span>
                            </div>
                            <!-- /input-group -->
                        </form>

                        <div class="social pull-right">
                            <ul>
                                <li><a class="wow fadeInUp animated" href="https://twitter.com/kimarotec"><i class="fa fa-twitter"></i></a></li>
                                <li><a class="wow fadeInUp animated" href="https://www.facebook.com/kimarotec" data-wow-delay="0.2s"><i class="fa fa-facebook"></i></a></li>
                                <li><a class="wow fadeInUp animated" href="https://plus.google.com/kimarotec" data-wow-delay="0.3s"><i class="fa fa-google-plus"></i></a></li>
                                <li><a class="wow fadeInUp animated" href="https://instagram.com/kimarotec" data-wow-delay="0.4s"><i class="fa fa-instagram"></i></a></li>
                                <li><a class="wow fadeInUp animated" href="https://instagram.com/kimarotec" data-wow-delay="0.6s"><i class="fa fa-dribbble"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <div class="footer-copy text-center">
        <div class="container">
            <div class="row">
                <div class="pull-left">
                    <span> (C) <a href="http://www.KimaroTec.com">KimaroTheme</a> , All rights reserved 2016  </span>
                </div>
                <div class="bottom-menu pull-right">
                    <ul>
                        <li><a class="wow fadeInUp animated" href="#" data-wow-delay="0.2s">Home</a></li>
                        <li><a class="wow fadeInUp animated" href="#" data-wow-delay="0.3s">Property</a></li>
                        <li><a class="wow fadeInUp animated" href="#" data-wow-delay="0.4s">Faq</a></li>
                        <li><a class="wow fadeInUp animated" href="#" data-wow-delay="0.6s">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>
<script src="/resources/assets/js/jquery-1.10.2.min.js"></script>

<script src="/resources/assets/js/modernizr-2.6.2.min.js"></script>

<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
<%--<script src="/resources/assets/js/jquery.geocomplete.js"></script>--%>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"
        type = "text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.1/jquery.form.min.js"></script>
<script src="/resources/assets/js/jquery.bootstrap-growl.js"></script>
<script src="/resources/assets/js/bootstrap-select.min.js"></script>
<script src="/resources/assets/js/bootstrap-hover-dropdown.js"></script>
<script type="text/javascript" src="/resources/assets/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="/resources/assets/js/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script src="/resources/assets/js/easypiechart.min.js"></script>
<script src="/resources/assets/js/jquery.easypiechart.min.js"></script>

<script src="/resources/assets/js/owl.carousel.min.js"></script>
<script src="/resources/assets/js/wow.js"></script>

<script src="/resources/assets/js/icheck.min.js"></script>
<script src="/resources/assets/js/price-range.js"></script>
<script src="/resources/assets/js/main.js"></script>
<script src="/resources/assets/js/logger.js"></script>

<script>
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
    //    $(function(){
    //
    //        var $geocomplete = $("#us3-address");
    ////            $multiple = $("#multiple");
    //
    //        $geocomplete
    //            .geocomplete({ map: ".map_canvas" })
    //            .bind("geocode:multiple", function(event, results){
    //                $.each(results, function(){
    //                    var result = this
    //                    //                    $("<li>")
    //                    //                        .html(result.formatted_address)
    //                    //                        .appendTo($multiple)
    //                        .click(function(){
    //                            $geocomplete.geocomplete("update", result)
    //                        });
    //                });
    //            });
    //
    ////        $("#find").click(function(){
    ////            $("#geocomplete").trigger("geocode");
    ////        });
    //
    //    });
//    $(document).ready(function () {
//        $('.btn').on('click', function() {
//            var $this = $(this);
//            $this.button('loading');
////formsubmit();
//
//            setTimeout(function() {
//                $this.button('reset');
//            }, 6000);
//        });
//
//
//
//    });
        $('#RequestForpc').ajaxForm({

            success: function (msg) {
                alert(msg);
                $('#RequestForpc').find("input[type=text],select,input[type=number],input[type=radio]").val("");

            },
            error: function (msg) {
                alert(msg);
            }
        });
</script>

</body>
</html>