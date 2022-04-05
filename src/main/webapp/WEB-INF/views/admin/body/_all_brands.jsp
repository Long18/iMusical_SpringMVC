<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="content-body">
	<div class="container-fluid">
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title">Brands</h4>
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table id="example3" class="display min-w850">
							<thead>
								<tr>
									<th>Name</th>
									<th>Create Date</th>
									<th>Status</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${brands}" var="brand">
									<tr>
										<td>${brand.name }</td>
										<td>${brand.createdAt }</td>
										<td>
										<c:if test="${brand.status == 1 }">
											<span class='badge light badge-success badge-sm'>Avaiable</span>
										</c:if>
										<c:if test="${brand.status == 0 }">
											<span class='badge light badge-danger badge-sm'>Unavaiable</span>
										</c:if>
										</td>
										<td>
											<div class="d-flex">
												<a
													href="<c:url value='edit-brand?id=${brand.id}'/>"
													class="btn btn-primary shadow btn-xs sharp mr-1"><i
													class="fa fa-pencil"></i></a> <a
													onclick="return confirm('Are you sure to delete?')"
													href="<c:url value='delete-brand?id=${brand.id}'/>"
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