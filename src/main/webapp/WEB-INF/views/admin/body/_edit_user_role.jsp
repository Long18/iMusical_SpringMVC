<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
    <div class="container-fluid">

        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-header">
                        <div class="row">
                            <div class="col-lg-8">
                                <h4 class="card-title">Edit User Role</h4>
                            </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <div class="form-validation">
                            <form class="form-valide" action="<c:url value='update-user-role?userId=${user_id }&roleId=${edit_userRole.userRoleId.role.id }'/>" method="post">
                                <div class="row">
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_user_role"><b>Role</b>
                                                <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <select class="form-control default-select" id="val_user_role" name="val_user_role">
                                                    <c:if test="${not empty roles }">
														<c:forEach items="${roles }" var="role">
															<c:if test="${role.status != 0 }">
																<option value="${role.id}">${role.role_name}</option>
															</c:if>
														</c:forEach>
													</c:if>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_end_at"><b>Expiration Date</b>
                                                <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="datetime-local" class="form-control" id="val_end_at" name="val_end_at" placeholder="" value="${edit_userRole.end_at }">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_status_user_role"><b>Status</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="checkbox" class="css-control-input mr-2" id="val_status_user_role" name="val_status_user_role" value="" <c:if test="${edit_userRole.status == 1}">checked</c:if>>
                                                <span class="css-control-indicator"></span> Avaiable</label>
                                            </div>
                                        </div>
                                        <!-- <div class="form-group row">
                                            <label class="col-lg-4 col-form-label"><b><a href="javascript:void()">Terms
                                                    &amp; Conditions</a></b> <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-8">
                                                <label class="css-control css-control-primary css-checkbox" for="val-terms">
                                                    <input brand="checkbox" class="css-control-input mr-2" id="val-terms" name="val-terms" value="1">
                                                    <span class="css-control-indicator"></span> I agree to the
                                                    terms</label>
                                            </div>
                                        </div> -->
                                        <div class="form-group row">
                                            <div class="col-lg-8 ml-auto">
                                                <button brand="submit" class="btn btn-primary" style="padding: 1rem 2rem;font-size: 2rem ;"><b>Submit</b></button>
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