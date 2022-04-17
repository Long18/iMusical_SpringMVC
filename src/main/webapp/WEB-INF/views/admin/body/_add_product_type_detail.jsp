<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">

		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">Add Product Detail</h4>
					</div>
					<div class="card-body">
						<div class="form-validation">
							<form class="form-valide"
								action="save-product-type-detail?productId=${product_id }"
								method="post" >
								<div class="row">
									<div class="col-xl-6">
										<div class="form-group row">
											<label  class="col-lg-4 col-form-label"
												for="val_type_type_detail"><b>Type</b> <span
												class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<select  class="form-control" id="val_type_type_detail"
													name="val_type_type_detail">
													<option value="">Select type</option>
													<c:if test="${not empty types }">
														<c:forEach items="${types }" var="type">
															<option value="${type.id }">${type.type_name }</option>
														</c:forEach>
													</c:if>
												</select>
											</div>
										</div>
									</div>
									<div class="col-xl-6">
										<div class="form-group row">
											<label  class="col-lg-4 col-form-label"
												for="val_value_type_detail"><b>value</b> <span
												class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input  type="text" class="form-control"
													id="val_value_type_detail" name="val_value_type_detail"/>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-8 ml-auto">
												<button type="submit" class="btn btn-primary"
													style="padding: 1rem 2rem; font-size: 2rem;">
													<b>Submit</b>
												</button>
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