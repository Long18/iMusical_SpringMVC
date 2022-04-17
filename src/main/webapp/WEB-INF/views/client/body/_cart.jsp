<%@page import="java.text.DecimalFormat"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!-- title page -->
<!-- title page -->
<section class="flat-title-page inner">
	<div class="overlay"></div>
	<div class="themesflat-container">
		<div class="row">
			<div class="col-md-12">
				<div class="page-title-heading mg-bt-12">
					<h1 class="heading text-center">Activity 2</h1>
				</div>
				<div class="breadcrumbs style2">
					<ul>
						<li><a href="index-2.html">Home</a></li>
						<li><a href="#">Activity</a></li>
						<li>Activity 2</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</section>

<section class="tf-activity tf-section">
	<div class="themesflat-container">
		<div class="row">
			<div class="col-xl-8 col-lg-9 col-md-8 col-12">
				<div class="box-activity">
					<c:if test="${not empty carts }">
						<c:forEach items="${carts }" var="cart">
							<!-- item -->
							<div id="card-${cart.cartId.product.id }"
								class="sc-card-activity style-2"
								style="<c:if test='${cart.isSelected }'>background-color: #393966;</c:if>">
								<div class="content">
									<div class="checkbox" style="align-content: center;">
										<input type="hidden" name="user_id"
											value="${cart.cartId.user.id }" />
										<div>
											<c:choose>
												<c:when test="${cart.isSelected }">

													<input id="select-${cart.cartId.product.id }"
														type="checkbox" value="1"
														onchange="updateCart(${cart.cartId.user.id },${cart.cartId.product.id })"
														checked>
												</c:when>
												<c:otherwise>
													<input id="select-${cart.cartId.product.id }"
														type="checkbox" value="1"
														onchange="updateCart(${cart.cartId.user.id },${cart.cartId.product.id })">
												</c:otherwise>
											</c:choose>
										</div>
										
										
									</div>
									
									<div class="media">
										<img
											src="<c:url value='${cart.cartId.product.productImages.get(o).product_img_name }'/>"
											alt="">
										
									</div>
									
									<div class="infor">
										<h4>
											<a href="item-details.html">${cart.cartId.product.name }</a>
										</h4>
										<div class="status">
											Brand: <span class="author">${cart.cartId.product.brand.name }</span>
										</div>
										<div class="status">
											Price:
											<c:choose>
												<c:when test="${not empty cart.cartId.product.priceSale }">
													<span class="author" id="price-${cart.cartId.product.id }"><del>
															<fmt:formatNumber type="number" maxFractionDigits="0"
																value="${cart.cartId.product.price*cart.value }" />
															VND
														</del>
														-${Math.round((cart.cartId.product.price/cart.cartId.product.priceSale - 1)*100)}
														%</span>
													<span id="sale-${cart.cartId.product.id }"> <fmt:formatNumber
															type="number" maxFractionDigits="0"
															value="${cart.cartId.product.priceSale*cart.value }" />
														VND
													</span>
												</c:when>
												<c:otherwise>
													<span class="author" id="price-${cart.cartId.product.id }"></span>
													<span id="sale-${cart.cartId.product.id }">${cart.cartId.product.price*cart.value }
														VND</span>
												</c:otherwise>
											</c:choose>
										</div>

										<div class="time">
											Qty: <input type="number" id="val-${cart.cartId.product.id }"
												onchange="updateCart(${cart.cartId.user.id },${cart.cartId.product.id })"
												style="height: 3rem; width: 15rem;" value="${cart.value}">
										</div>
										
										<div class="delete-button" onclick="deleteCart(${cart.cartId.user.id },${cart.cartId.product.id })"
											style="background-color: red; padding: 1rem; border-radius: 1rem;align-content: center; margin-top: 1rem;font-size:  2rem; min-width: 3rem">
											<i style="font-size: 2rem;" class="fas fa-trash"> </i> Delete
										</div>
									</div>
								</div>

							</div>
							<!-- item -->
						</c:forEach>
					</c:if>


				</div>
				<!--/.box-activity-->
			</div>
			<div class="col-xl-4 col-lg-3 col-md-4 col-12">

				<div id="side-bar" class="side-bar style-2">

					<div class="details ">
						<div class="widget widget-recent-post mg-bt-43">

							<ul>
								<li class="box-recent-post">
									<div class="box-content">
										<h3>
											<a class="th-title">Price: </a><a id="price" class="th-title"
												style="color: #DF4949;"></a>
										</h3>
									</div>
								</li>
								<li class="box-recent-post">
									<div class="box-content">
										<h3>
											<a class="th-title">Tax: </a><a id="tax" class="th-title">
												0</a>
										</h3>
									</div>
								</li>
								<li class="box-recent-post" style="float: right;">
									<div class="box-content">
										<h3>
											<a class="th-title">Delivery: </a><a id="delivery"
												class="th-title"></a>
										</h3>
									</div>
								</li>
								<li class="box-recent-post">
									<div class="box-content">
										<h3>
											<a class="th-title">Total: </a><a id="total" class="th-title"
												name="total_price" id="total_price" style="color: #47A432;"></a>
										</h3>
									</div>
								</li>

							</ul>
						</div>
						<div class="col-md-12 wrap-inner load-more text-center mg-t16">
							<a class="sc-button fl-button pri-3"><span>Create
									Order</span></a>
						</div>
					</div>

				</div>
				<!--/.side-bar-->

			</div>
		</div>
	</div>
</section>