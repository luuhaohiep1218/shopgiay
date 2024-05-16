<%-- 
    Document   : index
    Created on : 27 thg 2, 2024, 19:54:48
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
            <!-- Categories Section Begin -->
            <section class="categories">
                <div class="container">
                    <div class="row">
                        <div class="categories__slider owl-carousel">
                            <div class="col-lg-3" >
                                <div class="categories__item set-bg" >
                                    <h5><a href="#"><img src="img/categories/category-mlb.png" alt="MLB" style="width: 50%"/></a></h5>
                                </div>
                            </div>
                            <div class="col-lg-3" >
                                <div class="categories__item set-bg">
                                    <h5><a href="#"><img src="img/categories/category-adidas.jpg" alt="Adidas" style="width: 45%"/></a></h5>
                                </div>
                            </div>
                            <div class="col-lg-3" >
                                <div class="categories__item set-bg" >
                                    <h5><a href="#"><img src="img/categories/category-conver.jpg" alt="Conver" style="width: 30%"/></a></h5>
                                </div>
                            </div>
                            <div class="col-lg-3" >
                                <div class="categories__item set-bg">
                                    <h5><a href="#"><img src="img/categories/category-nike.jpeg" alt="NIKE" style="width: 50%"/></a></h5>
                                </div>
                            </div>
                            <div class="col-lg-3" >
                                <div class="categories__item set-bg">
                                    <h5><a href="#"><img src="img/categories/category-vans.jpg" alt="Vans" style="width: 50%"/></a></h5>
                                </div>
                            </div>
                            <div class="col-lg-3" ">
                                <div class="categories__item set-bg">
                                    <h5><a href="#"><img src="img/categories/category-fila.png" alt="Fila" style="width: 50%"/></a></h5>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="categories__item set-bg">
                                    <h5><a href="#"><img src="img/categories/category-mc.png" alt="McQueen" style="width: 70%"/></a></h5>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- Categories Section End -->

            <!-- Featured Section Begin -->
            <section class="featured spad">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="section-title">
                                <h2>Featured Product</h2>
                            </div>
                            <div class="featured__controls">
                                <ul>
                                    <li class="active" data-filter="*">All</li>
                                    <li data-filter=".nike">Nike</li>
                                    <li data-filter=".mlb">MLB</li>
                                    <li data-filter=".vans">Vans</li>
                                    <li data-filter=".mc">McQueen</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="row featured__filter">
                    <c:forEach items="${listMLB}" var="o">
                        <div class="col-lg-3 col-md-4 col-sm-6 mix mlb">
                            <div class="featured__item">

                                <div class="featured__item__text">

                                    <h6><a href="detail?pId=${o.pId}">
                                            <div class="featured__item__pic set-bg" data-setbg="${o.pImage}">
                                            </div>
                                            ${o.pName}
                                        </a></h6>
                                    <h5>${o.pPrice}đ</h5>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <c:forEach items="${listNike}" var="o">
                        <div class="col-lg-3 col-md-4 col-sm-6 mix nike">
                            <div class="featured__item">

                                <div class="featured__item__text">

                                    <h6><a href="detail?pId=${o.pId}">
                                            <div class="featured__item__pic set-bg" data-setbg="${o.pImage}">
                                            </div>
                                            ${o.pName}
                                        </a></h6>
                                    <h5>${o.pPrice}đ</h5>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <c:forEach items="${listVans}" var="o">
                        <div class="col-lg-3 col-md-4 col-sm-6 mix vans">
                            <div class="featured__item">

                                <div class="featured__item__text">
                                    
                                    <h6><a href="detail?pId=${o.pId}"><div class="featured__item__pic set-bg" data-setbg="${o.pImage}">
                                            </div>${o.pName}</a></h6>
                                    <h5>${o.pPrice}đ</h5>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <c:forEach items="${listMC}" var="o">
                        <div class="col-lg-3 col-md-4 col-sm-6 mix mc">
                            <div class="featured__item">

                                <div class="featured__item__text">
                                    
                                    <h6><a href="detail?pId=${o.pId}"><div class="featured__item__pic set-bg" data-setbg="${o.pImage}">
                                            </div>${o.pName}</a></h6>
                                    <h5>${o.pPrice}đ</h5>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>
        <!-- Featured Section End -->


        <!-- Latest Product Section Begin -->
        <section class="latest-product spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Latest Products</h4>
                            <c:forEach items="${listLatest}" var="o">
                                <div class="latest-product__slider owl-carousel">
                                    <div class="latest-prdouct__slider__item">
                                        <a href="detail?pId=${o.pId}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${o.pImage}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${o.pName}</h6>
                                                <span>${o.pPrice}đ</span>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Top Rated Products</h4>
                            <c:forEach items="${listRate}" var="o">
                                <div class="latest-product__slider owl-carousel">
                                    <div class="latest-prdouct__slider__item">
                                        <a href="detail?pId=${o.pId}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${o.pImage}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${o.pName}</h6>
                                                <span>${o.pPrice}đ</span>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6">
                        <div class="latest-product__text">
                            <h4>Review Products</h4>
                            <c:forEach items="${listReview}" var="o">
                                <div class="latest-product__slider owl-carousel">
                                    <div class="latest-prdouct__slider__item">
                                        <a href="detail?pId=${o.pId}" class="latest-product__item">
                                            <div class="latest-product__item__pic">
                                                <img src="${o.pImage}" alt="">
                                            </div>
                                            <div class="latest-product__item__text">
                                                <h6>${o.pName}</h6>
                                                <span>${o.pPrice}đ</span>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Latest Product Section End -->

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