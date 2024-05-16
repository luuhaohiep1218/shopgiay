<%-- 
    Document   : shop-details
    Created on : 27 thg 2, 2024, 19:58:39
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
        <style>
            body{
                margin-top:20px;
            }

            .content-item {
                padding:30px 0;
                background-color:#FFFFFF;
            }

            .content-item.grey {
                background-color:#F0F0F0;
                padding:50px 0;
                height:100%;
            }

            .content-item h2 {
                font-weight:700;
                font-size:35px;
                line-height:45px;
                text-transform:uppercase;
                margin:20px 0;
            }

            .content-item h3 {
                font-weight:400;
                font-size:20px;
                color:#555555;
                margin:10px 0 15px;
                padding:0;
            }

            .content-headline {
                height:1px;
                text-align:center;
                margin:20px 0 70px;
            }

            .content-headline h2 {
                background-color:#FFFFFF;
                display:inline-block;
                margin:-20px auto 0;
                padding:0 20px;
            }

            .grey .content-headline h2 {
                background-color:#F0F0F0;
            }

            .content-headline h3 {
                font-size:14px;
                color:#AAAAAA;
                display:block;
            }


            /* Container Styling */
            #comments {
                margin: 50px 0;
                padding: 20px;
                background-color: #f9f9f9;
                border-radius: 8px;
                box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            }

            /* Comment Form */
            .comment-form {
                margin-bottom: 30px;
            }

            .comment-form h3 {
                margin-bottom: 20px;
            }

            .comment-form textarea {
                width: 100%;
                padding: 10px;
                border: 1px solid #ddd;
                border-radius: 5px;
                resize: vertical;
                min-height: 100px;
            }

            .comment-form button {
                background-color: #5cb85c;
                border: none;
                color: white;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s;
            }

            .comment-form button:hover {
                background-color: #4cae4c;
            }

            /* Comment Item */
            .comment-item {
                padding: 15px;
                border-bottom: 1px solid #ddd;
                margin-bottom: 15px;
            }

            .comment-item:last-child {
                border-bottom: none;
                margin-bottom: 0;
            }

            .media-heading {
                font-size: 1.25em;
                font-weight: bold;
                margin-bottom: 10px;
            }

            .media-body p {
                font-size: 1em;
                color: #333;
                margin-bottom: 10px;
            }

            /* Media Detail */
            .media-detail {
                margin-top: 10px;
                font-size: 0.9em;
                color: #888;
            }

            .media-detail i {
                margin-right: 5px;
            }

            /* Links */
            .media-detail a {
                color: #007bff;
                text-decoration: none;
                transition: color 0.3s;
            }

            .media-detail a:hover {
                color: #0056b3;
            }
            .media-body{
                display: block;
            }

        </style>
    </head>

    <body>
        <jsp:include page="header.jsp"></jsp:include>



            <!-- Product Details Section Begin -->
            <form action="cart" method="post">
                <section class="product-details spad">
                    <div class="container">
                        <div class="row">
                            <div class=" col-lg-5 col-md-5">
                                <div class="product__details__pic">
                                    <input type="text" name="proid" value="${detail.pId}" hidden="">
                                <div class="product__details__pic__item">
                                    <img class="product__details__pic__item--large"
                                         src="${detail.pImage}" alt="">
                                </div>

                            </div>
                        </div>
                        <div class=" col-lg-7 col-md-7">
                            <div class="product__details__text">
                                <h3>${detail.pName}</h3>
                                <div class="product__details__price">${detail.pPrice}đ</div>
                                <p>${detail.pDetail}</p>
                                <div style="display: -webkit-inline-box;align-content: center">
                                    <h5>Select size: </h5>
                                    <select name="size">
                                        <c:forEach items="${listS}" var="o">
                                            <option>${o.size_Name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="product__details__quantity" style="display: flex;justify-content: flex-start">
                                    <div class="quantity">
                                        <div class="pro-qty">
                                            <input type="text" value="1" name="quantity">
                                        </div>
                                    </div>
                                    <div><button type="submit" style="width: 180px;height: 50px;background-color: #7fad39;color: white">ADD TO CARD</button></div>
                                </div>


                                <ul>
                                    <li><b>Availability</b> <span>In Stock</span></li>
                                    <li><b>Shipping</b> <span>01 day shipping. <samp>Free pickup today</samp></span></li>
                                    <li><b>Weight</b> <span>0.5 kg</span></li>
                                    <li><b>Share on</b>
                                        <div class="share">
                                            <a href="#"><i class="fa fa-facebook"></i></a>
                                            <a href="#"><i class="fa fa-twitter"></i></a>
                                            <a href="#"><i class="fa fa-instagram"></i></a>
                                            <a href="#"><i class="fa fa-pinterest"></i></a>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </form>


        <hr>


        <!--Comment-->

        <section class="content-item" id="comments">
            <div class="container">   
                <div class="row">
                    <div class="col-sm-12">   
                        <form action="addcomment" method="post">
                            <input type="text" name="proid" value="${detail.pId}" hidden="">
                            <h3 class="pull-left">New Comment</h3>
                            <button type="submit" class="btn btn-normal pull-right">Submit</button>
                            <fieldset>
                                <div class="row">

                                    <div class="form-group col-xs-12 col-sm-12 col-lg-12">
                                        <textarea class="form-control" id="message" placeholder="Your message" name="commentid" required=""></textarea>
                                    </div>
                                </div>  	
                            </fieldset>
                        </form>
                        <!-- COMMENT 1 - START -->
                        <c:forEach items="${listcm}" var="o">
                            <div class="media">
                                <div class="media-body col-sm-12">
                                    <h4 class="media-heading">${o.account_id.user}</h4>
                                    <p>${o.comment_detail}</p>
                                    <ul class="list-unstyled list-inline media-detail pull-left">
                                        <li><i class="fa fa-calendar" ></i>${o.comment_time}</li>
                                    </ul>
                                </div>
                            </div>
                        </c:forEach>

                        <!-- COMMENT 1 - END -->
                    </div>
                </div>
            </div>
        </section>


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