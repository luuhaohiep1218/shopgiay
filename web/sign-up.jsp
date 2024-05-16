

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <title>Login 10</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="css/style_1.css">

    </head>
    <body >
        <p><a href="homepage"><i class="fa fa-arrow-left">Back to homepage</i></a>
            <section class="ftco-section">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-md-6 col-lg-4">
                            <div class="login-wrap p-0">
                                <h3 class="mb-4 text-center">Sign up</h3>
                                <form action="signup" class="signin-form">
                                    <div class="alert-danger">
                                        ${mess}
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Username" name="user" required>
                                    </div>
                                    <div class="form-group">
                                        <input id="password-field" type="password" class="form-control" placeholder="Password" name="pass" required>
                                        <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
                                    </div>
                                    <div class="form-group">
                                        <input id="password-field" type="password" class="form-control" placeholder="Confirm Password" name="cfpass" required>
                                        <span toggle="#password-field" class="fa fa-fw fa-eye field-icon toggle-password"></span>
                                    </div>
                                    <div class="form-group">
                                        <button type="submit" class="form-control btn btn-primary submit px-3">Sign In</button>
                                    </div>
                                    <div class="form-group d-md-flex">
                                        <div class="w-50">
                                            <label class="checkbox-wrap checkbox-primary">Remember Me
                                                <input type="checkbox" checked>
                                                <span class="checkmark"></span>
                                            </label>
                                        </div>
                                        <div class="w-50 text-md-right">
                                            <a href="#">Forgot Password</a>
                                        </div>                                    
                                    </div>
                                    <div class="color align" style="display: block; text-align: center;">Already have an account?<a href="login.jsp" style="font-size: 18px; font-family: monospace">Login</a> </div>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

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

