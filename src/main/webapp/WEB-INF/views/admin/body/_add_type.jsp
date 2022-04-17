<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">

		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">Add type</h4>
					</div>
					<div class="card-body">
						<div class="form-validation">
							<form class="form-valide"
								action="<c:url value='save-type'/>" method="post">
								<div class="row">
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_name_type"><b>Name</b>
												<span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_name_type"
													name="val_name_type" placeholder="Enter a name type..">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_slug_type"><b>Slug</b>
											</label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_slug_type"
													name="val_slug_type" placeholder="Your valid Slug..">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="al_image_url"><b>Image
													URL</b> </label>
											<div class="col-lg-6">
												<input type="password" class="form-control"
													id="al_image_url" name="al_image_url"
													placeholder="Choose a beautifull one..">
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
														<option value="${parent.id}">${parent.type_name }</option>
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
												<input type="password" class="form-control"
													id="val_meta_key" name="val_meta_key"
													placeholder="Choose a beautifull one..">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_meta_desc"><b>Meta
													Description</b> </label>
											<div class="col-lg-6">
												<textarea class="form-control" id="val_meta_desc"
													name="val_meta_desc" placeholder="Make type description.."
													style="min-height: 10rem;"></textarea>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_status_type"><b>Status</b>
											</label>
											<div class="col-lg-6">
												<input type="checkbox" class="css-control-input mr-2"
													id="val_status_type" name="val_status_type"> <span
													class="css-control-indicator"></span> Avaiable</label>
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