<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<script>
    $(document).ready(function () {

        $('#bulkregistrationformiyf').ajaxForm({

            success: function (msg) {
//                $('#iyfuserregistrationform').find("input[type=text],input[type=email],select,textarea,input[type=number],input[type=password],input[type=radio]").val("");
                alert(msg);
                window.location.href="http://localhost:8090/BulkRegistrationPage";
            },
            error: function (msg) {
                alert(msg);
            }
        });
    });
</script>
<div class="container">
    <div class="col-sm-12" style="margin-right: -15px;margin-left: -15px;">

        <div class="row">
            <hr>
            <div class=" single-property-header" style="color: red;">
                <center><h2> <span>Bulk Registartion</span></h2></center>
<hr>
            </div>
        </div>
        <div class="row" >
            <div class="table-responsive table-bordered">
                <%--<h1 class="property-price pull-left"> Recent HarinaamSankirtan Nearby You</h1>--%>
                <%--<span class="property-tittle pull-right">Total Number Of kirtans<br>30</span>--%>
                <table border="1px" class="table" style="font-size: small;">
            <c:url var="urlaction" value="/bulkRegister"></c:url>
            <form:form method="post" action="${urlaction}" id="bulkregistrationformiyf" modelAttribute="UserRegistraion">
            <tr>
            <th>User Name</th>
            <th>Firt Name</th  >
            <th>Last name</th>
            <th>Email</th>
            <th>password</th>
            <th>Phone</th>
            <th>address</th>
            <th>state</th>
            <th>deeksha</th>
            <th>rounds Chanting</th>
            </tr>
            <%
            int index=0;
            %>

            <c:forEach var="i" items="${UserRegistraion.user}">

            <tr>
            <td><input type="text" class="form-control" name="user[<%=index%>].userName" /></td>
            <td><input type="text" class="form-control" name="user[<%=index%>].firstName" /></td>
            <td><input type="text" class="form-control" name="user[<%=index%>].lastName" /></td>
            <td><input type="email" class="form-control" name="user[<%=index%>].email" /></td>
            <td><input type="password" class="form-control" name="user[<%=index%>].password" /></td>
            <td><input type="number" class="form-control" name="user[<%=index%>].mobileNumber" /></td>
            <td><input type="text" class="form-control" name="user[<%=index%>].address" /></td>
            <td><input type="text" class="form-control" name="user[<%=index%>].state" /></td>
            <td><input type="text" class="form-control" name="user[<%=index%>].deeksha"/></td>
            <td><input type="number" class="form-control" name="user[<%=index%>].roundsChanting"/></td>


            </tr>
            <%
            index++;
            %>
            </c:forEach>
            </table>
            <br/>
            <input type="submit" class="button btn btn-primary" value="Save" />

            </form:form>
            </div>
        </div>
        </div>
    </div>

<jsp:include page="IskcongzbFooter.jsp"></jsp:include>