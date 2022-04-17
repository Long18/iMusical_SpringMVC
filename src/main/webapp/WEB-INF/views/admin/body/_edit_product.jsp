<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">

		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">Update Product</h4>
					</div>
					<div class="card-body">
						<div class="form-validation">
							<form class="form-valide"
								action="<c:url value='update-product?id=${edit_product.id }'/>" method="post">
								<div class="row">
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_name_product">Product
												Name <span class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control"
													id="val_name_product" name="val_name_product"
													placeholder="Enter a name product.."
													value="${edit_product.name}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_brand_product">Brand <span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<select class="form-control default-select"
													id="val_brand_product" name="val_brand_product">
													<c:forEach items="${brands }" var="brand">
														<c:if test="${brand.id == edit_product.brand.id }">
															<option value="${brand.id}" selected>${brand.name }</option>
														</c:if>
														<c:if test="${brand.id != edit_product.brand.id }">
															<option value="${brand.id}">${brand.name }</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_price_product">Price <span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control"
													id="val_price_product" name="val_price_product"
													placeholder="Choose a good one.."
													value="${edit_product.price}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_price_sale">Sale
												Price <span class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_price_sale"
													name="val_price_sale" placeholder="Choose a good one.."
													value="${edit_product.priceSale}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_end_sale">End
												Sale <span class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="datetime-local" class="form-control"
													id="val_end_sale" name="val_end_sale"
													placeholder="..and confirm it!"
													value="${edit_product.endSale}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_detail_product">Detail <span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<textarea class="form-control" id="val_detail_product"
													name="val_detail_product" rows="5"
													placeholder="What would you like to see?">${edit_product.detail}</textarea>
											</div>
										</div>
									</div>
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_category_product">Category <span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control"
													id="val_category_product" name="val_category_product"
													placeholder="..and confirm it!"
													value="${edit_product.category.type_name}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_created_at">Created
												At <span class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_created_at"
													name="val_created_at" value="${edit_product.created_at}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_created_by">Created
												By <span class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_created_by"
													name="val_created_by"
													value="${edit_product.created_by.user_name}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_amount_product">Product Amount <span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input type="number" class="form-control"
													id="val_amount_product" name="val_amount_product"
													placeholder="" min="0" value="${edit_product.amount}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"><a
												href="javascript:void()"> Status </a> <span
												class="text-danger">*</span> </label>
											<div class="col-lg-8">
												<label class="css-control css-control-primary css-checkbox"
													for="val_status_product"> <input type="checkbox"
													class="css-control-input mr-2" id="val_status_product"
													name="val_status_product" value="1"
													<c:if test="${edit_product.status == 1}">checked</c:if>>
													<span class="css-control-indicator"></span> Available
												</label>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-8 ml-auto">
												<button type="submit" class="btn btn-primary">Submit</button>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="col-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">
							Product type detail | <a
								href="<c:url value='add-product-type-detail?productId=${edit_product.id }'/>"
								class="bg-success text-light "
								style="padding: 0.2rem 0.8rem; border-radius: 0.4rem;">Add
								Type Detail</a>
						</h4>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table id="example3" class="display min-w850">
								<thead>
									<tr>
										<th>ID</th>
										<th>Type</th>
										<th>Value</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${not empty edit_product.typeDetails}">
										<c:forEach items="${edit_product.typeDetails }" var="type_detail">
											<tr>
												<td>${type_detail.id}</td>
												<td>${type_detail.type.type_name}</td>
												<td>${type_detail.type_detail_value}</td>
												<td><a
													href="<c:url value='edit-product-type-detail?productId=${edit_product.id }&typeDetailId=${type_detail.id }'/>"
													class="btn btn-primary btn-sm">Edit</a> <a
													href="<c:url value='delete-product-type-detail?productId=${edit_product.id }&typeDetailId=${type_detail.id }'/>"
													class="btn btn-danger btn-sm">Delete</a></td>
											</tr>
										</c:forEach>
									</c:if>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</div>