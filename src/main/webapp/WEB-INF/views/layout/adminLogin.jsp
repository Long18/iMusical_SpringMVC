<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Admin | Page Login</title>
<meta name="description" content="Some description for the page" />

<link rel="icon" type="image/png" sizes="16x16"
	href="<c:url value='/resources/template/BE/images/favicon.png'/>">
<link href="<c:url value='/resources/template/BE/css/style.css'/>"
	rel="stylesheet">
</head>
<body>
<body class="h-100">
	<div class="authincation h-100">
		<div class="container h-100">
			<div class="row justify-content-center h-100 align-items-center">
				<div class="col-md-6">
					<div class="authincation-content">
						<div class="row no-gutters">
							<div class="col-xl-12">
								<div class="auth-form">
									<div class="text-center mb-3">
										<a href="<c:url value='/admin-dashboard'/>"><img
											src="<c:url value='/resources/template/BE/images/logo-full.png'/>"
											alt=""></a>
									</div>
									
									<c:if test="${not empty error}">
										<div
											class="alert alert-danger solid alert-dismissible fade show">
											<svg viewBox="0 0 24 24" width="24 " height="24"
												stroke="currentColor" stroke-width="2" fill="none"
												stroke-linecap="round" stroke-linejoin="round" class="mr-2">
												<polygon
													points="7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"></polygon>
												<line x1="15" y1="9" x2="9" y2="15"></line>
												<line x1="9" y1="9" x2="15" y2="15"></line></svg>
											<strong>Error!</strong> ${error }
											<button type="button" class="close h-100"
												data-dismiss="alert" aria-label="Close">
												<span><i class="mdi mdi-close"></i></span>
											</button>
										</div>
									</c:if>

									<h4 class="text-center mb-4 text-white">Sign in your
										account</h4>
									<form action="<c:url value='/admin/admin-dashboard'/>"
										method="post">
										<div class="form-group">
											<label class="mb-1 text-white"><strong>Email</strong></label>
											<input type="email" name="admin_email" class="form-control"
												value="" placeholder="Your Account">
										</div>
										<div class="form-group">
											<label class="mb-1 text-white"><strong>Password</strong></label>
											<input type="password" name="admin_password"
												class="form-control" value="" placeholder="Password">
										</div>
										<div class="form-row d-flex justify-content-between mt-4 mb-2">
											<div class="form-group">
												<div class="custom-control custom-checkbox ml-1 text-white">
													<input type="checkbox" class="custom-control-input"
														id="basic_checkbox_1"> <label
														class="custom-control-label" for="basic_checkbox_1">Remember
														my preference</label>
												</div>
											</div>
											<div class="form-group">
												<a class="text-white"
													href="<c:url value='/admin/forgot-password'/>">Forgot
													Password?</a>
											</div>
										</div>
										<div class="text-center">
											<button type="submit"
												class="btn bg-white text-primary btn-block">Sign Me
												In</button>
										</div>
									</form>
									<%-- <div class="new-account mt-3">
										<p class="text-white">
											Don't have an account? <a class="text-white"
												href="<c:url value='/admin/register'/>">Sign up</a>
										</p>
									</div> --%>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="<c:url value='/resources/template/BE/vendor/global/global.min.js'/>"
		type="text/javascript"></script>
	<script
		src="<c:url value='/resources/template/BE/vendor/bootstrap-select/dist/js/bootstrap-select.min.js'/>"
		type="text/javascript">
		
	</script>
	<script src="<c:url value='/resources/template/BE/js/custom.js'/>"
		type="text/javascript"></script>
	<script
		src="<c:url value='/resources/template/BE/js/dlabnav-init.js'/>"
		type="text/javascript"></script>

</body>
</html>