<jsp:include page="Iskcongzbheader.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="iskcongzb.domain.ProductDetails" %>
<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>

<%--<head>--%>

    <%--<meta charset="utf-8">--%>
    <%--<meta name="robots" content="all,follow">--%>
    <%--<meta name="googlebot" content="index,follow,snippet,archive">--%>
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <%--<meta name="description" content="Obaju e-commerce template">--%>
    <%--<meta name="author" content="Ondrej Svestka | ondrejsvestka.cz">--%>
    <%--<meta name="keywords" content="">--%>

    <%--<title>--%>
        <%--Obaju : e-commerce template--%>
    <%--</title>--%>

    <%--<meta name="keywords" content="">--%>

    <%--<link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>--%>

    <%--<!-- styles -->--%>
    <%--<link href="/resources/bucketcss/font-awesome.css" rel="stylesheet">--%>
    <%--<link href="/resources/bucketcss/bootstrap.min.css" rel="stylesheet">--%>
    <%--<link href="/resources/bucketcss/animate.min.css" rel="stylesheet">--%>
    <%--<link href="/resources/bucketcss/owl.carousel.css" rel="stylesheet">--%>
    <%--<link href="/resources/bucketcss/owl.theme.css" rel="stylesheet">--%>

    <%--<!-- theme stylesheet -->--%>
    <%--<link href="/resources/bucketcss/style.default.css" rel="stylesheet" id="theme-stylesheet">--%>

    <%--<!-- your stylesheet with modifications -->--%>
    <%--<link href="/resources/bucketcss/custom.css" rel="stylesheet">--%>

    <%--<script src="/resources/bucketjs/respond.min.js"></script>--%>

    <%--<link rel="shortcut icon" href="favicon.png">--%>



<%--</head>--%>

<%--<body>--%>

<div class="navbar navbar-default yamm" role="navigation" id="navbar">


