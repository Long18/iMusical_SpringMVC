<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!-- title page -->
<input id="user_id" type="hidden" value="${sessionScope.UserLogin.id }"/>

<section class="flat-title-page inner">
	<div class="overlay"></div>
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="page-title-heading mg-bt-12">
					<h1 class="heading text-center">Details</h1>
				</div>
				<div class="breadcrumbs style2">
					<ul>
						<li><a href="index-2.html">Home</a></li>
						<li><a href="#">Explore</a></li>
						<li>${product.name}</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</section>

<!-- tf item details -->
<div class="tf-section tf-item-details">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-xl-6 col-md-12">
				<div class="content-left">
					<div class="media">
						<c:choose>
							<c:when test="${product.productImages.size() > 0 }">
								<img
									src="<c:url value='/${product.productImages.get(0).product_img_name }'/>"
									alt="">
							</c:when>
							<c:otherwise>
								<img
									src="<c:url value='/resources/template/FE/images/box-item/images-item-details.jpg'/>"
									alt="">
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
			<div class="col-xl-6 col-md-12">
				<div class="content-right">
					<div class="sc-item-details">
						<h2 class="style2">${product.name }</h2>
						<div class="meta-item">
							<div class="left">
								<span class="viewed eye">225</span> <span
									class="liked heart wishlist-button mg-l-8"><span
									class="number-like">100</span></span>
							</div>
							<div class="right">
								<a href="#" class="share"></a> <a class="option"></a>
							</div>
						</div>
						<div class="client-infor sc-card-product">
							<div class="meta-info">
								<div class="author">
									<div class="avatar">
										<img
											src="<c:url value='/resources/template/FE/images/avatar/avt-8.jpg'/>"
											alt="">
									</div>
									<div class="info">
										<span>Brand</span>
										<h6>
											<a href="author02.html">${product.brand.name }</a>
										</h6>
									</div>
								</div>
							</div>
						</div>
						<p>${product.detail }</p>
						<div class="meta-item-details style2">
							<div class="item meta-price">
								<span class="heading">Current Price</span>
								<div class="price">
									<div class="price-box">
										<c:choose>
											<c:when test="${not empty product.priceSale}">
												<span> <del>
														<fmt:formatNumber value="${product.price}" type="number"
															maxFractionDigits="0" />
													</del> ${Math.round((product.priceSale/product.price-1)*100)}% =
												</span>
												<h5>
													<b><fmt:formatNumber value="${product.priceSale}"
															type="number" maxFractionDigits="0" /> VND</b>
												</h5>
											</c:when>

											<c:when test="${not empty product.price}">
												<span class="price"><b><fmt:formatNumber
															value="${product.price}" type="number"
															maxFractionDigits="0" /> VND</b></span>
											</c:when>

											<c:otherwise>
												<span class="price" style="color: red;"><b>Please
														Contact</b></span>
											</c:otherwise>
										</c:choose>
									</div>
								</div>
							</div>
							<div class="item count-down">
								<span class="heading style-2">Countdown</span> <span
									class="js-countdown" data-timer="416400"
									data-labels=" :  ,  : , : , "></span>
							</div>
						</div>
						<a href="#" onclick="addCart(${ product.id })" data-toggle="modal" data-target="#popup_bid" class="sc-button loadmore style bag fl-button pri-3"><span>Add to Cart</span></a>
						<a href="#" data-toggle="modal" data-target="#popup_bid" class="sc-button loadmore style bag fl-button pri-3"><span>Buy Now</span></a>
						<div class="flat-tabs themesflat-tabs">
							<ul class="menu-tab tab-title">
								<!-- <li class="item-title active">
                                                <span class="inner">Bid History</span>
                                            </li> -->
								<!-- <li class="item-title">
                                                <span class="inner">Info</span>
                                            </li> -->
								<li class="item-title"><span class="inner">Info</span></li>
							</ul>
							<div class="content-inner tab-content">
								<div class="provenance">
									<p>	Lorem Ipsum is simply dummy text of the printing and
										typesetting industry. Lorem Ipsum has been the industry's
										standard dummy text ever since the 1500s, when an unknown
										printer took a galley of type and scrambled it to make a type
										specimen book. It has survived not only five centuries, but
										also the leap into electronic typesetting, remaining
										essentially unchanged. It was popularised in the 1960s with
										the release of Letraset sheets containing Lorem Ipsum
										passages, and more recently with desktop publishing software
										like Aldus PageMaker including versions of Lorem Ipsum.</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- /tf item details -->

<section
	class="tf-section live-auctions item-details pad-b-74 mobie-style">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="heading-live-auctions">
					<h2 class="tf-title">Another Image</h2>
					<!-- <a href="explore-3.html" class="exp">EXPLORE MORE</a> -->
				</div>
			</div>
			<div class="col-md-12">
				<div class="swiper-container show-shadow carousel pad-t-24 auctions">
					<div class="swiper-wrapper">
						<c:if test="${product.productImages.size() > 0 }">
							<c:forEach items="${product.productImages }" var="img">
								<div class="swiper-slide">
									<div class="slider-item">
										<div class="sc-card-product">
											<div class="card-media">
												<a href="#"><img
													src="<c:url value='/${img.product_img_name }'/>"
													alt="Image"></a>
											</div>
										</div>
									</div>
									<!-- item-->
								</div>
							</c:forEach>
						</c:if>

					</div>
					<div class="swiper-pagination mg-t-12"></div>
					<div class="swiper-button-next btn-slide-next active"></div>
					<div class="swiper-button-prev btn-slide-prev"></div>
				</div>
			</div>
		</div>
	</div>
</section>