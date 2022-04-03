<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<title><tiles:getAsString name="title" /></title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <meta name="csrf-token" content="rFtJ8NudN4YmTWbPJ4KufcTFd14V2dNIEXZdWTqS">
    <meta name="description" content="Some description for the page" />

    <link rel="icon" type="image/png" sizes="16x16" href="<c:url value='/resources/template/BE/images/favicon.png'/>">
    <link href="<c:url value='/resources/template/BE/vendor/bootstrap-select/dist/css/bootstrap-select.min.css'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/resources/template/BE/vendor/jqvmap/css/jqvmap.min.css'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/resources/template/BE/vendor/chartist/css/chartist.min.css'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/resources/template/BE/vendor/owl-carousel/owl.carousel.css'/>" rel="stylesheet" type="text/css" />

    <link href="<c:url value='/resources/template/BE/vendor/bootstrap-select/dist/css/bootstrap-select.min.css'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/resources/template/BE/vendor/datatables/css/jquery.dataTables.min.css'/>" rel="stylesheet" type="text/css" />
    <link href="<c:url value='/resources/template/BE/css/style.css'/>" rel="stylesheet" type="text/css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	
</head>

<body>
	<div id="preloader">
		<div class="sk-three-bounce">
			<div class="sk-child sk-bounce1"></div>
			<div class="sk-child sk-bounce2"></div>
			<div class="sk-child sk-bounce3"></div>
		</div>
	</div>


	<div id="main-wrapper">

		<tiles:insertAttribute name="header" />

		<tiles:insertAttribute name="body" />

		<%-- <tiles:insertAttribute name="footer" /> --%>

		<div class="footer">
			<div class="copyright">
				<p>
					Copyright © Designed &amp; Developed by <a
						href="https://www.facebook.com/William.2418/" target="_blank">Isekai
						Team</a> 2022
				</p>
			</div>
		</div>
	</div>
	
	<script src="<c:url value='/resources/template/BE/vendor/global/global.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/vendor/bootstrap-select/dist/js/bootstrap-select.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/vendor/chart.js/Chart.bundle.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/vendor/peity/jquery.peity.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/vendor/apexchart/apexchart.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/js/dashboard/dashboard-1.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/js/custom.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/js/dlabnav-init.js'/>" type="text/javascript"></script>

    <script src="<c:url value='/resources/template/BE/vendor/datatables/js/jquery.dataTables.min.js'/>" type="text/javascript"></script>
    <script src="<c:url value='/resources/template/BE/js/plugins-init/datatables.init.js'/>" type="text/javascript"></script>
<!--     <script data-cfasync="false" src={{ asset('../../public/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js'/>"></script> -->
	
</body>
</html>