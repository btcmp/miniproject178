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
                    <li>
                        <a href="${pageContext.request.contextPath}/menu">
                            <i class="material-icons">library_books</i>
                            <p>Menu</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/menu_access">
                            <i class="material-icons">library_books</i>
                            <p>Menu Access</p>
                        </a>
                    </li>
                    <li><a href="${pageContext.request.contextPath }/biodata"> 
						<i class="material-icons">person</i>
						<p>Biodata</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/monitoring"> 
						<i class="material-icons">work</i>
						<p>Monitoring</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/assignment"> 
						<i class="material-icons">work</i>
						<p>Assignment</p>
					</a></li>
					<li>
					<li>
                        <a href="${pageContext.request.contextPath }/office">
                            <i class="material-icons">work</i>
                            <p>Office</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/bootcamp">
                            <i class="material-icons">group</i>
                            <p>Bootcamp Test Type</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/category">
                            <i class="material-icons">library_books</i>
                            <p>Category</p>
                        </a>
                    </li>
                      <li>
                        <a href="${pageContext.request.contextPath }/idlenews">
                            <i class="material-icons">chat</i>
                            <p>Idle News</p>
                        </a>
                    </li>
					<li><a href="${pageContext.request.contextPath }/question">
							<i class="material-icons">library_books</i>
							<p>Questions</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/version">
							<i class="material-icons">library_books</i>
							<p>Versions</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/feedback">
							<i class="material-icons">library_books</i>
							<p>Feedback</p>
					</a></li>
					<li class="active"><a href="${pageContext.request.contextPath }/technology">
							<i class="material-icons">developer_mode</i>
							<p>Technology</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/trainer">
							<i class="material-icons">supervisor_account</i>
							<p>Trainer</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/testimony">
							<i class="material-icons">list</i>
							<p>Testimony</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/batch">
							<i class="material-icons">list</i>
							<p>Batch</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/class">
							<i class="material-icons">list</i>
							<p>Class</p>
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
						<a class="navbar-brand" href="#"> Technology Datatable </a>
					</div>
				</div>
			</nav>
			
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12">
						<%-- 	<c:if test="${not empty message}">
								<div class="alert alert-info">
									<c:out value="${message }"></c:out>
								</div>
							</c:if> --%>
							<div class="card">
								<div class="card-header" data-background-color="orange">
									<h4 class="title">Technology</h4>
								</div>
								<div class="card-content table-responsive">
									<form class="navbar-form navbar-left" role ="search" action="${pageContext.request.contextPath }/technology">
										<div class="form-group is-empty">
											<input class="form-control" type="text" name="search"
											placeholder="Search by Technology" />
										</div>
										<span class="material-input"></span>
										<span class="material-input"></span>
										<button type= "submit" class="btn btn-primary btn-round btn-just-icon">
										<i class="material-icons">search</i>
										</button>
										<div>
											<button type="button" id="tambahTechnology"
											class="btn btn-sm btn-primary">
												<i class="material-icons">add</i>
												technology
											</button>
										</div>
									</form>
									
									<div class="table-responsive">
										<table id="table-technology" class="table">
											<thead class="text-warning">
												<th>Technology</th>
												<th>Created By</th>
												<th>Status</th>
												<th>Action</th>
											</thead>
											<tbody>
												<c:forEach var="dept" items="${technology}">
													<tr>
														<td><c:out value="${dept.name}"></c:out></td>
														<td><c:out value="${dept.createdby }"></c:out></td>
														<td>
															<c:choose>
																<c:when test="${dept.active==true}">
																	Active
																</c:when>
																<c:otherwise>
   																	 Not Active
  																</c:otherwise>
															</c:choose>
														</td>
														<td>
														<button id="${dept.id }" type="button" rel="tooltip" title="Edit ${employee.name }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
														<button id="${dept.id }" type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-simple btn-xs btn-deactive">
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
		<div class="modal fade" id="add-technology-modal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Technology</h5>
					</div>
					<div class="modal-body">
						<form id="theForm" action="${pageContext.request.contextPath }/technology/save" method="POST">
							<div class="form-group">
								<label for="name-technology">Name</label>
								<input data-parsley-required="true" type="text" id="name"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Technology" />
							</div>
							<div class="form-group">
								<label for="note-technology">Note</label>
								<textarea data-parsley-required="true" 
								rows="4" cols="50" id="note" aria-describedby="nameHelp"
								class="form-control" placeholder="Enter note technology" ></textarea>
							</div>
							<button type="button" id="tambahTrainer" class="btn btn-primary bts-sm">+Trainer</button><br>
									<div class="table-responsive">
										<table id="table-trainer" class="table">
											<thead class="text-warning">
												<th></th>
												<th>Trainer</th>
												<th>Created By</th>
												<th>Status</th>
												<th>Action</th>
											</thead>
											<tbody>
 				 						 	</tbody>
										</table>
									</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-save-technology-submit"
									class="btn btn-primary">Save</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
		<div class="modal fade" id="add-trainer-modal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Trainer</h5>
					</div>
					<div class="modal-body">
						<form
							action="${pageContext.request.contextPath }/technology/savetrain" method="POST">
							<div class="form-group">
								<select id="trainerId" name="training" class="form-control">
									<option>--Trainer--</option>
									<c:forEach items="${training}" var="train">
										<option value="${train.id}">${train.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary" id="tambahCancel"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-save-trainer-submit"
									class="btn btn-primary">Save</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
		<div class="modal fade" id="add-trainer1-modal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Trainer</h5>
					</div>
					<div class="modal-body">
						<form
							action="${pageContext.request.contextPath }/technology/savetrain" method="POST">
							<div class="form-group">
								<select id="trainerId1" name="training" class="form-control">
									<option>--Trainer--</option>
									<c:forEach items="${training}" var="train">
										<option value="${train.id}">${train.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary" id="tambahCancel"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-update-trainer-submit"
									class="btn btn-primary">Save</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
		
		<div class="modal fade" id="add-update-technology" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Technology</h5>
					</div>
					<div class="modal-body">
						<form id="theForm1"
							action="${pageContext.request.contextPath }/technology/update" method="POST">
							<div class="form-group">
								<label for="name-technology">Name</label>
								<input type="hidden" id="id-technology" />
								<input type="text" id="name1" data-parsley-required="true"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Technology" />
							</div>
							<div class="form-group">
								<label>Note</label>
								<textarea rows="4" cols="50" id="note1" class="form-control" placeholder="Enter note technology" data-parsley-required="true"></textarea>
							</div>
							<button type="button" id="tambahTrainer1" class="btn btn-primary bts-sm">+Trainer</button><br>
							<div class="table-responsive">
										<table id="table-techtrain" class="table">
											<thead class="text-warning">
												<th></th>
												<th>Trainer</th>
												<th>Created By</th>
												<th>Status</th>
												<th>Action</th>
											</thead>
											<tbody id="list-trainer">
											</tbody>
										</table>
									</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary" id="btn-close-update"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-update-technology"
									class="btn btn-primary">Update</button>
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

					 	/*    $('#table-trainer').DataTable({
							 searching:false,
							 bSort:false,
							 paging:false
						  });   */
						/*   $('#table-technology').DataTable({
							searching:false,
							bSort:false,
							paging:false
						});  */ 

/* 						$('.btn-hapus').on('click',function() {var conf = confirm("Are you sure delete this data ?");
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
										}); */

						//logout event button
						$('#logout').click(function(event) {
							event.preventDefault();
							$('#logoutForm').submit();
						});
						$('#list-trainer').on('click','.btn-hapus',function(){
							var trItem = $(this).parent().parent();
							var id=trItem.attr('id');
							console.log(id)
							  $.ajax({
								url:'${pageContext.request.contextPath}/technology/delete/'+ id,
								type:'DELETE',
								success : function(data){
									window.location='${pageContext.request.contextPath}/technology',
									alert('data berhasil dihapus')
								},
								error: function(data){
									alert('data tidak berhasil dihapus');
								}
							})  
						});
						//edit technology
						 $('.btn-edit').on('click', function(){
				    		 var id = $(this).attr('id');
				    		 $.ajax({
				    			 url : '${pageContext.request.contextPath}/technology/get/'+ id,
				    			 type: 'GET',
				    			 success : function(data){
				    				 $('#id-technology').val(data.id);
				    				 $('#name1').val(data.name);
				    				 $('#note1').val(data.note);
 				    				 console.log(data)
				    				 
				    				 var oTable=$('#table-techtrain');
				    				 var tbody=oTable.find('tbody');
				    				 $.each(data.techTran,function(key,value){
				    					 if(value.trainer.active==true){
				    						 active="Active";
				    					 }
				    						var tr ="<tr>";
				    					 	/* var tr ="<tr id='"+value.trainer.id+"'>"; */
				    					 	tr +="<td><input type='hidden' name='trainer2' id='"+value.trainer.id+"'/></td>";
 											tr += "<td>"+value.trainer.name+"</td>";
											tr += "<td>"+value.trainer.createdBy+"</td>";
											tr += "<td>"+active+"</td>";
											tr += "<td>"+"<button type='button' href='#'class='btn-hapus btn btn-danger btn-sm'>Delete</button>"+"</td>";
											tr +="</tr>";
											tbody.append(tr)
				    				 });
				    			 },
				    			 dataType: 'json'
				    		 })
				    		 
				    		$('#add-update-technology').modal();
				    		 
				    	 });
						jQuery('#btn-close-update').click(function(event){
							location.reload();
						})
						 //update technology
						jQuery('#btn-update-technology').click(function(event){
								event.preventDefault();
								validate = $('#theForm').parsley();
								validate.validate();
								if(validate.isValid()){
									var name = jQuery('#name1').val();
								    var note = jQuery('#note1').val();
									var id = jQuery('#id-technology').val();
									var active=1;
									
									var technology = {
											name:name,
											note:note,
											id:id,
											active:active

									} 
									jQuery.ajax({
										url : '${pageContext.request.contextPath}/technology/update',
										type:'POST',
											beforeSend:function(){
												console.log(technology);
												console.log('mau contact server');
											},
										contentType: 'application/json',
										data: JSON.stringify(technology),
										success : function(data){
											
											console.log('data dari server');
											console.log(data);
											window.location='${pageContext.request.contextPath}/technology'
										}
									});

								}else{
									alert('data tidak boleh kosong')
									return false;
								}
							 									
							});
						 

						
						//modal tambah technology
						$('#tambahTechnology').click(function(event) {
							event.preventDefault();
							$('#add-technology-modal').modal();
						});
						//modal tambah trainer
						$('#tambahTrainer').click(function(event) {
							event.preventDefault();
							$('#add-technology-modal').modal('hide');
							$('#add-trainer-modal').modal();
						});
						$('#tambahTrainer1').click(function(event) {
							event.preventDefault();
							$('#add-update-technology').modal('hide');
							$('#add-trainer1-modal').modal();
						});
						
						$('#tambahCancel').click(function(event) {
							event.preventDefault();
							$('#add-technology-modal').modal('show');
							$('#add-trainer-modal').modal('hide');
						});
						//add trainer
						jQuery('#btn-save-trainer-submit').click(function(event){
							event.preventDefault();
					    		 var id = $('#trainerId option:selected').val(); 
					    		 console.log(id);
					    		 $.ajax({
					    			 url : '${pageContext.request.contextPath}/technology/get1/'+ id,
					    			 type: 'GET',
					    			 success : function(data){
					    				 console.log(data)
					    				  if(data.active==true){
				    						 active="Active";
				    					 }
					    				 	var oTable=$('#table-trainer');
				    				 		var tbody=oTable.find('tbody');
				    				 			var tr = "<tr>";
					    				 		tr +="<td><input type='hidden' name='trainer' id='"+data.id+"'/></td>";
												tr += "<td>"+data.name+"</td>";
 												tr += "<td>"+data.createdBy+"</td>";
 												tr += "<td>"+active+"</td>";
												tr += "<td><a href='#'class='btn-hapus btn btn-danger btn-sm'>Delete</a></td>";
												tr +="</tr>";
												tbody.append(tr);
				    				 	 	 },
					    			 dataType: 'json'
					    		 
							 });
							
							$('#add-technology-modal').modal('show');
							$('#add-trainer-modal').modal('hide'); 
							
						});
						jQuery('#btn-update-trainer-submit').click(function(event){
							event.preventDefault();
					    		 var id = $('#trainerId1 option:selected').val(); 
					    		 console.log(id);
					    		 $.ajax({
					    			 url : '${pageContext.request.contextPath}/technology/get1/'+ id,
					    			 type: 'GET',
					    			 success : function(data){
					    				 console.log(data)
					    				  if(data.active==true){
				    						 active="Active";
				    					 }
					    				 	var oTable=$('#table-techtrain');
				    				 		var tbody=oTable.find('tbody');
				    				 			var tr = "<tr>";
					    				  		tr +="<td><input type='hidden' name='trainer1' id='"+data.id+"'/></td>";
												tr += "<td>"+data.name+"</td>";
 												tr += "<td>"+data.createdBy+"</td>";
 												tr += "<td>"+active+"</td>";
												tr += "<td><a href='#'class='btn-hapus btn btn-danger btn-sm'>Delete</a></td>";
												tr +="</tr>";
												tbody.append(tr);
				    				 	 	 },
					    			 dataType: 'json'
					    		 
							 });
							
							$('#add-update-technology').modal('show');
							$('#add-trainer1-modal').modal('hide'); 
							
						});
						
						
						
						//add technology
						jQuery('#btn-save-technology-submit').click(function(event){
							event.preventDefault();
							validate = $('#theForm').parsley();
							validate.validate();
							if(validate.isValid()){
								var name = jQuery('#name').val();
							    var note = jQuery('#note').val();
								var active=1;
								var technologyTrainers = [];
					            $.each($("input[name='trainer']:hidden"), function(){
									var technologyTrainer = {
											trainer:{
												id:$(this).attr("id")
											}
									}
									technologyTrainers.push(technologyTrainer);
					            });
								
								var technology = {
										name:name,
										note:note,
										active:active,
										techTran:technologyTrainers
								}
								console.log(technology)
								   jQuery.ajax({
									url : '${pageContext.request.contextPath}/technology/save',
									type:'POST',
										beforeSend:function(){
											console.log(technology);
											console.log('mau contact server');
										},
									contentType: 'application/json',
									data: JSON.stringify(technology),
									success : function(data){
										
										console.log('data dari server');
										console.log(data);
	 									window.location='${pageContext.request.contextPath}/technology'
	 							}
								});  
			 				
							}else{
								alert('data tidak boleh kosong')
								return false
							}
								
					});
				});				    	
						
</script>

</html>