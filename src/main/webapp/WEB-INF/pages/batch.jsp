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
	<link href="${pageContext.request.contextPath}/resources/assets/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" rel="stylesheet" />
	
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
					<li><a href="${pageContext.request.contextPath }/technology">
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
					<li class="active"><a href="${pageContext.request.contextPath }/batch">
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
						<a class="navbar-brand" href="#"> Batch Datatable </a>
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
									<h4 class="title">Batch</h4>
								</div>
								<div class="card-content table-responsive">
									<form class="navbar-form navbar-left" role ="search" action="${pageContext.request.contextPath }/batch">
										<div class="form-group is-empty">
											<input class="form-control" type="text" name="search"
											placeholder="Search by batch/technology" />
										</div>
										<span class="material-input"></span>
										<span class="material-input"></span>
										<span class="material-input"></span>
										<button type= "submit" class="btn btn-primary btn-round btn-just-icon">
										<i class="material-icons">search</i>
										</button>
										<div>
											<button type="button" id="tambahBatch"
											class="btn btn-sm btn-primary">
												<i class="material-icons">add</i>
												batch
											</button>
										</div>
									</form>
									

									<div class="table-responsive">
										<table id="table-user" class="table">
											<thead class="text-warning">
												<th>Batch</th>
												<th>Technology</th>
												<th>Trainer</th>
												<th>Action</th>
											</thead>
											<tbody>
												<c:forEach var="dept" items="${batch}">
													<tr>
														<td><c:out value="${dept.name}"></c:out></td>
														<td><c:out value="${dept.technology.name }"></c:out></td>
														<td><c:out value="${dept.trainer.name }"></c:out></td>
														<td><a id="${dept.id }" href="#"
															class="btn-edit btn btn-primary btn-sm">Edit</a>
														<a id="${dept.id }" href="#"
															class="btn-hapus btn btn-danger btn-sm">Add Participant</a>
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
		<div class="modal fade" id="add-batch-modal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Batch</h5>
					</div>
					<div class="modal-body">
						<input type="hidden" id="id-batch"/>
						<form action="${pageContext.request.contextPath}/batch/save" method="POST">
							<div class="form-group">
								<select id="technologyId" name="technology" class="form-control">
									<option>--Technology--</option>
									<c:forEach items="${technology}" var="tech">
										<option value="${tech.id}">${tech.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<select id="trainerId" name="training" class="form-control">
										<option value="select">--Trainer--</option>
								</select>
							</div>
							<div class="form-group">
								<label for="name-batch">Name</label>
								<input data-parsley-required="true" type="text" id="name"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Batch" />
							</div>
						<div class="form-group">
							<input type="text" id="startDate" class="form-control" placeholder="Start Date">
						</div>
							<div class="form-group">
								<label for="name-batch">End Date</label>
								<input data-parsley-required="true" type="text" id="endDate"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter End Date" />
							</div>
							<div class="form-group">
								<select id="trainerId" name="training" class="form-control">
									<option>--Room--</option>
									<c:forEach items="${room}" var="room">
										<option value="${room.id}">${room.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label for="note-trainer">Note</label>
								<textarea data-parsley-required="true" 
								rows="4" cols="50" id="note" aria-describedby="nameHelp"
								class="form-control" placeholder="Enter note trainer" ></textarea>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-save-batch-submit"
									class="btn btn-primary">Save</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
		<div class="modal fade" id="update-batch-modal" tabindex="-1"
			role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">Batch</h5>
					</div>
					<div class="modal-body">
						<input type="hidden" id="id-batch1"/>
						<form action="${pageContext.request.contextPath}/batch/save" method="POST">
							<div class="form-group">
								<select id="technologyId1" name="technology" class="form-control">
									<option>--Technology--</option>
									<c:forEach items="${technology}" var="tech">
										<option value="${tech.id}">${tech.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<select id="trainerId1" name="training" class="form-control">
										<option value="select">--Trainer--</option>
								</select>
							</div>
							<div class="form-group">
								<label for="name-batch">Name</label>
								<input data-parsley-required="true" type="text" id="name1"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter Name Batch" />
							</div>
						<div class="form-group">
							<input type="text" id="startDate1" class="form-control" placeholder="Start Date">
						</div>
							<div class="form-group">
								<label for="name-batch">End Date</label>
								<input data-parsley-required="true" type="text" id="endDate1"
									class="form-control"
									aria-describedby="nameHelp" placeholder="Enter End Date" />
							</div>
							<div class="form-group">
								<select id="roomId1" name="training" class="form-control">
									<option>--Room--</option>
									<c:forEach items="${room}" var="room">
										<option value="${room.id}">${room.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label for="note-trainer">Note</label>
								<textarea data-parsley-required="true" 
								rows="4" cols="50" id="note1" aria-describedby="nameHelp"
								class="form-control" placeholder="Enter note trainer" ></textarea>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
								<button type="submit" id="btn-update-batch-submit"
									class="btn btn-primary">update</button>
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
<%-- <script
	src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
 --%><script	src="${pageContext.request.contextPath}/resources/assets/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>	
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
								$('#startDate').datepicker({
	   							format: 'yyyy-mm-dd',
	    						autoclose: true
								});
						//setting up datepicker
								$('#endDate').datepicker({
	   							format: 'yyyy-mm-dd',
	    						autoclose: true
								});

						function ajaxSetUp() {
							var token = $("meta[name='_csrf']").attr("content");
							var header = $("meta[name='_csrf_header']").attr(
									"content");
							$(document).ajaxSend(function(e, xhr, options) {
								xhr.setRequestHeader(header, token);
							});
						}

						/* $('#table-user').DataTable(); */

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

 */						//logout event button
						$('#logout').click(function(event) {
							event.preventDefault();
							$('#logoutForm').submit();
						});
 						
 						$('.btn-hapus').on('click',function(){
 							var id=$(this).attr('id')
 							$.ajax({
 								url:'${pageContext.request.contextPath}/trainer/delete/'+ id,
 								type:'DELETE',
 								success:function(data){
 									window.location='${pageContext.request.contextPath}/trainer/'
 								}
 							})
 						})
						//edit technology
						 $('.btn-edit').on('click', function(){
				    		 var id = $(this).attr('id');
				    		 $.ajax({
				    			 url : '${pageContext.request.contextPath}/batch/get/'+ id,
				    			 type: 'GET',
				    			 success : function(data){
				    				  console.log(data)
			    			                 options="<option value="+data.trainer.id+">"+data.trainer.name+"</option>";
			    			                $(options).appendTo('#trainerId1');
				    				 $('#id-batch1').val(data.id);
				    				 $('#name1').val(data.name);
				    				 $('#note1').val(data.note);
				    				 $('#technologyId1').val(data.technology.id);
				    				 $('#trainerId1').val(data.trainer.id);
				    				 $('#startDate1').val(data.periodFrom);
				    				 $('#endDate1').val(data.periodTo);
				    			 },
				    			 dataType: 'json'
				    		 })
				    		 
				    		$('#update-batch-modal').modal();
				    		 
				    	 });
						 //update technology
						 jQuery('#btn-update-batch-submit').click(function(event){
								event.preventDefault();
								var date=new Date();
								var technology=$('#technologyId1 option:selected').val();
								var trainer=$('#trainerId1 option:selected').val();
								var name = jQuery('#name1').val();
							    var note = jQuery('#note1').val();
							    var startDate=jQuery('#startDate1').val();
							    var endDate=jQuery('#endDate1').val();
								var batch = {
										technology:{
											id:technology,
										},
										trainer:{
											id:trainer,
										},
										name:name,
										note:note,
										periodFrom:startDate,
										periodTo:endDate,
										createdOn:date
								}
								
								jQuery.ajax({
									url : '${pageContext.request.contextPath}/batch/save',
									type:'POST',
										beforeSend:function(){
											console.log(batch);
											console.log('mau contact server');
										},
									contentType: 'application/json',
									data: JSON.stringify(batch),
									success : function(data){
										
										console.log('data dari server');
										console.log(data);
										window.location='${pageContext.request.contextPath}/batch'
									}
								});
								
							});

						
						$('#tambahBatch').click(function(event) {
							event.preventDefault();
							$('#add-batch-modal').modal();
						});
						
						//add trainer
						jQuery('#btn-save-batch-submit').click(function(event){
							event.preventDefault();
							var date=new Date();
							var technology=$('#technologyId option:selected').val();
							var trainer=$('#trainerId option:selected').val();
							var name = jQuery('#name').val();
						    var note = jQuery('#note').val();
						    var startDate=jQuery('#startDate').val();
						    var endDate=jQuery('#endDate').val();
							console.log(trainer)
							var batch = {
									technology:{
										id:technology,
									},
									trainer:{
										id:trainer,
									},
									name:name,
									note:note,
									periodFrom:startDate,
									periodTo:endDate,
									createdOn:date
							}
							
							jQuery.ajax({
								url : '${pageContext.request.contextPath}/batch/save',
								type:'POST',
									beforeSend:function(){
										console.log(batch);
										console.log('mau contact server');
									},
								contentType: 'application/json',
								data: JSON.stringify(batch),
								success : function(data){
									alert("data berhasil disimpan")
									console.log('data dari server');
									console.log(data);
									window.location='${pageContext.request.contextPath}/batch'
								},
								error : function(data){
									alert("data tidak berhasil disimpan")
								}
							});
							
						});
						
						$('#technologyId').on('change', function() {
							  var value = $(this).val();
							  var id = $('#technologyId option:selected').val(); 
							  console.log(value);
							  $.ajax({
					    			 url : '${pageContext.request.contextPath}/batch/get1/'+ id,
					    			 type: 'GET',
					    			 success : function(data){
					    				 console.log(data.techTran) 
					    				 $.each(data.techTran,function(key,obj){
					    			                options="<option value="+obj.trainer.id+">"+obj.trainer.name+"</option>";
					    			                $(options).appendTo('#trainerId'); 
					    			       });
					    			 },
					    			 dataType: 'json'
					    		 
							 });

							});
				});				    	
						
</script>

</html>