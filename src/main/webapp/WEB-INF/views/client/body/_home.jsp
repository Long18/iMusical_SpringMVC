
<%@page import="java.util.Random"%>
<%@page import="java.text.DecimalFormat"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<!-- title page -->
<input id="user_id" type="hidden" value="${sessionScope.UserLogin.id }"/>

<section class="flat-title-page style2">
	<img class="bgr-gradient gradient1"
		src="<c:url value='/resources/template/FE/images/backgroup-secsion/bg-gradient1.png'/>"
		alt=""> <img class="bgr-gradient gradient2"
		src="<c:url value='/resources/template/FE/images/backgroup-secsion/bg-gradient2.png'/>"
		alt=""> <img class="bgr-gradient gradient3"
		src="<c:url value='/resources/template/FE/images/backgroup-secsion/bg-gradient3.png'/>"
		alt="">
	<div class="shape item-w-16"></div>
	<div class="shape item-w-22"></div>
	<div class="shape item-w-32"></div>
	<div class="shape item-w-48"></div>
	<div class="shape style2 item-w-51"></div>
	<div class="shape style2 item-w-51 position2"></div>
	<div class="shape item-w-68"></div>
	<div class="overlay"></div>
	<div class="swiper-container mainslider home auctions">
		<div class="swiper-wrapper">
			<div class="swiper-slide">
				<div class="slider-item">
					<div class="themesflat-container ">
						<div class="wrap-heading flat-slider flex">
							<div class="content">
								<h2 class="heading">Hear it…See it…LIVE it</h2>
								<h1 class="heading mb-style">
									<span class="tf-text s1">Sell extraordinary</span>
								</h1>
								<h1 class="heading">Music for your LIFE</h1>
								<p class="sub-heading mg-t-29 mg-bt-44">Music is the
									mediator between the spiritual and the sensual life.</p>
								<div class="flat-bt-slider flex style2">
									<a href="explore-1.html"
										class="sc-button header-slider style style-1 rocket fl-button pri-1"><span>Explore
									</span></a> <a href="create-item.html"
										class="sc-button header-slider style style-1 note fl-button pri-1"><span>Create
									</span></a>
								</div>
							</div>
							<div class="image">
								<img class="img-bg"
									src="<c:url value='/resources/template/FE/images/backgroup-secsion/img-bg-sliderhome2.png'/>"
									alt="Image"> <img
									src="<c:url value='/resources/template/FE/images/box-item/guitar.png'/>"
									alt="Image">
							</div>
						</div>

					</div>
				</div>
				<!-- item-->
			</div>
			<div class="swiper-slide">
				<div class="slider-item">
					<div class="themesflat-container">
						<div class="wrap-heading flat-slider text-center two">
							<h2 class="heading">Discover, and collect</h2>
							<h1 class="heading">
								<span class="tf-text s1">extraordinary</span> <span>Monster
									NFTs</span>
							</h1>
							<p class="sub-heading mg-t-29 mg-bt-50">Marketplace for
								monster character cllections non fungible token NFTs</p>
							<div class="flat-bt-slider flex">
								<a href="explore-1.html"
									class="sc-button header-slider style style-1 rocket fl-button pri-1"><span>Explore
								</span></a> <a href="create-item.html"
									class="sc-button header-slider style style-1 note fl-button pri-1"><span>Create
								</span></a>
							</div>
						</div>
					</div>
				</div>
				<!-- item-->
			</div>
			<div class="swiper-slide">
				<div class="slider-item">
					<div class="themesflat-container flex">
						<div class="image three">
							<img
								src="<c:url value='/resources/template/FE/images/box-item/keylab.jpg'/>"
								alt="Image"> <img class="img-bg"
								src="<c:url value='/resources/template/FE/images/backgroup-secsion/img-bg-sliderhome3.png'/>"
								alt="Image">
						</div>
						<div class="wrap-heading flat-slider h3 three">
							<h2 class="heading">Discover, and collect</h2>
							<h2 class="heading">extraordinary</h2>
							<h2 class="heading h3">
								<span class="fill">Monster </span>NFTs
							</h2>
							<p class="sub-heading mt-29 mb-35">Marketplace for monster
								character cllections non fungible token NFTs</p>
							<div class="flat-bt-slider flex style2">
								<a href="explore-1.html"
									class="sc-button header-slider style style-1 rocket fl-button pri-1"><span>Explore
								</span></a> <a href="create-item.html"
									class="sc-button header-slider style style-1 note fl-button pri-1"><span>Create
								</span></a>
							</div>
						</div>
					</div>
				</div>
				<!-- item-->
			</div>
		</div>
		<div class="swiper-pagination"></div>
	</div>
	<div class="swiper-button-next btn-slide-next active"></div>
	<div class="swiper-button-prev btn-slide-prev"></div>
