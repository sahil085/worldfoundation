<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-
->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>GARO ESTATE | Property  page</title>
    <meta name="description" content="company is a real-estate template">
    <meta name="author" content="Kimarotec">
    <meta name="keyword" content="html5, css, bootstrap, property, real-estate theme , bootstrap template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800' rel='stylesheet' type='text/css'>

    <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
    <link rel="icon" href="favicon.ico" type="image/x-icon">

    <link rel="stylesheet" href="/resources/assets/css/normalize.css">
    <link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="/resources/assets/css/fontello.css">
    <link href="/resources/assets/fonts/icon-7-stroke/css/pe-icon-7-stroke.css" rel="stylesheet">
    <link href="/resources/assets/fonts/icon-7-stroke/css/helper.css" rel="stylesheet">
    <link href="/resources/assets/css/animate.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="/resources/assets/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/assets/css/icheck.min_all.css">
    <link rel="stylesheet" href="/resources/assets/css/price-range.css">
    <link rel="stylesheet" href="/resources/assets/css/owl.carousel.css">
    <link rel="stylesheet" href="/resources/assets/css/owl.theme.css">
    <link rel="stylesheet" href="/resources/assets/css/owl.transitions.css">
    <link rel="stylesheet" href="/resources/assets/css/lightslider.min.css">
    <link rel="stylesheet" href="/resources/assets/css/style.css">
    <link rel="stylesheet" href="/resources/assets/css/responsive.css">


    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
          rel = "Stylesheet" type="text/css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/easy-autocomplete/1.3.5/easy-autocomplete.css">
    <script src="/resources/assets/js/jquery-1.10.2.min.js"></script>
    <script src="/resources/assets/js/jquery.bootstrap-growl.js"></script>

    <script>
        function getnumberofstudents(idd) {
            $.ajax({
                url: "/getcountofstudents?lid="+idd,
                method: "get",
                success: function (response) {
                    $('#'+idd).text(response);
                    console.log(response);
                },
                failure: function (response) {
                    alert(response);
                }
            });
        }

    </script>
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
            <a class="navbar-brand" href="index.html"><img src="assets/img/logo.png" alt=""></a>
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

<%--<div class="page-head">--%>
<%--<div class="container">--%>
<%--<div class="row">--%>
<%--<div class="page-head-content">--%>
<%--<h1 class="page-title">Super nice villa </h1>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<!-- End page header -->





















<!-- property area -->
<div class="content-area single-property" style="background-color: #FCFCFC;">&nbsp;
    <div class="container">

        <div class="clearfix" >

            <div class="col-md-12 col-sm-6 single-property-content prp-style-1 ">
                <div class="row">
                    <div class="light-slide-item">
                        <div class="clearfix">
                            <div class="favorite-and-print">
                                <a class="add-to-fav" href="#login-modal" data-toggle="modal">
                                    <i class="fa fa-star-o"></i>
                                </a>
                                <a class="printer-icon " href="javascript:window.print()">
                                    <i class="fa fa-print"></i>
                                </a>
                            </div>

                            <ul id="image-gallery" class="gallery list-unstyled cS-hidden">
                                <li data-thumb="/resources/assets/img/iyf1.jpg">
                                    <img src="/resources/assets/img/iyf1.jpg" width="100%" />
                                </li>
                                <li data-thumb="/resources/assets/img/iyf1.jpg">
                                    <img src="/resources/assets/img/iyf1.jpg" width="100%"  />
                                </li>
                                <li data-thumb="/resources/assets/img/iyf3.jpg">
                                    <img src="/resources/assets/img/iyf3.jpg" width="100%"  />
                                </li>
                                <li data-thumb="/resources/assets/img/iyf3.jpg">
                                    <img src="/resources/assets/img/iyf3.jpg" width="100%"  />
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="single-property-header col-sm-12"  >
                    <center>
                        <a href="/ArrangeLectureAtCollegePage" ><button type="button" class="btn btn-danger pull-left" >Arrange Lecture At Your College</button></a>
                        <a href="/RequestForPersonalClassPage" ><button type="button" class="btn btn-danger pull-right" >Request For Personal Class</button>
                        </a>
                    </center>
                </div>

                <%--<div class="single-property-header col-sm-12"  >--%>
                    <%--<button type="button" class="btn btn-danger" style="width: 100%;background-color: whitesmoke; color: black; ">BUlk REGISTRATION OF USERS</button>--%>
                <%--</div>--%>

                <div class="single-property-wrapper">
                    <div class="single-property-header" >
                        <h2 class="s-property-title pull-left" > Search Lectures </h2>
                        <input type="text" id="searchlecture" class="form-control pull-left"  placeholder="Search" >
                        <%--<h2 class="s-property-title pull-left" > Upcoming Lectures </h2>--%>
                    </div>

                    <%
                        int flag=0;
                    %>
                    <%--recent lectures creted --%>
                    <c:if test="${fn:length(upcominglectures) gt 0}">
                        <%flag=1;%>
                        <div class="single-property-header" >

                            <h2 class="s-property-title" >Upcoming lectures </h2>
                        </div>
                        <div class="table-responsive table-bordered">
                                <%--<h1 class="property-price pull-left"> Recent HarinaamSankirtan Nearby You</h1>--%>
                                <%--<span class="property-tittle pull-right">Total Number Of kirtans<br>30</span>--%>
                            <table border="1px" class="table text-center" >
                                <thead>
                                <tr >
                                    <b>
                                        <th>Lecture Tittle</th>
                                        <th>speaker name</th>
                                        <th>Course name</th>
                                        <th>Vedic level</th>
                                        <th>Date</th>
                                        <th>Time</th>
                                        <th>Venue</th>
                                        <th>Street</th>
                                        <th>Action</th>
                                    </b>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="i" items="${upcominglectures}">
                                    <tr>
                                        <td>${i.tittle}</td>
                                        <td>${i.speakerName}</td>
                                        <td>${i.createCourse.courseName}</td>
                                        <td>${i.createCourse.courseCategory}</td>
                                        <td>${i.date}</td>
                                        <td>${i.time}</td>
                                        <td>${i.venue}</td>
                                        <td>${i.street}</td>
                                        <td>
                                            <a href="/IyfSinglelectureDetails?lname=${i.tittle}" class="btn-link"><button class="btn btn-success">View</button></a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>


