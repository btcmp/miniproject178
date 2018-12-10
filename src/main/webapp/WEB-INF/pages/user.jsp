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
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    Batch 178
                </a>
            </div>
            <div class="sidebar-wrapper">
                <ul class="nav">
                    <li class="active">
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
					<li><a href="${pageContext.request.contextPath }/batch">
							<i class="material-icons">list</i>
							<p>Batch</p>
					</a></li>
					<li><a href="${pageContext.request.contextPath }/class">
							<i class="material-icons">list</i>
							<p>Class</p>
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
                        <a class="navbar-brand" href="#"> User Datatable</a>
                    </div>
                    <div class="collapse navbar-collapse">
                        
                        <form class="navbar-form navbar-right" role="search">
                            <div class="form-group  is-empty">
                                <input type="text" class="form-control" placeholder="Search">
                                <span class="material-input"></span>
                            </div>
                            <button type="submit" class="btn btn-white btn-round btn-just-icon">
                                <i class="material-icons">search</i>
                                <div class="ripple-container"></div>
                            </button>
                        </form>
                    </div>
                </div>
            </nav>
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
                    <div class="col-lg-12 col-md-12">
                            <div class="card">
                                <div class="card-header" data-background-color="orange">
                                    <h4 class="title">List User</h4>
                                </div>
                                <div class="card-content table-responsive">
                                <form action="${pageContext.request.contextPath}/user/search" method="GET">
	                                <input type="search" id="searchUser" name="srcuser" placeholder="Search by Username" />
	                                <button type="submit" class="btn btn-sm btn-default">
	                                		<i class="material-icons"></i>Search
	                               	</button>
	                                <button type="button" id="tambahUser" class="btn btn-sm btn-primary">+</button>
                                </form>
                                    <table id="table-user" class="table table-hover">
                                        <thead class="text-warning">
                                            <th>Username</th>
                                            <th>Role</th>
                                            <th>Status</th>
                                            <th>Action</th>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="user" items="${users }">
                                            	<tr>
                                            		<td><c:out value="${user.username }"></c:out></td>
                                            		<td><c:out value="${user.role.name }"></c:out></td>
                       								<td>
                       									<c:choose>
                       										<c:when test="${user.active == true }">
                       											Active
                       										</c:when>
                       										<c:when test="${user.active == false }">
                       											Not Active
                       										</c:when>
                       									</c:choose>
                       								</td>
                       								<td>
                                            			<a id="${user.id }" class="btn-deactivate btn btn-danger btn-sm">Deactived</a>
                                            			<a id="${user.id }" class="btn-update btn btn-primary btn-sm">Edit</a>
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
        <!-- modal add user -->
        <div class="modal fade" id="addUser" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">User</h5>
				</div>
				<form action="${pageContext.request.contextPath }/user/save" method="POST">
					<div class="modal-body">
						<div class="form-group">
							<select id="roles" name="roles" class="form-control">
							  <option>--Select Role--</option>
							  <c:forEach items="${roles}" var="rol">
							  			<option value="${rol.id}">${rol.name}</option>
							  </c:forEach>
							</select>
						</div>
						<div class="form-group">
							<input type="text" id="username" class="form-control" placeholder="Username" />
						</div>
						<div class="form-group">
							<input type="password" id="password" class="form-control" placeholder="Password"/>
						</div>
						<div class="form-group">
							<input type="password" id="confirm_password" class="form-control" placeholder="Retype Password"/>
							<span id='message'></span>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="add-user" class="btn btn-primary">Add</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
			</div>
		</div>	
		<!-- modal deactivate user -->
        <div class="modal fade" id="deactivate-user" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
				<center>
					<h3 class="modal-title">Are You Sure to Deactivate this User?</h3>
				</center>
				</div>
				<form action="${pageContext.request.contextPath }/user/deactivate" method="POST">
					<div class="modal-body">
						<div class="form-group">
							<input type="hidden" id="id-user"/>
							<input type="hidden" id="password-user"/>
							<input type="hidden" id="createdOn-user"/>
							<input type="hidden" id="createdBy-user"/>
							<input type="hidden" id="role-user"/>
							<input type="hidden" id="name-user"/>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="deactivate-btn" class="btn btn-danger">Deactivate</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
			</div>
		</div>
		<!-- modal edit user -->
        <div class="modal fade" id="update-user" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
				<center>
					<h3 class="modal-title">User Edit</h3>
				</center>
				</div>
				<form action="${pageContext.request.contextPath }/user/update" method="POST">
					<div class="modal-body">
						<div class="form-group">
							<select id="roles2" name="roles2" class="form-control">
							  <option>--Select Role--</option>
							  <c:forEach items="${roles}" var="rol">
							  			<option value="${rol.id}">${rol.name}</option>
							  </c:forEach>
							</select>
						</div>
						<div class="form-group">
							<input type="text" id="name-user2" class="form-control" />
						</div>	
						<div class="form-group">
							<input type="password" id="new-password" class="form-control" placeholder="Input new password"/>
						</div>	
						<div class="form-group">
							<input type="password" id="new-confirm_password" class="form-control" placeholder="Retype new password"/>
							<span id='new-message'></span>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<label>Mobile Flag</label>
							</div>
							<div class="form-group col-md-6">
								<div class="radio">
									<label><input type="radio" name="optradio">true</label>
								</div>
								<div class="radio">
									<label><input type="radio" name="optradio">false</label>
								</div>						
							</div>
						</div>
						<div class="form-group">
							<input type="text" id="mobileToken" class="form-control" placeholder="Input Mobile Token"/>
						</div>	
							<input type="hidden" id="id-user2"/>
							<input type="hidden" id="createdOn-user2"/>
							<input type="hidden" id="createdBy-user2"/>
					</div>
					<div class="modal-footer">
						<button type="submit" id="update-btn" class="btn btn-primary">Update</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancel</button>
					</div>
				</form>
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
    	 
    	 $('#table-user').DataTable();
    	 
    	//logout event button
    	 $('#logout').click(function(event){
    		 event.preventDefault();
    		$('#logoutForm').submit();
    	 });
    	
    	//modal tambah user
 	    $('#tambahUser').click(function(event) {
 			event.preventDefault();
 			$('#addUser').modal();
 		});
    	
 	 	//modal deactivate user
 	    $('#deactivateUser').click(function(event) {
 			event.preventDefault();
 			$('#deactivate-user').modal();
 		});
    	
 	 	//Script buat confirm password
 	 	$('#password, #confirm_password').on('keyup', function () {
  			if ($('#password').val() == $('#confirm_password').val()) {
    				$('#message').html('Matching').css('color', 'green');
  			} else 
    			$('#message').html('Not Matching').css('color', 'red');
		});
 	 	
 	 	//Script buat confirm password update
 	 	$('#new-password, #new-confirm_password').on('keyup', function () {
  			if ($('#new-password').val() == $('#new-confirm_password').val()) {
    				$('#new-message').html('Matching').css('color', 'green');
  			} else 
    			$('#new-message').html('Not Matching').css('color', 'red');
		});
 	 	
 		//tambah user
   	    var button = jQuery('#add-user').click(function(event){
   								event.preventDefault();
   								var username = jQuery('#username').val();
   								var password = jQuery('#password').val();
   								var role = jQuery('#roles').val();
   								var active = 1;
   								var enabled = 1;
   								var user = {
   										username:username,
   										password:password,
   										role:{
   											id:role
   										},
   										enabled:enabled,
   										active:active
   								}
   	
   								jQuery.ajax({
   									url : '${pageContext.request.contextPath}/user/save',
   									type:'POST',
   										beforeSend:function(){
   											console.log(user);
   											console.log('mau contact server');
   										},
   									contentType: 'application/json',
   									data: JSON.stringify(user),
   									success : function(data){
   										console.log('data dari server');
   										console.log(data);
   										window.location='${pageContext.request.contextPath}/user'
   										alert("Data User berhasil ditambahkan")
   									},
   									error : function(data){
   										alert("data tidak boleh kosong")
   									}
   								});
   								
   			});
 		//deactivate-confirm
 		$(".btn-deactivate").on('click', function(){
    		 var id = $(this).attr('id');
    		 $.ajax({
    			 url : '${pageContext.request.contextPath}/user/get/'+ id,
    			 type: 'GET',
    			 success : function(data){
    				 $('#id-user').val(data.id);
    				 $('#name-user').val(data.username);
    				 $('#password-user').val(data.password);
    				 $('#createdOn-user').val(data.createdOn);
    				 $('#role-user').val(data.role.id);
    				 $('#createdBy-user').val(data.createdBy);
    			 },
    			 dataType: 'json'
    		 })
    		 
    		$('#deactivate-user').modal();
    	 });
 		
   		//deactivate user
   	    var button = jQuery('#deactivate-btn').click(function(event){
   								event.preventDefault();
   								var active = 0;
   								var enabled = 0;
   								var modifiedOn = new Date();
   								var id = jQuery('#id-user').val();
   								var username = jQuery('#name-user').val();
   								var password = jQuery('#password-user').val();
   								var createdOn = jQuery('#createdOn-user').val();
   								var createdBy = jQuery('#createdBy-user').val();
   								var role = jQuery('#role-user').val();
   								var user = {
   										id:id,
   										role:{
   											id:role
   										},
   										username:username,
   										password:password,
   										createdOn:createdOn,
   										createdBy:createdBy,
   										modifiedOn:modifiedOn,
   										enabled:enabled,
   										active:active
   								}
   	
   								jQuery.ajax({
   									url : '${pageContext.request.contextPath}/user/deactivate',
   									type:'POST',
   										beforeSend:function(){
   											console.log(user);
   											console.log('mau contact server');
   										},
   									contentType: 'application/json',
   									data: JSON.stringify(user),
   									success : function(data){
   										console.log('data dari server');
   										console.log(data);
   										window.location='${pageContext.request.contextPath}/user'
   										alert("User berhasil deactivate")
   									}
   								});
   								
   			});
   		//update-confirm
 		$(".btn-update").on('click', function(){
    		 var id = $(this).attr('id');
    		 $.ajax({
    			 url : '${pageContext.request.contextPath}/user/get/'+ id,
    			 type: 'GET',
    			 success : function(data){
    				 $('#id-user2').val(data.id);
    				 $('#name-user2').val(data.username);
    				 $('#password-user2').val(data.password);
    				 $('#createdOn-user2').val(data.createdOn);
    				 $('#role-user2').val(data.role.id);
    				 $('#createdBy-user2').val(data.createdBy);
    			 },
    			 dataType: 'json'
    		 })
    		 
    		$('#update-user').modal();
    	 });
 		
   		//update user
   	    var button = jQuery('#update-btn').click(function(event){
   								event.preventDefault();
   								var active = 1;
   								var enabled = 1;
   								var modifiedOn = new Date();
   								var id = jQuery('#id-user2').val();
   								var username = jQuery('#name-user2').val();
   								var password = jQuery('#new-password').val();
   								var createdOn = jQuery('#createdOn-user2').val();
   								var createdBy = jQuery('#createdBy-user2').val();
   								var role = jQuery('#roles2').val();
   								var user = {
   										id:id,
   										role:{
   											id:role
   										},
   										username:username,
   										password:password,
   										createdOn:createdOn,
   										createdBy:createdBy,
   										modifiedOn:modifiedOn,
   										enabled:enabled,
   										active:active
   								}
   	
   								jQuery.ajax({
   									url : '${pageContext.request.contextPath}/user/update',
   									type:'POST',
   										beforeSend:function(){
   											console.log(user);
   											console.log('mau contact server');
   										},
   									contentType: 'application/json',
   									data: JSON.stringify(user),
   									success : function(data){
   										console.log('data dari server');
   										console.log(data);
   										window.location='${pageContext.request.contextPath}/user'
   										alert("User berhasil update")
   									},
   									error : function(data){
   										alert("data tidak boleh kosong")
   									}
   								});
   								
   			});
    });
    
</script>

</html>