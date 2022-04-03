<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="nav-header">
	<a href="<c:url value='/admin/dashboard'/>" class="brand-logo">
	<img class="logo-abbr" src="<c:url value='/resources/template/BE/images/logo.png'/>" alt="">
	<img class="logo-compact" src="<c:url value='/resources/template/BE/images/logo-text.png'/>" alt="">
	<img class="brand-title" src="<c:url value='/resources/template/BE/images/logo-text.png'/>" alt="">
	</a>
	<div class="nav-control">
		<div class="hamburger">
			<span class="line"></span><span class="line"></span><span
				class="line"></span>
		</div>
	</div>
</div>

<div class="chatbox">
	<div class="chatbox-close"></div>
	<div class="custom-tab-1">
		<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#notes">Notes</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#alerts">Alerts</a></li>
			<li class="nav-item"><a class="nav-link active"
				data-toggle="tab" href="#chat">Chat</a></li>
		</ul>
		<div class="tab-content">
			<div class="tab-pane fade active show" id="chat" role="tabpanel">
				<div class="card mb-sm-3 mb-md-0 contacts_card dlab-chat-user-box">
					<div class="card-header chat-list-header text-center">
						<a href="javascript:void(0)"><svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <rect fill="#000000" x="4"
									y="11" width="16" height="2" rx="1" />
                                            <rect fill="#000000"
									opacity="0.3"
									transform="translate(12.000000, 12.000000) rotate(-270.000000) translate(-12.000000, -12.000000) "
									x="4" y="11" width="16" height="2" rx="1" />
                                        </g>
                                    </svg></a>
						<div>
							<h6 class="mb-1">Chat List</h6>
							<p class="mb-0">Show All</p>
						</div>
						<a href="javascript:void(0)"><svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <rect x="0" y="0" width="24"
									height="24" />
                                            <circle fill="#000000"
									cx="5" cy="12" r="2" />
                                            <circle fill="#000000"
									cx="12" cy="12" r="2" />
                                            <circle fill="#000000"
									cx="19" cy="12" r="2" />
                                        </g>
                                    </svg></a>
					</div>
					<div class="card-body contacts_body p-0 dlab-scroll  "
						id="dlab_W_Contacts_Body">
						<ul class="contacts">
							<li class="name-first-letter">A</li>
							<li class="active dlab-chat-user">
								<div class="d-flex bd-highlight">
									<div class="img_cont">
										<img src="<c:url value='/resources/template/BE/images/avatar/1.jpg'/>" class="rounded-circle user_img" alt="" /> <span
											class="online_icon"></span>
									</div>
									<div class="user_info">
										<span>Archie Parker</span>
										<p>Kalid is online</p>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="card chat dlab-chat-history-box d-none">
					<div class="card-header chat-list-header text-center">
						<a href="javascript:void(0)" class="dlab-chat-history-back"> <svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <polygon
									points="0 0 24 0 24 24 0 24" />
                                            <rect fill="#000000"
									opacity="0.3"
									transform="translate(15.000000, 12.000000) scale(-1, 1) rotate(-90.000000) translate(-15.000000, -12.000000) "
									x="14" y="7" width="2" height="10" rx="1" />
                                            <path
									d="M3.7071045,15.7071045 C3.3165802,16.0976288 2.68341522,16.0976288 2.29289093,15.7071045 C1.90236664,15.3165802 1.90236664,14.6834152 2.29289093,14.2928909 L8.29289093,8.29289093 C8.67146987,7.914312 9.28105631,7.90106637 9.67572234,8.26284357 L15.6757223,13.7628436 C16.0828413,14.136036 16.1103443,14.7686034 15.7371519,15.1757223 C15.3639594,15.5828413 14.7313921,15.6103443 14.3242731,15.2371519 L9.03007346,10.3841355 L3.7071045,15.7071045 Z"
									fill="#000000" fill-rule="nonzero"
									transform="translate(9.000001, 11.999997) scale(-1, -1) rotate(90.000000) translate(-9.000001, -11.999997) " />
                                        </g>
                                    </svg>
						</a>
						<div>
							<h6 class="mb-1">Chat with Khelesh</h6>
							<p class="mb-0 text-success">Online</p>
						</div>
						<div class="dropdown">
							<a href="javascript:void(0)" data-toggle="dropdown"><svg
									xmlns="http://www.w3.org/2000/svg"
									xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
									height="18px" viewBox="0 0 24 24" version="1.1">
                                            <g stroke="none"
										stroke-width="1" fill="none" fill-rule="evenodd">
                                                <rect x="0" y="0"
										width="24" height="24" />
                                                <circle fill="#000000"
										cx="5" cy="12" r="2" />
                                                <circle fill="#000000"
										cx="12" cy="12" r="2" />
                                                <circle fill="#000000"
										cx="19" cy="12" r="2" />
                                            </g>
                                        </svg></a>
							<ul class="dropdown-menu dropdown-menu-right">
								<li class="dropdown-item"><i
									class="fa fa-user-circle text-primary mr-2"></i> View profile</li>
								<li class="dropdown-item"><i
									class="fa fa-users text-primary mr-2"></i> Add to close friends</li>
								<li class="dropdown-item"><i
									class="fa fa-plus text-primary mr-2"></i> Add to group</li>
								<li class="dropdown-item"><i
									class="fa fa-ban text-primary mr-2"></i> Block</li>
							</ul>
						</div>
					</div>
					<div class="card-body msg_card_body dlab-scroll"
						id="dlab_W_Contacts_Body3">
						<div class="d-flex justify-content-start mb-4">
							<div class="img_cont_msg">
								<img src="<c:url value='/resources/template/BE/images/avatar/1.jpg'/>" class="rounded-circle user_img_msg" />" alt="" />
							</div>
							<div class="msg_cotainer">
								Hi, how are you samim? <span class="msg_time">8:40 AM,
									Today</span>
							</div>
						</div>

					</div>
					<div class="card-footer type_msg">
						<div class="input-group">
							<textarea class="form-control" placeholder="Type your message..."></textarea>
							<div class="input-group-append">
								<button type="button" class="btn btn-primary">
									<i class="fa fa-location-arrow"></i>
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="tab-pane fade" id="alerts" role="tabpanel">
				<div class="card mb-sm-3 mb-md-0 contacts_card">
					<div class="card-header chat-list-header text-center">
						<a href="javascript:void(0)"><svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <rect x="0" y="0" width="24"
									height="24" />
                                            <circle fill="#000000"
									cx="5" cy="12" r="2" />
                                            <circle fill="#000000"
									cx="12" cy="12" r="2" />
                                            <circle fill="#000000"
									cx="19" cy="12" r="2" />
                                        </g>
                                    </svg></a>
						<div>
							<h6 class="mb-1">Notications</h6>
							<p class="mb-0">Show All</p>
						</div>
						<a href="javascript:void(0)"><svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <rect x="0" y="0" width="24"
									height="24" />
                                            <path
									d="M14.2928932,16.7071068 C13.9023689,16.3165825 13.9023689,15.6834175 14.2928932,15.2928932 C14.6834175,14.9023689 15.3165825,14.9023689 15.7071068,15.2928932 L19.7071068,19.2928932 C20.0976311,19.6834175 20.0976311,20.3165825 19.7071068,20.7071068 C19.3165825,21.0976311 18.6834175,21.0976311 18.2928932,20.7071068 L14.2928932,16.7071068 Z"
									fill="#000000" fill-rule="nonzero" opacity="0.3" />
                                            <path
									d="M11,16 C13.7614237,16 16,13.7614237 16,11 C16,8.23857625 13.7614237,6 11,6 C8.23857625,6 6,8.23857625 6,11 C6,13.7614237 8.23857625,16 11,16 Z M11,18 C7.13400675,18 4,14.8659932 4,11 C4,7.13400675 7.13400675,4 11,4 C14.8659932,4 18,7.13400675 18,11 C18,14.8659932 14.8659932,18 11,18 Z"
									fill="#000000" fill-rule="nonzero" />
                                        </g>
                                    </svg></a>
					</div>
					<div class="card-body contacts_body p-0 dlab-scroll"
						id="dlab_W_Contacts_Body1">
						<ul class="contacts">
							<li class="name-first-letter">SEVER STATUS</li>
							<li class="active">
								<div class="d-flex bd-highlight">
									<div class="img_cont primary">KK</div>
									<div class="user_info">
										<span>David Nester Birthday</span>
										<p class="text-primary">Today</p>
									</div>
								</div>
							</li>
							<li class="name-first-letter">SOCIAL</li>
							<li>
								<div class="d-flex bd-highlight">
									<div class="img_cont success">
										RU<i class="icon fa-birthday-cake"></i>
									</div>
									<div class="user_info">
										<span>Perfection Simplified</span>
										<p>Jame Smith commented on your status</p>
									</div>
								</div>
							</li>
							<li class="name-first-letter">SEVER STATUS</li>
							<li>
								<div class="d-flex bd-highlight">
									<div class="img_cont primary">
										AU<i class="icon fa fa-user-plus"></i>
									</div>
									<div class="user_info">
										<span>AharlieKane</span>
										<p>Sami is online</p>
									</div>
								</div>
							</li>
							<li>
								<div class="d-flex bd-highlight">
									<div class="img_cont info">
										MO<i class="icon fa fa-user-plus"></i>
									</div>
									<div class="user_info">
										<span>Athan Jacoby</span>
										<p>Nargis left 30 mins ago</p>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<div class="card-footer"></div>
				</div>
			</div>
			<div class="tab-pane fade" id="notes">
				<div class="card mb-sm-3 mb-md-0 note_card">
					<div class="card-header chat-list-header text-center">
						<a href="javascript:void(0)"><svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <rect fill="#000000" x="4"
									y="11" width="16" height="2" rx="1" />
                                            <rect fill="#000000"
									opacity="0.3"
									transform="translate(12.000000, 12.000000) rotate(-270.000000) translate(-12.000000, -12.000000) "
									x="4" y="11" width="16" height="2" rx="1" />
                                        </g>
                                    </svg></a>
						<div>
							<h6 class="mb-1">Notes</h6>
							<p class="mb-0">Add New Nots</p>
						</div>
						<a href="javascript:void(0)"><svg
								xmlns="http://www.w3.org/2000/svg"
								xmlns:xlink="http://www.w3.org/1999/xlink" width="18px"
								height="18px" viewBox="0 0 24 24" version="1.1">
                                        <g stroke="none"
									stroke-width="1" fill="none" fill-rule="evenodd">
                                            <rect x="0" y="0" width="24"
									height="24" />
                                            <path
									d="M14.2928932,16.7071068 C13.9023689,16.3165825 13.9023689,15.6834175 14.2928932,15.2928932 C14.6834175,14.9023689 15.3165825,14.9023689 15.7071068,15.2928932 L19.7071068,19.2928932 C20.0976311,19.6834175 20.0976311,20.3165825 19.7071068,20.7071068 C19.3165825,21.0976311 18.6834175,21.0976311 18.2928932,20.7071068 L14.2928932,16.7071068 Z"
									fill="#000000" fill-rule="nonzero" opacity="0.3" />
                                            <path
									d="M11,16 C13.7614237,16 16,13.7614237 16,11 C16,8.23857625 13.7614237,6 11,6 C8.23857625,6 6,8.23857625 6,11 C6,13.7614237 8.23857625,16 11,16 Z M11,18 C7.13400675,18 4,14.8659932 4,11 C4,7.13400675 7.13400675,4 11,4 C14.8659932,4 18,7.13400675 18,11 C18,14.8659932 14.8659932,18 11,18 Z"
									fill="#000000" fill-rule="nonzero" />
                                        </g>
                                    </svg></a>
					</div>
					<div class="card-body contacts_body p-0 dlab-scroll"
						id="dlab_W_Contacts_Body2">
						<ul class="contacts">
							<li class="active">
								<div class="d-flex bd-highlight">
									<div class="user_info">
										<span>New order placed..</span>
										<p>10 Aug 2020</p>
									</div>
									<div class="ml-auto">
										<a href="javascript:void(0)"
											class="btn btn-primary btn-xs sharp mr-1"><i
											class="fa fa-pencil"></i></a> <a href="javascript:void(0)"
											class="btn btn-danger btn-xs sharp"><i
											class="fa fa-trash"></i></a>
									</div>
								</div>
							</li>
							<li>
								<div class="d-flex bd-highlight">
									<div class="user_info">
										<span>Youtube, a video-sharing website..</span>
										<p>10 Aug 2020</p>
									</div>
									<div class="ml-auto">
										<a href="javascript:void(0)"
											class="btn btn-primary btn-xs sharp mr-1"><i
											class="fa fa-pencil"></i></a> <a href="javascript:void(0)"
											class="btn btn-danger btn-xs sharp"><i
											class="fa fa-trash"></i></a>
									</div>
								</div>
							</li>
							<li>
								<div class="d-flex bd-highlight">
									<div class="user_info">
										<span>john just buy your product..</span>
										<p>10 Aug 2020</p>
									</div>
									<div class="ml-auto">
										<a href="javascript:void(0)"
											class="btn btn-primary btn-xs sharp mr-1"><i
											class="fa fa-pencil"></i></a> <a href="javascript:void(0)"
											class="btn btn-danger btn-xs sharp"><i
											class="fa fa-trash"></i></a>
									</div>
								</div>
							</li>
							<li>
								<div class="d-flex bd-highlight">
									<div class="user_info">
										<span>Athan Jacoby</span>
										<p>10 Aug 2020</p>
									</div>
									<div class="ml-auto">
										<a href="javascript:void(0)"
											class="btn btn-primary btn-xs sharp mr-1"><i
											class="fa fa-pencil"></i></a> <a href="javascript:void(0)"
											class="btn btn-danger btn-xs sharp"><i
											class="fa fa-trash"></i></a>
									</div>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="header">
	<div class="header-content">
		<nav class="navbar navbar-expand">
			<div class="collapse navbar-collapse justify-content-between">
				<div class="header-left">
					<div class="dashboard_bar">Dashboard</div>
				</div>
				<ul class="navbar-nav header-right">
					<li class="nav-item dropdown header-profile"><a
						class="nav-link" href="javascript:void(0)" role="button"
						data-toggle="dropdown"> <img src="<c:url value='/resources/template/BE/images/profile/17.jpg'/>" width="20" alt="" />
							<div class="header-info">
								<p class="fs-12 mb-0">admin</p>
							</div>
					</a>
						<div class="dropdown-menu dropdown-menu-right">
							<a href="app-profile.html" class="dropdown-item ai-icon"> <svg
									id="icon-user1" xmlns="http://www.w3.org/2000/svg"
									class="text-primary" width="18" height="18" viewBox="0 0 24 24"
									fill="none" stroke="currentColor" stroke-width="2"
									stroke-linecap="round" stroke-linejoin="round">
                                            <path
										d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path>
                                            <circle cx="12" cy="7" r="4"></circle>
                                        </svg> <span class="ml-2">Profile
							</span>
							</a> <a href="email-inbox.html" class="dropdown-item ai-icon"> <svg
									id="icon-inbox" xmlns="http://www.w3.org/2000/svg"
									class="text-success" width="18" height="18" viewBox="0 0 24 24"
									fill="none" stroke="currentColor" stroke-width="2"
									stroke-linecap="round" stroke-linejoin="round">
                                            <path
										d="M4 4h16c1.1 0 2 .9 2 2v12c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2z">
                                            </path>
                                            <polyline
										points="22,6 12,13 2,6"></polyline>
                                        </svg> <span class="ml-2">Inbox
							</span>
							</a> <a href="<c:url value="admin/logout"/>"
								class="dropdown-item ai-icon"> <svg id="icon-logout"
									xmlns="http://www.w3.org/2000/svg" class="text-danger"
									width="18" height="18" viewBox="0 0 24 24" fill="none"
									stroke="currentColor" stroke-width="2" stroke-linecap="round"
									stroke-linejoin="round">
                                            <path
										d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path>
                                            <polyline
										points="16 17 21 12 16 7"></polyline>
                                            <line x1="21" y1="12" x2="9"
										y2="12"></line>
                                        </svg> <span class="ml-2">Logout
							</span>
							</a>
						</div></li>
				</ul>
			</div>
		</nav>
	</div>
