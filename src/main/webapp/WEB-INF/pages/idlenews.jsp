<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
    <meta name="_csrf" content="${_csrf.token}"/>
    <!-- default header name is X-CSRF-TOKEN -->
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
    <!-- Bootstrap core CSS     -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" rel="stylesheet" />
    <!--  Material Dashboard CSS    -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/material-dashboard.css?v=1.2.0" rel="stylesheet" />
    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/demo.css" rel="stylesheet" />
    <link href="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.min.css" rel="stylesheet" />
    <!--     Fonts and icons     -->
    <link href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css" rel="stylesheet">
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons' rel='stylesheet' type='text/css'>
	<style>
		input.parsley-error
		{
		  color: #B94A48 !important;
		  background-color: #F2DEDE !important;
		  border: 1px solid #EED3D7 !important;
		}
		
	</style>
</head>
<body>
    <div class="wrapper">
        <div class="sidebar" data-color="purple" data-image="${pageContext.request.contextPath}/resources/assets/img/sidebar-1.jpg">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
    <!-- logo samping -->
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    BATCH 178
                </a>
            </div>
            <div class="sidebar-wrapper">
                <ul class="nav">
                    <li>
                        <a href="dashboard.html">
                            <i class="material-icons">dashboard</i>
                            <p>Dashboard</p>
                        </a>
                    </li>
                    <li><a href="${pageContext.request.contextPath }/department">
						<i class="material-icons">library_books</i>
						<p>Department</p>
					</a></li>
                    <li>
                        <a href="${pageContext.request.contextPath}/employee">
                             <i class="material-icons">bubble_chart</i>
                            <p>Employee</p>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/account">
                            <i class="material-icons">person</i>
                            <p>User Account</p>
                        </a>
                    </li>
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
                            <i class="material-icons">meeting_room</i>
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
                    <li class="active">
                        <a href="${pageContext.request.contextPath }/idlenews">
                            <i class="material-icons">chat</i>
                            <p>Idle News</p>
                        </a>
                    </li>
                    <li>
					<li><a href="${pageContext.request.contextPath }/question">
							<i class="material-icons">library_books</i>
							<p>Questions</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/technology">
							<i class="material-icons">library_books</i>
							<p>Technology</p>
					</a></li>
                    <li>
                        <a href="#" id="logout">
                            <i class="material-icons">block</i>
                            <p>Logout</p>
                        </a>
                    </li>
                    <form action="${logoutUrl}" method="post" id="logoutForm">
					  <input type="hidden"
						name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					</form>
                </ul>
            </div>
        </div>
        
        <!-- logo atas -->
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
                        <a class="navbar-brand" href="#"> Idle News Datatable </a>
                    </div>
                    <div class="collapse navbar-collapse">
                    </div>
                </div>
            </nav>
            
           <!--  ISI -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
	                    <div class="col-lg-12 col-md-12">
			                   <c:if test="${not empty message}">
									<div  class="alert alert-info" >
										<c:out value="${message }"></c:out>
									</div>	
								</c:if> 
	                            <div class="card">
	                                <div class="card-header" data-background-color="orange">
	                                    <h4 class="title">Idle News</h4>
	                                </div>
	                             	<div class="card-content table-responsive">
	                             	
	                             	<form action="${pageContext.request.contextPath }/bootcamp/src" method = "GET">
										<input type="text" id= "searchBootcamp" name="srctext" placeholder="Search by Name"/>
										<button type="submit" class="btn btn-sm btn-default"/>
                                			<i class="material-icons">search</i>
										<button type="button" id="tambah-bootcamp" class="btn btn-sm btn-primary"> +Add </button>
									 </form>
									 
	            				</div>
                                <div class="card-content table-responsive">
                                    <table id="table-user" class="table table-hover">
                                        <thead class="text-warning">
                                            <th>TITLE</th>
                                            <th>CATEGORY</th>
                                            <th></th>
                                        </thead>
                                        <tbody id="list-bootcamp">
                                            <c:forEach items = "${bootcamps }" var="bootcamp">
                                            	<tr>
                                            		<td><c:out value="${bootcamp.name }"></c:out></td>
                                            		<td><c:out value="${bootcamp.createdBy }"></c:out></td>
                                            		<td>
                                            		<c:choose>
													    <c:when test="${bootcamp.active=='0'}">
													        non active
													    </c:when>    
													    <c:otherwise>
													        active
													    </c:otherwise>
													</c:choose>
													</td>
	                                            	<td>
	                                            		<button type="button" rel="tooltip" title="Edit" value="${bootcamp.id }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button type="button" rel="tooltip" title="Deactive" value="${bootcamp.id }" class="btn btn-danger btn-simple btn-xs btn-delete">
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
                            <li>
                                <a href="#">
                                    Home
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Company
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Portfolio
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Blog
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <p class="copyright pull-right">
                        &copy;
                        <script>
                            document.write(new Date().getFullYear())
                        </script>
                        <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
                    </p>
                </div>
            </footer>
        </div>
    </div>
    
	<!-- Modal ADD BOOTCAMP  -->
		<div class="modal fade" id="add-bootcamp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
	  aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header text-center">
	        <h3 class="modal-title w-100 font-weight-bold">ADD DATA</h3>
	      </div>
		      
		      <div class="modal-body">
			      <form  action="#" id="form-bootcamp" method="POST">
			      	<input type="hidden" id="action" value="add"/>
			      	<input type="hidden" id="id" />
			      
			      <div class="form-group">
			      	<input type="text" id="name" class="form-control" placeholder="Name"/>
			      </div>
			      
			      <div class="form-group">
			      	<textarea type="text" id="notes" class="form-control" placeholder="Notes"></textarea>      	
			      </div>
			       
			       	       	
		      <div class="modal-footer">
			        <button type="submit" id="submit-bootcamp" class="btn btn-primary">Save</button>
			        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
		      </div>
		      </form>
		    </div>
		  </div>
		</div>
		</div>

		<!-- Modal DEACTIVE BOOTCAMP  -->
		<div class="modal fade" id="deactive-bootcamp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<h3 class="modal-title w-100 font-weight-bold">Deactive Data???</h3>
					</div>

					<div class="modal-body text-center">
						<form action="${pageContext.request.contextPath }/bootcamp/update" method="POST">
							
							<button type="submit" id="deactive-yes" class="btn btn-primary">YES</button>
							<button type="button" class="btn btn-secondary" data-dismiss="modal">NO</button>
							</form>
					</div>
					
				</div>
			</div>
		</div>
	</body>