</section>

<section class="tf-section live-auctions style1 pad-b-54 mobie-style">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="heading-live-auctions">
					<h2 class="tf-title pb-18">New Product</h2>
					<a href="explore-3.html" class="exp style2">EXPLORE MORE</a>
				</div>
			</div>
			<div class="col-md-12">
				<div class="swiper-container show-shadow carousel pad-t-17 auctions">
					<div class="swiper-wrapper">
						<c:if test="${not empty newProducts }">
							<c:forEach items="${newProducts }" var="product">
								<div class="swiper-slide">
									<div class="slider-item">
										<div class="sc-card-product">

											<div class="card-media">
												<a href="<c:url value='/product/product-detail?id=${product.id}'/>"><img
													src="
												<c:if test='${product.productImages.size() > 0}'>
													<c:url value="${product.productImages.get(0).product_img_name }"/>
												</c:if>
												"
													alt="Image"></a>
												<button class="wishlist-button heart">
													<%
													Random rand = new Random();
													int n = rand.nextInt(90000) + 10000;
													%>
													<span class="number-like"> <%=n%></span>
												</button>
												<div class="featured-countdown">
													<span class="slogan"></span> <span class="js-countdown"
														data-timer="{{rand(12345,716400)}"
														data-labels=" :  ,  : , : , "></span>
												</div>
												<div class="button-place-bid">
													<button href="#" onclick="addCart(${ product.id })"
														name="add-to-cart" type="button"
														class="sc-button style-place-bid style bag fl-button pri-3 add-to-cart">
														<span> Add to Cart </span>
													</button>
												</div>
											</div>
											<div class="card-title">
												<h3>
													<a
														href="<c:url value='/product-detail?id=${product.id }'/>"
														method="post"> ${product.name } </a>
												</h3>
											</div>
											<div class="meta-info">
												<div class="author">
													<div class="avatar">
														<img
															src="<c:url value='/resources/template/FE/images/avatar/avt-11.jpg'/>"
															alt="Image">
													</div>
													<div class="info">
														<span>Brand</span>
														<h5>
															<a href="author02.html">${product.brand.name } </a>
														</h5>
													</div>
												</div>
												<div class="price">
													<c:choose>
														<c:when test="${not empty product.priceSale}">
															<span> <del>
																	<fmt:formatNumber value="${product.price}"
																		type="number" maxFractionDigits="0" />
																</del> ${Math.round((product.priceSale/product.price-1)*100)}%
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
									</div>
								</div>
							</c:forEach>
						</c:if>
					</div>
					<div class="swiper-pagination mg-t-6"></div>
					<div class="swiper-button-next btn-slide-next active"></div>
					<div class="swiper-button-prev btn-slide-prev"></div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="tf-section live-auctions style2 no-pt-mb tl-pb-0">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="heading-live-auctions">
					<h2 class="tf-title">Top Seller</h2>
				</div>
			</div>
			<div class="col-md-12">
				<div
					class="swiper-container seller style2 seller-slider2 button-arow-style">
					<div class="swiper-wrapper">
						<c:if test="${not empty topSellerProducts}">
							<c:forEach items="${topSellerProducts}" var="product">
								<div class="swiper-slide">
									<div class="slider-item">
										<div class="sc-author-box style-2">
											<div class="author-avatar">
												<c:set
													value="${product.productImages.get(0).product_img_name }"
													var="imgUrl" />
												<img
													src="
												<c:url value='/${imgUrl }'/>
												"
													alt="" class="avatar">
												<div class="badge"></div>
											</div>
											<div class="author-infor">
												<h5>
													<a href="<c:url value='/user/'/>">${product.name }</a>
												</h5>

												<c:choose>
													<c:when test="${not empty product.priceSale}">
														<p style="font-size: 1.5rem;">
															<del>
																<fmt:formatNumber value="${product.price}" type="number"
																	maxFractionDigits="0" />
															</del>
															${Math.round((product.priceSale/product.price-1)*100)}%
														</p>
														<span class="price"><b><fmt:formatNumber
																	value="${product.priceSale}" type="number"
																	maxFractionDigits="0" /> VND</b></span>
													</c:when>

													<c:when test="${not empty product.price}">
														<p style="font-size: 1.5rem;">Current Price</p>
														<span class="price"><b><fmt:formatNumber
																	value="${product.price}" type="number"
																	maxFractionDigits="0" /> VND</b></span>
													</c:when>

													<c:otherwise>
														<p style="font-size: 1.5rem;"></p>
														<span class="price" style="color: red;"><b>Please
																Contact</b></span>
													</c:otherwise>
												</c:choose>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
						</c:if>
					</div>
					<div class="swiper-button-next btn-slide-next active"></div>
					<div class="swiper-button-prev btn-slide-prev "></div>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="tf-section live-auctions style4 no-pt-mb mobie-style">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="heading-live-auctions">
					<h2 class="tf-title pb-17 text-left">Category</h2>
					<a href="explore-3.html" class="exp style2">EXPLORE MORE</a>
				</div>
			</div>
			<div class="col-md-12">
				<div class="collection">
					<div
						class="swiper-container show-shadow carousel4 pad-t-20 button-arow-style">
						<div class="swiper-wrapper">

							<c:if test="${not empty categories }">
								<c:forEach items="${categories }" var="category">
									<div class="swiper-slide">
										<div class="slider-item">
											<div class="sc-card-collection style-2 home2">
												<div class="card-bottom">
													<div class="author">
														<div class="sc-author-box style-2">
															<div class="author-avatar">
																<img
																	src="<c:url value='/resources/template/FE/images/avatar/avt-1.jpg'/>"
																	alt="" class="avatar">
																<div class="badge">
																	<i class="ripple"></i>
																</div>
															</div>
														</div>
														<div class="content">
															<h3>
																<a href="author01.html">${category.type_name }</a>
															</h3>

														</div>
													</div>
												</div>
												<a href="author02.html">
													<div class="media-images-collection">
														<div class="box-left">
															<img
																src="<c:url value='/resources/template/FE/images/box-item/collection-item-2.jpg'/>"
																alt="">
														</div>
														<div class="box-right">
															<div class="top-img">
																<img
																	src="<c:url value='/resources/template/FE/images/box-item/collection-item-top-1.jpg'/>"
																	alt=""> <img
																	src="<c:url value='/resources/template/FE/images/box-item/collection-item-top-2.jpg'/>"
																	alt="">
															</div>
															<div class="bottom-img">
																<img
																	src="<c:url value='/resources/template/FE/images/box-item/collection-item-bottom-4.jpg'/>"
																	alt="">
															</div>
														</div>
													</div>
												</a>
											</div>
										</div>
										<!-- item-->
									</div>
								</c:forEach>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>