</c:if>
                    <%
                        if(flag==0)
                        {
                    %>

                    <center>
                        <div class="single-property-header" >

                            <h2 class="s-property-title" >No Lecture Yet...! </h2>
                        </div>
                    </center>
                        <%--<a href="/CreateLecturePage"> <button type="button" class="btn btn-danger " >Create New Lecture</button></a></center>--%>
                    <%
                        }
                    %>
                    <div class="single-property-header" >

                        <h2 class="s-property-title" > Courses Soo Far </h2>
                    </div>

                        <div class="table-responsive table-bordered">
                                <%--<h1 class="property-price pull-left"> Recent HarinaamSankirtan Nearby You</h1>--%>
                                <%--<span class="property-tittle pull-right">Total Number Of kirtans<br>30</span>--%>
                            <table border="1px" class="table" >
                                <thead>
                                <tr>
                                    <b>
                                        <th>Course Name</th>
                                        <th>Vedic Level</th>
                                        <th>Lecture Title</th>
                                        <th>No. Of Students Attended</th>
                                    </b>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="i" items="${courselist}">
                                    <tr>
                                        <td>${i.createCourse.courseName}</td>
                                        <td>${i.createCourse.courseCategory}</td>
                                        <td>${i.tittle}</td>
                                        <td id="${i.id}"><script>
                                            getnumberofstudents(${i.id});
                                        </script></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>

                    <%--<c:otherwise>--%>
                    <%--<center><a href="/CreateLecturePage"> <button type="button" class="btn btn-danger " >Create New Lecture</button></a></center>--%>

                    <%--</c:otherwise>--%>
                    <hr>





                    <%--// recent lecture created --%>
                    <%--<div class="property-meta entry-meta clearfix ">--%>
                    <%--<div class="col-xs-6 col-sm-3 col-md-3 p-b-15">--%>

                    <%--<span class="property-info-entry">--%>
                    <%--<button type="button" class="btn btn-default" onclick="changeVideo('e80BbX05D7Y')">Raj Nagar</button>--%>
                    <%--</span>--%>
                    <%--</div>--%>

                    <%--</div>--%>
                    <!-- .property-meta -->

                    <div class="section">
                        <b> <h3 class="s-property-title">Iskcon Youth Forum</h3>
                            <div class="s-property-content">

                                <p style="color: black;">
                                    <b>
                                        Happiness and the true fulfillment of the soul and unending success have been the goals of humanity from eternity. The purpose of life is a life of purpose and what makes a life valuable is the perfect blend of knowledge, skills and values. Most of us simply go through life but in the pursuit of going through life, we forget to grow through life. Therefore the reality is” one cannot upload love, one can’t download time, one can’t google all of the life’s answers therefore one must actually live some of his life. ISKCON Youth Forum (IYF) is the youth wing of Sri Sri Radha Parthasarathi Temple, a branch of the International Society for Krishna Consciousness (ISKCON). IYF is aimed towards nourishing the hearts of today's youth with the sublime message of the scriptures and helping them flourish in their lives in a wholesome manner.
                                    </b>
                                </p>
                                <%--<p style="color: black;">Harinama-sankirtana (the congregational chanting of the holy names of the Lord) may be most familiar from seeing the devotees out in the streets, dancing and chanting the maha-mantra Hare Krishna, Hare Krishna, Krishna Krishna, Hare Hare/ Hare Rama, Hare Rama, Rama Rama, Hare Hare accompanied by mridangas (two headed drums) and karatalas (hand cymbals). Krishnas holy names are endowed with all of His potencies and this sound vibration can reawaken a person to his spiritual identity and existence. We have forgotten our real identity as spiritual beings, part and parcel of Krishna, and this forgetfulness is the root cause of all our suffering. When a person is asleep he forgets who he really is and in his dreaming he assumes one illusory identity after another, in each existence suffering unnecessarily.</p>--%>

                            </div>
                            <hr>
                            <b><h3 class="s-property-title">Spirit Of IYF</h3></b>
                            <div class="s-property-content">
                                <p style="color: black;">
                                    <b>
                                        For a sincere human being to live a life of pure principles is a great challenge.  ISKCON youth Forum is serving as an oasis in the sense that it is ‘life-giving and transforming’ society in a stress –ridden fast-paced rat race society’ that is like a desert.  Thus ISKCON Youth Forum is committed to provide a facility like an Oasis in the middle of a desert to keep oneself surcharged in remembrance of the Supreme Lord, Sri Krishna always. The inspiration is the spiritual inspiration to practice devotion to God with full enthusiasm and developing the spiritual knowledge which acts like a beacon in the sea like unending mysteries of life. IYF is striving towards rekindling the wisdom and reviving their loving and serving propensities
                                    </b>
                                </p>
                            </div>
                            <hr>
                            <b><h3 class="s-property-title">Mission</h3></b>
                            <div class="s-property-content">
                                <p style="color: black;">
                                    <b>
                                        Change is an inevitable part of the life and history has witnessed numerous revolutions as part of the change. Most of these revolutions were spearheaded and lead by the youths only. As India makes rapid advancements in the field of technology and is recognized the world over for its vast and untapped resources, especially the ‘human’ resource, with 55% of the population in the age group of 18-25, the future seems bright. But along with this euphoria, there is also a darker side to the reality; one that finds today’s youth battling with drug and alcoholic addictions, pre and post marital infidelities and mental depressions. Therefore ISKCON Youth Forum has ventured into wisdom literatures with the desire to bring about positive revolutions in the misguided life of modern youths. Now ISKCON Youth Forum has taken a good shape in many prestigious cities of India.
                                    </b>
                                </p>
                            </div>
                            <hr>
                            <b><h3 class="s-property-title">The goals of IYF are as follow:</h3></b>
                            <div class="s-property-content">
                                <p style="color: black;">
                                    <b>
                                        1. Training in soft skills like Public Speaking, Stress management, Leadership and Management by the application of the timeless wisdom in the modern scenario.
                                        <br> 2. Bringing out the potential in the individual like Concentration, Motivation, Self Confidence etc.
                                        <br> 3. Blending the character with competence in bringing about A Long Enduring Success.4.
                                        <br>4. Dealing With Sensitivity And self-awareness In Thought, Words And Action
                                        <br>5. Organizing Outing For Experiencing Closer Touch With The Nature And The Marvelous Gift Of The Supreme Divine
                                    </b>
                                </p>
                            </div>
                    </div>
                    <!-- End description area  -->

                    <div class="section additional-details">

                        <h4 class="s-property-title">Additional Details</h4>

                        <ul class="additional-details-list clearfix">
                            <li>
                                <span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Waterfront</span>
                                <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">Yes</span>
                            </li>

                            <li>
                                <span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Built In</span>
                                <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">2003</span>
                            </li>
                            <li>
                                <span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Parking</span>
                                <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">2 Or More Spaces,Covered Parking,Valet Parking</span>
                            </li>

                            <li>
                                <span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Waterfront</span>
                                <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">Yes</span>
                            </li>

                            <li>
                                <span class="col-xs-6 col-sm-4 col-md-4 add-d-title">View</span>
                                <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">Intracoastal View,Direct ew</span>
                            </li>

                            <li>
                                <span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Waterfront Description:</span>
                                <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">Intracoastal Front,Ocean Access</span>
                            </li>

                        </ul>
                    </div>
                    <!-- End additional-details area  -->

                    <div class="section property-features">

                        <h4 class="s-property-title">Features</h4>
                        <ul>
                            <li><a href="properties.html">Swimming Pool</a></li>
                            <li><a href="properties.html">3 Stories</a></li>
                            <li><a href="properties.html">Central Cooling</a></li>
                            <li><a href="properties.html">Jog Path 2</a></li>
                            <li><a href="properties.html">2 Lawn</a></li>
                            <li><a href="properties.html">Bike Path</a></li>
                        </ul>

                    </div>
                    <!-- End features area  -->

                    <div class="section property-video">
                        <h4 class="s-property-title">Property Video</h4>
                        <div class="video-thumb">
                            <a class="video-popup" href="yout" title="Virtual Tour">
                                <iframe class="embed-responsive-item" src="https://www.youtube.com/embed/XGSy3_Czz8k" allowfullscreen></iframe>
                                <!-- <img src="assets/img/property-video.jpg" class="img-responsive wp-post-image" alt="Exterior">             -->
                            </a>
                        </div>
                    </div>
                    <!-- End video area  -->



                    <div class="section property-share">
                        <h4 class="s-property-title">Share width your friends </h4>
                        <div class="roperty-social">
                            <ul>
                                <li><a title="Share this on dribbble " href="#"><img src="assets/img/social_big/dribbble_grey.png"></a></li>
                                <li><a title="Share this on facebok " href="#"><img src="assets/img/social_big/facebook_grey.png"></a></li>
                                <li><a title="Share this on delicious " href="#"><img src="assets/img/social_big/delicious_grey.png"></a></li>
                                <li><a title="Share this on tumblr " href="#"><img src="assets/img/social_big/tumblr_grey.png"></a></li>
                                <li><a title="Share this on digg " href="#"><img src="assets/img/social_big/digg_grey.png"></a></li>
                                <li><a title="Share this on twitter " href="#"><img src="assets/img/social_big/twitter_grey.png"></a></li>
                                <li><a title="Share this on linkedin " href="#"><img src="assets/img/social_big/linkedin_grey.png"></a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- End video area  -->

                </div>
            </div>


            <div class="col-md-4 p0">
                <aside class="sidebar sidebar-property blog-asside-right">
                    <div class="dealer-widget">
                        <div class="dealer-content">
                            <div class="inner-wrapper">

                                <div class="clear">
                                    <div class="col-xs-4 col-sm-4 dealer-face">
                                        <a href="">
                                            <img src="assets/img/client-face1.png" class="img-circle">
                                        </a>
                                    </div>
                                    <div class="col-xs-8 col-sm-8 ">
                                        <h2 class="dealer-name">
                                            <span>Book Kirtan Now</span>

                                        </h2>
                                        <!--   <div class="dealer-social-media">
                                              <a class="twitter" target="_blank" href="">
                                                  <i class="fa fa-twitter"></i>
                                              </a>
                                              <a class="facebook" target="_blank" href="">
                                                  <i class="fa fa-facebook"></i>
                                              </a>
                                              <a class="gplus" target="_blank" href="">
                                                  <i class="fa fa-google-plus"></i>
                                              </a>
                                              <a class="linkedin" target="_blank" href="">
                                                  <i class="fa fa-linkedin"></i>
                                              </a>
                                              <a class="instagram" target="_blank" href="">
                                                  <i class="fa fa-instagram"></i>
                                              </a>
                                          </div> -->

                                    </div>
                                </div>

                                <div class="clear">
                                    <a href="#" class="btn btn-default" role="button"  style="margin-top: 4px;margin-left: 150px;border-color: white;background-color: black;color: white;">Book Now</a>
                                    <!--   <button type="button" class="btn btn-default" onclick="changeVideo('e80BbX05D7Y')">Raj Nagar</button> -->
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default sidebar-menu similar-property-wdg wow fadeInRight animated">
                        <div class="panel-heading">
                            <h3 class="panel-title">Similar Properties</h3>
                        </div>
                        <div class="panel-body recent-property-widget">
                            <ul>
                                <li>
                                    <div class="col-md-3 col-sm-3 col-xs-3 blg-thumb p0">
                                        <a href="single.html"><img src="assets/img/demo/small-property-2.jpg"></a>
                                        <span class="property-seeker">
                                                    <b class="b-1">A</b>
                                                    <b class="b-2">S</b>
                                                </span>
                                    </div>
                                    <div class="col-md-8 col-sm-8 col-xs-8 blg-entry">
                                        <h6> <a href="single.html">Super nice villa </a></h6>
                                        <span class="property-price">3000000$</span>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-md-3 col-sm-3  col-xs-3 blg-thumb p0">
                                        <a href="single.html"><img src="assets/img/demo/small-property-1.jpg"></a>
                                        <span class="property-seeker">
                                                    <b class="b-1">A</b>
                                                    <b class="b-2">S</b>
                                                </span>
                                    </div>
                                    <div class="col-md-8 col-sm-8 col-xs-8 blg-entry">
                                        <h6> <a href="single.html">Super nice villa </a></h6>
                                        <span class="property-price">3000000$</span>
                                    </div>
                                </li>
                                <li>
                                    <div class="col-md-3 col-sm-3 col-xs-3 blg-thumb p0">
                                        <a href="single.html"><img src="assets/img/demo/small-property-3.jpg"></a>
                                        <span class="property-seeker">
                                                    <b class="b-1">A</b>
                                                    <b class="b-2">S</b>
                                                </span>
                                    </div>
                                    <div class="col-md-8 col-sm-8 col-xs-8 blg-entry">
                                        <h6> <a href="single.html">Super nice villa </a></h6>
                                        <span class="property-price">3000000$</span>
                                    </div>
                                </li>

                                <li>
                                    <div class="col-md-3 col-sm-3 col-xs-3 blg-thumb p0">
                                        <a href="single.html"><img src="assets/img/demo/small-property-2.jpg"></a>
                                        <span class="property-seeker">
                                                    <b class="b-1">A</b>
                                                    <b class="b-2">S</b>
                                                </span>
                                    </div>
                                    <div class="col-md-8 col-sm-8 col-xs-8 blg-entry">
                                        <h6> <a href="single.html">Super nice villa </a></h6>
                                        <span class="property-price">3000000$</span>
                                    </div>
                                </li>

                            </ul>
                        </div>
                    </div>

                    <div class="panel panel-default sidebar-menu wow fadeInRight animated">
                        <div class="panel-heading">
                            <h3 class="panel-title">Ads her  </h3>
                        </div>
                        <div class="panel-body recent-property-widget">
                            <img src="assets/img/ads.jpg">
                        </div>
                    </div>

                    <div class="panel panel-default sidebar-menu wow fadeInRight animated" >
                        <div class="panel-heading">
                            <h3 class="panel-title">Smart search</h3>
                        </div>
                        <div class="panel-body search-widget">
                            <form action="" class=" form-inline">
                                <fieldset>
                                    <div class="row">
                                        <div class="col-xs-12">
                                            <input type="text" class="form-control" placeholder="Key word">
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset>
                                    <div class="row">
                                        <div class="col-xs-6">

                                            <select id="lunchBegins" class="selectpicker" data-live-search="true" data-live-search-style="begins" title="Select Your City">

                                                <option>New york, CA</option>
                                                <option>Paris</option>
                                                <option>Casablanca</option>
                                                <option>Tokyo</option>
                                                <option>Marraekch</option>
                                                <option>kyoto , shibua</option>
                                            </select>
                                        </div>
                                        <div class="col-xs-6">

                                            <select id="basic" class="selectpicker show-tick form-control">
                                                <option> -Status- </option>
                                                <option>Rent </option>
                                                <option>Boy</option>
                                                <option>used</option>

                                            </select>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <label for="price-range">Price range ($):</label>
                                            <input type="text" class="span2" value="" data-slider-min="0"
                                                   data-slider-max="600" data-slider-step="5"
                                                   data-slider-value="[0,450]" id="price-range" ><br />
                                            <b class="pull-left color">2000$</b>
                                            <b class="pull-right color">100000$</b>
                                        </div>
                                        <div class="col-xs-6">
                                            <label for="property-geo">Property geo (m2) :</label>
                                            <input type="text" class="span2" value="" data-slider-min="0"
                                                   data-slider-max="600" data-slider-step="5"
                                                   data-slider-value="[50,450]" id="property-geo" ><br />
                                            <b class="pull-left color">40m</b>
                                            <b class="pull-right color">12000m</b>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <label for="price-range">Min baths :</label>
                                            <input type="text" class="span2" value="" data-slider-min="0"
                                                   data-slider-max="600" data-slider-step="5"
                                                   data-slider-value="[250,450]" id="min-baths" ><br />
                                            <b class="pull-left color">1</b>
                                            <b class="pull-right color">120</b>
                                        </div>

                                        <div class="col-xs-6">
                                            <label for="property-geo">Min bed :</label>
                                            <input type="text" class="span2" value="" data-slider-min="0"
                                                   data-slider-max="600" data-slider-step="5"
                                                   data-slider-value="[250,450]" id="min-bed" ><br />
                                            <b class="pull-left color">1</b>
                                            <b class="pull-right color">120</b>

                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label> <input type="checkbox" checked> Fire Place</label>
                                            </div>
                                        </div>

                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label> <input type="checkbox"> Dual Sinks</label>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label> <input type="checkbox" checked> Swimming Pool</label>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label> <input type="checkbox" checked> 2 Stories </label>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label><input type="checkbox"> Laundry Room </label>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label> <input type="checkbox"> Emergency Exit</label>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label>  <input type="checkbox" checked> Jog Path </label>
                                            </div>
                                        </div>
                                        <div class="col-xs-6">
                                            <div class="checkbox">
                                                <label>  <input type="checkbox"> 26' Ceilings </label>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset class="padding-5">
                                    <div class="row">
                                        <div class="col-xs-12">
                                            <div class="checkbox">
                                                <label>  <input type="checkbox"> Hurricane Shutters </label>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>

                                <fieldset >
                                    <div class="row">
                                        <div class="col-xs-12">
                                            <input class="button btn largesearch-btn" value="Search" type="submit">
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div>

                </aside>
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

                        <img src="assets/img/footer-logo.png" alt="" class="wow pulse" data-wow-delay="1s">
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
                                        <img src="assets/img/demo/small-proerty-2.jpg">
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
                                        <img src="assets/img/demo/small-proerty-2.jpg">
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
                                        <img src="assets/img/demo/small-proerty-2.jpg">
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

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-body">

                <iframe id="iframeYoutube" width="560" height="315"  src="https://www.youtube.com/embed/e80BbX05D7Y" frameborder="0" allowfullscreen></iframe>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<script src="/resources/assets/js/vendor/modernizr-2.6.2.min.js"></script>
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="/resources/assets/js/jquery.bootstrap-growl.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"
        type = "text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.devbridge-autocomplete/1.4.7/jquery.autocomplete.min.js"></script>
