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
					<h1 class="heading text-center">Explore 1</h1>
				</div>
				<div class="breadcrumbs style2">
					<ul>
						<li><a href="index-2.html">Home</a></li>
						<li><a href="#">Explore</a></li>
						<li>Explore 1</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</section>

<div class="tf-section sc-explore-1">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="wrap-box explore-1 flex mg-bt-40">
					<div class="seclect-box style-1">
						<div id="item_category" class="dropdown">
							<a href="#" class="btn-selector nolink">All Categories</a>
							<ul>
								<c:if test="${not empty categories }">
									<c:forEach items="${categories }" var="category">
										<a href="<c:url value='/product/product-cate?cateId=${category.id }'/>"><li><span>${category.type_name }</span></li></a>
									</c:forEach>
								</c:if>
							</ul>
						</div>
						<div id="all-items" class="dropdown">
							<a href="#" class="btn-selector nolink">All Brands</a>
							<ul>
								<c:if test="${not empty brands }">
									<c:forEach items="${brands }" var="brand">
										<a href="<c:url value='/product/product-brand?brandId=${brand.id }'/>"><li><span>${brand.name }</span></li></a>
									</c:forEach>
								</c:if>
							</ul>
						</div>
						<!-- <div id="buy" class="dropdown">
							<a href="#" class="btn-selector nolink">Buy Now</a>
							<ul>
								<li><span>On Auction</span></li>
								<li><span>Has Offers</span></li>
							</ul>
						</div>
						<div id="all-items" class="dropdown">
							<a href="#" class="btn-selector nolink">All Items</a>
							<ul>
								<li><span>Single Items</span></li>
								<li><span>Bundles</span></li>
							</ul>
						</div> -->
					</div>
					<div class="seclect-box style-2 box-right">
						<!-- <div id="artworks" class="dropdown">
							<a href="#" class="btn-selector nolink">All Artworks</a>
							<ul>
								<li><span>Abstraction</span></li>
								<li><span>Skecthify</span></li>
								<li><span>Patternlicious</span></li>
								<li><span>Virtuland</span></li>
								<li><span>Papercut</span></li>
							</ul>
						</div> -->
						<!-- <div id="sort-by" class="dropdown">
							<a href="#" class="btn-selector nolink">Sort by</a>
							<ul>
								<li><span>Top rate</span></li>
								<li><span>Mid rate</span></li>
								<li><span>Low rate</span></li>
							</ul>
						</div> -->
					</div>
				</div>
			</div>
			<c:if test="${not empty products }">
				<c:forEach items="${products }" var="product">
					<div class="fl-item col-xl-3 col-lg-4 col-md-6 col-sm-6">
						<div class="sc-card-product">
							<div class="card-media">
								<a href="<c:url value='/product/product-detail?id=${product.id }'/>"><img
									src="<c:url value='/${product.productImages.get(0).product_img_name }'/>"
									alt="Image"></a>
								<button class="wishlist-button heart">
									<span class="number-like"></span>
								</button>
							</div>
							<div class="card-title">
								<h5 class="style2">
									<a href="item-details.html">${product.name }</a>
								</h5>
								<div class="tags">New</div>
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
							<div class="card-bottom" >
								<a href="#" onclick="addCart(${ product.id })"
									class="sc-button style bag fl-button pri-3" method="post"><span>Add
										to Cart</span></a>
							</div>
						</div>
					</div>
				</c:forEach>
			</c:if>

			<div class="col-md-12 wrap-inner load-more text-center">
				<a href="#" id="loadmore" class="sc-button loadmore fl-button pri-3"><span>Load
						More</span></a>
			</div>
		</div>
	</div>
</div>