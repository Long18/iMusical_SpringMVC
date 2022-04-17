<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title">Sliders</h4>
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table id="example3" class="display min-w850">
							<thead>
								<tr>
									<th></th>
									<th>ID</th>
									<th>Name</th>
									<th>URL</th>
									<th>position</th>
									<th>Image URL</th>
									<th>Created at</th>
									<th>Created by</th>
									<th>Status</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${sliders}" var="slider">
									<tr>
										<td><img class="rounded-circle" width="35"
											src="<c:url value='/resources/template/BE/images/profile/small/pic1.jpg'/>"
											alt=""></td>
										<td>${slider.id }</td>
										<td>${slider.slider_name }</td>
										<td>${slider.slider_url }</td>
										<td>${slider.slider_position }</td>
										<td>${slider.slider_img_url }</td>
										<td>${slider.created_at }</td>
										<td>${slider.created_by.user_name }</td>
										<td>
										<c:if test="${slider.status == 1 }">
											<span class='badge light badge-success badge-sm'>Avaiable</span>
										</c:if>
										<c:if test="${slider.status == 0 }">
											<span class='badge light badge-danger badge-sm'>Unavaiable</span>
										</c:if>
										</td>
										<td>
											<div class="d-flex">
												<a
													href="<c:url value='edit-slider?id=${slider.id}'/>"
													class="btn btn-primary shadow btn-xs sharp mr-1"><i
													class="fa fa-pencil"></i></a> <a
													onclick="return confirm('Are you sure to delete?')"
													href="<c:url value='delete-slider?id=${slider.id}'/>"
													class="btn btn-danger shadow btn-xs sharp"><i
													class="fa fa-trash"></i></a>
											</div>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>