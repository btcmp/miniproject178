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
                      <li class="active">
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
	                             	
	                             	<form action="${pageContext.request.contextPath }/idlenews/src" method = "GET">
										<input type="text" id= "searchIdlenews" name="srctext" placeholder="Search by Title"/>
										<button type="submit" class="btn btn-sm btn-default"/>
                                			<i class="material-icons">search</i>
										<button type="button" id="tambah-idle" class="btn btn-sm btn-primary"> +Add </button>
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
                                            <c:forEach items = "${idlenews }" var="idle">
                                            	<tr>
                                            		<td><c:out value="${idle.title }"></c:out></td>
                                            		<td><c:out value="${idle.category.name }"></c:out></td>
                                            		
	                                            	<td>
	                                            		<button type="button" rel="tooltip" title="Edit" value="${idle.id }" class="btn btn-success btn-simple btn-xs btn-edit">
										                    <i class="fa fa-edit"></i>
										                </button>
										                <button type="button" rel="tooltip" title="Publish" value="${idle.id }" class="btn btn-primary btn-simple btn-xs btn-publish">
										                    <i class="fa fa-check"></i>
										                </button>
										                <button type="button" rel="tooltip" title="Deactive" value="${idle.id }" class="btn btn-danger btn-simple btn-xs btn-delete">
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
		<div class="modal fade" id="add-idle" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
	  aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header text-center">
	        <h3 class="modal-title w-100 font-weight-bold">ADD DATA</h3>
	      </div>
		      
		      <div class="modal-body">
			      <form  action="#" id="form-idle" method="POST">
			      	<input type="hidden" id="action" value="add"/>
			      	<input type="hidden" name="createdOn" id="createdOn"/>
			      	<input type="hidden" id="id" />
			      	<input type="hidden" id="publish" name="isPublish" value="false">
			      
			      <div class="form-group">
			      	<input type="text" id="title" class="form-control" placeholder="Title"/>
			      </div>
			      
			      <div class="form-group">
			      	<select class="form-control" id="category" name="category.id">
			      		<option>-- Select Category --</option>
							<c:forEach items="${categorys}" var="cat">
								<option value="${cat.id }">${cat.name }</option>
							</c:forEach>
					</select><br>
			      </div>
			      			      
			      <div class="form-group">
			      	<textarea type="text" id="content" class="form-control" placeholder="Content"></textarea>      	
			      </div>
			       
			       	       	
		      <div class="modal-footer">
			        <button type="submit" id="submit-idle" class="btn btn-primary">Save</button>
			        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
		      </div>
		      </form>
		    </div>
		  </div>
		</div>
		</div>

		<!-- Modal PUBLISH BOOTCAMP  -->
		<div class="modal fade" id="publish-idle" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<h3 class="modal-title w-100 font-weight-bold">Are you sure Publish Data???</h3>
					</div>
					
					<div class="modal-body text-center">
						<form action="${pageContext.request.contextPath }/idlenews/update" method="POST">
							<button type="submit" id="publish-yes" class="btn btn-primary">YES</button>
							<button type="button" class="btn btn-secondary" data-dismiss="modal">NO</button>
							</form>
					</div>
					
				</div>
			</div>
		</div>

		<!-- Modal DEACTIVE BOOTCAMP  -->
		<div class="modal fade" id="delete-idle" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<h3 class="modal-title w-100 font-weight-bold">Deactive Data???</h3>
					</div>

					<div class="modal-body text-center">
						<form action="${pageContext.request.contextPath }/bootcamp/update" method="POST">
							
							<button type="submit" id="delete-yes" class="btn btn-primary">YES</button>
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
			$('#submit-idle').click(function(event){
				event.preventDefault();
			//event listener on click
			var action = $('#action').val();
			var title = jQuery('#title').val();
			var content = jQuery('#content').val();
			var id = jQuery('#id').val();
			var catId = $('#category option:selected').val();
			var date = new Date;
			
			var cat = {
					id : id,
					title : title,
					content : content,
					category : {
						id: catId
					},
					createdOn : date
					
			};
			console.log(cat);
			
			
			if (action == "add") {
				jQuery.ajax({
					url: '${pageContext.request.contextPath}/idlenews/save',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(cat),
					success : function(data){
						alert('Data Berhasil di Add')
						window.location = '${pageContext.request.contextPath}/idlenews'
					},error: function(){
						alert('Masukkan data lengkap!');
					}
				})  
			}else{
				var editCat={
						id:$('#id').val(),
						category:{
							id:catId,
						},
						content:$('#content').val(),
						title:$('#title').val(),
						createdOn:$('#createdOn').val(),
						modifiedOn:date
				};
			 jQuery.ajax({
					url: '${pageContext.request.contextPath}/idlenews/update',
					type : 'POST',
					beforeSend: function(){
						console.log(editCat);
						console.log('contact server');
					},
					contentType : 'application/json',
					data : JSON.stringify(editCat),
					success : function(data){
						alert('Data Berhasil di Add')
						window.location = '${pageContext.request.contextPath}/idlenews'
					},error: function(){
						alert('Edit Data Failed');
					}
				})    
			}
			
		});
		
			//button edit data bootcamp
			$(".btn-edit").on('click', function(){
	    		 var id = $(this).val();
	    		 var action = ('edit');
	    		 $.ajax({
	    			 url : '${pageContext.request.contextPath}/idlenews/get/'+ id,
	    			 type: 'GET',
	    			 dataType: 'json',
	    			 success : function(data){
	    				 $('#action').val(action);
	    				 $('#id').val(data.id);
	    				 $('#title').val(data.title);
	    				 $('#content').val(data.content);
	    				 $('#createdOn').val(data.createdOn);
	    				 $('#category').val(data.catId);
	    			 }, 
	    		 })
	    		$('#add-idle').modal();
	    	 });
			
			//publish
			$(".btn-publish").on('click', function(){
	    		 var id = $(this).val();
	    		 $.ajax({
	    			 url : '${pageContext.request.contextPath}/idlenews/publish/'+ id,
	    			 type: 'GET',
	    			 dataType: 'json',
	    			 success : function(data){
	    				 $('#id').val(data.id);
	    				 $('#title').val(data.title);
	    				 $('#content').val(data.content);
	    				 $('#createdOn').val(data.createdOn);
	    				 $('#category').val(data.catId);
	    			 }, 
	    		 })
	    		$('#publish-idle').modal();
	    	 });
			
			$('#publish-yes').click(function(event){
				event.preventDefault();
			//event listener on click
			var title = jQuery('#title').val();
			var content = jQuery('#content').val();
			var id = jQuery('#id').val();
			var catId = $('#category option:selected').val();
			var date = new Date;
			
			var catPub = {
					id : jQuery('#id').val(),
					title : jQuery('#title').val(),
					content : jQuery('#content').val(),
					category : {
						id: catId
					},
					createdOn : date
					
			};
			console.log(catPub);
				jQuery.ajax({
					url: '${pageContext.request.contextPath}/idlenews/update',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(catPub),
					success : function(data){
						alert('Publish Berhasil')
						window.location = '${pageContext.request.contextPath}/idlenews'
					},error: function(){
						alert('Publish Berhasil');
						window.location = '${pageContext.request.contextPath}/idlenews'
					}
				})   
			
		});
			
			//delete
			$(".btn-delete").on('click', function(){
	    		 var id = $(this).val();
	    		 $.ajax({
	    			 url : '${pageContext.request.contextPath}/idlenews/delete/'+ id,
	    			 type: 'GET',
	    			 dataType: 'json',
	    			 success : function(data){
	    				 $('#id').val(data.id);
	    				 $('#title').val(data.title);
	    				 $('#content').val(data.content);
	    				 $('#createdOn').val(data.createdOn);
	    				 $('#category').val(data.catId);
	    			 }, 
	    		 })
	    		$('#delete-idle').modal();
	    	 });
			
			$('#delete-yes').click(function(event){
				event.preventDefault();
			//event listener on click
			var title = jQuery('#title').val();
			var content = jQuery('#content').val();
			var id = jQuery('#id').val();
			var catId = $('#category option:selected').val();
			var date = new Date;
			
			var catPub = {
					id : jQuery('#id').val(),
					title : jQuery('#title').val(),
					content : jQuery('#content').val(),
					category : {
						id: catId
					},
					createdOn : date
					
			};
			console.log(catPub);
				jQuery.ajax({
					url: '${pageContext.request.contextPath}/idlenews/update',
					type : 'POST',
					contentType : 'application/json',
					data : JSON.stringify(catPub),
					success : function(data){
						alert('Deactive Berhasil')
						window.location = '${pageContext.request.contextPath}/idlenews'
					},error: function(){
						alert('Deactive Berhasil');
						window.location = '${pageContext.request.contextPath}/idlenews'
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
    	
    	$('#tambah-idle').click(function(event){
    		event.preventDefault();
    		clearAllForm('#form-bootcamp');
    		$('#add-idle').modal();
    		$('#action').val('add');
    	});
    });
</script>

</html>