<script src="/resources/assets/js/bootstrap-select.min.js"></script>
<script src="/resources/assets/js/bootstrap-hover-dropdown.js"></script>
<script src="/resources/assets/js/easypiechart.min.js"></script>
<script src="/resources/assets/js/jquery.easypiechart.min.js"></script>
<script src="/resources/assets/js/owl.carousel.min.js"></script>
<script src="/resources/assets/js/wow.js"></script>
<script src="/resources/assets/js/icheck.min.js"></script>
<script src="/resources/assets/js/price-range.js"></script>
<script type="text/javascript" src="/resources/assets/js/lightslider.min.js"></script>
<script src="/resources/assets/js/main.js"></script>

<script>
    $(document).ready(function () {

        $('#image-gallery').lightSlider({
            gallery: true,
            item: 1,
            thumbItem: 9,
            slideMargin: 0,
            speed: 500,
            auto: true,
            loop: true,
            onSliderLoad: function () {
                $('#image-gallery').removeClass('cS-hidden');
            }
        });
    });

    function getnumberofstudents() {
        $.ajax({
            url: "getcountofstudents?lid="+id,
            method: "get",
            success: function (response) {
                $(id).innerHTML(response);
                console.log(response);
            },
            failure: function (response) {
                alert(response);
            }
        });
    }
