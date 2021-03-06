<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!doctype html>
<html lang="en">

<head>
	<meta charset="utf-8" />
	<link rel="apple-touch-icon" sizes="76x76" href="${pageContext.request.contextPath}/resources/assets/img/apple-icon.png" />
	<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/assets/img/favicon.png" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<title>Material Dashboard by Creative Tim</title>
	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
	<meta name="viewport" content="width=device-width" />
	<meta name="_csrf" content="${_csrf.token}" />

	<!-- default header name is X-CSRF-TOKEN -->
	<meta name="_csrf_header" content="${_csrf.headerName}" />

	<!-- Bootstrap core CSS     -->
	<link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" />

	<!--  Material Dashboard CSS    -->
	<link href="${pageContext.request.contextPath}/resources/assets/css/material-dashboard.css?v=1.2.0"	rel="stylesheet" />

	<!--  CSS for Demo Purpose, don't include it in your project     -->
	<link href="${pageContext.request.contextPath}/resources/assets/css/demo.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" />

	<!--     Fonts and icons     -->
	<link href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css" rel="stylesheet">
	<link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>

	<style> input.parsley-error { color: #B94A48 !important; background-color: #F2DEDE !important; border: 1px solid #EED3D7 !important; }</style>
</head>

<body>
	<div class="wrapper">
		<div class="sidebar" data-color="purple" data-image="${pageContext.request.contextPath}/resources/assets/img/sidebar-1.jpg">
		
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
                    <li class="active"><a href="${pageContext.request.contextPath }/biodata"> 
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
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form>
				</ul>
			</div>
		</div>
		
		<div class="main-panel">
			<nav class="navbar navbar-primary navbar-absolute">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span> 
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#"> BIODATA TABLE </a>
					</div>
				</div>
			</nav>
			
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<div class="card">
								<div class="card-header" data-background-color="orange">
									<h4 class="title">Biodata</h4>
									<p class="category">
								</div>
					
	                           	<div class="card-content table-responsive">
	                           		<form action="${pageContext.request.contextPath }/biodata/src">
	                           			<input type="search" id="search" name="srctext" placeholder="Search by Name"/>
	                           			<button type="submit" class="btn btn-sm btn-default"/><i class="material-icons">search</i>
	                           			<button type="button" id="tambahBiodata" class="btn btn-sm btn-primary"> + Add </button>
                       				</form>
	                     		</div>
								
								<div class="card-content table-responsive">
									<table id="table-user" class="table table-hover">
										<thead class="text-warning">
											<th>NAME</th>
											<th>MAJORS</th>
											<th>GPA</th>
											<th>ACTION</th>
										</thead>
										<tbody>
											<c:forEach var="biodata" items="${biodatas }">
												<tr>
													<td><c:out value="${biodata.name }"></c:out></td>
													<td><c:out value="${biodata.majors }"></c:out></td>
													<td><c:out value="${biodata.gpa }"></c:out></td>
													<td>
														<button id="${biodata.id }" type="button" rel="tooltip" title="Edit ${biodata.name }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button id="${biodata.id }" type="button" rel="tooltip" title="Deactive ${biodata.name }" class="btn btn-danger btn-simple btn-xs btn-delete">
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
	
<!-- Modal -->
	<div class="modal fade" id="addBiodata" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Add Biodata</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/biodata/save" method="POST">
				      	<div class="form-group">
							<input type="text" id="name" class="form-control" placeholder="Name" />
						</div>
						<div class="form-group">
							<input type="text" id="lastEducation" class="form-control" placeholder="Last Education" />
						</div>
						<div class="form-group">
							<input type="text" id="educationalLevel" class="form-control" placeholder="Educational Level" />
						</div>
						<div class="form-group">
							<input type="text" id="majors" class="form-control" placeholder="Majors" />
						</div>
						<div class="form-group">
							<input type="text" id="gpa" class="form-control" placeholder="GPA" />
						</div>	
						
						<div class="modal-footer">
							<button type="submit" id="saving" class="btn btn-primary">Save</button>
							<button type="submit" id="canceling" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>
	
<!-- Modal2 -->
	<div class="modal fade" id="edit-biodata" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Edit Biodata</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/biodata/editbiodata" method="POST">
		     			<input type="hidden" id="createdBy" name="createdBy"/>
		     			<input type="hidden" id="id-biodata" name="id-biodata"/>
		     			<input type="hidden" id="createdOn" name="createdOn"/>
		     			<input type="hidden" id="active" name="active"/>
				      	<div class="row">
				      		<div class="form-group col-md-6">
								<input type="text" id="name-biodata" name="name-biodata" class="form-control" placeholder="Name" />
							</div>
							<div class="form-group col-md-6">
								<input type="radio" id="gender" name="gender" value="Male" /> Male
								<input type="radio" id="gender1" name="gender" value="Female" /> Female
							</div>
				      	</div>
				      	
				      	<div class="row">
				      		<div class="form-group col-md-6">
								<input type="text" id="lasted-biodata" name="lasted-biodata" class="form-control" placeholder="Last Education" />
							</div>
							<div class="form-group col-md-6">
								<select class="form-control" id="bootcampTestTypeId" name="bootcampTestTypeId">
									<c:forEach items="${bootcamps }" var="bc">
										<option value="${bc.id }">${bc.name }</option>
									</c:forEach>
								</select>
							
							</div>
				      	</div>
				      	
				      	<div class="row">
				      		<div class="form-group col-md-6">
								<input type="text" id="edlev-biodata" name="edlev-biodata" class="form-control" placeholder="Educational Level" />
							</div>
							<div class="form-group col-md-1">
								<input type="text" id="iq" class="form-control" placeholder="IQ" />
							</div>
							<div class="form-group col-md-1">
								<input type="text" id="du" class="form-control" placeholder="DU" />
							</div>
							<div class="form-group col-md-1">
								<input type="text" id="nestedLogic" class="form-control" placeholder="NL" />
							</div>
							<div class="form-group col-md-1">
								<input type="text" id="joinTable" class="form-control" placeholder="JT" />
							</div>
				      	</div>
						
						<div class="row">
				      		<div class="form-group col-md-6">
								<input type="text" id="graduationYear" class="form-control" placeholder="Graduation Year" />
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="arithmetic" class="form-control" placeholder="Arithmetic" />
							</div>
				      	</div>
						
						<div class="row">
				      		<div class="form-group col-md-6">
								<input type="text" id="majors-biodata" name="majors-biodata" class="form-control" placeholder="Majors" />
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="tro" class="form-control" placeholder="TRO" />
							</div>
				      	</div>
						
						<div class="row">
				      		<div class="form-group col-md-6">
								<input type="text" id="gpa-biodata" name="gpa-biodata" class="form-control" placeholder="GPA" />
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="interviewer" class="form-control" placeholder="Interviewer" />
							</div>
				      	</div>

						<div class="form-group">
							<textarea id="notes" class="form-control" rows="5" placeholder="Notes" ></textarea>
						</div>
						
						<div class="modal-footer">
							<button type="submit" id="edit" class="btn btn-primary">Edit</button>
							<button type="submit" id="canceledit" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>

<!-- Modal3 -->
	<div class="modal fade" id="deactive-biodata" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Sure to delete this???</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/biodata/editbiodata" method="POST">
						<div class="modal-footer text-center">
							<button type="submit" id="deactive-edit" class="btn btn-primary">Yes</button>
							<button type="submit" id="canceled-deactive" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>
	
</body>

<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script	src="${pageContext.request.contextPath}/resources/assets/js/material.min.js" type="text/javascript"></script>

<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>

<!--  Dynamic Elements plugin -->
<script	src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>

<!--  PerfectScrollbar Library -->
<script	src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script	src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>

<!--  Notifications Plugin    -->
<script	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>

<!-- Material Dashboard javascript methods -->
<script	src="${pageContext.request.contextPath}/resources/assets/js/material-dashboard.js?v=1.2.0"></script>
<script	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" />
<script	src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js" />

<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script	src="${pageContext.request.contextPath}/resources/assets/js/demo.js"></script>
<script type="text/javascript">

	$(document).ready(function(){
		//saving
		var button=jQuery('#saving').click(function(event){
			event.preventDefault();
			
			var name=jQuery('#name').val();
			var lasted=jQuery('#lastEducation').val();
			var edlev=jQuery('#educationalLevel').val();
			var majors=jQuery('#majors').val();
			var gpa=jQuery('#gpa').val();
			var date=new Date();
			
			var biodata={
					name:name,
					lastEducation:lasted,
					educationalLevel:edlev,
					majors:majors,
					gpa:gpa,
					createdOn:date
			}
			
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/biodata/save',
				type:'POST',
				beforeSend: function(){
					console.log(biodata);
					console.log('contact server');
				},
				contentType:'application/json',
				data:JSON.stringify(biodata),
				success: function(data){
					console.log(data);
					alert('Data biodata successfully added');
					window.location='${pageContext.request.contextPath}/biodata'
				},
				error: function(){
					alert('Please fill all form!!')
				}
			})
		});
		

		//modal tampilan edit
		var button2=jQuery('.btn-edit').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');

			$.ajax({
				url : '${pageContext.request.contextPath}/biodata/editui/'+ id,
				type :'GET',
				success : function(data){
					$('#createdBy').val(data.createdBy);
					$('#id-biodata').val(data.id);
					$('#name-biodata').val(data.name);
					$('#lasted-biodata').val(data.lastEducation);
					$('#edlev-biodata').val(data.educationalLevel);
					$('#majors-biodata').val(data.majors);
					$('#gpa-biodata').val(data.gpa);
					$('#bootcampTestTypeId').val(data.bootcampTestTypeId);
					$('#iq').val(data.iq);
					$('#du').val(data.du);
					$('#nestedLogic').val(data.nestedLogic);
					$('#joinTable').val(data.joinTable);
					$('#graduationYear').val(data.graduationYear);
					$('#arithmetic').val(data.arithmetic);
					$('#tro').val(data.tro);
					$('#interviewer').val(data.interviewer);
					$('#notes').val(data.notes);
					$('#createdOn').val(data.createdOn);
				},
				dataType:'json'
			})
			
			$('#edit-biodata').modal();
		})
		
		//radionbutton
		var radiobtn;
		$("input[type='radio']"). click(function(){
			radiobtn=$("[name=gender]:checked").val();
		})
		
		//edit
		var button3=jQuery('#edit').click(function(event){
			event.preventDefault();
			var bootcampTestTypeId= $('#bootcampTestTypeId option:selected').val();
			var datemodif=new Date();
			
			var bio={
					id :  $('#id-biodata').val(),
					name : $('#name-biodata').val(),
					gender:radiobtn,
					lastEducation : $('#lasted-biodata').val(),
					bootcampTestTypeId:{
 						id:bootcampTestTypeId,
 					},
					educationalLevel : $('#edlev-biodata').val(),
					iq:$('#iq').val(),
					du:$('#du').val(),
					nestedLogic:$('#nestedLogic').val(),
					joinTable:$('#joinTable').val(),
					graduationYear:$('#graduationYear').val(),
					arithmetic:$('#arithmetic').val(),
					majors : $('#majors-biodata').val(),
					tro:$('#tro').val(),
					gpa : $('#gpa-biodata').val(),
					interviewer:$('#interviewer').val(),
					notes:$('#notes').val(),
					createdOn:$('#createdOn').val(),
					modifiedOn:datemodif,
					createdBy:$('#createdBy').val()
			}
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/biodata/editbiodata',
				type:'POST',
				beforeSend: function(){
					console.log(bio);
					console.log('contact server');
				},
				data:JSON.stringify(bio),
				headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
				success: function(data){
					console.log(data);
					alert('Data biodata successfully updated');
					window.location='${pageContext.request.contextPath}/biodata'
				},
				error: function(){
					alert('Data biodata failed updated')
				}
			})
		})
		
		//nonactive
		var button3=jQuery('.btn-delete').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/biodata/editui/'+ id,
				type :'GET',
				success : function(data){
					$('#id-biodata').val(data.id);
					$('#name-biodata').val(data.name);
					$('#gender').val(data.gender);
					$('#lasted-biodata').val(data.lastEducation);
					$('#edlev-biodata').val(data.educationalLevel);
					$('#majors-biodata').val(data.majors);
					$('#gpa-biodata').val(data.gpa);
					$('#bootcampTestTypeId').val(data.bootcampTestTypeId);
					$('#iq').val(data.iq);
					$('#du').val(data.du);
					$('#nestedLogic').val(data.nestedLogic);
					$('#joinTable').val(data.joinTable);
					$('#graduationYear').val(data.graduationYear);
					$('#arithmetic').val(data.arithmetic);
					$('#tro').val(data.tro);
					$('#interviewer').val(data.interviewer);
					$('#notes').val(data.notes);
					$('#createdOn').val(data.createdOn);
					$('#active').val(data.active=false);
				},
				dataType:'json'
			})
			
			$('#deactive-biodata').modal();
		})
		//continue deactive
		var button3=jQuery('#deactive-edit').click(function(event){
			event.preventDefault();
			var datemodif=new Date();
			var bio={
					id :  $('#id-biodata').val(),
					name : $('#name-biodata').val(),
					gender: $('#gender').val(),
					lastEducation : $('#lasted-biodata').val(),
					bootcampTestTypeId:$('#bootcampTestTypeId').val(),
					educationalLevel : $('#edlev-biodata').val(),
					iq:$('#iq').val(),
					du:$('#du').val(),
					nestedLogic:$('#nestedLogic').val(),
					joinTable:$('#joinTable').val(),
					graduationYear:$('#graduationYear').val(),
					arithmetic:$('#arithmetic').val(),
					majors : $('#majors-biodata').val(),
					tro:$('#tro').val(),
					gpa : $('#gpa-biodata').val(),
					interviewer:$('#interviewer').val(),
					notes:$('#notes').val(),
					createdOn:$('#createdOn').val(),
					modifiedOn:datemodif,
					active:$('#active').val()
			}
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/biodata/editbiodata',
				type:'POST',
				beforeSend: function(){
					console.log(bio);
					console.log('contact server');
				},
				data:JSON.stringify(bio),
				headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
				success: function(data){
					console.log(data);
					alert('Data biodata successfully deactivated');
					window.location='${pageContext.request.contextPath}/biodata'
				},
				error: function(){
					alert('Data biodata failed deactivated')
				}
			})
		})

		$('#table-user').DataTable();

	//logout event button
	$('#logout').click(function(event) {
		event.preventDefault();
		$('#logoutForm').submit();
	});
	
	//modal
	$('#tambahBiodata').click(function(event) {
		event.preventDefault();
		$('#addBiodata').modal();
	});
	
});
</script>
</html>