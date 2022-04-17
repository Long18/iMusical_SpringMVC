<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
    <div class="container-fluid">
        <div class="col-12">
            <div class="card">
                <div class="card-header">
                    <h4 class="card-title">Products</h4>
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <table id="example3" class="display min-w850">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>Brand</th>
                                    <th>Price</th>
                                    <th>Sale Price</th>
                                    <th>Amount</th>
                                    <th>Create Date</th>
                                    <th>Status</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:if test="${not empty products }">
                                	<c:forEach items="${products }" var="product">
                                		<tr>
                                            <td><img class="rounded-circle" width="35" src='<c:if test="${product.productImages.size() > 0 }"><c:url value='/${product.productImages.get(0).product_img_name }'/></c:if>' alt="">
                                            </td>
                                            <td>${product.name }</td>
                                            <td>${product.brand.name }</td>
                                            <td>${product.price }</td>
                                            <td>${product.priceSale }</td>
                                            <td>${product.amount }</td>
                                            <td>${product.created_at }</td>
                                            <td>
                                            	<c:choose>
                                            		<c:when test="${product.amount < 1 }">
                                            		<span class='badge badge-warning light  badge-sm'>Out of stock</span>
                                            		</c:when>
                                            			
                                            		<c:when test="${product.status == 1 }">
                                            		<span class='badge badge-success light  badge-sm'>Available</span>
                                            		</c:when>
                                            		
                                            		<c:when test="${product.status == 0 }">
                                            		<span class='badge badge-danger light  badge-sm'>Unavailable</span>
                                            		</c:when>
                                            	</c:choose>
                                            </td>
                                            <td>
                                                <div class="d-flex">
                                                    <a href="<c:url value='edit-product?id=${product.id }'/>" class="btn btn-primary shadow btn-xs sharp mr-1"><i class="fa fa-pencil"></i></a>
                                                    <a onclick="return confirm('Are you sure to delete?')" href="<c:url value='delete-product?id=${product.id }'/>" class="btn btn-danger shadow btn-xs sharp"><i class="fa fa-trash"></i></a>
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