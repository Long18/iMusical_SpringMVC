<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- Basic Page Needs -->
<meta charset="utf-8">
<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
<title>iMusic | Buy Mucsical Instruments Online</title>


<!-- Mobile Specific Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- Theme Style -->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/template/FE/css/style.css'/>">

<!-- Favicon and Touch Icons  -->
<link rel="shortcut icon"
	href="<c:url value='/resources/template/FE/icon/Favicon.png'/>">
<link rel="apple-touch-icon-precomposed"
	href="<c:url value='/resources/template/FE/icon/Favicon.png'/>">

<!-- Reponsive -->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/template/FE/css/responsive.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/template/FE/css/textanimation.css'/>">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/template/FE/css/sweetalert.css'/>">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@5/dark.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">

</head>
<body class="body header-fixed is_dark">

	<!-- preloade -->
	<div class="preload preload-container">
		<div class="preload-logo"></div>
	</div>
	<!-- /preload -->

	<div id="wrapper">
		<div id="page" class="clearfix">
			

			<tiles:insertAttribute name="header" />

			<tiles:insertAttribute name="body" />

			<tiles:insertAttribute name="footer" />

			
		</div>
		<!-- /#page -->

	</div>
	<!-- /#wrapper -->
	
	<a id="scroll-top"></a>

    <!-- Javascript -->
    <script src="<c:url value='/resources/template/FE/js/jquery.min.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/main.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/jquery.easing.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/popper.min.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/wow.min.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/plugin.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/count-down.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/shortcodes.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/swiper-bundle.min.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/swiper.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/web3.min.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/moralis.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/nft.js'/>"></script>
    <script src="<c:url value='/resources/template/FE/js/sweetalert2.all.js'/>"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
    <script async defer crossorigin="anonymous"
        src="https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v13.0&appId=435206154792265&autoLogAppEvents=1"
        nonce="UVTONwsm"></script>
    <script src="https://www.paypalobjects.com/api/checkout.js"></script>
	

</body>
</html>