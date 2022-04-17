<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title">Users</h4>
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table id="example3" class="display min-w850">
							<thead>
								<tr>
									<th></th>
									<th>ID</th>
									<th>Name</th>
									<th>Email</th>
									<th>Status</th>
									<th>Create Date</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:if test="${not empty users}">
									<c:forEach items="${users}" var="user">
										<tr>
											<td><img class="rounded-circle" width="35"
												src="<c:url value='/resources/template/BE/images/profile/small/pic1.jpg'/>"
												alt=""></td>
											<td>${user.id}</td>
											<td>${user.user_name }</td>
											<td>${user.user_email }</td>
											<td><c:if test="${user.status == 1 }">
													<span class='badge light badge-success badge-sm'>Avaiable</span>
												</c:if> <c:if test="${user.status == 0 }">
													<span class='badge light badge-danger badge-sm'>Unavaiable</span>
												</c:if></td>
											<td>${user.created_at }</td>
											<td>
												<div class="d-flex">
													<a href="<c:url value='edit-user?id=${user.id }'/>"
														class="btn btn-primary shadow btn-xs sharp mr-1"><i
														class="fa fa-pencil"></i></a><a
														onclick="return confirm('Are you sure to delete?')"
														href="<c:url value='delete-user?id=${user.id }'/>"
														class="btn btn-danger shadow btn-xs sharp"><i
														class="fa fa-trash"></i></a>
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