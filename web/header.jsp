
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Page Preloder -->
<div id="preloder">
    <div class="loader"></div>
</div>


<!-- Header Section Begin -->
<header class="header">

    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="header__logo">
                    <a href="homepage"><img src="img/logo 2.png" alt=""></a>
                </div>
            </div>
            <div class="col-lg-6">
                <nav class="header__menu">
                    <ul>
                        <li><a href="homepage">Home</a></li>
                        <li><a href="shopgird">Shop</a></li>
                       
                        <li><a href="contact.jsp">Contact</a></li>
                            <c:if test="${sessionScope.acc.isAdmin==1}">
                            <li><a href="#">Admin</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="manager-product">Manager Products</a></li>
                                    <li><a href="manager-order">Manager Order</a></li>
                                </ul>

                            </li>
                        </c:if>
                    </ul>
                </nav>
            </div>
            <div class="col-lg-3">
                <div class="header__cart">
                    <ul>
                        <li><a href="addtocart"><i class="fa fa-shopping-bag"></i> </a></li>
                        <c:if test="${sessionScope.acc==null}">
                            <li><a href="login.jsp"><i class="fa fa-user"></i> </a></li>
                            </c:if>
                            <c:if test="${sessionScope.acc!=null}">
                            
                            <li><a href="logout"><i class="fa fa-sign-out"></i></a></li>
                                </c:if>
                    </ul>

                </div>
            </div>
        </div>

    </div>
</header>
<!-- Header Section End -->

<!-- Hero Section Begin -->
<section class="hero">
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="hero__categories">
                    <div class="hero__categories__all">
                        <i class="fa fa-bars"></i>
                        <span>All Categories</span>
                    </div>
                    <ul>
                        <c:forEach items="${listC}" var="o">
                            <li><a href="category?category_Id=${o.category_Id}">${o.category_Name}</a></li>
                            </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="col-lg-9">
                <div class="hero__search">
                    <div class="hero__search__form">
                        <form action="search" method="post">
                            <input type="text" placeholder="What do yo u need?" name="txt">
                            <button type="submit" class="site-btn">SEARCH</button>
                        </form>
                    </div>

                </div>
                <div class="hero__item set-bg" data-setbg="img/hero/banner.png">
                    <div class="hero__text">

                        <a href="shopgird" class="primary-btn">SHOP NOW</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Hero Section End -->