</div>

<div class="dlabnav">
	<div class="dlabnav-scroll">
		<ul class="metismenu" id="menu">
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-networking"></i> <span
					class="nav-text">Menu</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value="/admin/dashboard"/>">Dashboard</a></li>
					<!-- <li><a href="calendar.html">Calendar</a></li>
                            <li><a href="messages.html">Messages</a></li> -->
				</ul></li>
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-layer-1"></i> <span
					class="nav-text">Order Manager</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value="/admin/all-orders"/>">All Order</a></li>
				</ul></li>
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-network"></i> <span
					class="nav-text">Products</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value="/admin/all-products"/>">All
							Products</a></li>
					<li><a href="<c:url value="/admin/add-product"/>">Add
							Product</a></li>
				</ul></li>
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-layer-1"></i> <span
					class="nav-text">Types</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value="/admin/all-types"/>">All Types</a></li>
					<li><a href="<c:url value="/admin/add-type"/>">Add Type</a></li>
				</ul></li>
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-price-tag"></i> <span
					class="nav-text">Brands</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value="/admin/all-brands"/>">All
							Brands</a></li>
					<li><a href="<c:url value="/admin/add-brand"/>">Add Brand</a></li>
				</ul></li>
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-user-4"></i> <span
					class="nav-text">Users Manager</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value='/admin/all-users'/>">All User</a></li>
				</ul></li>
			<li><a class="has-arrow ai-icon" href="javascript:void()"
				aria-expanded="false"> <i class="flaticon-381-menu"></i> <span
					class="nav-text">Sliders</span>
			</a>
				<ul aria-expanded="false">
					<li><a href="<c:url value='/admin/all-sliders'/>">All
							Slider</a></li>
					<li><a href="<c:url value='/admin/add-slider'/>">Add
							Slider</a></li>
				</ul></li>
		</ul>

		<a class="add-menu-sidebar d-block" href="javascript:void(0)"
			data-toggle="modal" data-target="#addOrderModalside">+ New
			Project</a>
		<div class="copyright">
			<p>
				<strong>Admin Dashboard</strong> © 2022 All Rights Reserved
			</p>
			<p>
				Made with <span class="heart"></span> by Isekai Team
			</p>
		</div>
	</div>
</div>