<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<div class="content-body">
    <div class="container-fluid">

        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-header">
                        <h4 class="card-title">Add slider</h4>
                    </div>
                    <div class="card-body">
                        <div class="form-validation">
                            <form class="form-valide" action="<c:url value='/admin/slider/save-slider'/>" method="post">
                                <div class="row">
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_name_slider"><b>Name</b>
                                                <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="val_name_slider" name="val_name_slider" placeholder="Enter a name slider.." >
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_url_slider"><b>URL</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="val_url_slider" name="val_url_slider" placeholder="Your valid URL.." >
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_image_url"><b>Image URL</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="password" class="form-control" id="val_image_url" name="val_image_url" placeholder="Choose a beautifull one..">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xl-6">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_position_slider"><b>Position</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="password" class="form-control" id="val_position_slider" name="val_position_slider" placeholder="Choose a position.." >
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" for="val_status_slider"><b>Status</b>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="checkbox" class="css-control-input mr-2" id="val_status_slider" name="val_status_slider" val="1" >
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