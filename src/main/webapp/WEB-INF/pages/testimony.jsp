<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!doctype html>
<html lang="en">

<head>
<meta charset="utf-8" />
<link rel="apple-touch-icon" sizes="76x76"
	href="${pageContext.request.contextPath}/resources/assets/img/apple-icon.png" />
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>Material Dashboard by Creative Tim</title>
<meta
	content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0'
	name='viewport' />
<meta name="viewport" content="width=device-width" />
<meta name="_csrf" content="${_csrf.token}" />
<!-- default header name is X-CSRF-TOKEN -->
<meta name="_csrf_header" content="${_csrf.headerName}" />
<!-- Bootstrap core CSS     -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<!--  Material Dashboard CSS    -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/material-dashboard.css?v=1.2.0"
	rel="stylesheet" />
<!--  CSS for Demo Purpose, don't include it in your project     -->
<link
	href="${pageContext.request.contextPath}/resources/assets/css/demo.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css"
	rel="stylesheet" />
<!--     Fonts and icons     -->
<link
	href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css"
	rel="stylesheet">
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons'
	rel='stylesheet' type='text/css'>
<style>
input.parsley-error {
	color: #B94A48 !important;
	background-color: #F2DEDE !important;
	border: 1px solid #EED3D7 !important;
}
</style>
</head>
<body>
	<div class="wrapper">
		<div class="sidebar" data-color="purple"
			data-image="${pageContext.request.contextPath}/resources/assets/img/sidebar-1.jpg">
			<!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
			<div class="logo">
				<a href="http://www.creative-tim.com" class="simple-text"> Batch 178 </a>
			</div>
			<div class="sidebar-wrapper">
				<ul class="nav">
					<li><a href="dashboard.html"> <i
							class="material-icons">dashboard</i>
							<p>Dashboard</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/department">
						<i class="material-icons">library_books</i>
						<p>Department</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath}/employee">
							<i class="material-icons">bubble_chart</i>
							<p>Employee</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath}/account">
							<i class="material-icons">person</i>
							<p>User Account</p>
					</a></li>
					<li>
                        <a href="${pageContext.request.contextPath}/user">
                            <i class="material-icons">person</i>
                            <p>User</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/role">
                            <i class="material-icons">person</i>
                            <p>Role</p>
                        </a>
                    </li>
					<li><a href="${pageContext.request.contextPath }/biodata"> 
						<i class="material-icons">person</i>
						<p>Biodata</p>
					</a></li>
					<li>
                        <a href="${pageContext.request.contextPath }/office">
                            <i class="material-icons">work</i>
                            <p>Office</p>
                        </a>
                    </li>
					<li><a href="${pageContext.request.contextPath }/question">
							<i class="material-icons">library_books</i>
							<p>Questions</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/technology">
							<i class="material-icons">developer_mode</i>
							<p>Technology</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/trainer">
							<i class="material-icons">supervisor_account</i>
							<p>Trainer</p>
					</a></li>
					</a></li>
					<li class="active"><a href="${pageContext.request.contextPath }/testimony">
							<i class="material-icons">list</i>
							<p>Testimony</p>
					</a></li>
					<li><a href="#" id="logout"> <i class="material-icons">block</i>
							<p>Logout</p>
					</a></li>
					<form action="${logoutUrl}" method="post" id="logoutForm">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
				</ul>
			</div>
		</div>
		<div class="main-panel">
			<nav class="navbar navbar-primary navbar-absolute">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#"> Testimony Datatable </a>
					</div>
				</div>
			</nav>
			
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<c:if test="${not empty message}">
								<div class="alert alert-info">
									<c:out value="${message }"></c:out>
								</div>
							</c:if>
							<div class="card">
								<div class="card-header" data-background-color="orange">
									<h4 class="title">Testimony</h4>
								</div>
								<div class="card-content table-responsive">
									<form class="navbar-form navbar-left" role ="search" action="${pageContext.request.contextPath }/testimony">
										<div class="form-group is-empty">
											<input class="form-control" type="text" name="search"
											placeholder="Search by Testimony" />
										</div>
										<span class="material-input"></span>
										<span class="material-input"></span>
										<button type= "submit" class="btn btn-primary btn-round btn-just-icon">
										<i class="material-icons">search</i>
										</button>
										<div>
											<button type="button" id="tambahTestimony"
											class="btn btn-sm btn-primary">
												<i class="material-icons">add</i>
												testimony
											</button>
										</div>
									</form>
									

									<div class="table-responsive">
										<table id="table-testimony" class="table">
											<thead class="text-warning">
												<th>Testimony</th>
												<th>Action</th>
											</thead>
											<tbody>
												<c:forEach var="dept" items="${testimony}">
													<tr>
														<td><c:out value="${dept.title}"></c:out></td>
														<td>
														<button id="${dept.id }" type="button" rel="tooltip" title="Edit ${employee.name }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
														<button id="${dept.id }" type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs btn-hapus">
										                    <i class="fa fa-times"></i>
										                </button>
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

				<!-- <div class="row">
                    <div class="col-lg-12 col-md-12">
                            <div class="card">
                                <div class="card-header" data-background-color="orange">
                                    <h4 class="title">List Technology</h4>
                                    <p class="category">
                                </div>
                     -->
				<footer class="footer">
					<div class="container-fluid">
						<nav class="pull-left">
							<ul>
								<li><a href="#"> Home </a></li>
								<li><a href="#"> Company </a></li>
								<li><a href="#"> Portfolio </a></li>
								<li><a href="#"> Blog </a></li>
							</ul>
						</nav>
						<p class="copyright pull-right">
							&copy;
							<script>
									document.write(new Date().getFullYear())
								</script>
							<a href="http://www.creative-tim.com">Creative Tim</a>, made with
							love for a better web
						</p>
					</div>
				</footer>
			</div>
		</div>
		<!--modal-->
		<div class="modal fade" id="add-testimony-modal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Testimony</h5>
					</div>
					<div class="modal-body">
						<form id="theForm"action="${pageContext.request.contextPath }/testimony/save" method="POST">
							<div class="form-group">
								<label for="name-testimony">Name</label>
								<input type="hidden" id="active"/>
								<input data-parsley-required="true" type="text" id="title"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Testimony" />
							</div>
							<div class="form-group">
								<label for="content">Note</label>
								<textarea data-parsley-required="true" 
								rows="4" cols="50" id="content" aria-describedby="nameHelp"
								class="form-control" placeholder="Enter Content" ></textarea>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-save-testimony-submit"
									class="btn btn-primary">Save</button>
							</div>
						</form>
					</div>
				</div>
				</div>
			</div>
			
			<div class="modal fade" id="add-update-testimony" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Testimony</h5>
					</div>
					<div class="modal-body">
						<form action="${pageContext.request.contextPath }/testimony/update" method="POST">
							<div class="form-group">
								<label for="name-testimony">Name</label>
								<input type=hidden id="id-testimony">
								<input type=hidden id="created-on1">
								<input data-parsley-required="true" type="text" id="titles"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Testimony" />
							</div>
							<div class="form-group">
								<label for="content">Note</label>
								<textarea data-parsley-required="true" 
								rows="4" cols="50" id="contents" aria-describedby="nameHelp"
								class="form-control" placeholder="Enter Content" ></textarea>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-update-testimony-submit"
									class="btn btn-primary">Update</button>
							</div>
						</form>
					</div>
					</div>
				</div>
			</div>
			
			<div class="modal fade" id="add-delete-testimony" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Testimony</h5>
					</div>
					<div class="modal-body">
						<form action="${pageContext.request.contextPath }/testimony/update" method="POST">
							<div class="form-group">
								<label for="name-testimony">Name</label>
								<input type=hidden id="id-testimony"/>
								<input type="hidden" name="isDelete" id="actives"/>
								<input type="hidden" name="created-on"id="created-on"/>
								<input data-parsley-required="true" type="text" id="titles1"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Testimony" />
							</div>
							<div class="form-group">
								<label for="content">Note</label>
								<textarea data-parsley-required="true" 
								rows="4" cols="50" id="contents1" aria-describedby="nameHelp"
								class="form-control" placeholder="Enter Content" ></textarea>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-delete-testimony-submit"
									class="btn btn-danger">Delete</button>
							</div>
						</form>
					</div>
					</div>
				</div>
			</div>
		
							
							
