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
					<li class="active"><a href="${pageContext.request.contextPath }/monitoring"> 
						<i class="material-icons">work</i>
						<p>Monitoring</p>
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
						<a class="navbar-brand" href="#"> MONITORING TABLE </a>
					</div>
				</div>
			</nav>
			
			<div class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<div class="card">
								<div class="card-header" data-background-color="orange">
									<h4 class="title">Idle Monitoring</h4>
									<p class="category">
								</div>
					
	                           	<div class="card-content table-responsive">
	                           		<form action="${pageContext.request.contextPath }/monitoring">
	                           			<input type="search" id="search" placeholder="Search by Name"/>
	                           			<button type="button" id="tambahMonitoring" class="btn btn-sm btn-primary"> + </button>
                       				</form>
	                     		</div>
								
								<div class="card-content table-responsive">
									<table id="table-user" class="table table-hover">
										<thead class="text-warning">
											<th>NAME</th>
											<th>IDLE DATE</th>
											<th>PLACEMENT DATE</th>
											<th>ACTION</th>
										</thead>
										<tbody>
											<c:forEach var="monitoring" items="${monitorings }">
												<tr>
													<td><c:out value="${monitoring.testId.name }"></c:out></td>
													<td><c:out value="${monitoring.idleDate }"></c:out></td>
													<td><c:out value="${monitoring.placementDate }"></c:out></td>
													<td>
														<button id="${monitoring.id }" type="button" rel="tooltip" title="Edit ${monitoring.testId.name }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button id="${monitoring.id }" type="button" rel="tooltip" title="Placement ${monitoring.testId.name }" class="btn btn-warning btn-simple btn-xs btn-placement">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button id="${monitoring.id }" type="button" rel="tooltip" title="Deactive ${monitoring.testId.name }" class="btn btn-danger btn-simple btn-xs btn-delete">
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
	<div class="modal fade" id="addMonitoring" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Input Idle</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		<input type="hidden" id="action" value="add">
		     		<input type="hidden" name="createdOn" id="createdOn"/>
		     		
		     		<form action="${pageContext.request.contextPath }/monitoring/save" method="POST">
				      	<div class="form-group">
							<select class="form-control" id="biodata-id" name="testId">
								<c:forEach items="${biodatas }" var="biodata">
									<option value="${biodata.id }">${biodata.name }</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<input type="text" id="idleDate" class="form-control" placeholder="Idle Date">
						</div>
						
						<div class="form-group">
							<input type="text" id="lastProject" class="form-control" placeholder="Last Project At" />
						</div>
						<div class="form-group">
							<input type="text" id="idleReason" class="form-control" placeholder="Idle Reason" />
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
	<div class="modal fade" id="addPlacement" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Input Placement</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/monitoring/placement" method="POST">
		     			<input type="hidden" name="id" id="id"/>
		     			<input type="hidden" name="createdOn" id="createdOn"/>
						<div class="form-group">
							<input type="text" id="placementDate" class="form-control" placeholder="Placement Date"/>
						</div>
						<div class="form-group">
							<input type="text" id="placementAt" class="form-control" placeholder="Placement At" />
						</div>
						<div class="form-group">
							<input type="text" id="notes" class="form-control" placeholder="Notes" />
						</div>	
						
						<div class="modal-footer">
							<button type="submit" id="saving-placement" class="btn btn-primary">Save</button>
							<button type="submit" id="canceling-placement" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
						</div>
						
					</form>
		     	 </div>
		    </div>
		</div>
	</div>

