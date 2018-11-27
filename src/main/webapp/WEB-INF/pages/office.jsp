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
                    <li><a href="${pageContext.request.contextPath }/biodata"> 
						<i class="material-icons">person</i>
						<p>Biodata</p>
					</a></li>
					<li class="active">
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
                        <a class="navbar-brand" href="#"> Office Datatable </a>
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
	                                    <h4 class="title">Office</h4>
	                                </div>
	                             	<div class="card-content table-responsive">
	                             	<form action="${pageContext.request.contextPath }/office">
									<input type="search" name="name" placeholder="Search by Name"/>
									<button type="button" id="tambahOffice" class="btn btn-sm btn-primary"> + </button>
								</form>
	            
                                <div class="card-content table-responsive">
                                    <table id="table-user" class="table table-hover">
                                        <thead class="text-warning">
                                            <th>NAME</th>
                                            <th>CONTACT</th>
                                            <th>STATUS</th>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="office" items="${offices }">
                                            	<tr>
                                            		<td><c:out value="${office.name }"></c:out></td>
                                            		<td><c:out value="${office.phone }"></c:out></td>
                                            		<td><c:out value="${office.active }"></c:out></td>
                                            		<td>
                                            			<a id="${dept.id }" href="#" class="btn-hapus btn btn-danger btn-sm">Delete</a>
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
    
	<!-- Modal OFFICE  -->
		<div class="modal fade" id="addOffice" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
	  aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header text-center">
	        <h3 class="modal-title w-100 font-weight-bold">ADD OFFICE</h3>
	      </div>
		      
		      <div class="modal-body">
			      <form:form commandName = "officeForm" action="${pageContext.request.contextPath }/office/save" method="POST">
			      <div class="form-group">
			      	<form:input type="text" path="name" class="form-control" placeholder="Name"/>
			      </div>
			      
			      <div class="form-group">
			      	<form:input type="text" path="phone" class="form-control" placeholder="Phone"/>       	
			      </div>
			       
			      <div class="form-group"> 	
			       	<form:input type="text" path="email" class="form-control" placeholder="Email"/>      	
			      </div>
			      
			      <div class="form-group">
			       	<form:input type="text" path="address" class="form-control" placeholder="Address"/>
			      </div> 	
			       	       	
			      <div class="form-group"> 	
			       	<form:input type="textarea" path="notes" class="form-control" placeholder="Description"/>
			      </div>	
		       	<form:button type="button" id="tambahRoom" class="btn btn-warning">+ROOM</form:button></br></br>
		       
		       	<div class="card-content table-responsive">
	               <table id="table-user" class="table table-hover">
	                   <thead class="text-warning">
	                       <th>CODE</th>
	                       <th>NAME</th>
	                       <th>CAPACITY</th>
	                       <th> </th>
	                   </thead>
	                 </table>
	             </div>
		      
		      </div>
		      <div class="modal-footer">
		        <form:button type="submit" id="submit" class="btn btn-primary" >Save</form:button>
		        <form:button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</form:button>
		      </div>
		      </form:form>
		    </div>
		  </div>
		</div>
		
	
	<!-- Modal ROOM -->
		<div class="modal fade" id="addRoom" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<h3 class="modal-title w-100 font-weight-bold">ADD ROOM</h3>
					</div>
					<div class="modal-body">
					
					<div class="modal-body">
				      <form action="">
				      <div class="form-group">
				      	<input type="text" name="code" class="form-control" placeholder="Code"/>
				      </div>
				      
				      <div class="form-group">
				      	<input type="text" name="name" class="form-control" placeholder="Name"/>       	
				      </div>
				       
				      <div class="form-group"> 	
				       	<input type="text" name="capacity" class="form-control" placeholder="Capacity"/>      	
				      </div>
				      
				      <div class="form-group"> 	
				     	Any Projector? &nbsp;
				     	<input type="radio" name="active" value="1" >True   &nbsp;
				       	<input type="radio" name="active" value="0" >False </br>
				      </div>
				      
				      <div class="form-group"> 	
				       	<input type="text" name="description" class="form-control" placeholder="Description"/>      	
				      </div>
				      
					</div>
					<div class="modal-footer">
						<button type="button" id="saveRoom" class="btn btn-primary">Add</button>
						<button type="button" id="cancelRoom" class="btn btn-secondary"
							data-dismiss="modal">Cancel</button>

					</div>
				</div>
			</div>
		</div></body>
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
    $(document).ready(function() {
    	//setting up datepicker
    	$('#birthDate123').datepicker();
    	
    	 function ajaxSetUp(){
    		 var token = $("meta[name='_csrf']").attr("content");
    		  var header = $("meta[name='_csrf_header']").attr("content");
    		  $(document).ajaxSend(function(e, xhr, options) {
    		    xhr.setRequestHeader(header, token);
    		  });
    	 }
    	 
    	 $('#table-user').DataTable();
    	 
    	 $('.btn-hapus').on('click', function(){
    		 var conf = confirm("Are you sure delete this data ?");
    		 if(conf == true){
    			 var id = $(this).attr("id");
    			 
    			 ajaxSetUp();
    			 $.ajax({
    				 url : '${pageContext.request.contextPath}/department/delete/'+id,
    				 type: 'DELETE',
    				 success: function(data){
    					 window.location = "${pageContext.request.contextPath}/department";
    				 }, error : function(){
    					 alert('delete data failed..!!');
    				 }
    			 });
    		 }
    		 
    		 return false;
    	 });
    	 
    	//logout event button
    	 $('#logout').click(function(event){
    		 event.preventDefault();
    		$('#logoutForm').submit();
    	 });
    	
    	$('#tambahOffice').click(function(event){
    		event.preventDefault();
    		$('#addOffice').modal();
    	});
    	
    	$('#tambahRoom').click(function(event){
    		event.preventDefault();
    		$('#addOffice').modal('hide');
    		$('#addRoom').modal();
    	});
    	$('#cancelRoom').click(function(event){
    		event.preventDefault();
    		$('#addOffice').modal('show');
    		$('#addRoom').modal('hide');
    		
    	});
    	
    });
</script>

</html>