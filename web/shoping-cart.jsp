
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
        <style>
            .submit {
                display: block;
                padding-top: 0.75rem;
                padding-bottom: 0.75rem;
                padding-left: 1.25rem;
                padding-right: 1.25rem;
                background-color: #4F46E5;
                color: #ffffff;
                font-size: 0.875rem;
                line-height: 1.25rem;
                font-weight: 500;
                width: 100%;
                border-radius: 0.5rem;
                text-transform: uppercase;
            }
            ul {

                list-style-type: none;
                padding: 0;
                margin: 0;
            }

            li {
                margin-bottom: 10px;
            }

            .checkout-icon {
                display: flex;
                align-items: center;
                justify-content: end;
            }

            .checkout-icon span {
                font-size: 24px;
                margin-right: 10px;
            }

            .checkout-icon a {
                font-size: 22px;
                text-decoration: none;
                color: #333;
                font-weight: bold;
                transition: color 0.3s ease;
            }

            .checkout-icon a:hover {
                color: #007bff;
            }
            /* CSS for shopping cart quantity control */


            .quantity {
                display: flex;
                align-items: center;
                justify-content: center;
            }

            .quantity button {
                background-color: #f8f9fa;
                border: 1px solid #ced4da;
                color: #495057;
                cursor: pointer;
                font-size: 16px;
                padding: 5px 10px;
                transition: background-color 0.3s ease;
            }

            .quantity button:hover {
                background-color: #e9ecef;
            }

            .quantity p {
                margin: 0 10px;
                font-size: 20px;
            }

            .quantity a {
                text-decoration: none;
                color: inherit;
            }



        </style>
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>


            <!-- Breadcrumb Section Begin -->
            <section class="breadcrumb-section set-bg" >
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 text-center">
                            <div class="breadcrumb__text" >
                                <h2 style="color: green;font-size: 60px">Shopping Cart</h2>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- Breadcrumb Section End -->

            <!-- Shoping Cart Section Begin -->
            <section class="shoping-cart spad" style="padding-top: 30px">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">

                            <div class="shoping__cart__table">
                                <table>
                                    <thead>
                                        <tr>
                                            <th class="shoping__product col-lg-3">Products</th>
                                            <th class="col-lg-3">Name</th>
                                            <th class="col-lg-2">Price</th>
                                            <th class="col-lg-1">Quantity</th>
                                            <th class="col-lg-1">Size</th>
                                            <th class="col-lg-1">Total</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${listCart}" var="o">
                                        <tr>
                                    <input name="pid" type="text" value="${o.getProduct_Id().pId}" hidden="">
                                    <td class="shoping__cart__item" >
                                        <img  src="${o.getProduct_Id().getpImage()}" alt="">
                                    </td>
                                    <td class="shoping__cart__item" >
                                        <h5 style="font-size: 24px;height: calc;margin-left: 20px">${o.getProduct_Id().pName}</h5>
                                    </td>
                                    <td class="shoping__cart__price">
                                        ${o.getProduct_Id().pPrice}đ 
                                    </td>
                                    <td class="shoping__cart__quantity">
                                        <div class="quantity" >
                                            <button><a href="closecart?num=${o.quantity -1}&cid=${o.cart_Id}" >-</a></button>
                                            <p name="quantity">${o.quantity}</p>
                                            <button><a href="closecart?num=${o.quantity +1}&cid=${o.cart_Id}" >+</a></button>
                                        </div>
                                    </td>
                                    <td style="font-size: 20px;">${o.getSize().getSize_Name()}</td>
                                    <td class="shoping__cart__total" name="total">
                                        ${o.getProduct_Id().pPrice*o.quantity}đ 
                                    </td>

                                    <td class="shoping__cart__item__close">
                                        <a href="closecart?num=0&cid=${o.cart_Id}"><span class="icon_close"></span></a>
                                    </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>

                    </div>
                    <div class="col-lg-6">
                    </div>
                    <div class="col-lg-6">
                        <div class="shoping__checkout">
                            <h5>Cart Total</h5>
                            <ul>
                                <li>Total <span>${t}đ</span></li>
                                <div class="checkout-icon">
                                    <span>&#x1F6D2;</span>
                                    <a href="checkout" style="">CheckOut</a>
                                </div>     
                            </ul>

                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Shoping Cart Section End -->

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