<!-- Modal3 Deactive-->
	<div class="modal fade" id="deactive-monitoring" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header text-center">
					<h3 class="modal-title w-100 font-weight-bold">Sure to delete this???</h3>
				</div>
		     	
		     	<div class="modal-body">
		     		
		     		<form action="${pageContext.request.contextPath }/monitoring/edit" method="POST">
						<div class="modal-footer text-center">
							<button type="submit" id="deactive" class="btn btn-primary">Yes</button>
							<button type="submit" id="canceled-deactive" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
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
		$('#idleDate').val("");
		$('#lastProject').val("");
		$('#idleReason').val("");
		$('#createdOn').val("");
		$('#placementDate').val("");
		$('#placementAt').val("");
		$('#notes').val("");
	}

	$(document).ready(function(){
		//modal1
		$('#tambahMonitoring').click(function(event) {
			event.preventDefault();
			$('#action').val('add');
			formEmpty();
			$('#addMonitoring').modal();
		});
		
		//setting up datepicker idleDate
		$('#idleDate').datepicker({
	   		format: 'yyyy-mm-dd',
	    	autoclose: true
		});
		
		//setting up datepicker placementDate
		$('#placementDate').datepicker({
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
				var idleDate=jQuery('#idleDate').val();
				var lastProject=jQuery('#lastProject').val();
				var idleReason=jQuery('#idleReason').val();
				
				var idle={
	 					testId:{
	 						id:testId,
	 					},
						idleDate:idleDate,
						lastProject:lastProject,
						idleReason:idleReason,
						createdOn:date
				};
				
				jQuery.ajax({
					url:'${pageContext.request.contextPath}/monitoring/save',
					type:'POST',
					beforeSend: function(){
						console.log(idle);
						console.log('contact server');
					},
					contentType:'application/json',
					data:JSON.stringify(idle),
					success: function(data){
						console.log(data);
						alert('Idle berhasil ditambahkan');
						window.location='${pageContext.request.contextPath}/monitoring'
					}
				});
			}
			else{
				var editidle={
						id:$('#id').val(),
						testId:{
							id:testId,
						},
						placementDate:$('#placementDate').val(),
						placementAt:$('#placementAt').val(),
						notes:$('#notes').val(),
						idleDate:$('#idleDate').val(),
						lastProject:$('#lastProject').val(),		
						idleReason:$('#idleReason').val(),
						createdOn:$('#createdOn').val(),
						modifiedOn:date
				};
				
				jQuery.ajax({
					url:'${pageContext.request.contextPath}/monitoring/edit',
					type:'POST',
					beforeSend: function(){
						console.log(editidle);
						console.log('contact server');
					},
					contentType:'application/json',
					data:JSON.stringify(editidle),
					success: function(data){
						console.log(data);
						alert('Edit idle berhasil');
						window.location='${pageContext.request.contextPath}/monitoring';
					}
				})
			}
		});
		
		//get id
		jQuery('.btn-placement').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/monitoring/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#testId').val(data.testId);
					$('#idleDate').val(data.idleDate);
					$('#lastProject').val(data.lastProject);
					$('#idleReason').val(data.idleReason);
					$('#createdOn').val(data.createdOn);
					$('#placementDate').val(data.placementDate);
					$('#placementAt').val(data.placementAt);
					$('#notes').val(data.notes);
				},
			})
			$('#addPlacement').modal();
		})
		
		//saving placement
		jQuery('#saving-placement').click(function(event){
			event.preventDefault();
			var date=new Date();
			var testId= $('#biodata-id option:selected').val();
			
			var placement={
					id:$('#id').val(),
					testId:{
						id:testId,
					},
					placementDate:$('#placementDate').val(),
					placementAt:$('#placementAt').val(),
					notes:$('#notes').val(),
					idleDate:$('#idleDate').val(),
					lastProject:$('#lastProject').val(),		
					idleReason:$('#idleReason').val(),
					createdOn:$('#createdOn').val(),
					modifiedOn:date
			};
			
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/monitoring/edit',
				type:'POST',
				beforeSend: function(){
					console.log(placement);
					console.log('contact server');
				},
				contentType:'application/json',
				data:JSON.stringify(placement),
				success: function(data){
					console.log(data);
					alert('Placement berhasil ditambahkan');
					window.location='${pageContext.request.contextPath}/monitoring'
				}
			});
		});
 
		
		//get id edit
		jQuery('.btn-edit').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			var action=('edit');
			
			$.ajax({
				url : '${pageContext.request.contextPath}/monitoring/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#action').val(action);
					$('#testId').val(data.testId);
					$('#idleDate').val(data.idleDate);
					$('#lastProject').val(data.lastProject);
					$('#idleReason').val(data.idleReason);
					$('#createdOn').val(data.createdOn);
					$('#placementDate').val(data.placementDate);
					$('#placementAt').val(data.placementAt);
					$('#notes').val(data.notes);
				},
			})
			$('#addMonitoring').modal();
		})

		//nonactive
		jQuery('.btn-delete').click(function(event){
			event.preventDefault();
			var id=$(this).attr('id');
			$.ajax({
				url : '${pageContext.request.contextPath}/monitoring/get/'+ id,
				type :'GET',
				dataType:'json',
				success : function(data){
					$('#id').val(data.id);
					$('#testId').val(data.testId);
					$('#idleDate').val(data.idleDate);
					$('#lastProject').val(data.lastProject);
					$('#idleReason').val(data.idleReason);
					$('#createdOn').val(data.createdOn);
					$('#placementDate').val(data.placementDate);
					$('#placementAt').val(data.placementAt);
					$('#notes').val(data.notes);
					$('#isDelete').val(data.isDelete);
				},
			})
			$('#deactive-monitoring').modal();
		})
		
		//continue deactive
		jQuery('#deactive').click(function(event){
			event.preventDefault();
			var datemodif=new Date();
			var isDelete=false;
			var testId= $('#biodata-id option:selected').val();
			var moni={
					id:$('#id').val(),
					testId:{
						id:testId,
					},
					placementDate:$('#placementDate').val(),
					placementAt:$('#placementAt').val(),
					notes:$('#notes').val(),
					idleDate:$('#idleDate').val(),
					lastProject:$('#lastProject').val(),		
					idleReason:$('#idleReason').val(),
					createdOn:$('#createdOn').val(),
					modifiedOn:$('#modifiedOn').val(),
					createdOn:$('#createdOn').val(),
					deleteOn:datemodif,
					isDelete:isDelete
			}
			jQuery.ajax({
				url:'${pageContext.request.contextPath}/monitoring/edit',
				type:'POST',
				beforeSend: function(){
					console.log(moni);
					console.log('contact server');
				},
				data:JSON.stringify(moni),
				headers: { 
			        'Accept': 'application/json',
			        'Content-Type': 'application/json' 
			    },
				success: function(data){
					console.log(data);
					alert('idle berhasil dideactivekan');
					window.location='${pageContext.request.contextPath}/monitoring'
				}
			})
		})

		$('#table-user').DataTable();

	//logout event button
	$('#logout').click(function(event) {
		event.preventDefault();
		$('#logoutForm').submit();
	});
	
});
</script>
</html>