<!--   Core JS Files   -->
<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/resources/assets/js/material.min.js" type="text/javascript"></script>
<!--  Charts Plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/chartist.min.js"></script>
<!--  Dynamic Elements plugin -->
<script src="${pageContext.request.contextPath}/resources/assets/js/arrive.min.js"></script>
<!--  PerfectScrollbar Library -->
<script src="${pageContext.request.contextPath}/resources/assets/js/perfect-scrollbar.jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/assets/datepicker/dist/datepicker.js"></script>
<!--  Notifications Plugin    -->
<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap-notify.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/parsley.js/2.8.0/parsley.min.js"></script>
<!-- Material Dashboard javascript methods -->
<script src="${pageContext.request.contextPath}/resources/assets/js/material-dashboard.js?v=1.2.0"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" />
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js" />
<!-- Material Dashboard DEMO methods, don't include it in your project! -->
<script src="${pageContext.request.contextPath}/resources/assets/js/demo.js"></script>
<script type="text/javascript">

		//add data btcmp
		jQuery(document).ready(function(){
			$('#submit-bootcamp').click(function(event){
				event.preventDefault();
			//event listener on click
			var action = $('#action').val();
			var name = jQuery('#name').val();
			var notes = jQuery('#notes').val();
			var id = jQuery('#id').val();
			var date = new Date;
			
			var bootcamp = {
					id : id,
					name : name,
					notes : notes,
					createdOn : date
					
			};
			console.log(bootcamp);
			
			
			if (action == "add") {
				jQuery.ajax({
					url: '${pageContext.request.contextPath}/bootcamp/save',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(bootcamp),
					success : function(data){
						alert('Data Berhasil di Add')
						window.location = '${pageContext.request.contextPath}/bootcamp'
					},error: function(){
						alert('Add Data Failed');
					}
				})  
			}else{
				jQuery.ajax({
					url: '${pageContext.request.contextPath}/bootcamp/update',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(bootcamp),
					success : function(data){
						alert('Data Berhasil di Add')
						window.location = '${pageContext.request.contextPath}/bootcamp'
					},error: function(){
						alert('Add Data Failed');
					}
				})   
			}
			
		});
		
			//button edit data bootcamp
			$(".btn-edit").on('click', function(){
	    		 var id = $(this).val();
	    		 var action = ('edit');
	    		 $.ajax({
	    			 url : '${pageContext.request.contextPath}/bootcamp/editui/'+ id,
	    			 type: 'GET',
	    			 dataType: 'json',
	    			 success : function(data){
	    				 $('#action').val(action);
	    				 $('#id').val(data.id);
	    				 $('#name').val(data.name);
	    				 $('#notes').val(data.notes);
	    			 }, 
	    		 })
	    		$('#add-bootcamp').modal();
	    	 });
			
			//deactive
			$(".btn-delete").on('click', function(){
	    		 var id = $(this).val();
	    		 $.ajax({
	    			 url : '${pageContext.request.contextPath}/bootcamp/delete/'+ id,
	    			 type: 'GET',
	    			 dataType: 'json',
	    			 success : function(data){
	    				 $('#id').val(data.id);
	    				 $('#name').val(data.name);
	    				 $('#notes').val(data.notes);
	    			 }, 
	    		 })
	    		$('#deactive-bootcamp').modal();
	    	 });
			
			$('#deactive-yes').click(function(event){
				event.preventDefault();
			//event listener on click
			var name = jQuery('#name').val();
			var notes = jQuery('#notes').val();
			var id = jQuery('#id').val();
			var date = new Date;
			
			var btcmp = {
					id : id,
					name : name,
					notes : notes,
					createdOn : date
					
			};
				jQuery.ajax({
					url: '${pageContext.request.contextPath}/bootcamp/update',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(btcmp),
					success : function(data){
						alert('Deactive Berhasil')
						window.location = '${pageContext.request.contextPath}/bootcamp'
					},error: function(){
						alert('Gagal Deactive');
					}
				})   
			
		});
		});
	
	function clearAllForm(formId){
		$(formId).trigger("reset");
	}
	
    $(document).ready(function() {
    	
    	 $('#table-user').DataTable();
    	 	 
    	//logout event button
    	 $('#logout').click(function(event){
    		 event.preventDefault();
    		$('#logoutForm').submit();
    	 });
    	
    	$('#tambah-bootcamp').click(function(event){
    		event.preventDefault();
    		clearAllForm('#form-bootcamp');
    		$('#add-bootcamp').modal();
    		$('#action').val('add');
    	});
    });
</script>

</html>