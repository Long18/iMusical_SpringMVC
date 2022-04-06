<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="content-body">
	<div class="container-fluid">

		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-header ">
						<h4 class="card-title">Update user</h4>
					</div>
					<div class="card-body">
						<div class="form-validation">
							<form class="form-valide"
								action="<c:url value ='update-user?id=${edit_user.id }'/>"
								method="post">
								<div class="row">
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_name_user"><b>Name</b>
												<span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_name_user"
													name="val_name_user" placeholder="Enter a name user.."
													value="${edit_user.user_name}">
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_email_user"><b>Email</b>
												<span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_email_user"
													name="val_email_user" placeholder="Your valid Slug.."
													value="${edit_user.user_email}" disabled>
											</div>
										</div>
									</div>
									<div class="col-xl-6">
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_create_at"><b>Created
													at</b> <span class="text-danger">*</span> </label>
											<div class="col-lg-6">
												<input type="text" class="form-control" id="val_create_at"
													name="val_create_at" placeholder="Unknow.."
													value="${edit_user.created_at}" disabled>
											</div>
										</div>
										<div class="form-group row">
											<label class="col-lg-4 col-form-label" for="val_status_user"><b>Status</b>
											</label>
											<div class="col-lg-6">
												<input type="checkbox" class="css-control-input mr-2"
													id="val_status_user" name="val_status_user" value="1"
													<c:if test="${edit_user.status == 1}">checked</c:if>>
												<span class="css-control-indicator"></span> Avaiable</label>
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
			<div class="col-12">
				<div class="card">
					<div class="card-header">
						<h4 class="card-title">
							User Roles | <a
								href="<c:url value ='add-user-role?id=${edit_user.id }'/>"
								class="bg-success text-light "
								style="padding: 0.2rem 0.8rem; border-radius: 0.4rem;">Add
								Role</a>
						</h4>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table id="example3" class="display min-w850">
								<thead>
									<tr>
										<th>ID</th>
										<th>Role Name</th>
										<th>Status</th>
										<th>Create Date</th>
										<th>End Date</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:if test="${not empty edit_user.userRoles}">
										<c:forEach items="${edit_user.userRoles}" var="user_role">
											<tr>

												<td><b>${user_role.userRoleId.role.id}</b></td>
												<td>${user_role.userRoleId.role.role_name}</td>
												<td><c:if test="${user_role.status == 1 }">
														<span class='badge light badge-success badge-sm'>Avaiable</span>
													</c:if> <c:if test="${user_role.status == 0 }">
														<span class='badge light badge-danger badge-sm'>Unavaiable</span>
													</c:if>
													
													 <c:if
														test='<% 
														SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm a"); 
														Date now = new Date();
														
														if(sdf.parse(request.getParameter("user_role.end_at")).after(now)){
															pageContext.setAttribute("isExperied",true);
														}
													%>${isExperied }'>
														<span class='badge light badge-warning badge-sm'>Expired</span>
													</c:if></td>
												<td>${user_role.created_at}</td>
												<td>${user_role.end_at}</td>
												<td>
													<div class="d-flex form-group">
														<a id="button-edit"
															href="<c:url value ='edit-user-role?userId=${edit_user.id}&roleId=${user_role.userRoleId.role.id}'/>"
															class="btn btn-primary shadow btn-xs sharp mr-1"><i
															class="fa fa-pencil"></i></a> <a
															onclick="return confirm('Are you sure to delete?')"
															href="<c:url value ='delete-user-role?userId=${edit_user.id}&roleId=${user_role.userRoleId.role.id}'/>"
															class="btn btn-danger shadow btn-xs sharp mr-1"><i
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
</div>