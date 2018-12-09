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
	<link href="${pageContext.request.contextPath}/resources/assets/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" rel="stylesheet" />
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
					<li><a href="dashboard.html"> 
						<i class="material-icons">dashboard</i>
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
					<li><a href="${pageContext.request.contextPath }/biodata"> 
						<i class="material-icons">person</i>
						<p>Biodata</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/monitoring"> 
						<i class="material-icons">work</i>
						<p>Monitoring</p>
					</a></li>
					<li class="active"><a href="${pageContext.request.contextPath }/assignment"> 
						<i class="material-icons">work</i>
						<p>Assignment</p>
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
							<i class="material-icons">library_books</i>
							<p>Technology</p>
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
						<a class="navbar-brand" href="#"> ASSIGNMENT TABLE </a>
					</div>
				</div>
			</nav>
			
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<div class="card">
								<div class="card-header" data-background-color="orange">
									<h4 class="title">Assignment</h4>
									<p class="category">
								</div>
					
	                           	<div class="card-content table-responsive">
	                           		<form action="${pageContext.request.contextPath }/assignment/src" method="GET">
	                           			<input type="text" id="searchAssignment" name="scrtxt" placeholder="Search by Name"/>
	                           			<button type="submit" class="btn btn-sm btn-default"/><i class="material-icons">search</i>
	                           			<button type="button" id="tambahAssignment" class="btn btn-sm btn-primary"> + add </button>
                       				</form>
	                     		</div>
								
								<div class="card-content table-responsive">
									<table id="table-user" class="table table-hover">
										<thead class="text-warning">
											<th>NAME</th>
											<th>START DATE</th>
											<th>END DATE</th>
											<th>ACTION</th>
										</thead>
										<tbody>
											<c:forEach var="assignment" items="${assignments }">
												<tr>
													<td><c:out value="${assignment.testId.name }"></c:out></td>
													<td><c:out value="${assignment.startDate }"></c:out></td>
													<td><c:out value="${assignment.endDate }"></c:out></td>
													<td>
														<button id="${assignment.id }" type="button" rel="tooltip" title="Edit ${assignment.testId.name }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button id="${assignment.id }" type="button" rel="tooltip" title="Deactive ${assignment.testId.name }" class="btn btn-danger btn-simple btn-xs btn-delete">
										                    <i class="fa fa-times"></i>
										             	</button>
										             	<button id="${assignment.id }" type="button" rel="tooltip" title="Hold ${assignment.testId.name }" class="btn btn-warning btn-simple btn-xs btn-hold">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button id="${assignment.id }" type="button" rel="tooltip" title="Mark As Done ${assignment.testId.name }" class="btn btn-secondary btn-simple btn-xs btn-done">
										                    <i class="fa fa-check"></i>
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
	<div class="modal fade" id="addAssignment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Create Assignment</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		<input type="hidden" id="action" value="add">
		     		<input type="hidden" name="createdOn" id="createdOn"/>
		     		
		     		<form action="${pageContext.request.contextPath }/assignment/save" method="POST">
				      	<div class="form-group">
							<select class="form-control" id="biodata-id" name="testId">
								<c:forEach items="${biodatas }" var="biodata">
									<option value="${biodata.id }">${biodata.name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<input type="text" id="title" class="form-control" placeholder="Title" />
						</div>
						<div class="form-group">
							<input type="text" id="startDate" class="form-control" placeholder="Start Date">
						</div>
						<div class="form-group">
							<input type="text" id="endDate" class="form-control" placeholder="End Date" />
						</div>
						<div class="form-group">
							<input type="text" id="description" class="form-control" placeholder="Description" />
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
	
<!-- Modal2 Placement -->
	<div class="modal fade" id="addDone" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Mark As Done</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/assignment/edit" method="POST">
		     			<input type="hidden" name="id" id="id"/>
		     			<input type="hidden" name="createdOn" id="createdOn"/>
						<div class="form-group">
							<input type="text" id="realizationDate" class="form-control" placeholder="Realization Date"/>
						</div>
						<div class="form-group">
							<input type="text" id="notes" class="form-control" placeholder="Notes" />
						</div>
						
						<div class="modal-footer">
							<button type="submit" id="saving-done" class="btn btn-primary">Save</button>
							<button type="submit" id="canceling-done" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>


<!-- Modal3 Deactive-->
	<div class="modal fade" id="deactive-assignment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Sure to deactive this???</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/assignment/deactive" method="POST">
		     		<input type="hidden" name="modifiedBy" id="modifiedBy"/>
		     		<input type="hidden" name="createdBy" id="createdBy"/>
		     		<input type="hidden" name="modifiedOn" id="modifiedOn"/>
						<div class="modal-footer text-center">
							<button type="submit" id="deactive" class="btn btn-primary">Yes</button>
							<button type="submit" id="canceled-deactive" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>
	
	
<!-- Modal Hold-->
	<div class="modal fade" id="hold-assignment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Sure to hold this???</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/assignment/edit" method="POST">
						<div class="modal-footer text-center">
							<button type="submit" id="hold" class="btn btn-primary">Yes</button>
							<button type="submit" id="canceled-hold" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>
</body>

<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.js" type="text/javascript"></script>
<script	src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script	src="${pageContext.request.contextPath}/resources/assets/js/material.min.js" type="text/javascript"></script>

<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>

<!--  Dynamic Elements plugin -->
<script	src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>

<!--  PerfectScrollbar Library -->

<script	src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script	src="${pageContext.request.contextPath}/resources/assets/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>

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
	function formEmpty(){
		$('#id').val("");
		$('#testId').val("");
		$('#title').val("");
		$('#startDate').val("");
		$('#endDate').val("");
		$('#description').val("");
		$('#createdOn').val("");
	}

	$(document).ready(function(){
		//modal1
		$('#tambahAssignment').click(function(event) {
			event.preventDefault();
			$('#action').val('add');
			formEmpty();
			$('#addAssignment').modal();
		});
		
		//setting up datepicker startDate
		$('#startDate').datepicker({
	   		format: 'yyyy-mm-dd',
	    	autoclose: true
		});
		
		//setting up datepicker ednDate
		$('#endDate').datepicker({
	   		format: 'yyyy-mm-dd',
	    	autoclose: true
		});
		
		//setting up datepicker realization date
		$('#realizationDate').datepicker({
	   		format: 'yyyy-mm-dd',
	    	autoclose: true
		});
		
		//saving
		jQuery('#saving').click(function(event){
			event.preventDefault();
 			var testId= $('#biodata-id option:selected').val();
			var date=new Date();
			var action=$('#action').val();
				
			if(action=='add'){
				var title=jQuery('#title').val();
				var startDate=jQuery('#startDate').val();
				var endDate=jQuery('#endDate').val();
				var description=jQuery('#description').val();
				
				var assign={
	 					testId:{
	 						id:testId,
	 					},
	 					title:title,
	 					startDate:startDate,
	 					endDate:endDate,
	 					description:description,
						createdOn:date
				};
				
				jQuery.ajax({
					url:'${pageContext.request.contextPath}/assignment/save',
					type:'POST',
					beforeSend: function(){
						console.log(assign);
						console.log('contact server');
					},
					contentType:'application/json',
					data:JSON.stringify(assign),
					success: function(data){
						console.log(data);
						alert('Data assignment successfully added');
						window.location='${pageContext.request.contextPath}/assignment'
					},
					error: function(){
						alert('Data assignment failed added')
					}
				});
			}
			else{
				var editidle={
						id:$('#id').val(),
						testId:{
							id:testId,
						},
						title:$('#title').val(),
						startDate:$('#startDate').val(),
						endDate:$('#endDate').val(),
						description:$('#description').val(),
						createdOn:$('#createdOn').val(),
						createdBy:$('#createdBy').val(),
						modifiedOn:date
				};
				
				jQuery.ajax({
					url:'${pageContext.request.contextPath}/assignment/edit',
					type:'POST',
					beforeSend: function(){
						console.log(editidle);
						console.log('contact server');
					},
					contentType:'application/json',
					data:JSON.stringify(editidle),
					success: function(data){
						console.log(data);
						alert('Data assignment successfully updated');
						window.location='${pageContext.request.contextPath}/assignment';
					},
					error: function(){
						alert('Data assignment failed updated')
					}
				})
			}
		});

		//get id edit
		jQuery('.btn-edit').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			var action=('edit');
			
			$.ajax({
				url : '${pageContext.request.contextPath}/assignment/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#action').val(action);
					$('#testId').val(data.testId);
					$('#title').val(data.title);
					$('#startDate').val(data.startDate);
					$('#endDate').val(data.endDate);
					$('#createdOn').val(data.createdOn);
					$('#description').val(data.description);
					$('#createdBy').val(data.createdBy);
				},
			})
			$('#addAssignment').modal();
		});

		//get mark as done
		jQuery('.btn-done').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/assignment/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#testId').val(data.testId);
					$('#title').val(data.title);
					$('#startDate').val(data.startDate);
					$('#endDate').val(data.endDate);
					$('#createdOn').val(data.createdOn);
					$('#description').val(data.description);
					$('#isDone').val(data.isDone);
					$('#realizationDate').val(data.realizationDate);
					$('#notes').val(data.notes);
					$('#createdBy').val(data.createdBy);
					$('#modifieddBy').val(data.modifiedBy);
				},
			})
			$('#addDone').modal();
		});
		

		//continue mark as done
		jQuery('#saving-done').click(function(event){
			event.preventDefault();
			var date=new Date();
			var isDone=true;
			var testId= $('#biodata-id option:selected').val();
			var markdone={
					id:$('#id').val(),
					testId:{
						id:testId,
					},
					title:$('#title').val(),
					startDate:$('#startDate').val(),
					endDate:$('#endDate').val(),
					description:$('#description').val(),
					createdOn:$('#createdOn').val(),
					createdBy:$('#createdBy').val(),
					modifiedOn:$('#modifiedOn').val(),
					notes:$('#notes').val(),
					modifiedOn:date,
					realizationDate:$('#realizationDate').val(),
					isDone:isDone
			}
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/assignment/edit',
				type:'POST',
				beforeSend: function(){
					console.log(markdone);
					console.log('contact server');
				},
				data:JSON.stringify(markdone),
				headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
				success: function(data){
					console.log(data);
					alert('Data assignment successfully mark as done');
					window.location='${pageContext.request.contextPath}/assignment'
				},
				error: function(){
					alert('Data assignment failed updated')
				}
			})
		});
		
		//get isDelete
		jQuery('.btn-delete').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/assignment/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#testId').val(data.testId);
					$('#title').val(data.title);
					$('#startDate').val(data.startDate);
					$('#endDate').val(data.endDate);
					$('#createdOn').val(data.createdOn);
					$('#createdBy').val(data.createdBy);
					$('#modifiedOn').val(data.modifiedOn);
					$('#modifiedBy').val(data.modifiedBy);
					$('#description').val(data.description);
					$('#isDelete').val(data.isDelete);
					$('#realizationDate').val(data.realizationDate);
					$('#notes').val(data.notes);
				},
			})
			$('#deactive-assignment').modal();
		});
		

		//continue isDelete
		jQuery('#deactive').click(function(event){
			event.preventDefault();
			var date=new Date();
			var isDelete=true;
			var testId= $('#biodata-id option:selected').val();
			var deac={
					id:$('#id').val(),
					testId:{
						id:testId,
					},
					title:$('#title').val(),
					startDate:$('#startDate').val(),
					endDate:$('#endDate').val(),
					description:$('#description').val(),
					createdOn:$('#createdOn').val(),
					createdBy:$('#createdBy').val(),
					modifiedOn:$('#modifiedOn').val(),
					modifiedBy:$('#modifiedBy').val(),
					notes:$('#notes').val(),
					realizationDate:$('#realizationDate').val(),
					isDelete:isDelete,
					deletedOn:date
			}
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/assignment/deactive',
				type:'POST',
				beforeSend: function(){
					console.log(deac);
					console.log('contact server');
				},
				data:JSON.stringify(deac),
				headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
				success: function(data){
					console.log(data);
					alert('Data Assignment successfully deleted');
					window.location='${pageContext.request.contextPath}/assignment'
				},
				error: function(){
					alert('Data Assignment failed deleted')
				}
			})
		});
		
		//get isHold
		jQuery('.btn-hold').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/assignment/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#testId').val(data.testId);
					$('#title').val(data.title);
					$('#startDate').val(data.startDate);
					$('#endDate').val(data.endDate);
					$('#createdOn').val(data.createdOn);
					$('#modifiedOn').val(data.modifiedOn);
					$('#description').val(data.description);
					$('#isHold').val(data.isHold);
					$('#realizationDate').val(data.realizationDate);
					$('#notes').val(data.notes);
				},
			})
			$('#hold-assignment').modal();
		});
		

		//continue isDelete
		jQuery('#hold').click(function(event){
			event.preventDefault();
			var date=new Date();
			var isHold=true;
			var testId= $('#biodata-id option:selected').val();
			var deac={
					id:$('#id').val(),
					testId:{
						id:testId,
					},
					title:$('#title').val(),
					startDate:$('#startDate').val(),
					endDate:$('#endDate').val(),
					description:$('#description').val(),
					createdOn:$('#createdOn').val(),
					modifiedOn:$('#modifiedOn').val(),
					notes:$('#notes').val(),
					realizationDate:$('#realizationDate').val(),
					isHold:isHold,
			}
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/assignment/edit',
				type:'POST',
				beforeSend: function(){
					console.log(deac);
					console.log('contact server');
				},
				data:JSON.stringify(deac),
				headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
				success: function(data){
					console.log(data);
					alert('Data Assignment successfully hold');
					window.location='${pageContext.request.contextPath}/assignment'
				},
				error: function(){
					alert('Data Assignment failed to hold')
				}
			})
		});

		$('#table-user').DataTable();

	//logout event button
	$('#logout').click(function(event) {
		event.preventDefault();
		$('#logoutForm').submit();
	});
	
});
</script>
</html>