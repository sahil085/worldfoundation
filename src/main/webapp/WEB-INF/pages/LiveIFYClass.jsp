<jsp:include page="Iskcongzbheader.jsp"></jsp:include>


<div class="content-area blog-page padding-top-40" style="background-color: #FCFCFC; padding-bottom: 55px;">
    <div class="container">
        <div class="row">
            <div class="blog-lst col-md-12 pl0">
                <section id="id-100" class="post single">

                    <div class="post-header single">
                        <div class="">
                            <h2 class="wow text-center animated">Hare Krishna</h2>

                            <div class=" row"><!-- panel-footer -->
                                <div class="col-xs-6 text-left">
                                    <div class="previous">
                                        <a href="" ><button type="button" class="btn btn-success">View On youtube
                                        </button></a>
                                    </div>
                                </div>
                                <div class="col-xs-6 text-right">
                                    <div class="next">
                                        <a href="${LiveLectureDetails.hangoutUrl}" target="_blank"> <button type="button" class="btn btn-success">
                                           Join On Hangout
                                        </button></a>
                                    </div>
                                </div>
                            </div>

                            <h5 class="text-center" style="color: black;">I ${LiveLectureDetails.speakerName} Heartly Welcomes You To My Lecture On</h5>
                            <h3 class="text-center">${LiveLectureDetails.tittle}</h3>
                            <div class="title-line wow fadeInRight animated"></div>
                        </div>
                        <div class="row wow fadeInRight animated">
                            <div class="col-sm-6">
                                <p class="author-category">
                                <h3 style="color: black;">Venue : ${LiveLectureDetails.venue}</h3>
                                  <h3 style="color: black">  Course : ${LiveLectureDetails.createCourse.courseName}</h3>
                                </p>
                            </div>
                            <div class="col-sm-6 right" >
                                <p class="date-comments">
                                <h5 style="color: black">Date : ${LiveLectureDetails.date}</h5>
                                <h5 style="color: black">Time : ${LiveLectureDetails.time}</h5>
                                </p>
                            </div>
                        </div>
                        <div class="image wow fadeInRight animated">
                            <iframe src="${LiveLectureDetails.youtubeurl}" width="100%" height="650px"></iframe>
                        </div>
                    </div>

                </section>
            </div>
        </div>
    </div>
</div>
<jsp:include page="IskcongzbFooter.jsp"></jsp:include>




<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 1/12/2018
  Time: 2:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h3 class="pull-right">${Attendance}</h3>--%>
<%--Connect Live Session Via Hangout <br>--%>
<%--<a href="${LiveLectureDetails.hangoutUrl}" target="_blank">Join On Hangout Meet</a>--%>

<%--<hr>--%>
<%--For Mobile Users Copy Paste this Link As Meeting Code<br>--%>
<%--Link : ${LiveLectureDetails.hangoutUrl}--%>

<%--<hr>--%>
<%--<iframe src="${LiveLectureDetails.youtubeurl}" height="70%" width="100%"></iframe>--%>
<%--</body>--%>
<%--</html>--%>
