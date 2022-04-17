<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title">Types</h4>
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table id="example3" class="display min-w850">
							<thead>
								<tr>
									<th></th>
									<th>Name</th>
									<th>Detail</th>
									<th>Key</th>
									<th>Parent</th>
									<th>Create Date</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${not empty types }">
									<c:forEach items="${types }" var="type">
										<tr>
											<td><img class="rounded-circle" width="35"
												src="<c:url value='/resources/template/BE/images/profile/small/pic1.jpg'/>"
												alt=""></td>
											<td>${type.type_name }</td>
											<td>${type.type_meta_desc }</td>
											<td><strong> ${type.type_meta_key }</strong></td>
											<td><strong> ${type.parent.type_name}</strong></td>
											<td>${type.create_at }</td>
											<td>
												<div class="d-flex">

													<a href="<c:url value='edit-type?id=${type.id }'/>"
														class="btn btn-primary shadow btn-xs sharp mr-1"><i
														class="fa fa-pencil"></i></a> <a
														onclick="return confirm('Are you sure to delete?')"
														href="<c:url value='delete-type?id=${type.id }'/>"
														class="btn btn-danger shadow btn-xs sharp"><i
														class="fa fa-trash"></i> </a>

												</div>
											</td>
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