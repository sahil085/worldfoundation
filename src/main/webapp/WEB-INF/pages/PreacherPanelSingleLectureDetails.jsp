<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="Iskcongzbheader.jsp"></jsp:include>

<div class="content-area blog-page padding-top-40" style="background-color: #FCFCFC; padding-bottom: 55px;">
    <div class="container">
        <div class="row">
            <div class="blog-lst col-md-9">
                <section class="post">
                    <div class="text-center padding-b-50">
                        <b><h2 class="wow fadeInLeft animated " style="color: black">${SingleLectureDetails.tittle}</h2></b>
                        <div class="title-line wow fadeInRight animated"></div>
                    </div>

                    <div class="row">
                        <div class="col-sm-12 ">
                            <p class="intro">
                                Description About Lecture :<br>

                            <h5 style="color: black">${SingleLectureDetails.description}</h5>
                            </p>
                        </div>
                        <div class="col-sm-6">
                            <p class="author-category" >
                                By &nbsp; <h5 style="color: black">${SingleLectureDetails.speakerName}</h5><br>
                            Course <h5 style="color: black">${SingleLectureDetails.createCourse.courseName}</h5><br>
                            Venue : <h5 style="color: black">${SingleLectureDetails.venue}</h5>
                            </p>
                        </div>
                        <div class="col-sm-6 right" >
                            <p class="author-category">
                                <i class="glyphicon glyphicon-calendar"></i>
                                Date : <h5 style="color: black">${SingleLectureDetails.date}</h5><br>

                            <i class="glyphicon glyphicon-time"></i>
                            Time :  <h5 style="color: black">${SingleLectureDetails.time}</h5><br>

                            Sewa Coordinators : <h5 style="color: black">${SingleLectureDetails.sewaCoordinators}</h5>
                            </p>
                        </div>
                        <div class=" row"><!-- panel-footer -->
                            <div class="col-xs-6 text-left">
                                <div class="previous">
                                    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">Enter Hangout Url /Meeting Code
                                    </button>
                                </div>
                                <%--Modal for hangout url--%>
                                <div class="modal fade" id="myModal" role="dialog">
                                    <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title" style="color: black">Hangout Url</h4>
                                    </div>
                                    <div class="modal-body">

                                        <Form id="hangouturlform" action="/setHangoutUrl" method="post">
                                            <label for="hurl"><h3  class="panel-title" style="color: black">
                                                Enter Hangout Meeting Url
                                            </h3></label>
                                            <<input type="text" name="url" id="hurl" style="border: groove" class="input-group">
                                            <input type="hidden"  value="${SingleLectureDetails.id}" name="lid">
                                            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                                            <input type="submit" value="save">
                                        </Form>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    </div>
                                </div>
                                    </div>
                                </div>

                            </div>
                            <div class="col-xs-6 text-right">
                                <div class="next">
                                    <a href="${LiveLectureDetails.hangoutUrl}" target="_blank"> <button type="button" class="btn btn-success">
                                        Enter Youtube Url
                                    </button></a>
                                </div>
                            </div>
                        </div>
                    </div>

                </section>

                </section>


            </div>

            <div class=" col-md-3">
                <div class="panel panel-default sidebar-menu text-center" >


                    <div class="panel-heading">
                        <h3 class="panel-title">Lecture Starts In :</h3>
                    </div>

                    <div class="panel-body text-center">

                        <b>
                            <div id="timeleft" style="color: black;font-size: larger">
                            </div>
                        </b>

                        <form id="myform" method="post" action="/PreacherPanelLiveClass?${_csrf.parameterName}=${_csrf.token}">

                            <input type="hidden" name="lid" value="${SingleLectureDetails.id}" />

                            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                            <a id="link" class="viewlecture" onclick="document.getElementById('myform').submit();">

                                <button  id="lec" disabled>Enter In Class</button></a>

                        </form>

                    </div>

                </div>


                <div class="panel panel-default sidebar-menu wow fadeInRight animated text-center">
                    <div class="panel-heading">
                        <h3 class="panel-title">Upcoming Lectures</h3>
                    </div>
                    <div class="panel-body recent-property-widget text-center ">
                        <ul >
                            <c:forEach var="lecture" items="${upcominglectures}">
                                <li>
                                    <div style="border: 1px solid black;border-radius: 10px;">
                                        <div class="panel-title" style="color: black;">
                                            <h3 class="panel-title"><a href="/IyfSinglelectureDetails?lname=${lecture.tittle}"> ${lecture.tittle}</a></h3>
                                            <small  style="color:black;">${lecture.speakerName}</small>
                                        </div>
                                    </div>

                                </li>
                                <hr>
                            </c:forEach>
                        </ul>
                    </div>
                </div>



            </div>
        </div>

    </div>
</div>

<jsp:include page="IskcongzbFooter.jsp"></jsp:include>












<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 1/12/2018
  Time: 1:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--Tittle : ${SingleLectureDetails.tittle}<br>--%>
<%--Start Time : ${SingleLectureDetails.time}<br>--%>
<%--Time To Start : <div id="timetostart"></div>--%>
<%--<form id="myform" method="post" action="/gotoLiveClass?${_csrf.parameterName}=${_csrf.token}">--%>
<%--<input type="hidden" name="lid" value="${SingleLectureDetails.id}" />--%>
<%--<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />--%>

<%--<a id="link" class="viewlecture" onclick="document.getElementById('myform').submit();">--%>
<%--<button  id="lec" disabled>Enter In Class</button></a>--%>

<%--</form>--%>
<%--</body>--%>
<%--<script src="/resources/assets/js/jquery-1.10.2.min.js"></script>--%>
<%--<script src="/resources/assets/js/jquery.countdownTimer.min.js"></script>--%>

<%--</html>--%>
