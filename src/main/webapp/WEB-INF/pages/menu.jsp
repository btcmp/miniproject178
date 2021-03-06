<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page import="java.util.Random" %>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!doctype html>
<html lang="en">
<%
Random rng = new Random();
String characters = "0123456789";
char[] pattern = new char[5];
pattern[0] = 'M';
for(int i=1;i<pattern.length;i++)
{
	pattern[i] = characters.charAt(rng.nextInt(characters.length()));
}
String RndmCode = new String(pattern);
%>
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
                    <li class="active">
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
                        <a class="navbar-brand" href="#"> Menu Datatable</a>
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
                                    <h4 class="title">Menu</h4>
                                </div>
                                
                                <div class="card-content table-responsive">
	                                <form action="${pageContext.request.contextPath}/menu/search" method="GET">
	                                	<input type="search" id="searchMenu" name="srcmenu" placeholder="Search by title" />
	                                	<button type="submit" class="btn btn-sm btn-default">
	                                		<i class="material-icons"></i>Search
	                                	</button>
	                                	<button type="button" id="tambahMenu" class="btn btn-sm btn-primary">+</button>
	                                </form>
                                </div>
                                <div class="card-content table-responsive">                
                                    <table id="table-menu" class="table table-hover">
                                        <thead class="text-warning">
                                            <th>Code</th>
                                            <th>Title</th>
                                            <th>Parent</th>
                                            <th>Status</th>
                                            <th>Actions</th>
                                        </thead>
                                        <tbody>
                                            <c:forEach var="menu" items="${menus}">
                                            	<tr class="content">
                                            		<td><c:out value="${menu.code }"></c:out></td>
                                            		<td><c:out value="${menu.title }"></c:out></td>
                                            		<td>
                                            			<c:choose>
                                            				<c:when test="${menu.menu == null }">
                                            					Dont have parent
                                            				</c:when>
                                            				<c:otherwise>
                                            					<c:out value="${menu.menu.title }"></c:out>
                                            				</c:otherwise>
                                            			</c:choose>
                                            		</td>
                       								<td>
                       									<c:choose>
                       										<c:when test="${menu.active == true }">
                       											Active
                       										</c:when>
                       										<c:when test="${menu.active == false }">
                       											Not Active
                       										</c:when>
                       									</c:choose>
                       								</td>
                       								<td>
                                            			<a id="${menu.id }" class="btn-deactivate btn btn-danger btn-sm">Deactived</a>
                                            			<a id="${menu.id }" class="btn-update btn btn-primary btn-sm">Edit</a>
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
        <!-- modal add menu-->
        <div class="modal fade" id="addMenu" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">Menu</h5>
				</div>
				<form action="${pageContext.request.contextPath }/menu/save" method="POST">
					<div class="modal-body">
						<div class="row">
							<div class="form-group col-md-6">
								<input type="text" id="code" value="<%out.print(RndmCode);%>" class="form-control" placeholder="<%out.print(RndmCode);%>" style="background-color: #bcbcbc" readonly/>
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="imageUrl" class="form-control" placeholder="Input Image Url"/>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<input type="text" id="title" class="form-control" placeholder="Input title"/>
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="menuOrder" class="form-control" placeholder="Input Menu Order"/>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<textarea rows="5" cols="50" id="description" class="form-control" placeholder="input Description"></textarea>
							</div>
							<div class="row">
								<div class="form-group col-md-6" style="width:48%;">
									<select id="menuParents" class="form-control">
										<option value="0">--Select Menu Parent--</option>
										<c:forEach items="${menus}" var="menu">
											<option value="${menu.id }">${menu.title}</option>
										</c:forEach>
									</select>
								</div>
								<div class="form-group col-md-6" style="width:48%;">
									<input type="text" id="menuUrl" class="form-control" placeholder="input menu Url"/>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" id="add-menu" class="btn btn-primary">Add</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
			</div>
		</div>
		<!-- modal deactivate menu-->
        <div class="modal fade" id="deactivate-menu" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h3 class="modal-title">Are You Sure to Deactivate this Menu?</h3>
				</div>
				<form action="${pageContext.request.contextPath }/menu/deactivate" method="POST">
					<div class="modal-body">
						<input type="hidden" id="id-menu"/>
						<input type="hidden" id="title-menu"/>
						<input type="hidden" id="code-menu"/>
						<input type="hidden" id="description-menu"/>
						<input type="hidden" id="createdOn-menu"/>
						<input type="hidden" id="createdBy-menu"/>
						<input type="hidden" id="menuUrl-menu"/>
						<input type="hidden" id="menuOrder-menu"/>
						<input type="hidden" id="imageUrl-menu"/>
						<input type="hidden" id="menuParent-menu"/>
					</div>
					<div class="modal-footer">
						<button type="submit" id="deactivate-btn" class="btn btn-primary">Deactivate</button>
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Cancel</button>
					</div>
				</form>
			</div>
			</div>
		</div>
		<!-- modal edit menu-->
        <div class="modal fade" id="update-menu" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h3 class="modal-title">Edit Role</h3>
				</div>
				<form action="${pageContext.request.contextPath }/menu/update" method="POST">
					<div class="modal-body">
						<input type="hidden" id="id-menu2"/>
						<input type="hidden" id="createdOn-menu2"/>
						<input type="hidden" id="createdBy-menu2"/>
						<div class="row">
							<div class="form-group col-md-6">
								<input type="text" id="code-menu2" class="form-control" style="background-color: #bcbcbc" readonly/>
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="imageUrl-menu2" class="form-control"/>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<input type="text" id="title-menu2" class="form-control"/>
							</div>
							<div class="form-group col-md-6">
								<input type="text" id="menuOrder-menu2" class="form-control"/>
							</div>
						</div>
						<div class="row">
							<div class="form-group col-md-6">
								<textarea rows="5" cols="50" id="description-menu2" class="form-control"></textarea>
							</div>
							<div class="row">
								<div class="form-group col-md-6" style="width:48%;">
									<select id="menuParents2" class="form-control">
										<option>--Select Menu Parent--</option>
										<option value="">Dont have parent</option>
										<c:forEach items="${menus}" var="menu">
											<option value="${menu.id }">${menu.title}</option>
										</c:forEach>
									</select>
								</div>
								<div class="form-group col-md-6" style="width:48%;">
									<input type="text" id="menuUrl-menu2" class="form-control"/>
								</div>
							</div>
						</div>
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
    	 
    	 $('#table-menu').DataTable();
    	 
    	//logout event button
    	 $('#logout').click(function(event){
    		 event.preventDefault();
    		$('#logoutForm').submit();
    	 });
    	
    	//modal tambah menu
 	    $('#tambahMenu').click(function(event) {
 			event.preventDefault();
 			$('#addMenu').modal();
 		});
    	
 		//tambah menu
   	    var button = jQuery('#add-menu').click(function(event){
   								event.preventDefault();
   								var code = jQuery('#code').val();
   								var title = jQuery('#title').val();
   								var description = jQuery('#description').val();
   								var imageUrl = jQuery('#imageUrl').val();
   								var menuOrder = jQuery('#menuOrder').val();
   								var menuUrl = jQuery('#menuUrl').val();
   								var menuParent = jQuery('#menuParents').val();
   								var active = 1;
   								var createdOn = new Date();
   								if (menuParent == 0) {
   									var menu = {
   	   										code:code,
   	   										title:title,
   	   										description:description,
   	   										imageUrl:imageUrl,
   	   										menuOrder:menuOrder,
   	   										menuUrl:menuUrl,
   	   										createdOn:createdOn,
   	   										active:active
   	   								}
								}
   								else{
   									var menu = {
   	   										code:code,
   	   										title:title,
   	   										description:description,
   	   										imageUrl:imageUrl,
   	   										menuOrder:menuOrder,
   	   										menu:{
   	   											id:menuParent
   	   										},
   	   										menuUrl:menuUrl,
   	   										createdOn:createdOn,
   	   										active:active
   	   								}
   								}
   								jQuery.ajax({
   									url : '${pageContext.request.contextPath}/menu/save',
   									type:'POST',
   										beforeSend:function(){
   											console.log(menu);
   											console.log('mau contact server');
   										},
   									contentType: 'application/json',
   									data: JSON.stringify(menu),
   									success : function(data){
   										console.log('data dari server');
   										console.log(data);
   										window.location='${pageContext.request.contextPath}/menu'
   										alert("Berhasil menambahkan Menu")
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
    			 url : '${pageContext.request.contextPath}/menu/get/'+ id,
    			 type: 'GET',
    			 success : function(data){
    				 $('#id-menu').val(data.id);
    				 $('#title-menu').val(data.title);
    				 $('#code-menu').val(data.code);
    				 $('#createdOn-menu').val(data.createdOn);
    				 $('#createdBy-menu').val(data.createdBy);
    				 $('#description-menu').val(data.description);
    				 $('#menuOrder-menu').val(data.menuOrder);
    				 $('#menuUrl-menu').val(data.menuUrl);
    				 $('#imageUrl-menu').val(data.imageUrl);
    				 $('#menuParent-menu').val(data.menu.id);
    			 },
    			 dataType: 'json'
    		 })
    		 
    		$('#deactivate-menu').modal();
    	 });
   	
   		//deactivate menu
   	    var button = jQuery('#deactivate-btn').click(function(event){
   								event.preventDefault();
   								var active = 0;
   								var modifiedOn = new Date();
   								var id = jQuery('#id-menu').val();
   								var title = jQuery('#title-menu').val();
   								var code = jQuery('#code-menu').val();
   								var createdOn = jQuery('#createdOn-menu').val();
   								var createdBy = jQuery('#createdBy-menu').val();
   								var description = jQuery('#description-menu').val();
   								var menuOrder = jQuery('#menuOrder-menu').val();
   								var menuUrl = jQuery('#menuUrl-menu').val();
   								var imageUrl = jQuery('#imageUrl-menu').val();
   								var menuParent = jQuery('#menuParent-menu').val();
   								if (menuParent == null) {
									menuParent = 0;
								}
   								if (menuParent == 0) {
   									var menu = {
   	   										id:id,
   	   										code:code,
   	   										title:title,
   	   										description:description,
   	   										modifiedOn:modifiedOn,
   	   										createdOn:createdOn,
   	   										createdBy:createdBy,
   	   										menuOrder:menuOrder,
   	   										menuUrl:menuUrl,
   	   										imageUrl:imageUrl,
   	   										active:active
   	   								}
								}
   								else{
   									var menu = {
   	   										id:id,
   	   										code:code,
   	   										title:title,
   	   										description:description,
   	   										modifiedOn:modifiedOn,
   	   										createdBy:createdBy,
   	   										createdOn:createdOn,
   	   										menuOrder:menuOrder,
   	   										menuUrl:menuUrl,
   	   										menu:{
   	   											id:menuParent
   	   										},
   	   										imageUrl:imageUrl,
   	   										active:active
   	   								}
   								} 
   								
   								jQuery.ajax({
   									url : '${pageContext.request.contextPath}/menu/deactivate',
   									type:'POST',
   										beforeSend:function(){
   											console.log(menu);
   											console.log('mau contact server');
   										},
   									contentType: 'application/json',
   									data: JSON.stringify(menu),
   									success : function(data){
   										console.log('data dari server');
   										console.log(data);
   										window.location='${pageContext.request.contextPath}/menu'
   										alert("Menu berhasil deactivate")
   									}
   								});
   								
   			});
   		
   		//update-confirm
 		$(".btn-update").on('click', function(){
    		 var id = $(this).attr('id');
    		 $.ajax({
    			 url : '${pageContext.request.contextPath}/menu/get/'+ id,
    			 type: 'GET',
    			 success : function(data){
    				 $('#id-menu2').val(data.id);
    				 $('#title-menu2').val(data.title);
    				 $('#code-menu2').val(data.code);
    				 $('#createdOn-menu2').val(data.createdOn);
    				 $('#createdBy-menu2').val(data.createdBy);
    				 $('#description-menu2').val(data.description);
    				 $('#menuOrder-menu2').val(data.menuOrder);
    				 $('#menuUrl-menu2').val(data.menuUrl);
    				 $('#imageUrl-menu2').val(data.imageUrl);
    				 $('#menuParent-menu2').val(data.menu.id);
    			 },
    			 dataType: 'json'
    		 })
    		 
    		$('#update-menu').modal();
    	 });
   	
   		//update menu
   	    var button = jQuery('#update-btn').click(function(event){
   								event.preventDefault();
   								var active = 1;
   								var modifiedOn = new Date();
   								var id = jQuery('#id-menu2').val();
   								var title = jQuery('#title-menu2').val();
   								var code = jQuery('#code-menu2').val();
   								var createdOn = jQuery('#createdOn-menu2').val();
   								var createdBy = jQuery('#createdBy-menu2').val();
   								var description = jQuery('#description-menu2').val();
   								var menuOrder = jQuery('#menuOrder-menu2').val();
   								var menuUrl = jQuery('#menuUrl-menu2').val();
   								var imageUrl = jQuery('#imageUrl-menu2').val();
   								var menuParent = jQuery('#menuParents2').val();
   								if (menuParent == null) {
									menuParent = 0;
								}
   								if (menuParent == 0 || menuParent == id) {
   									var menu = {
   	   										id:id,
   	   										code:code,
   	   										title:title,
   	   										description:description,
   	   										modifiedOn:modifiedOn,
   	   										createdOn:createdOn,
   	   										createdBy:createdBy,
   	   										menuOrder:menuOrder,
   	   										menuUrl:menuUrl,
   	   										imageUrl:imageUrl,
   	   										active:active
   	   								}
								}
   								else{
   									var menu = {
   	   										id:id,
   	   										code:code,
   	   										title:title,
   	   										description:description,
   	   										modifiedOn:modifiedOn,
   	   										createdOn:createdOn,
   	   										createdBy:createdBy,
   	   										menuOrder:menuOrder,
   	   										menuUrl:menuUrl,
   	   										menu:{
   	   											id:menuParent
   	   										},
   	   										imageUrl:imageUrl,
   	   										active:active
   	   								}
   								} 
   								
   								jQuery.ajax({
   									url : '${pageContext.request.contextPath}/menu/update',
   									type:'POST',
   										beforeSend:function(){
   											console.log(menu);
   											console.log('mau contact server');
   										},
   									contentType: 'application/json',
   									data: JSON.stringify(menu),
   									success : function(data){
   										console.log('data dari server');
   										console.log(data);
   										window.location='${pageContext.request.contextPath}/menu'
   										alert("Menu berhasil update")
   									},
   									error : function(data){
   										alert("data tidak boleh kosong")
   									}
   								});
   								
   			});
   		
    });
    
</script>

</html>