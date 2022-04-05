<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="content-body">
    <div class="container-fluid">

        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="card-title">Update slider</h4>
                    </div>
                    <div class="card-body">
                        <div class="form-validation">
                            <form class="form-valide" action="<c:url value ='/admin/slider/update-slider?id=${edit_slider.id }'/>" method="post">
                                <div class="row">
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_name_slider"><b>Name</b>
                                                <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="val_name_slider" name="val_name_slider" placeholder="Enter a name slider.." value="${edit_slider.slider_name}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_url_slider"><b>URL</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="val_url_slider" name="val_url_slider" placeholder="Your valid URL.." value="${edit_slider.slider_url}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_position_slider"><b>Posittion</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="password" class="form-control" id="val_position_slider" name="val_position_slider" placeholder="Choose a position.." value="${edit_slider.slider_position}">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_image_url"><b>Image URL</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="password" class="form-control" id="val_image_url" name="val_image_url" placeholder="Choose a beautifull one.." value="${edit_slider.slider_img_url}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_created_at"><b>Created at</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text"  class="form-control" id="val_created_at" name="val_created_at" placeholder="Choose a date.." value="${edit_slider.created_at}" disabled>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_creator"><b>Creator</b>
                                                <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="val_creator" name="val_creator" placeholder="212-999-0000" value="${creator.user_name}" disabled>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_status_slider"><b>Status</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="checkbox" class="css-control-input mr-2" id="val_status_slider" name="val_status_slider" value="1" <c:if test="${edit_slider.status == 1}">checked</c:if>>
                                                <span class="css-control-indicator"></span> Avaiable</label>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-lg-8 ml-auto">
                                                <button type="submit" class="btn btn-primary" style="padding: 1rem 2rem;font-size: 2rem ;"><b>Submit</b></button>
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