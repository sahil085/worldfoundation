<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Iskcongzbheader.jsp"></jsp:include>
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
<div class="container">
    <div class="col-sm-12">
        <div class="row">

            <div class="pull-left" style="color: red;">
                <div class="single-property-header" >
                    <h2 class="s-property-title pull-left" > Search Lectures </h2>
                    <input type="text" id="searchlecture" class="form-control pull-left"  placeholder="Search" >
                    <%--<h2 class="s-property-title pull-left" > Upcoming Lectures </h2>--%>
                    <hr>
                </div>
            </div>
        </div>
        <div class="row">
            <hr>
            <div class=" single-property-header pull-left" style="color: red;">
                <h2> <span>Course Details :</span></h2>

            </div>
        </div>
        <div class="row">
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
                            <%--<th>Action</th>--%>
                        </b>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="i" items="${LectureDetails}">
                        <tr>
                            <td>${i.tittle}</td>
                            <td>${i.speakerName}</td>
                            <td>${i.createCourse.courseName}</td>
                            <td>${i.createCourse.courseCategory}</td>
                            <td>${i.date}</td>
                            <td>${i.time}</td>
                            <td>${i.venue}</td>
                            <td>${i.street}</td>
                            <%--<td><a href="/UpdatelectureinfoPage?lid=${i.id}" >--%>
                                <%--<button type="button" class="btn btn-success">Update</button></a>--%>

                                <%--<button type="button" id="${i.id}"  class=" deletelecture btn btn-danger">Delete</button>--%>
                            <%--</td>--%>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<jsp:include page="IskcongzbFooter.jsp"></jsp:include>