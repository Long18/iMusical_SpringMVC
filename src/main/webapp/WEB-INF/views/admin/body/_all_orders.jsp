<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
	<div class="container-fluid">
		<div class="col-12">
			<div class="card">
				<div class="card-header">
					<h4 class="card-title">Orders</h4>
				</div>
				<div class="card-body">
					<div class="table-responsive">
						<table id="example3" class="display min-w850">
							<thead>
								<tr>
									<th>ID</th>
									<th>User</th>
									<th>Created At</th>
									<th>Total Sum</th>
									<th>Status</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
                                <c:if test="${not empty orders }">
                                	<c:forEach items="${orders }" var="order">
                                		<tr>
									<td>${order.id }</td>
									<td>${order.user.user_name }</td>
									<td>${order.created_at }</td>
									<td>${order.total_sum }</td>
									<td><c:choose>
											<c:when test="${order.status == 1 }">
												<span class='badge badge-success light  badge-sm'>Waiting Confirm</span>
											</c:when>
											
											<c:when test="${order.status == 21 }">
												<span class='badge badge-success light  badge-sm'>Packing</span>
											</c:when>
											
											<c:when test="${order.status == 3 }">
												<span class='badge badge-success light  badge-sm'>Delivering</span>
											</c:when>
											
											<c:when test="${order.status == 4 }">
												<span class='badge badge-success light  badge-sm'>Delivering</span>
											</c:when>
											
											<c:when test="${order.status == -1 }">
												<span class='badge badge-success light  badge-sm'>Cancel</span>
											</c:when>

											<c:when test="${order.status == 0 }">
												<span class='badge badge-danger light  badge-sm'>Unavailable</span>
											</c:when>
										</c:choose></td>
									<td>
										<div class="d-flex">
											<a href="<c:url value='edit-order?id=${order.id }'/>"
												class="btn btn-primary shadow btn-xs sharp mr-1"><i
												class="fa fa-pencil"></i></a>
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