<section
	class="tf-section live-auctions style3 pad-b-54 no-pt-mb mobie-pb-70">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="heading-live-auctions mg-bt-21">
					<h2 class="tf-title pad-l-7">Today's Picks</h2>
					<a href="explore-3.html" class="exp style2">EXPLORE MORE</a>
				</div>
			</div>
			<div class="col-md-12">
				<div class="tf-soft">
					<div class="soft-left">
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<svg width="24" height="24" viewBox="0 0 24 24" fill="none"
									xmlns="http://www.w3.org/2000/svg">
                                        <path
										d="M5 10H7C9 10 10 9 10 7V5C10 3 9 2 7 2H5C3 2 2 3 2 5V7C2 9 3 10 5 10Z"
										stroke="white" stroke-width="1.5" stroke-miterlimit="10"
										stroke-linecap="round" stroke-linejoin="round" />
                                        <path
										d="M17 10H19C21 10 22 9 22 7V5C22 3 21 2 19 2H17C15 2 14 3 14 5V7C14 9 15 10 17 10Z"
										stroke="white" stroke-width="1.5" stroke-miterlimit="10"
										stroke-linecap="round" stroke-linejoin="round" />
                                        <path
										d="M17 22H19C21 22 22 21 22 19V17C22 15 21 14 19 14H17C15 14 14 15 14 17V19C14 21 15 22 17 22Z"
										stroke="white" stroke-width="1.5" stroke-miterlimit="10"
										stroke-linecap="round" stroke-linejoin="round" />
                                        <path
										d="M5 22H7C9 22 10 21 10 19V17C10 15 9 14 7 14H5C3 14 2 15 2 17V19C2 21 3 22 5 22Z"
										stroke="white" stroke-width="1.5" stroke-miterlimit="10"
										stroke-linecap="round" stroke-linejoin="round" />
                                    </svg>
								<span class="inner">Category</span>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="#">
									<div class='sort-filter active'>
										<span><img
											src="<c:url value='/resources/template/FE/images/icon/menu.png'/>"
											alt="" /> All</span> <i class="fal fa-check"></i>
									</div>
								</a>
								<c:if test="${not empty categories }">
									<c:forEach items="${categories }" var="category">
										<a class="dropdown-item" href="category/">
											<div class="sort-filter">
												<span><img
													src="<c:url value='/resources/template/FE/images/icon/rainbow.png'/>"
													alt="" />${category.type_name }</span> <i class="fal fa-check"></i>
											</div>
										</a>
									</c:forEach>
								</c:if>


							</div>
						</div>
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton2" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<svg width="24" height="24" viewBox="0 0 24 24" fill="none"
									xmlns="http://www.w3.org/2000/svg">
                                        <path
										d="M8.67188 14.3298C8.67188 15.6198 9.66188 16.6598 10.8919 16.6598H13.4019C14.4719 16.6598 15.3419 15.7498 15.3419 14.6298C15.3419 13.4098 14.8119 12.9798 14.0219 12.6998L9.99187 11.2998C9.20187 11.0198 8.67188 10.5898 8.67188 9.36984C8.67188 8.24984 9.54187 7.33984 10.6119 7.33984H13.1219C14.3519 7.33984 15.3419 8.37984 15.3419 9.66984"
										stroke="white" stroke-width="1.5" stroke-linecap="round"
										stroke-linejoin="round" />
                                        <path d="M12 6V18"
										stroke="white" stroke-width="1.5" stroke-linecap="round"
										stroke-linejoin="round" />
                                        <path
										d="M12 22C17.5228 22 22 17.5228 22 12C22 6.47715 17.5228 2 12 2C6.47715 2 2 6.47715 2 12C2 17.5228 6.47715 22 12 22Z"
										stroke="white" stroke-width="1.5" stroke-linecap="round"
										stroke-linejoin="round" />
                                    </svg>
								<span class="inner">Price range</span>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="#">
									<div class='sort-filter active'>
										<span> Price: Low to High</span> <i class="fal fa-check"></i>
									</div>
								</a> <a class="dropdown-item" href="#">
									<div class='sort-filter'>
										<span> Price: High to Low</span> <i class="fal fa-check"></i>
									</div>
								</a>
							</div>
						</div>
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton3" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<svg width="18" height="22" viewBox="0 0 18 22" fill="none"
									xmlns="http://www.w3.org/2000/svg">
                                        <path
										d="M3.0901 12.2799H6.1801V19.4799C6.1801 21.1599 7.0901 21.4999 8.2001 20.2399L15.7701 11.6399C16.7001 10.5899 16.3101 9.7199 14.9001 9.7199H11.8101V2.5199C11.8101 0.839898 10.9001 0.499897 9.7901 1.7599L2.2201 10.3599C1.3001 11.4199 1.6901 12.2799 3.0901 12.2799Z"
										stroke="white" stroke-width="1.5" stroke-miterlimit="10"
										stroke-linecap="round" stroke-linejoin="round" />
                                    </svg>
								<span class="inner">Sale type</span>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<a class="dropdown-item" href="#">
									<div class='sort-filter'>
										<span> Timed auction</span> <i class="fal fa-check"></i>
									</div>
								</a> <a class="dropdown-item" href="#">
									<div class='sort-filter active'>
										<span>Fixed price</span> <i class="fal fa-check"></i>
									</div>
								</a> <a class="dropdown-item" href="#">
									<div class='sort-filter'>
										<span> Not for sale</span> <i class="fal fa-check"></i>
									</div>
								</a> <a class="dropdown-item" href="#">
									<div class='sort-filter'>
										<span>Open for offers</span> <i class="fal fa-check"></i>
									</div>
								</a>
							</div>
						</div>
					</div>
					<div class="soft-right">
						<div class="dropdown">
							<button class="btn btn-secondary dropdown-toggle" type="button"
								id="dropdownMenuButton4" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false">
								<svg width="24" height="24" viewBox="0 0 24 24" fill="none"
									xmlns="http://www.w3.org/2000/svg">
                                        <path d="M3 7H21" stroke="white"
										stroke-width="1.5" stroke-linecap="round" />
                                        <path d="M6 12H18"
										stroke="white" stroke-width="1.5" stroke-linecap="round" />
                                        <path d="M10 17H14"
										stroke="white" stroke-width="1.5" stroke-linecap="round" />
                                    </svg>
								<span>Sort By: Recently Added</span>
							</button>
							<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
								<h6>Sort by</h6>
								<a href="#" class="dropdown-item">
									<div class="sort-filer" href="#">
										<span>Recently added</span> <i class="fal fa-check"></i>
									</div>
								</a> <a href="#" class="dropdown-item">
									<div class="sort-filer active" href="#">
										<span>Price: Low to High</span> <i class="fal fa-check"></i>
									</div>
								</a> <a href="#" class="dropdown-item">
									<div class="sort-filer" href="#">
										<span>Price: High to Low</span> <i class="fal fa-check"></i>
									</div>
								</a> <a href="#" class="dropdown-item">
									<div class="sort-filer" href="#">
										<span>Auction ending soon</span> <i class="fal fa-check"></i>
									</div>
								</a>

								<h6>Options</h6>
								<a href="#" class="dropdown-item">
									<div class="sort-filer" href="#">
										<span>Auction ending soon</span> <input class="check"
											type="checkbox" value="checkbox" name="check" checked="">
									</div>
								</a> <a href="#" class="dropdown-item">
									<div class="sort-filer" href="#">
										<span>Show lazy minted</span> <input class="check"
											type="checkbox" value="checkbox" name="check">
									</div>
								</a>

							</div>
						</div>
					</div>
				</div>
			</div>
			<c:if test="${not empty products }">
				<c:forEach items="${products }" var="product">
					<div class="fl-item col-xl-3 col-lg-4 col-md-6 col-sm-6">
						<div class="sc-card-product">
							<div class="card-media">
								<a href="<c:url value='/item-detail/${product.id}'/>"><img
									src='<c:choose>
											<c:when test='${product.productImages.size() > 0}'>
													<c:url value="${product.productImages.get(0).product_img_name }"/>
											</c:when>
											<c:otherwise >
													<c:url value="/resources/template/FE/images/box-item/nonImage.png"/>
											</c:otherwise>
										</c:choose>'
									alt="Image"></a>
							</div>
							<div class="card-title">
								<h5 class="style2">
									<a href="item-details.html">${product.name }</a>
								</h5>
								<div class="tags">bsc</div>
							</div>
							<div class="meta-info">
								<div class="author">
									<div class="avatar">
										<img
											src="<c:url value='/resources/template/FE/images/avatar/avt-1.jpg'/>"
											alt="Image">
									</div>
									<div class="info">
										<span>Brand</span>
										<h6>
											<a href="author02.html">${product.brand.name }</a>
										</h6>
									</div>
								</div>
								<div class="price">
									<c:choose>
										<c:when test="${not empty product.priceSale}">
											<span> <del>
													<fmt:formatNumber value="${product.price}" type="number"
														maxFractionDigits="0" />
												</del> ${Math.round((product.priceSale/product.price-1)*100)}%
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
							<div class="card-bottom">
								<a href="#" data-toggle="modal" data-target="#popup_bid"
									class="sc-button style bag fl-button pri-3"><span>
										Add to Cart </span></a>
								<!-- <a href="activity1.html" class="view-history reload">View History</a> -->
							</div>
						</div>
					</div>
				</c:forEach>
			</c:if>

			<div class="col-md-12 wrap-inner load-more text-center mg-t-4">
				<a href="#" id="loadmore" class="sc-button loadmore fl-button pri-3"><span>Load
						More</span></a>
			</div>
		</div>
	</div>
</section>