</body>
<!--   Core JS Files   -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/js/material.min.js"
	type="text/javascript"></script>
<!--  Charts Plugin -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<!--  Notifications Plugin    -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/material-dashboard.js?v=1.2.0"></script>
<script
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" />
<script
	src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js" />
<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script
	src="${pageContext.request.contextPath}/resources/assets/js/demo.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		
	
						//setting up datepicker
						$('#birthDate123').datepicker();

						function ajaxSetUp() {
							var token = $("meta[name='_csrf']").attr("content");
							var header = $("meta[name='_csrf_header']").attr(
									"content");
							$(document).ajaxSend(function(e, xhr, options) {
								xhr.setRequestHeader(header, token);
							});
						}

						 $('#table-testimony').DataTable({
							 searching:false,
							 paging:false,
							 bSort:false
						 }); 

						/* $('.btn-hapus').on('click',function() {var conf = confirm("Are you sure delete this data ?");
											if (conf == true) {
												var id = $(this).attr("id");

												ajaxSetUp();
												$.ajax({url : '${pageContext.request.contextPath}/department/delete/'
																	+ id,
															type : 'DELETE',
															success : function(
																	data) {
																window.location = "${pageContext.request.contextPath}/department";
															},
															error : function() {
																alert('delete data failed..!!');
															}
														});
											}

											return false;
										});
 */
						//logout event button
						$('#logout').click(function(event) {
							event.preventDefault();
							$('#logoutForm').submit();
						});
 
 
						//edit technology
						 $('.btn-edit').on('click', function(){
				    		 var id = $(this).attr('id');
				    		 $.ajax({
				    			 url : '${pageContext.request.contextPath}/testimony/get/'+ id,
				    			 type: 'GET',
				    			 success : function(data){
				    				 $('#id-testimony').val(data.id);
				    				 $('#titles').val(data.title);
				    				 $('#contents').val(data.content);
				    				 $('#created-on1').val(data.createdOn);
				    			 },
				    			 dataType: 'json'
				    		 })
				    		 
				    		$('#add-update-testimony').modal();
				    		 
				    	 });
						 
						 var button = jQuery('#btn-update-testimony-submit').click(function(event){
								event.preventDefault();
								var name = jQuery('#titles').val();
							    var note = jQuery('#contents').val();
								var id = jQuery('#id-testimony').val();
								var createdon=$('#created-on1').val()
								var date=new Date();
								
								var testimony = {
										title:name,
										content:note,
										id:id,
										modifiedOn:date,
										createdOn:createdon
								}
								jQuery.ajax({
									url : '${pageContext.request.contextPath}/testimony/update',
									type:'POST',
										beforeSend:function(){
											console.log(testimony);
											console.log('mau contact server');
										},
									contentType: 'application/json',
									data: JSON.stringify(testimony),
									success : function(data){
										
										console.log('data dari server');
										console.log(data);
										window.location='${pageContext.request.contextPath}/testimony'
									}
								});
								
							});
						  
						$('#tambahTestimony').click(function(event) {
							event.preventDefault();
							$('#add-testimony-modal').modal();
						});
						
						jQuery('#btn-save-testimony-submit').click(function(event){
							validate = $('#theForm').parsley();
							validate.validate();
							if(validate.isValid()){
								event.preventDefault();
								var name = jQuery('#title').val();
							    var content = jQuery('#content').val();
								var date = new Date();
							 	var isd = jQuery('#active').val(); 
								var testimony = {
										title:name,
										content:content,
										createdOn:date,
							 			isDelete:isd 
								}
								
								jQuery.ajax({
									url : '${pageContext.request.contextPath}/testimony/save',
									type:'POST',
										beforeSend:function(){
											console.log(testimony);
											console.log('mau contact server');
										},
									contentType: 'application/json',
									dataType: "json",
									data: JSON.stringify(testimony),
									success : function(data){
										alert('data berhasil disimpan');
										console.log('data dari server');
										console.log(data);
										window.location='${pageContext.request.contextPath}/testimony'
									}
								});
							}
							else{
								alert('data tidak boleh kosong');
								return false;
						
							}
							
							
						});
						
						 $('.btn-hapus').on('click', function(){
			    		 var id = $(this).attr('id');
			    		 $.ajax({
			    			 url : '${pageContext.request.contextPath}/testimony/get/'+ id,
			    			 type: 'GET',
			    			 success : function(data){
			    			 	$("#id-testimony").val(data.id);
			    			 	$('#titles1').val(data.title);
				    			$('#contents1').val(data.content);
				    			$('#created-on').val(data.createdOn);
				    			$('input[name="isDelete"]').val(data.isDelete=true)
				    			console.log(data)
			    			 },
			    			
			    		 })
			    		 $('#add-delete-testimony').modal()
			    		 
			    	 });
						 
					jQuery('#btn-delete-testimony-submit').click(function(event){
								event.preventDefault();
								var name = jQuery('#titles1').val();
							    var note = jQuery('#contents1').val();
								var id = jQuery('#id-testimony').val();
								var date=new Date();
								
								var testimony = {
										title:name,
										content:note,
										id:id,
										isDelete:$('#actives').val(),
										createdOn : $('#created-on').val(),
										deletedOn:date
								}
								jQuery.ajax({
									url : '${pageContext.request.contextPath}/testimony/update',
									type:'POST',
										beforeSend:function(){
											console.log(testimony);
											console.log('mau contact server');
										},
									contentType: 'application/json',
									data: JSON.stringify(testimony),
									success : function(data){
										
										console.log('data dari server');
										console.log(data);
										window.location='${pageContext.request.contextPath}/testimony'
									}
								});
								
							});
	 	
				});				    							
</script>

</html>