<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!-- title page -->
<section class="flat-title-page inner">
	<div class="overlay"></div>
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="page-title-heading mg-bt-12">
					<h1 class="heading text-center">Sign Up</h1>
				</div>
				<div class="breadcrumbs style2">
					<ul>
						<li><a href="<c:url value='/'/>">Home</a></li>
						<li><a href="#">Pages</a></li>
						<li>SignUp</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="tf-login tf-section">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-12">
				<h2 class="tf-title-heading ct style-1">Sigup To iMusic</h2>

				<div class="flat-form box-login-social">
					<div class="box-title-login">
						<h5>Login with social</h5>
					</div>
					<ul>
						<li><a href="#" class="sc-button style-2 fl-button pri-3">
								<i class="icon-fl-google-2"></i> <span>Google</span>
						</a></li>
						<li><a href="#" class="sc-button style-2 fl-button pri-3">
								<i class="icon-fl-facebook"></i> <span>Facebook</span>
						</a></li>
					</ul>
				</div>

				<div class="flat-form box-login-email">
					<div class="box-title-login">
						<h5>Or login with email</h5>
					</div>

					<div class="form-inner">
						<form action="<c:url value='/add-user'/>" id="contactform"
							method="POST">
							<input id="name" name="name" tabindex="1"
								value="" aria-required="true" required type="text"
								placeholder="Your Full Name"> 
							<input id="email"
								name="email" tabindex="2" value="" aria-required="true"
								type="email" placeholder="Your Email Address" required>
							<input id="password" name="password" tabindex="3" value=""
								aria-required="true" type="password"
								placeholder="Set Your Password" required>
							<div class="row-form style-1">
								<label>Remember me <input type="checkbox"> <span
									class="btn-checkbox"></span>
								</label> <a href="#" class="forgot-pass">Forgot Password ?</a>
							</div>

							<button class="submit">Login</button>
						</form>
					</div>

				</div>

			</div>
		</div>
	</div>
</section>