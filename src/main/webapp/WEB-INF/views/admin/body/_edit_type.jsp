<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">Update type</h4>
					</div>
					<div class="card-body">
						<div class="form-validation">
							<form class="form-valide"
								action="<c:url value='update-type?id=${edit_type.id }'/>"
								method="post">
								<div class="row">
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_name_type"><b>Name</b>
												<span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_name_type"
													name="val_name_type" placeholder="Enter a name type.."
													value="${edit_type.type_name}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_slug_type"><b>Slug</b>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_slug_type"
													name="val_slug_type" placeholder="Your valid Slug.."
													value="${edit_type.type_slug}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_image_url"><b>Image
													URL</b> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_image_url"
													name="val_image_url" placeholder="Choose a beautifull one.."
													value="${edit_type.type_image_url}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_parent_type"><b>Parent</b>
											</label>
											<div class="col-lg-6">
												<select class="form-control default-select"
													id="val_parent_type" name="val_parent_type">
													<option value="NULL"><b>Please select</b></option>
													<c:forEach items="${parents }" var="parent">
														<c:if test="${parent.id == edit_type.parent.id }">
															<option value="${parent.id}" selected>${parent.type_name }</option>
														</c:if>
														<c:if test="${parent.id != edit_type.parent.id }">
															<option value="${parent.id}" >${parent.type_name }</option>
														</c:if>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_meta_key"><b>Meta
													Keywords</b> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_meta_key"
													name="val_meta_key" placeholder="Choose a beautifull one.."
													value="${edit_type.type_meta_key}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_meta_desc"><b>Meta
													Description</b> </label>
											<div class="col-lg-6">
												<textarea class="form-control" id="val_meta_desc"
													name="val_meta_desc" placeholder="Make type description.."
													style="min-height: 10rem;">${edit_type.type_meta_desc}</textarea>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_create_at"><b>Created
													at</b> <span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_create_at"
													name="val_create_at" placeholder="Unknow.."
													value="${edit_type.create_at}" disabled>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_creator"><b>Creator</b>
												<span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_creator"
													name="val_creator" placeholder="212-999-0000"
													value="${edit_type.create_by.user_name}" disabled>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_status_type"><b>Status</b>
											</label>
											<div class="col-lg-6">
												<input type="checkbox" class="css-control-input mr-2"
													id="val_status_type" name="val_status_type" value="1"
													<c:if test="${edit_type.status == 1}">checked</c:if>>
												<label><span class="css-control-indicator"></span>
													Available</label>
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