<div id="all">

    <div id="content">
        <div class="container">

            <div class="col-md-12">
                <ul class="breadcrumb">
                    <li><a href="#">Home</a>
                    </li>
                    <li>Shopping cart</li>
                </ul>
            </div>

            <div class="col-md-9" id="basket">

                <div class="box">

                    <form method="post" action="checkout1.html">

                        <h1>Shopping cart</h1>
                        <div class="InCart">
                            <%
                                List<ProductDetails> list=(List<ProductDetails>)session.getAttribute("cart");
                            %>
                        <p class="text-muted">You currently have <%out.print(list.size());%> item(s) in your cart.</p>
                        <div class="table-responsive">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th colspan="2">Product</th>
                                    <th>Quantity</th>
                                    <th>Unit price</th>

                                    <th colspan="2">Total</th>
                                </tr>
                                </thead>
                                <c:forEach var="cartItems" items="${cart}">
                                <tbody>
                                <tr>
                                    <td>
                                        <a href="#">
                                            <img src="img/detailsquare.jpg" alt="White Blouse Armani">
                                        </a>
                                    </td>
                                    <td><a href="#">${cartItems.bookName}</a>
                                    </td>
                                    <td>
                                        <input type="number" value="1" min="1" max="" class="form-control">
                                    </td>
                                    <td>${cartItems.price}</td>
                                    <td class="subtotal">${cartItems.price}</td>
                                    <td><a href="#"><span class="glyphicon glyphicon-trash"></span></a>
                                    </td>
                                </tr>

                                </tbody>
                                </c:forEach>
                                <tfoot>
                                <tr>
                                    <th colspan="5">Total</th>
                                    <th colspan="2">$446.00</th>
                                </tr>
                                </tfoot>
                            </table>

                        </div>
                        </div>
                        <!-- /.table-responsive -->

                        <div class="box-footer">
                            <div class="pull-left">
                                <a href="category.html" class="btn btn-default"><i class="fa fa-chevron-left"></i> Continue shopping</a>
                            </div>
                            <div class="pull-right">
                                <button type="submit" class="btn btn-primary">Proceed to checkout <i class="fa fa-chevron-right"></i>
                                </button>
                            </div>
                        </div>

                    </form>

                </div>
                <!-- /.box -->


                <div class="row same-height-row">
                    <div class="col-md-3 col-sm-6">
                        <div class="box same-height">
                            <h3>You may also like these products</h3>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="product same-height">
                            <div class="flip-container">
                                <div class="flipper">
                                    <div class="front">
                                        <a href="detail.html">
                                            <img src="img/product2.jpg" alt="" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="back">
                                        <a href="detail.html">
                                            <img src="img/product2_2.jpg" alt="" class="img-responsive">
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <a href="detail.html" class="invisible">
                                <img src="img/product2.jpg" alt="" class="img-responsive">
                            </a>
                            <div class="text">
                                <h3>Fur coat</h3>
                                <p class="price">$143</p>
                            </div>
                        </div>
                        <!-- /.product -->
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="product same-height">
                            <div class="flip-container">
                                <div class="flipper">
                                    <div class="front">
                                        <a href="detail.html">
                                            <img src="img/product1.jpg" alt="" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="back">
                                        <a href="detail.html">
                                            <img src="img/product1_2.jpg" alt="" class="img-responsive">
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <a href="detail.html" class="invisible">
                                <img src="img/product1.jpg" alt="" class="img-responsive">
                            </a>
                            <div class="text">
                                <h3>Fur coat</h3>
                                <p class="price">$143</p>
                            </div>
                        </div>
                        <!-- /.product -->
                    </div>


                    <div class="col-md-3 col-sm-6">
                        <div class="product same-height">
                            <div class="flip-container">
                                <div class="flipper">
                                    <div class="front">
                                        <a href="detail.html">
                                            <img src="img/product3.jpg" alt="" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="back">
                                        <a href="detail.html">
                                            <img src="img/product3_2.jpg" alt="" class="img-responsive">
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <a href="detail.html" class="invisible">
                                <img src="img/product3.jpg" alt="" class="img-responsive">
                            </a>
                            <div class="text">
                                <h3>Fur coat</h3>
                                <p class="price">$143</p>

                            </div>
                        </div>
                        <!-- /.product -->
                    </div>

                </div>


            </div>
            <!-- /.col-md-9 -->

            <div class="col-md-3">
                <div class="box" id="order-summary">
                    <div class="box-header">
                        <h3>Order summary</h3>
                    </div>
                    <p class="text-muted">Shipping and additional costs are calculated based on the values you have entered.</p>

                    <div class="table-responsive">
                        <table class="table">
                            <tbody>
                            <tr>
                                <td>Order subtotal</td>
                                <th>$446.00</th>
                            </tr>
                            <tr>
                                <td>Shipping and handling</td>
                                <th>$10.00</th>
                            </tr>
                            <tr>
                                <td>Tax</td>
                                <th>$0.00</th>
                            </tr>
                            <tr class="total">
                                <td>Total</td>
                                <th>$456.00</th>
                            </tr>
                            </tbody>
                        </table>
                    </div>

                </div>


                <div class="box">
                    <div class="box-header">
                        <h4>Coupon code</h4>
                    </div>
                    <p class="text-muted">If you have a coupon code, please enter it in the box below.</p>
                    <form>
                        <div class="input-group">

                            <input type="text" class="form-control">

                            <span class="input-group-btn">

					<button class="btn btn-primary" type="button"><i class="fa fa-gift"></i></button>

				    </span>
                        </div>
                        <!-- /input-group -->
                    </form>
                </div>

            </div>
            <!-- /.col-md-3 -->

        </div>
        <!-- /.container -->
    </div>
    <!-- /#content -->
</div>

</div>
<!-- /#all -->


<jsp:include page="IskcongzbFooter.jsp"></jsp:include>

<!-- *** SCRIPTS TO INCLUDE ***
_________________________________________________________ -->
<%--<script src="/resources/bucketjs/jquery-1.11.0.min.js"></script>--%>
<%--<script src="/resources/bucketjs/bootstrap.min.js"></script>--%>
<%--<script src="/resources/bucketjs/jquery.cookie.js"></script>--%>
<%--<script src="/resources/bucketjs/waypoints.min.js"></script>--%>
<%--<script src="/resources/bucketjs/modernizr.js"></script>--%>
<%--<script src="/resources/bucketjs/bootstrap-hover-dropdown.js"></script>--%>
<%--<script src="/resources/bucketjs/owl.carousel.min.js"></script>--%>
<%--<script src="/resources/bucketjs/front.js"></script>--%>


<script>
    $('span.glyphicon-trash').on('click', function() {
        $(this).closest('tr').remove();
    });

</script>
<%--</body>--%>

<%--</html>--%>