</script>
<script type="">
    $(document).ready(function(){
        $("#myModal").on("hidden.bs.modal",function(){
            $("#iframeYoutube").attr("src","#");
        })

        $("#searchlecture").autocomplete({
            minLength: 1,
            delay: 500,
            //define callback to format results
            source: function (request, response) {
                $.getJSON("/fetchLectureName?${_csrf.parameterName}=${_csrf.token}", request, function(result) {
                    response($.map(result, function(item) {
                        return {
                            // following property gets displayed in drop down
                            label: item,
                            // following property gets entered in the textbox
                            value: item,
                            // following property is added for our own use
                            tag_url: "http://" + window.location.host + "/IyfSinglelectureDetails?lname="+item
                        }
                    }));
                });
            },

//            define select handler
            select : function(event, ui) {
                if (ui.item) {
                    window.location.href=ui.item.tag_url;
//                    $("#selected_tags span").append('<a href=" + ui.item.tag_url + " target="_blank">'+ ui.item.label +'</a>');
//                    //$("#tagQuery").value = $("#tagQuery").defaultValue
//                    var defValue = $("#tagQuery").prop('defaultValue');
//                    $("#tagQuery").val(defValue);
//                    $("#tagQuery").blur();
//                    return false;
                }
            }
        });

        $('.deletelecture').on('click',function () {
            var $this=$(this);
            var idd=this.id;
            $.ajax({
                url: "/DeleteLecture?lid="+idd,
                method: "get",
                success: function (response) {
                    $($this).closest('tr').remove();
                    setTimeout(function() {
                        $.bootstrapGrowl(response, { type: 'danger',position:'top-right' });
                    }, 1000);
                    console.log(response);
                },
                failure: function (response) {
                    alert(response);
                }
            });
        })

    })

    function changeVideo(vId){
        var iframe=document.getElementById("iframeYoutube");
        iframe.src="https://www.youtube.com/embed/"+vId;

        $("#myModal").modal("show");
    }
