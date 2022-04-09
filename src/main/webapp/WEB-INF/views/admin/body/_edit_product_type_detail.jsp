<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="content-body">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">Update Product Type Detail</h4>
					</div>
					<div class="card-body">
						<div class="form-validation">
							<form class="form-valide"
								action="<c:url value='update-product-type-detail?productId=${product_id }&typeDetailId=${edit_type_detail.id }'/>" method="post">
								<div class="row">
								<%request.setAttribute("test", "testtes"); %>
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_type">Type<span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<div class="col-lg-6">
												<input class="form-control"
													id="val_type" name="val_type"
													value="${edit_type_detail.type.type_name}">
											</div>
											</div>
										</div>
									</div>
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label"
												for="val_type_detail_value">Value <span
												class="text-danger">*</span>
											</label>
											<div class="col-lg-6">
												<input class="form-control"
													id="val_type_detail_value" name="val_type_detail_value"
													value="${edit_type_detail.type_detail_value}">
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
		</div>
	</div>
</div>