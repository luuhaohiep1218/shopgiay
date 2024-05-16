<%-- 
    Document   : checkout
    Created on : 27 thg 2, 2024, 20:00:05
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Ogani | Template</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>


            <!-- Checkout Section Begin -->
            <section class="checkout spad">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                        <c:if test="${sessionScope.acc==null}">
                            <h6><span class="fa fa-exclamation-circle">You need to<a href="login.jsp">login</a> before checkout</span>
                            </h6>
                        </c:if>
                    </div>
                </div>
                <div class="checkout__form">
                    <h4>Billing Details</h4>
                    <form action="#">
                        <div class="row">
                            <div class="col-lg-5 col-md-5">
                                <div class="row">
                                    <div >
                                        <input type="hidden" name="cusId">
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Full Name<span>*</span></p>
                                            <input name="cusName" type="text">

                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Address<span>*</span></p>
                                            <input name="cusAdd" type="text" placeholder="Street Address" class="checkout__input__add" style="margin-bottom: 0;">
                                        </div>
                                    </div>
                                </div>
                                <div class="checkout__input">
                                    <p>City<span>*</span></p>
                                    <input name="cusCity" type="text">
                                </div>
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Phone<span>*</span></p>
                                            <input name="cusPhone" type="text">
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Email<span>*</span></p>
                                            <input name="cusEmail" type="text">
                                        </div>
                                    </div>
                                </div>

                            </div>

                            <div class="col-lg-7 col-md-7">
                                <div class="checkout__order">
                                    <h4>Your Order</h4>
                                    <table>
                                        <thead >
                                            <tr >
                                                <th class="shoping__product col-lg-7">Products</th>
                                                <th class="col-lg-1">Quantity</th>
                                                <th class="col-lg-1">Size</th>
                                                <th class="col-lg-2">Total</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody >
                                            <c:forEach items="${listCart}" var="o">
                                            <tr>
                                                <td class="shoping__cart__item" >
                                                    <h5>${o.getProduct_Id().pName}</h5>
                                                </td>
                                                <td class="shoping__cart__quantity">
                                                    <div class="quantity">
                                                        <div>
                                                            <input name="quantity" type="text" value="${o.quantity}" readonly="" >
                                                        </div>
                                                    </div>
                                                </td>
                                                <td style="display: table-cell;text-align: center">${o.getSize().getSize_Name()}</td>
                                                <td class="shoping__cart__total" name="total" style="font-weight: 700 ">
                                                    ${o.getProduct_Id().pPrice*o.quantity}đ 
                                                </td>
                                                <td><input type="hidden" name="pid" value="${o.getProduct_Id().pId}" ></td>

                                            </tr>
                                        </c:forEach>

                                        </tbody>

                                    </table>
                                    <hr>
                                    <div class="checkout__order__total">Total <span>${t}đ</span></div>

                                    <button type="submit" class="site-btn">PLACE ORDER</button>
                                </div>
                            </div>

                        </div>
                    </form>
                </div>
            </div>
        </section>
        <!-- Checkout Section End -->

        <jsp:include page="footer.jsp"></jsp:include>


        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>



    </body>

</html>