</script>
</body>
</html>







<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: user--%>
  <%--Date: 1/9/2018--%>
  <%--Time: 5:18 PM--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<%--%>
    <%--int flag=0;--%>
<%--%>--%>
<%--<c:forEach var="lec" items="${upcominglectures}">--%>
    <%--tittle : ${lec.tittle}<br>--%>
    <%--time :${lec.time}<br>--%>
    <%--date :${lec.date}<br>--%>
    <%--<% if(flag==0)--%>
    <%--{--%>
    <%--%>--%>
    <%--<c:forEach var="joined" items="${JoinedLectureList}">--%>
        <%--<c:if test="${lec.id==joined.lecture.id}">--%>

            <%--<a href="/viewLecture?lid=${lec.id}" ><input type="button" class="Viewlecture" id="${lec.id}" value="View Class"></a>--%>
            <%--<%flag=1;%>--%>
        <%--</c:if>--%>
    <%--</c:forEach>--%>
    <%--<%--%>
        <%--}--%>
        <%--if(flag!=1)--%>
        <%--{--%>
            <%--%>--%>
    <%--<a>--%>
        <%--<input type="button" class="joinlecture" id="${lec.id}" value="+ Join Class">--%>
    <%--</a>--%>
    <%--&lt;%&ndash;<input type="button"  id="${lec.id}" value="+ Join Class">&ndash;%&gt;--%>
    <%--<%--%>
        <%--}--%>
        <%--flag=0;--%>
    <%--%>--%>
    <%--<br>--%>
<%--</c:forEach>--%>

<%--<a href="/logout">logout</a>--%>
<%--</body>--%>
<%--<script src="/resources/assets/js/jquery-1.10.2.min.js"></script>--%>
<%--<script>--%>
    <%--$('.joinlecture').on('click',function () {--%>
        <%--var $this=$(this);--%>
        <%--var id=this.id;--%>
        <%--$.ajax(--%>
            <%--{--%>
       <%--url:"/joinlecture?id="+id,--%>
       <%--type:"GET",--%>
       <%--success:function (result) {--%>
           <%--alert(result);--%>
           <%--var p=$this.parent();--%>
           <%--p.attr("href","viewLecture?lid="+id);--%>
           <%--$this.removeClass('joinlecture').addClass('Viewlecture');--%>
           <%--$this.val("View Lecture");--%>
           <%--$this.unbind();--%>
           <%--return false;--%>

       <%--}--%>
            <%--}--%>
        <%--)--%>



    <%--});--%>
<%--</script>--%>
<%--</html>--%>
